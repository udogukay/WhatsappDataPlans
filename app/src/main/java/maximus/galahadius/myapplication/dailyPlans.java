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

public class dailyPlans extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_plans);



    final Button mb20 = findViewById(R.id.mb20);
    final Button mb50 = findViewById(R.id.mb50);
    final Button mb150 = findViewById(R.id.mb150);


    mb20.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent sub = new Intent(Intent.ACTION_CALL);
            sub.setData(Uri.parse("tel:" + Uri.encode("*559#")));

            if (ActivityCompat.checkSelfPermission(dailyPlans.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                return;
            }

            startActivity(sub);
        }
    });


        mb50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sub = new Intent(Intent.ACTION_CALL);
                sub.setData(Uri.parse("tel:" + Uri.encode("*559#")));

                if (ActivityCompat.checkSelfPermission(dailyPlans.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }

                startActivity(sub);
            }
        });




        mb150.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sub = new Intent(Intent.ACTION_CALL);
                sub.setData(Uri.parse("tel:" + Uri.encode("*559#")));

                if (ActivityCompat.checkSelfPermission(dailyPlans.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
                }

                startActivity(sub);
            }
        });


    }

}
