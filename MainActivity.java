package com.example.quilowats;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txt1,txt2;
    TextView text1,text2,text3;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1=findViewById(R.id.text1);
        text2=findViewById(R.id.text2);
        text3=findViewById(R.id.text3);
        txt1=findViewById(R.id.txt1);
        txt2=findViewById(R.id.txt2);
        btn=findViewById(R.id.btn);
    }
    public void Click(View v)
    {
        double t=Double.parseDouble(txt1.getText().toString());
        double t1=Double.parseDouble(txt2.getText().toString());
        text1.setText("a) Por cada Quilowatts, pagarás " + t*0.2 + "Kz ");
        double t2= t1*t*0.2;
        text2.setText("b) Para " + t1 +" pagarás  " + t2 + "Kz");
        text3.setText("c) Caso for aplicado um desconto de 15% sobre a compra de quilowatts, a sua conta será: " + (t2-0.15));
    }
}