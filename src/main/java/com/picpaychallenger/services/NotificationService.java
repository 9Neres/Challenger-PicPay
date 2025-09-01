package com.picpaychallenger.services;

import com.picpaychallenger.domain.user.User;
import com.picpaychallenger.dtos.NotificationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NotificationService {

    @Autowired
    private RestTemplate restTemplate;

    public void sendNotification(User user,  String message){
        String email = user.getEmail();

        NotificationDTO notificationRequest = new NotificationDTO(email, message);

        ResponseEntity<String> response = restTemplate.postForEntity(
                "https://util.devi.tools/api/v1/notify",
                notificationRequest,
                String.class);

    }

    public void receiver(){}
}
