package com.example.mm.cook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import android.widget.TextView;



/**
 * Created by mm$ on 05/05/2017.
 */
public class LoginActivity extends AppCompatActivity {
    TextView signup_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        signup_text=(TextView)findViewById(R.id.sign_up);

/**
 * On debute RegisterActivity
 */
        signup_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class);
            }
        });


    }
}
