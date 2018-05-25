package com.example.shakil.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView name,email,age,country,education;

    String nameRecieved,emailRecieved,ageRecieved,countryRecieved,educationRecieved;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name=(TextView)findViewById(R.id.your_name);
        email=(TextView)findViewById(R.id.your_email);
        age=(TextView)findViewById(R.id.your_age);
        country=(TextView)findViewById(R.id.your_country);
        education=(TextView)findViewById(R.id.your_education);


     nameRecieved = getIntent().getStringExtra("Name").toString();
     emailRecieved=getIntent().getStringExtra("Email").toString();
     ageRecieved=getIntent().getStringExtra("Age").toString();
     countryRecieved=getIntent().getStringExtra("Country").toString();
     educationRecieved=getIntent().getStringExtra("Education").toString();


     name.setText(nameRecieved);
     email.setText(emailRecieved);
     age.setText(ageRecieved);
     country.setText(countryRecieved);
     education.setText(educationRecieved);

    }
}
