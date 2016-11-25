package com.example.donghee.visiblelayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout r1;
    Button b1, b2;
    // CheckBox cb1;
    RadioButton rb1, rb2, rb3;
    ImageView image;
    Switch sw1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r1 = (LinearLayout) findViewById(R.id.layout2);
        r1.setVisibility(View.GONE);


        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);

        rb1 = (RadioButton) findViewById(R.id.radioButton1);
        rb2 = (RadioButton) findViewById(R.id.radioButton2);
        rb3 = (RadioButton) findViewById(R.id.radioButton3);
        image = (ImageView) findViewById(R.id.imageView2);
      //  cb1 = (CheckBox) findViewById(R.id.checkBox);
        sw1 = (Switch) findViewById(R.id.switch1);
/*
                if(rb1.isChecked() == true) {
                    image.setImageResource(R.drawable.t1);
                } else if(rb2.isChecked() == true) {
                    image.setImageResource(R.drawable.t2);
                } else if(rb3.isChecked() == true) {
                    image.setImageResource(R.drawable.t3);
                }
                */
        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setImageResource(R.drawable.t1);
            }
        });
        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setImageResource(R.drawable.t2);
            }
        });
        rb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setImageResource(R.drawable.t3);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"종료합니다.",Toast.LENGTH_SHORT).show();

                finish();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sw1.setChecked(false); // 체크해제
                r1.setVisibility(View.GONE); // 레이아웃 감춤
                Toast.makeText(getApplicationContext(),"처음으로 돌아갑니다.",Toast.LENGTH_SHORT).show();
            }
        });

        sw1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    r1.setVisibility(View.VISIBLE); // 스위치 온
                } else {
                    r1.setVisibility(View.GONE); // 스위치 오프
                }
            }
        });

    }
/*
    public void onClick01(View v) {
    if (cb1.isChecked()) {
        r1.setVisibility(View.VISIBLE);
    } else{
        r1.setVisibility(View.GONE);
    }
    }
    */
}

