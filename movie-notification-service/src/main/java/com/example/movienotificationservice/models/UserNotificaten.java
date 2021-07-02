package com.example.movienotificationservice.models;

import java.util.List;

public class UserNotificaten {

    private List<Notificaten> userNotificaten;

    public List<Notificaten> getUserNotificaten(){
        return userNotificaten;
    }

    public void setUserNotificaten(List<Notificaten> userNotificaten){
        this.userNotificaten =userNotificaten;
    }

}
