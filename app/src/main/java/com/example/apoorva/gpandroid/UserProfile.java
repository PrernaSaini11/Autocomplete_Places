package com.example.apoorva.gpandroid;

/**
 * Created by Dell on 06-May-18.
 */

public class UserProfile {
        public String userEmail;
        public String userName;

        public UserProfile(){
        }

        public UserProfile( String userEmail, String userName) {
            this.userEmail = userEmail;
            this.userName = userName;
        }
        public String getUserEmail() {
            return userEmail;
        }

        public void setUserEmail(String userEmail) {
            this.userEmail = userEmail;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }
}
