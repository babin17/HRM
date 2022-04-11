package com.example.hrmdl;

public class Authentication {
    private final String id;
        private String username;
        private String password;

        private Admin(String id, String username, String password){
            this.id = id;
            this.username = username;
            this.password = password;
        }

        public Admin(String username, String password){
            this(UUID.randomUUID().toString(), username, password);
        }

        public String getID(){
            return id;
        }

        public String getUserName(){
            return username;
        }

        public String getPassword(){
            return password;
        }

        public void setUsername(String username){
            this.username = username;
        }


        public void setPassword(String password){
            this.password = password;
        }
}
