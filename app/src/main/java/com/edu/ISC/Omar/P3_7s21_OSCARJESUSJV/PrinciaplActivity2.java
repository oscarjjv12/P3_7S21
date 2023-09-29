package com.edu.ISC.Omar.P3_7s21_OSCARJESUSJV;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class PrinciaplActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_princiapl2);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent cargarmenu = new Intent(PrinciaplActivity2.this, Menuactivity.class);
                startActivity(cargarmenu);
                finish();
            }
        }
    }
}
