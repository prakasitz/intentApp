package com.week7.a59050083.intentapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String name = bundle.getString("name");
            int star = bundle.getInt("star");
            boolean isSmart = bundle.getBoolean("smart");

            String result = String.format("Name is %s, star : %s, smart : %s",
                    name, star, isSmart);
            Toast.makeText(this, "Name : " + result, Toast.LENGTH_SHORT).show();
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
