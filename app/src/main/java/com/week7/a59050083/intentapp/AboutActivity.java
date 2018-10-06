package com.week7.a59050083.intentapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class AboutActivity extends AppCompatActivity {
    private  TextView tID,tName,tGPA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Student s1  = getIntent().getParcelableExtra("s1");
         tID = findViewById(R.id.textID);
         tName = findViewById(R.id.textName);
         tGPA = findViewById(R.id.textGPA);

        //Bundle bundle = getIntent().getExtras();
        if (s1 != null) {
            //String name = bundle.getString("name");
            //int star = bundle.getInt("star");
            //boolean isSmart = bundle.getBoolean("smart");
            tID.setText("ID :"+s1.getId());
            tName.setText("Name: "+s1.getName());
            tGPA.setText("GPA: "+s1.getGpa());


            String result = String.format("id %d, name : %s, gpa : %.2f",
                    s1.getId(), s1.getName(), s1.getGpa());
            Toast.makeText(this, "student : " + result, Toast.LENGTH_LONG).show();
        }

        Button buttonBack = (Button) findViewById(R.id.button_back);

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
