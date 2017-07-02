package com.deepsam.loginintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SuccessLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_login);


        String name=getIntent().getExtras().getString("username");

        TextView textView= (TextView) findViewById(R.id.textView2);
        textView.setText("WELCOME "+name);
    }
}
