package com.example.shhata.storia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class userprofileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userprofile);
        ArrayList<memoryCardView> users = new ArrayList<memoryCardView>();
        users.add(new memoryCardView("It was amazing memory",R.drawable.mahmoud));
        users.add(new memoryCardView("It was amazing memory",R.drawable.mahmoud));
        users.add(new memoryCardView("It was amazing memory",R.drawable.mahmoud));
        users.add(new memoryCardView("It was amazing memory",R.drawable.mahmoud));
        users.add(new memoryCardView("It was amazing memory",R.drawable.mahmoud));
        users.add(new memoryCardView("It was amazing memory",R.drawable.mahmoud));
        users.add(new memoryCardView("It was amazing memory",R.drawable.mahmoud));
        users.add(new memoryCardView("It was amazing memory",R.drawable.mahmoud));
        users.add(new memoryCardView("It was amazing memory",R.drawable.mahmoud));
        users.add(new memoryCardView("It was amazing memory",R.drawable.mahmoud));
        users.add(new memoryCardView("It was amazing memory",R.drawable.mahmoud));
        users.add(new memoryCardView("It was amazing memory",R.drawable.mahmoud));
        users.add(new memoryCardView("It was amazing memory",R.drawable.mahmoud));

        cardViewAdapter itemsAdapter = new cardViewAdapter(this,users);

        GridView listView = (GridView) findViewById(R.id.list_image);

        listView.setAdapter(itemsAdapter);
    }
}
