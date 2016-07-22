package com.example.combtwactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="MainActivityTAG_" ;
    private EditText mEditTextUsername;
    private EditText mEditTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void afterLogin(View view) {

        mEditTextUsername = (EditText) findViewById(R.id.txt1);
        mEditTextPassword = (EditText) findViewById(R.id.txt2);

        Log.d(TAG, "afterLogin: "+ mEditTextUsername.getText() +" "+ mEditTextPassword.getText());

        Intent intent =  new Intent(this, DetailActivity.class);

        intent.putExtra("username", mEditTextUsername.getText().toString());
        intent.putExtra("password", mEditTextPassword.getText().toString());

        startActivity(intent);

    }
}
