package org.launchcode.java.demos.lsn6inheritance;

//    public Greeting(String language, Boolean isFreiendly) {
//        super(isFriendly, language);

    public class Greeting extends Message {

        public Greeting(Boolean friendly, String language) {
            super(friendly, language);
        }

        public String getMorningMessage() {

            if (getLanguage().equals("English")){
                if (isFriendly()) {
                    return "Hey Girrl!";
                }
                return "Good Morning";
            }
           return "";
        }
    }
