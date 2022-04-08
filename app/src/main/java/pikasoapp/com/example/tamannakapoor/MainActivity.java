package pikasoapp.com.example.tamannakapoor;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.github.florent37.viewanimator.ViewAnimator;
import com.google.android.material.navigation.NavigationView;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {

    ImageButton edu,exp,cert,add,chbtn;
    CircleImageView photo;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    ActionBarDrawerToggle actionBarDrawerToggle;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigation_view);
        photo=findViewById(R.id.myphoto);
        edu=findViewById(R.id.education);
        exp=findViewById(R.id.experiene);
        cert=findViewById(R.id.certificate);
        add=findViewById(R.id.add_info);
        chbtn=findViewById(R.id.cheesecake);
        linearLayout=findViewById(R.id.llimages);
        animation();

        photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hyperlinkPresentation();
            }
        });

        edu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),Education_page.class);
                startActivity(intent);
            }
        });

        exp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),Experience_page.class);
                startActivity(intent);
            }
        });

        cert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),Certificate_page.class);
                startActivity(intent);
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),Additional_info_page.class);
                startActivity(intent);
            }
        });

        chbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),conicere.class);
                startActivity(intent);
            }
        });

        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.drawer_open, R.string.drawer_close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.call:
                        String num="9910191133";
                        Intent intent= new Intent(Intent.ACTION_CALL);
                        intent.setData(Uri.parse("tel:"+num));
                        startActivity(intent);
                        break;

                    case R.id.email:
                        sendmail();
                        break;

                    case R.id.linkedin:
                        setupHyperlink();
                        break;

                }

                return true;
            }
        });



}

    private void hyperlinkPresentation() {
        Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.canva.com/design/DAE7E-rPkVw/bepDZCJP8Dwqewwj-y9Oow/view?utm_content=DAE7E-rPkVw&utm_campaign=designshare&utm_medium=link&utm_source=publishpresent" +
                ""));
        startActivity(intent);
    }

    private void animation() {
        ViewAnimator
                .animate(edu)
                .startDelay(6000)
                .scale(1,1.5f,1)
                .duration(800)
                .thenAnimate(exp)
                .scale(1,1.5f,1)
                .duration(800)
                .thenAnimate(cert)
                .scale(1,1.5f,1)
                .duration(800)
                .thenAnimate(add)
                .scale(1,1.5f,1)
                .duration(800)
                .thenAnimate(chbtn)
                .scale(0.2f,1.4f,1)
                .duration(2000)
                .rotation(720)
                .start();
    }




    private void setupHyperlink() {
        Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/tamanna-kapoor-01b2ba190/"));
        startActivity(intent);
    }

    private void sendmail() {
        String recipients= "tamannakapoor144@gmail.com";
        Intent intent= new Intent(Intent.ACTION_SEND);
        intent.setType("message/rfc822");
        startActivity(Intent.createChooser(intent,"Choose Action:"));
    }
}