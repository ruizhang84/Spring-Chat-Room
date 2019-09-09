package edu.udacity.java.nano.chat;

/**
 * WebSocket message model
 */
public class Message {
    // TODO: add message model.
    private String username;
    private String message;

    public Message(String name, String msg){
        this.username = name;
        this.message = msg;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String name){
        this.username = name;
    }

    public String getMessage(){
        return message;
    }

    public void setMessage(String msg){
        this.message = msg;
    }

}
