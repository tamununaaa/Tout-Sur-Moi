package pikasoapp.com.example.tamannakapoor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.firebase.client.Firebase;

public class Feedback_page extends AppCompatActivity {
    EditText nameTxt, emailTxt, msgTxt, rqstTxt;
    Button btn;
    Firebase firebase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback_page);
        getSupportActionBar().hide();

        nameTxt=findViewById(R.id.name);
        emailTxt=findViewById(R.id.email);
        msgTxt=findViewById(R.id.message);
        rqstTxt=findViewById(R.id.caricature_rqst);
        btn=findViewById(R.id.sendBtn);

        Firebase.setAndroidContext(this);

        String uniqueID= Settings.Secure.getString(getApplicationContext().getContentResolver(), Settings.Secure.ANDROID_ID);

        firebase= new Firebase("https://portfolio--tk-default-rtdb.firebaseio.com/Users" + uniqueID);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String name= nameTxt.getText().toString();
                final String email= emailTxt.getText().toString();
                final String message= msgTxt.getText().toString();
                final String rqst=rqstTxt.getText().toString();
                int c=0;

                Firebase child_name=firebase.child("Name");
                child_name.setValue(name);
                if(name.isEmpty()){
                    nameTxt.setError("Enter Name");
                    btn.setEnabled(false);
                }
                else{
                    nameTxt.setError(null);
                    btn.setEnabled(true);
                    c++;
                }

                Firebase child_email=firebase.child("Email");
                child_email.setValue(email);
                if(email.isEmpty()){
                    emailTxt.setError("Enter Email");
                    btn.setEnabled(false);
                }
                else{
                    emailTxt.setError(null);
                    btn.setEnabled(true);
                    c++;
                }

                Firebase child_message=firebase.child("Message");
                child_message.setValue(message);
                if(message.isEmpty()){
                    msgTxt.setError("Enter Message");
                    btn.setEnabled(false);
                }
                else{
                    msgTxt.setError(null);
                    btn.setEnabled(true);
                    c++;
                }

                Firebase child_crrqst=firebase.child("Caricature Request");
                child_crrqst.setValue(rqst);

                if(c==3) {
                    Toast.makeText(Feedback_page.this, "Thank you! We'll reach you shortly...", Toast.LENGTH_SHORT).show();
                    btn.setEnabled(true);
                }
                else{
                    Toast.makeText(Feedback_page.this, "Fill necessary details", Toast.LENGTH_SHORT).show();
                    btn.setEnabled(true);
                }

                /*if(rqst.isEmpty()){
                    rqstTxt.setError("Enter Message!");
                    btn.setEnabled(false);
                }
                else{
                    rqstTxt.setError(null);
                    btn.setEnabled(true);
                }*/

            }
        });

    }
}