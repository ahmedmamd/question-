package com.example.mashal.question_task;

import android.content.Intent;
import android.support.annotation.ColorRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class result extends AppCompatActivity {
    TextView textView;
    TextView result;
    TextView result1;
    TextView result2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        textView=(TextView)findViewById(R.id.result);
        result  =(TextView)findViewById(R.id.result1);
        result1 =(TextView)findViewById(R.id.result2);
        result2 =(TextView)findViewById(R.id.result3);
        Bundle intent=getIntent().getExtras();

        String x=  intent.getString("key");
        String y=intent.getString("key1");
        String z=intent.getString("key2");
//        Toast.makeText(result.this,"x="+x,Toast.LENGTH_SHORT).show();
//        Toast.makeText(result.this,"y="+y,Toast.LENGTH_SHORT).show();
//        Toast.makeText(result.this,"z="+z,Toast.LENGTH_SHORT).show();
        int c=Integer.parseInt(x);
        int v=Integer.parseInt(y);
        int b=Integer.parseInt(z);
//        Toast.makeText(result.this,"c="+c,Toast.LENGTH_SHORT).show();

     if (c==1820){
//         result.setTextColor(0xFF00FF00);
         result.setText(x);
     }else if (c!=1820){
           result.setTextColor(0xFF00FF00);
           result.setText(x);}
        if (v==1890){
//            result1.setTextColor(0xFF00FF00);
              result1.setText(y);
     }else if (v!=1890){
            result1.setTextColor(0xFF00FF00);
            result1.setText(y);}
        if (b==1850){
//            result2.setTextColor(0xFF00FF00);
            result2.setText(z);
        }else if (b!=1850){
               result2.setTextColor(0xFF00FF00);
               result2.setText(z);}
}}

