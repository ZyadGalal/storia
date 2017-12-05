package com.example.shhata.storia;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //button capture to take  a photo
        at.markushi.ui.CircleButton capture=(at.markushi.ui.CircleButton)findViewById(R.id.btn_capture);
      capture.setOnClickListener(new View.OnClickListener(){

          @Override
          public void onClick(View view) {
              Intent capture =new Intent(MainActivity.this,befforPosttingActivity.class);
              startActivity(capture);
          }
      });

        ImageView Story=(ImageView) findViewById(R.id.btn_story);
        Story.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent Story =new Intent(MainActivity.this,Story.class);
                startActivity(Story);
            }
        });



    }
}
