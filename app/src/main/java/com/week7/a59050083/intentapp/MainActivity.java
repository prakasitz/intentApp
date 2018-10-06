package com.week7.a59050083.intentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonAbout = findViewById(R.id.button_about);
        final TextView eID = findViewById(R.id.editID);
        final TextView eName = findViewById(R.id.editName);
        final TextView eGPA = findViewById(R.id.editGPA);

        buttonAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);

                Student s1 = new Student(Integer.parseInt(eID.getText().toString()),eName.getText().toString(), Double.valueOf(eGPA.getText().toString()));
                intent.putExtra("s1",s1);
                //intent.putExtra("name", "devahoy");
                //intent.putExtra("isSmart", true);
                //intent.putExtra("star", 5);
                startActivity(intent);
            }
        });
    }
}
