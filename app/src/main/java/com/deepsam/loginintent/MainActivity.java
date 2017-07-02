package com.deepsam.loginintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Success(View view){

        EditText editText= (EditText) findViewById(R.id.editText2);
        String userName=editText.getText().toString();
        Intent intent=new Intent(MainActivity.this,SuccessLogin.class);
        intent.putExtra("username",userName);
        startActivity(intent);
    }
}
