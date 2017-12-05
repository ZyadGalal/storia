package com.example.shhata.storia;

/**
 * Created by shhata on 12/4/2017.
 */

public class memoryCardView {
    //User post
    private String post;

    //User Image
    private int imageResourceId;

    public memoryCardView(String Name,int imageId){

        post=Name;
        imageResourceId=imageId;
    }

    /**Method get to out user name*/
    public String getPost(){return post;}

    /**Method get to out User Image**/
    public int getImageResourcId() {
        return imageResourceId;
    }
}
