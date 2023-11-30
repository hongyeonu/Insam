package com.cookandroid.insam.svt;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.cookandroid.insam.R;

public class SeventeenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seventeen);

        Button songGuessingButton = findViewById(R.id.button_song_guessing_game);

        songGuessingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 노래 맞추기 액티비티로 이동하는 Intent 생성
                Intent intent = new Intent(SeventeenActivity.this, com.cookandroid.insam.svt.SongGuessingActivity_svt.class);
                startActivity(intent);
            }
        });

        Button BodyButton = findViewById(R.id.button_body_game);

        BodyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 노래 맞추기 액티비티로 이동하는 Intent 생성
                Intent intent = new Intent(SeventeenActivity.this, com.cookandroid.insam.svt.BodyActivity_svt.class);
                startActivity(intent);
            }
        });

        Button BuzButton = findViewById(R.id.button_buz_game);

        BuzButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 노래 맞추기 액티비티로 이동하는 Intent 생성
                Intent intent = new Intent(SeventeenActivity.this, com.cookandroid.insam.svt.BuzActivity_svt.class);
                startActivity(intent);
            }
        });
    }
}
