package com.cookandroid.insam.nct_dream;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.cookandroid.insam.R;

public class Dream_Song_NormalActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_normal_dream);

        Button playMusicButton = findViewById(R.id.button_play_music);
        playMusicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 노래 재생 코드
                if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                    mediaPlayer.stop(); // 음원 재생 중지
                    mediaPlayer.reset(); // 음원 초기화
                }
                mediaPlayer = MediaPlayer.create(Dream_Song_NormalActivity.this, R.raw.dream_normal); // 음악 파일 로드
                if (!mediaPlayer.isPlaying()) {
                    mediaPlayer.seekTo(0); //음원 재생 시작 위치를 0초로 설정
                    mediaPlayer.start(); //음원 재생 시작

                    // 7초 후 음원 재생 중지 코드
                    new Handler().postDelayed(new Runnable(){
                        public void run(){
                            if(mediaPlayer.isPlaying()){
                                mediaPlayer.stop(); // 음원 재생 중지
                                mediaPlayer.reset(); // 음원 초기화
                            }
                        }
                    }, 7000); // 7초 후 실행
                }
            }
        });

        EditText answerInputEditText = findViewById(R.id.editText_answer_input);

        Button submitButton = findViewById(R.id.button_submit);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 사용자가 입력한 답
                String userAnswer = getUserAnswer();

                // 정답
                String correctAnswer = "오르골"; // 원하는 정답을 입력하세요.

                // 정답 확인
                if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                    // 정답인 경우
                    // 원하는 처리를 여기에 추가하세요.
                    // 예를 들어, 메시지를 표시할 수 있습니다.
                    Toast.makeText(Dream_Song_NormalActivity.this, "정답입니다!", Toast.LENGTH_SHORT).show();
                } else {
                    // 오답인 경우
                    // 원하는 처리를 여기에 추가하세요.
                    // 예를 들어, 메시지를 표시할 수 있습니다.
                    Toast.makeText(Dream_Song_NormalActivity.this, "틀렸습니다. 다시 시도하세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    // 다른 곳에서 정답을 확인할 때 사용할 수 있습니다.
    public String getUserAnswer() {
        EditText answerInputEditText = findViewById(R.id.editText_answer_input);
        return answerInputEditText.getText().toString();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}
