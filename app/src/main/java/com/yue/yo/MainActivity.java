package com.yue.yo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Animation animation = AnimationUtils.loadAnimation(this, R.anim.text_anim);

        final Button btn1 = (Button) findViewById(R.id.btn_1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn1.startAnimation(animation);
                EditText editText = (EditText) findViewById(R.id.name);
                String name = editText.getText().toString();
                Toast.makeText(MainActivity.this, "Yo! " + name, Toast.LENGTH_LONG).show();
            }
        });

        final Button btn2 = (Button) findViewById(R.id.btn_2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn2.startAnimation(animation);
                EditText editText = (EditText) findViewById(R.id.name);
                String name = editText.getText().toString();
                Toast.makeText(MainActivity.this, "Yo!Yo! " + name, Toast.LENGTH_LONG).show();
            }
        });

        final Button btn3 = (Button) findViewById(R.id.btn_3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn3.startAnimation(animation);
                EditText editText = (EditText) findViewById(R.id.name);
                String name = editText.getText().toString();
                Toast.makeText(MainActivity.this, "Mo! " + name, Toast.LENGTH_LONG).show();
            }
        });

        final Button btn4 = (Button) findViewById(R.id.btn_4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn4.startAnimation(animation);
                EditText editText = (EditText) findViewById(R.id.name);
                String name = editText.getText().toString();
                Toast.makeText(MainActivity.this, "Or! " + name, Toast.LENGTH_LONG).show();
            }
        });
    }
}
