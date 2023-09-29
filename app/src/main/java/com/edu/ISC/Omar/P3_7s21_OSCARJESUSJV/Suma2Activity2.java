package com.edu.ISC.Omar.P3_7s21_OSCARJESUSJV;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Suma2Activity2 extends AppCompatActivity {

        EditText num1, num2;

        TextView lblresultado;
        Button btncalcula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma22);

        num1 = findViewById(R.id.txtnum1);
        num2 = findViewById(R.id.txtnum2);
    }

    public void calcularoperacion(View v){
        Integer n1,n2;
        n1 = Integer.parseInt(num1.getText().toString());
        n2 = Integer.parseInt(num2.getText().toString());
        lblresultado = findViewById(R.id.lblresultado);
    }

}