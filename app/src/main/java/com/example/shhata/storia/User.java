package com.example.shhata.storia;

/**
 * Created by shhata on 12/3/2017.
 */

public class User {

    //User Name
    private String userName;

    //User Image
    private int imageResourceId;

    public User(String Name,int imageId){

        userName=Name;
        imageResourceId=imageId;
    }

    /**Method get to out user name*/
    public String getUserName(){return userName;}

    /**Method get to out User Image**/
    public int getImageResourceId() {
        return imageResourceId;
    }

}
