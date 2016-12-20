package com.example.user.fantasyzoo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by user on 19/12/2016.
 */
public class FantasyZooStart extends AppCompatActivity {

    Zoo zoo;
    ZooManager zooManager;
    Button startButton;
    TextView welcomeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("FantasyZoo", "onCreate called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zoo = new Zoo("Imaginimals");
        zooManager = new ZooManager(zoo);

        welcomeText = (TextView) findViewById(R.id.welcome_text);
        startButton = (Button) findViewById(R.id.start_button);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FantasyZooStart.this, BuildZoo.class);
                startActivity(intent);
            }
        });

    }
}
