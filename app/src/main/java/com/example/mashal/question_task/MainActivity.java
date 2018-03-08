package com.example.mashal.question_task;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    TextView textView1;
    TextView textView2;
    EditText editText;
    EditText editText1;
    EditText editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView =(TextView)findViewById(R.id.text);
        textView1 =(TextView)findViewById(R.id.text1);
        textView2 =(TextView)findViewById(R.id.text2);
        editText =(EditText)findViewById(R.id.edit);
        editText1 =(EditText)findViewById(R.id.edit1);
        editText2 =(EditText)findViewById(R.id.edit2);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,result.class);
//                Toast.makeText(MainActivity.this,editText.getText(),Toast.LENGTH_SHORT).show();
                intent.putExtra("key",editText.getText().toString());
                intent.putExtra("key1",editText1.getText().toString());
                intent.putExtra("key2",editText2.getText().toString());

                startActivity(intent);

            }
        });
    }
}
