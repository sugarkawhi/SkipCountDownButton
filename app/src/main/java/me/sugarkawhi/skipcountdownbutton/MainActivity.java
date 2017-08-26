package me.sugarkawhi.skipcountdownbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements SkipCountDownButton.OnSkipCountDownListener, View.OnClickListener {

    SkipCountDownButton skipCountDownButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        skipCountDownButton = (SkipCountDownButton) findViewById(R.id.skipButton);
        skipCountDownButton.setOnCountDownStopListener(this);
        skipCountDownButton.setOnClickListener(this);
    }


    @Override
    public void onSkip() {
        Toast.makeText(this, "click cancel or auto over", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {
        skipCountDownButton.skip();
    }

    public void start(View view) {
        skipCountDownButton.start();
    }
}
