package maximus.galahadius.myapplication;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    //request app permissions here
        if (ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(MainActivity.this,new String[]{Manifest.permission.CALL_PHONE},1);
        }




        final Button bal = findViewById(R.id.bal_btn);
        bal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bal = new Intent(Intent.ACTION_CALL);
                bal.setData(Uri.parse("tel:"+ Uri.encode("*131*4#")));
                if (ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    Toast.makeText(MainActivity.this, "You need to allow the app to make calls", Toast. LENGTH_LONG).show();
                    return;
                }
                startActivity(bal);
            }
        });

        final Button plans = findViewById(R.id.sub_btn);
        plans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent plans = new Intent(MainActivity.this, PlanActivity.class);
                startActivity(plans);
            }
        });


    }
}
