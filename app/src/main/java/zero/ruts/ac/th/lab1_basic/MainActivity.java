package zero.ruts.ac.th.lab1_basic;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       mediaPlayer=MediaPlayer.create(this,R.raw.kkk);

       mediaPlayer.start();
       mediaPlayer.setLooping(true);



    }
}
