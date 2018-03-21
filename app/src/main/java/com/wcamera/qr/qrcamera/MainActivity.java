package com.wcamera.qr.qrcamera;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

//import com.wcamera.qr.qrcameralib.CaptureActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button)findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent() ;
                intent.setClass(MainActivity.this, CaptureActivity.class);
                startActivity(intent);
            }
        });

        Button btnMulti = (Button)findViewById(R.id.buttonMulti);

//        btnMulti.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent() ;
//                intent.setClass(MainActivity.this, MultiActivity.class);
//                startActivity(intent);
//            }
//        });
    }
}
