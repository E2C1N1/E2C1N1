package app.mateusz.apptest;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;


public class Projector extends ActionBarActivity {

    private int flagaWifi = 0;
    private final int port = 55000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projector);
        ConnectivityManager connManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo mWifi = connManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);

        if (mWifi.isConnected()) {flagaWifi = 1;
            Toast.makeText(getApplicationContext(), "Wifi Access", Toast.LENGTH_SHORT).show();
        } else {  flagaWifi = 0;
            Toast.makeText(getApplicationContext(), "Wifi Denied", Toast.LENGTH_LONG).show();
        }
    }



       class ClientThread implements Runnable{

        private String ipadress;

            public ClientThread(String ipadress){this.ipadress = ipadress;}

           @Override
           public void run() {
               try{
                   Socket socket = new Socket(ipadress,port );
                   if(socket.isConnected()){
                       Log.i("Thread:", "is Connected");
                   } else
                   {
                       Log.i("Thread:", "is not Connected");
                   }
               } catch (UnknownHostException e){e.printStackTrace();
               }catch (IOException e) {e.printStackTrace();}

           }
       }

    public void onClick(View v){


    }

}
