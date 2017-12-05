package com.example.shhata.storia;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by shhata on 12/4/2017.
 */

public class cardViewAdapter extends ArrayAdapter<memoryCardView> {


    public cardViewAdapter(Activity context, ArrayList<memoryCardView> post) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0,post);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {

            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.cardview, parent, false);
        }
// Get the {@link AndroidFlavor} object located at this position in the list
        memoryCardView currentUser = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView userPost = (TextView) listItemView.findViewById(R.id.user_post);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        userPost.setText(currentUser.getPost());


        // Find the ImageView in the list_item_story.xml layout with the ID list_item_icon
        ImageView userImage = (ImageView) listItemView.findViewById(R.id.image_post);
        // Get the image resource ID from the current Story object and
        // set the image to userImage
        userImage.setImageResource(currentUser.getImageResourcId());


        // Find the TextView in the list_item.xml layout with the ID version_number
        // TextView EnglishTextView = (TextView) listItemView.findViewById(R.id.English_Word);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
//        EnglishTextView.setText(currentWord.getdefaultTranslation());


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}

