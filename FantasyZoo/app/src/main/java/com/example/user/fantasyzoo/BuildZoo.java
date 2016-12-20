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
public class BuildZoo extends AppCompatActivity {

    Enclosure dragonEnclosure;
    Enclosure unicornEnclosure;
    Enclosure mermaidEnclosure;
    Button dragonButton;
    Button unicornButton;
    Button mermaidButton;
    Button continueButton;
    TextView buildText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("FantasyZoo", "onCreate called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buildzoo);

        dragonEnclosure = new Enclosure("Dragon Enclosure", "closed", "rocky");
        unicornEnclosure = new Enclosure("Unicorn Enclosure", "closed", "forest");
        mermaidEnclosure = new Enclosure("Mermaid Enclosure", "open", "water");

        buildText = (TextView) findViewById(R.id.build_zoo);
        dragonButton = (Button) findViewById(R.id.dragon_enclosure);
        unicornButton = (Button) findViewById(R.id.unicorn_enclosure);
        mermaidButton = (Button) findViewById(R.id.mermaid_enclosure);
        continueButton = (Button) findViewById(R.id.continue_build);

        dragonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

}
