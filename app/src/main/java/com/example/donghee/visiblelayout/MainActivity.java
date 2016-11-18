package com.example.donghee.visiblelayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    LinearLayout r1;
    Button b1;
    CheckBox cb1;
    RadioButton rb1, rb2, rb3;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r1 = (LinearLayout) findViewById(R.id.layout2);
        r1.setVisibility(View.GONE);


        b1 = (Button) findViewById(R.id.button);

        rb1 = (RadioButton) findViewById(R.id.radioButton1);
        rb2 = (RadioButton) findViewById(R.id.radioButton2);
        rb3 = (RadioButton) findViewById(R.id.radioButton3);
        image = (ImageView) findViewById(R.id.imageView2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rb1.isChecked() == true) {

                 //   image2.setImageResource(R.drawable.t1);
                 //   setContentView(image2);
                    image.setImageResource(R.drawable.t1);

                } else if(rb2.isChecked() == true) {
                    image.setImageResource(R.drawable.t2);
                } else if(rb3.isChecked() == true) {
                    image.setImageResource(R.drawable.t3);
                }

            }
        });
    }

    public void onClick01(View v) {
    cb1 = (CheckBox) findViewById(R.id.checkBox);
    if (cb1.isChecked() == true) {
        r1.setVisibility(View.VISIBLE);
    } else if (cb1.isChecked() == false) {
        r1.setVisibility(View.GONE);
    }
}
}
