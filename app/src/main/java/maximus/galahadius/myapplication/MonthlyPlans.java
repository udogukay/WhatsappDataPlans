package maximus.galahadius.myapplication;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MonthlyPlans extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monthly_plans);


    final Button gig1 = findViewById(R.id.gig1_5);
    final Button gig2 = findViewById(R.id.gig2);
    final Button gig3 = findViewById(R.id.gig3);
    final Button gig4 = findViewById(R.id.gig4);
        final Button gig6 = findViewById(R.id.gig6);
        final Button gig10 = findViewById(R.id.gig10);
        final Button gig15 = findViewById(R.id.gig15);
//    final Button gig2_5plus = findViewById(R.id.gig0);


        gig1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sub = new Intent(Intent.ACTION_CALL);
                sub.setData(Uri.parse("tel:"+ Uri.encode("*131*1*3*1#")));
                if (ActivityCompat.checkSelfPermission(MonthlyPlans.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity(sub);
            }
        });



        gig2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sub = new Intent(Intent.ACTION_CALL);
                sub.setData(Uri.parse("tel:"+ Uri.encode("*131*1*3*2#")));
                if (ActivityCompat.checkSelfPermission(MonthlyPlans.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity(sub);
            }
        });




        gig3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sub = new Intent(Intent.ACTION_CALL);
                sub.setData(Uri.parse("tel:"+ Uri.encode("*131*1*3*3#")));
                if (ActivityCompat.checkSelfPermission(MonthlyPlans.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity(sub);
            }
        });



        gig4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sub = new Intent(Intent.ACTION_CALL);
                sub.setData(Uri.parse("tel:"+ Uri.encode("*131*1*3*4#")));
                if (ActivityCompat.checkSelfPermission(MonthlyPlans.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity(sub);
            }
        });

        gig6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sub = new Intent(Intent.ACTION_CALL);
                sub.setData(Uri.parse("tel:"+ Uri.encode("*131*1*3*5#")));
                if (ActivityCompat.checkSelfPermission(MonthlyPlans.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity(sub);
            }
        });



        gig10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sub = new Intent(Intent.ACTION_CALL);
                sub.setData(Uri.parse("tel:"+ Uri.encode("131*1*3*6#")));
                if (ActivityCompat.checkSelfPermission(MonthlyPlans.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity(sub);
            }
        });




        gig15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sub = new Intent(Intent.ACTION_CALL);
                sub.setData(Uri.parse("tel:"+ Uri.encode("*131*1*3*99*7#")));
                if (ActivityCompat.checkSelfPermission(MonthlyPlans.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity(sub);
            }
        });





//
//
//
//        gig2_5plus.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent sub = new Intent(Intent.ACTION_CALL);
//                sub.setData(Uri.parse("tel:"+ Uri.encode("*556#")));
//                if (ActivityCompat.checkSelfPermission(MonthlyPlans.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
//                    return;
//                }
//                startActivity(sub);
//            }
//        });




    }
}
