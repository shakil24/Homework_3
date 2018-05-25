package com.example.shakil.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name,email,age,country,education;
    Button submit;

    String nametext,emailtext,agetext,countrytext,educationtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText)findViewById(R.id.name);
        email=(EditText)findViewById(R.id.email);
        age=(EditText)findViewById(R.id.age);
        country=(EditText)findViewById(R.id.country);
        education=(EditText)findViewById(R.id.education);

        submit=(Button)findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nametext=name.getText().toString();
                emailtext=email.getText().toString();
                agetext=age.getText().toString();
                countrytext=country.getText().toString();
                educationtext=education.getText().toString();

                Intent intent= new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("Name",nametext);
                intent.putExtra("Email",emailtext);
                intent.putExtra("Age",agetext);
                intent.putExtra("Country",countrytext);
                intent.putExtra("Education",educationtext);

                startActivity(intent);




            }
        });

    }
}
