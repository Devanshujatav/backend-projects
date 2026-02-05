package org.devanshu.model;

import java.time.LocalDateTime;

public class Contact{
    private int id;
    private String name;
    private String email;
    private String message;
    private LocalDateTime createdAt;

    // Default Constructor
    public Contact(){};

    // Constructors with parameters
    public Contact(String name , String email , String message){
        this.name = name;
        this.email = email;
        this.message = message;
    }

    // Construtors with all parameters
    public Contact(int id , String name , String email , String message , LocalDateTime createdAt){
        this.id = id;
        this.name = name;
        this.email = email;
        this.message = message;
        this.createdAt = createdAt;
    }

    // Getters and Setters
    public int getId(){
        return id;
    };
    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getMessage(){
        return message;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public LocalDateTime getCreatedAt(){
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt){
        this.createdAt =  createdAt;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Contact{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", message='" + message + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}