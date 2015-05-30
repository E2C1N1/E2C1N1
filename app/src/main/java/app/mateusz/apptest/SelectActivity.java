package app.mateusz.apptest;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class SelectActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        Button buttonPro = (Button)findViewById(R.id.button);
        Button buttonDis = (Button)findViewById(R.id.button2);
        Button buttonStr = (Button)findViewById(R.id.button3);

    }

    public void buttonProjector(View view){

        Intent intent = new Intent(this, Projector.class);
        startActivity(intent);
    }

    public   void  buttonDisplay(View view){

        Intent intent1 = new Intent(this, Display.class);
        startActivity(intent1);
    }

    public   void  buttonStreaming(View view){

        Intent intent2 = new Intent(this, Streaming.class);
        startActivity(intent2);
    }
}
