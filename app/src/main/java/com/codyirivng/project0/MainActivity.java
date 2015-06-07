package com.codyirivng.project0;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.Console;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button buttonSpotify = (Button) findViewById(R.id.buttonSpotifyStreamer);
        buttonSpotify.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CharSequence toastText = "This button will launch: SPOTIFY STREAMER App!";
                Toast.makeText(getApplicationContext(), toastText,Toast.LENGTH_LONG).show();

            }
        });
        Button buttonScores = (Button) findViewById(R.id.buttonScoresApp);
        buttonScores.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CharSequence toastText = "This button will launch: Scores App!";
                Toast.makeText(getApplicationContext(), toastText,Toast.LENGTH_LONG).show();

            }
        });
        Button buttonLibrary = (Button) findViewById(R.id.buttonLibraryApp);
        buttonLibrary.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CharSequence toastText = "This button will launch: Library App!";
                Toast.makeText(getApplicationContext(), toastText,Toast.LENGTH_LONG).show();

            }
        });
        Button buttonBuild = (Button) findViewById(R.id.buttonBuildItBigger);
        buttonBuild.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CharSequence toastText = "This button will launch: Build IT BIGGER App!";
                Toast.makeText(getApplicationContext(), toastText,Toast.LENGTH_LONG).show();

            }
        });
        Button buttonXYZ = (Button) findViewById(R.id.buttonXYZReader);
        buttonXYZ.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CharSequence toastText = "This button will launch: XYZ Reader App!";
                Toast.makeText(getApplicationContext(), toastText,Toast.LENGTH_LONG).show();

            }
        });
        Button buttonMyOwn = (Button) findViewById(R.id.buttonMyOwnApp);
        buttonMyOwn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CharSequence toastText = "This button will launch: MY APP!";
                Toast.makeText(getApplicationContext(), toastText,Toast.LENGTH_LONG).show();

            }
        });




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
