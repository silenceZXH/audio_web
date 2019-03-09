package com.audio.audio_web.pojo.db;

import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue
    private String user_name;
    @Column(nullable = false,unique = true)
    private String user_passwd;
    @Column(nullable = false, unique = true)
    private int user_level;
    @Column(nullable = false)

    public User(String user_name, String user_passwd,  int user_level){
        this.user_name = user_name;
        this.user_passwd = user_passwd;
        this.user_level = user_level;
    }

    public User(){

    }
    public String getUser_name(){
        return user_name;
    }
}
