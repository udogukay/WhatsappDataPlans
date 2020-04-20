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

public class WeeklyPlans extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weekly_plans);


        final Button mb300 = findViewById(R.id.mw300);
        final Button mb500 = findViewById(R.id.mb500);
        final Button mb500x2 = findViewById(R.id.mb500x2);
        final Button mb5001k = findViewById(R.id.mb5001k);
        final Button waw = findViewById(R.id.waw);

        mb300.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sub = new Intent(Intent.ACTION_CALL);
                sub.setData(Uri.parse("tel:"+ Uri.encode("*131*1*2*1#")));
                if (ActivityCompat.checkSelfPermission(WeeklyPlans.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity(sub);
            }
        });



        mb500.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sub = new Intent(Intent.ACTION_CALL);
                sub.setData(Uri.parse("tel:"+ Uri.encode("*131*1*2*2#")));
                if (ActivityCompat.checkSelfPermission(WeeklyPlans.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity(sub);
            }
        });



        mb500x2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sub = new Intent(Intent.ACTION_CALL);
                sub.setData(Uri.parse("tel:"+ Uri.encode("*131*1*2*3#")));
                if (ActivityCompat.checkSelfPermission(WeeklyPlans.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity(sub);
            }
        });


        mb5001k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sub = new Intent(Intent.ACTION_CALL);
                sub.setData(Uri.parse("tel:" + Uri.encode("*131*1*2*4#")));
                if (ActivityCompat.checkSelfPermission(WeeklyPlans.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(sub);
            }
        });

        waw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sub = new Intent(Intent.ACTION_CALL);
                sub.setData(Uri.parse("tel:" + Uri.encode("*131*1*2*4#")));
                if (ActivityCompat.checkSelfPermission(WeeklyPlans.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(sub);
            }
        });



    }
}
