package com.ymhase.websocketdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

import com.ymhase.websocketdemo.model.Notification;


@Service
public class MessageCountService {
        
        
        @Autowired
        private SimpMessagingTemplate messagingTemplate;

        public void notify(Notification notification, String username) {
                messagingTemplate.convertAndSendToUser(
                                username, 
                                "/queue/notify", 
                                notification
                              );
                              return;
                
                
        }

}
