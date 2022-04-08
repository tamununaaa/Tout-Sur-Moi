package pikasoapp.com.example.tamannakapoor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class Certificate_page extends AppCompatActivity {

    CircleImageView cert1,cert2,cert3,cert4,cert5;
    TextView cert_txt1,cert_txt2,cert_txt3,cert_txt4,cert_txt5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_certificate_page);
        getSupportActionBar().hide();

        cert1=findViewById(R.id.cert1);
        cert2=findViewById(R.id.cert2);
        cert3=findViewById(R.id.cert3);
        cert4=findViewById(R.id.cert4);
        cert5=findViewById(R.id.cert5);

        cert_txt1=findViewById(R.id.ct1);
        cert_txt2=findViewById(R.id.ct2);
        cert_txt3=findViewById(R.id.ct3);
        cert_txt4=findViewById(R.id.ct4);
        cert_txt5=findViewById(R.id.ct5);

        cert1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hyperlink1();
            }
        });

        cert_txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hyperlink1();
            }
        });

        cert2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hyperlink2();
            }
        });

        cert_txt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hyperlink2();
            }
        });

        cert3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hyperlink3();
            }
        });

        cert_txt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hyperlink3();
            }
        });

        cert4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hyperlink4();
            }
        });

        cert_txt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hyperlink4();
            }
        });

        cert5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hyperlink5();
            }
        });

        cert_txt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hyperlink5();
            }
        });

    }

    private void hyperlink5() {
        Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/19vtEzg1xdurJQdIOLfa2VZ0KZe1B-kWJ/view?usp=sharing"));
        startActivity(intent);
    }

    private void hyperlink4() {
        Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1VXC1VECDMDs-4UKYl9bEaimonKRActF-/view?usp=sharing"));
        startActivity(intent);
    }

    private void hyperlink1() {
        Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/19vCSt2pc8dJZAA5GJkObUJBGaoJXU4VN/view?usp=sharing"));
        startActivity(intent);
    }

    private void hyperlink2() {
        Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1o3EvttWhD1bhoiPCgnT7ZfpCkbKE3_id/view?usp=sharing"));
        startActivity(intent);
    }
    private void hyperlink3() {
        Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/13SlYk1kBr--x7fcg3-wA06V7KGVn088e/view?usp=sharing"));
        startActivity(intent);
    }




}