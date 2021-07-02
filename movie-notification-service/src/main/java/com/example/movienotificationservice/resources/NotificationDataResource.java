package com.example.movienotificationservice.resources;

import com.example.movienotificationservice.models.Notificaten;
import com.example.movienotificationservice.models.UserNotificaten;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.management.Notification;
import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("/notification")
public class NotificationDataResource {
    @RequestMapping("/{userId}")
    public Notificaten getNotificaten(@PathVariable("userId") String userId){ return new Notificaten(userId,"message");}

    @RequestMapping("notification/{userId}")
    public UserNotificaten getUserNotificaten(@PathVariable("userId") String userId){
        List<Notificaten> notificaten = Arrays.asList(
                new Notificaten("123","first notify"),
                new Notificaten("456","second notify")
        );

        UserNotificaten userNotificaten = new UserNotificaten();
        userNotificaten.setUserNotificaten(notificaten);
        return userNotificaten;
    }

}
