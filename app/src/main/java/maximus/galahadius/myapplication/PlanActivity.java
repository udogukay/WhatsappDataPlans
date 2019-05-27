package maximus.galahadius.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan);


    final Button daily = findViewById(R.id.daily);
    final Button weekly = findViewById(R.id.weekly);
    final Button monthly = findViewById(R.id.monthly);


    daily.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent dailyPlans = new Intent(PlanActivity.this, maximus.galahadius.myapplication.dailyPlans.class);
            startActivity(dailyPlans);
        }
    });


    weekly.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent weeklyPlans = new Intent(PlanActivity.this, WeeklyPlans.class);
            startActivity(weeklyPlans);
        }
    });


    monthly.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent monthly = new Intent(PlanActivity.this, MonthlyPlans.class);
            startActivity(monthly);
        }
    });









    }
}
