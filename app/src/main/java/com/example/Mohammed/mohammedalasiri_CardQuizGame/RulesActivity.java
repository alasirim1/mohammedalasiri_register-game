package com.example.Mohammed.mohammedalasiri_CardQuizGame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.Mohammed.mohammedalasiri_login_register.R;

public class RulesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rules);}
        public void agree(View view){
            Intent intent=new Intent(RulesActivity.this,QuizActivity.class);
            startActivity(intent);
            finish();
        }





}
