package com.cookandroid.insam.svt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.cookandroid.insam.R;

public class BuzActivity_svt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buz_svt);

        Button easyButton = findViewById(R.id.button_easy);
        easyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BuzActivity_svt.this, com.cookandroid.insam.svt.SVT_Buz_EasyActivity.class);
                startActivity(intent);
            }
        });


        Button normalButton = findViewById(R.id.button_normal);
        normalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BuzActivity_svt.this, com.cookandroid.insam.svt.SVT_Buz_NormalActivity.class);
                startActivity(intent);
            }
        });

        Button hardButton = findViewById(R.id.button_hard);
        hardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Hard 난이도 선택 시 이동할 Activity를 설정해주세요.
                Intent intent = new Intent(BuzActivity_svt.this, com.cookandroid.insam.svt.SVT_Buz_HardActivity.class);
                startActivity(intent);
            }
        });
    }
}
