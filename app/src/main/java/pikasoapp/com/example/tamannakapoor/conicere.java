package pikasoapp.com.example.tamannakapoor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.CarrierConfigManager;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.github.florent37.viewanimator.ViewAnimator;

public class conicere extends AppCompatActivity {
    ImageView cg,cs;
    ImageButton btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conicere);
        getSupportActionBar().hide();
        cg=findViewById(R.id.carriGallery);
        cs=findViewById(R.id.cheeseShots);
        btn=findViewById(R.id.feedback);

        animation();

        cg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),Caricature_Gallery.class);
                startActivity(intent);
            }
        });

        cs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),More_on_Cheesecakes.class);
                startActivity(intent);
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),Feedback_page.class);
                startActivity(intent);
            }
        });
    }

    private void animation() {
        ViewAnimator
                .animate(btn)
                .duration(1000)
                .scale(0.2f,0.4f,1)
                .rotation(720)
                .duration(1800)
                .start();
    }
}