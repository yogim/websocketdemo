package com.ymhase.websocketdemo.model;

public class MessageCount {
        private String count;
        private String userId;

        public MessageCount(String count, String userid) {
                this.count = count;
                this.userId = userid;

        }

        public String getCount() {
                return count;
        }

        public void setCount(String count) {
                this.count = count;
        }

        public String getUserId() {
                return userId;
        }

        public void setUserId(String userId) {
                this.userId = userId;
        }

}
