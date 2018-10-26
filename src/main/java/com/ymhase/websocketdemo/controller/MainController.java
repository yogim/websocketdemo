package com.ymhase.websocketdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ymhase.websocketdemo.model.Notification;
import com.ymhase.websocketdemo.service.MessageCountService;



@Controller
public class MainController {
        
        
        @Autowired
        private MessageCountService messageCountService;

       
        @RequestMapping("/")
        public String index() {
          return "index";
        }

        
        @RequestMapping("/notifications")
        public String notifications() {
          return "notifications";
        }

       
        @RequestMapping(value = "/some-action", method = RequestMethod.POST)
        @ResponseBody
        public ResponseEntity<?> someAction() {

                messageCountService.notify( new Notification("hello"), // notification object
                                "UserA");
          
          return new ResponseEntity<Object>(HttpStatus.OK);
        }

}
