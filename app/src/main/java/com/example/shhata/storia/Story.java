package com.example.shhata.storia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Story extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);


        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("Moustafa Shahin",R.drawable.mahmoud));
        users.add(new User("Moustafa Shahin",R.drawable.mahmoud));
        users.add(new User("Moustafa Shahin",R.drawable.mahmoud));
        users.add(new User("Moustafa Shahin",R.drawable.mahmoud));
        users.add(new User("Moustafa Shahin",R.drawable.mahmoud));
        users.add(new User("Moustafa Shahin",R.drawable.mahmoud));
        users.add(new User("Moustafa Shahin",R.drawable.mahmoud));
        users.add(new User("Moustafa Shahin",R.drawable.mahmoud));
        users.add(new User("Moustafa Shahin",R.drawable.mahmoud));
        users.add(new User("Moustafa Shahin",R.drawable.mahmoud));
        users.add(new User("Moustafa Shahin",R.drawable.mahmoud));
        users.add(new User("Moustafa Shahin",R.drawable.mahmoud));
        users.add(new User("Moustafa Shahin",R.drawable.mahmoud));

        StoryAdapter itemsAdapter = new StoryAdapter(this,users);

        ListView listView = (ListView) findViewById(R.id.list_Story);

        listView.setAdapter(itemsAdapter);
    }
}
