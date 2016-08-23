package com.yue.yo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.btn_1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText = (EditText) findViewById(R.id.name);
                String name = editText.getText().toString();
                Toast.makeText(MainActivity.this, "Yo! " + name, Toast.LENGTH_LONG).show();
            }
        });

        Button btn2 = (Button) findViewById(R.id.btn_2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText = (EditText) findViewById(R.id.name);
                String name = editText.getText().toString();
                Toast.makeText(MainActivity.this, "Yo!Yo! " + name, Toast.LENGTH_LONG).show();
            }
        });

        Button btn3 = (Button) findViewById(R.id.btn_3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText = (EditText) findViewById(R.id.name);
                String name = editText.getText().toString();
                Toast.makeText(MainActivity.this, "Mo! " + name, Toast.LENGTH_LONG).show();
            }
        });

        Button btn4 = (Button) findViewById(R.id.btn_4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText = (EditText) findViewById(R.id.name);
                String name = editText.getText().toString();
                Toast.makeText(MainActivity.this, "Or! " + name, Toast.LENGTH_LONG).show();
            }
        });
    }
}
