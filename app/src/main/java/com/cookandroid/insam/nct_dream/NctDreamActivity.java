package com.cookandroid.insam.nct_dream;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.cookandroid.insam.R;

public class NctDreamActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nct_dream);

        Button songGuessingButton = findViewById(R.id.button_song_guessing_game);

        songGuessingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 노래 맞추기 액티비티로 이동하는 Intent 생성
                Intent intent = new Intent(NctDreamActivity.this, com.cookandroid.insam.nct_dream.SongGuessingActivity_dream.class);
                startActivity(intent);
            }
        });

        Button bodyButton = findViewById(R.id.button_body_game);

        bodyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 신체 일부 맞추기 액티비티로 이동하는 Intent 생성
                Intent intent = new Intent(NctDreamActivity.this, com.cookandroid.insam.nct_dream.BodyActivity_dream.class);
                startActivity(intent);
            }
        });

        Button buzButton = findViewById(R.id.button_buz_game);

        buzButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Select 액티비티 대신 BuzActivity_dream으로 이동하는 Intent 생성
                Intent intent = new Intent(NctDreamActivity.this, com.cookandroid.insam.nct_dream.BuzActivity_dream.class);
                startActivity(intent);
            }
        });

    }
}
