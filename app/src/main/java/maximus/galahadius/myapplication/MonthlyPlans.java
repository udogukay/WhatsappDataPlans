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


    final Button gig1 = findViewById(R.id.gig1);
    final Button gig1_5 = findViewById(R.id.gig1_5);
    final Button gig2_5 = findViewById(R.id.gig2_5);
    final Button gig5 = findViewById(R.id.gig5);
    final Button gig10 = findViewById(R.id.gig10);
    final Button gig22 = findViewById(R.id.gig22);
    final Button gig1plus = findViewById(R.id.gig1plus);
    final Button gig2_5plus = findViewById(R.id.gig2_5plus);


        gig1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sub = new Intent(Intent.ACTION_CALL);
                sub.setData(Uri.parse("tel:"+ Uri.encode("*556#")));
                if (ActivityCompat.checkSelfPermission(MonthlyPlans.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity(sub);
            }
        });



        gig1_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sub = new Intent(Intent.ACTION_CALL);
                sub.setData(Uri.parse("tel:"+ Uri.encode("*556#")));
                if (ActivityCompat.checkSelfPermission(MonthlyPlans.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity(sub);
            }
        });




        gig2_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sub = new Intent(Intent.ACTION_CALL);
                sub.setData(Uri.parse("tel:"+ Uri.encode("*556#")));
                if (ActivityCompat.checkSelfPermission(MonthlyPlans.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity(sub);
            }
        });



        gig5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sub = new Intent(Intent.ACTION_CALL);
                sub.setData(Uri.parse("tel:"+ Uri.encode("*556#")));
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
                sub.setData(Uri.parse("tel:"+ Uri.encode("*556#")));
                if (ActivityCompat.checkSelfPermission(MonthlyPlans.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity(sub);
            }
        });



        gig22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sub = new Intent(Intent.ACTION_CALL);
                sub.setData(Uri.parse("tel:"+ Uri.encode("*556#")));
                if (ActivityCompat.checkSelfPermission(MonthlyPlans.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity(sub);
            }
        });




        gig1plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sub = new Intent(Intent.ACTION_CALL);
                sub.setData(Uri.parse("tel:"+ Uri.encode("*556#")));
                if (ActivityCompat.checkSelfPermission(MonthlyPlans.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity(sub);
            }
        });




        gig2_5plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sub = new Intent(Intent.ACTION_CALL);
                sub.setData(Uri.parse("tel:"+ Uri.encode("*556#")));
                if (ActivityCompat.checkSelfPermission(MonthlyPlans.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity(sub);
            }
        });




    }
}
