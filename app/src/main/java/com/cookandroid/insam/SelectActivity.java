package com.cookandroid.insam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

import com.cookandroid.insam.nct_dream.NctDreamActivity;
import com.cookandroid.insam.svt.SeventeenActivity;

public class SelectActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select);

        ImageView iv1 = findViewById(R.id.iv1);
        ImageView iv2 = findViewById(R.id.iv2);
        Button btn_badge = findViewById(R.id.btn_badge);
//        ImageView iv3 = findViewById(R.id.iv3);
//        ImageView iv4 = findViewById(R.id.iv4);
//        ImageView iv5 = findViewById(R.id.iv5);
//        ImageView iv6 = findViewById(R.id.iv6);

        // 아래의 Activity1~6는 해당 아티스트 페이지로 넘어가기 위한 액티비티 이름입니다.
        // 해당 액티비티들이 실제로 존재하며, AndroidManifest.xml 파일에 등록되어 있어야 합니다.

        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SelectActivity.this, SeventeenActivity.class));
            }
        });

        iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SelectActivity.this, NctDreamActivity.class));
            }
        });

        btn_badge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectActivity.this, BadgeActivity.class);
                startActivity(intent);
            }
        });
//
//        iv3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(SelectActivity.this, Activity3.class));
//            }
//        });
//
//        iv4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(SelectActivity.this, Activity4.class));
//            }
//        });
//
//        iv5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(SelectActivity.this, Activity5.class));
//            }
//        });
//
//        iv6.setOnClickListener(v -> startActivity(
//                new Intent(SelectActivity.this, Activity6.class)));
    }
}
