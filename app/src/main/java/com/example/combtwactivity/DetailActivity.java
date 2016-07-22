package com.example.combtwactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private TextView mTextViewUsername;
    private TextView mTextViewPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mTextViewUsername = (TextView) findViewById(R.id.detail_user);
        mTextViewPass = (TextView) findViewById(R.id.detail_pass);

        String username =  getIntent().getStringExtra("username");
        String passowrd = getIntent().getStringExtra("password");

        mTextViewUsername.setText(username);
        mTextViewPass.setText(passowrd );
    }


}
