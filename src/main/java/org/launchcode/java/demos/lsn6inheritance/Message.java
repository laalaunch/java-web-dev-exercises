package org.launchcode.java.demos.lsn6inheritance;

public class Message {



    private Boolean friendly;

    private String language;

    private String text;



    public Message() { }



    public Message(Boolean friendly, String language) {

        this.friendly = friendly;

        this.language = language;

    }



    public String getLanguage() {

        return language;

    }



    public void setLanguage(String language) {

        this.language = language;

    }



    public Boolean isFriendly() {

        return friendly;

    }



    public void setFriendly(boolean friendly) {

        this.friendly = friendly;

    }

}
