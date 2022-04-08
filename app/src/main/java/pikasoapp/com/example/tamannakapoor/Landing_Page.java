package pikasoapp.com.example.tamannakapoor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.github.florent37.viewanimator.ViewAnimator;

public class Landing_Page extends AppCompatActivity {

    ImageButton btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing__page);
        getSupportActionBar().hide();


        btn=findViewById(R.id.chbtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
        Animator();

    }

    private void Animator() {
        ViewAnimator
                .animate(btn)
                .scale(0,1)
                .scale(0.02f,0.5f,1)
                .duration(2000)
                .translationY(-2000,0)
                .rotation(720)
                .start();
    }


}