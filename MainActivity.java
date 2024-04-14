package com.hakanpolat.myapplication;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;



public class MainActivity extends AppCompatActivity {

    private EditText Edname,Edsurname,Edcity,Edage;
    private TextView signup;
    private RadioButton male,female;
    private Button button;
    private String name,surname,city,age;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        button = (Button)findViewById(R.id.button);

        Edname = (EditText) findViewById(R.id.name);
        Edsurname = (EditText)findViewById(R.id.surname);
        Edcity = (EditText)findViewById(R.id.city);
        Edage = (EditText)findViewById(R.id.age);

        male = (RadioButton)findViewById(R.id.male);
        female = (RadioButton)findViewById(R.id.female);

        signup = (TextView)findViewById(R.id.signup);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!TextUtils.isEmpty(name) && !TextUtils.isEmpty(surname) && !TextUtils.isEmpty(city)
                        && !TextUtils.isEmpty(age)){

                    name = Edname.getText().toString();
                    surname = Edsurname.getText().toString();
                    city = Edcity.getText().toString();
                    age = Edage.getText().toString();

                    signup.setText(name+ " | "+surname+" | "+city+" | "+ age);
                }
                else{
                    signup.setText("Fix The Errors Below!");
                }







            }
        });
    }
    }
