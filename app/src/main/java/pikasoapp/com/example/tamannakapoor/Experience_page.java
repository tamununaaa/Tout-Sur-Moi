package pikasoapp.com.example.tamannakapoor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import de.hdodenhof.circleimageview.CircleImageView;

public class Experience_page extends AppCompatActivity {

    CircleImageView e1,e2,e3,e4,e5,e0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experience_page);
        getSupportActionBar().hide();
        e0= findViewById(R.id.exp0);
        e1= findViewById(R.id.exp1);
        e2= findViewById(R.id.exp2);
        e3= findViewById(R.id.exp3);
        e4= findViewById(R.id.exp4);
        e5= findViewById(R.id.exp5);



        e0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),exp0.class);
                startActivity(intent);
            }
        });

        e1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),exp1.class);
                startActivity(intent);
            }
        });

        e2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),exp2.class);
                startActivity(intent);
            }
        });

        e3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),exp3.class);
                startActivity(intent);
            }
        });

        e4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),exp4.class);
                startActivity(intent);
            }
        });

        e5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),exp5.class);
                startActivity(intent);
            }
        });






    }
}