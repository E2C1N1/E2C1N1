package app.mateusz.apptest;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Window;

import java.util.Timer;
import java.util.TimerTask;


public class MainActivity extends Activity {

   long delay = 8000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_main);

        Timer runSpalsh = new Timer();

        TimerTask ShowSplash = new TimerTask() {
            @Override
            public void run() {
                finish();

                Intent intent = new Intent(MainActivity.this, SelectActivity.class);
                startActivity(intent);
            }
        };
        runSpalsh.schedule(ShowSplash,delay);

    }

}
