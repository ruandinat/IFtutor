package com.example.IFTutor.model;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;

public class UsersWithSkills {

    @Embedded
    private User user;
    @Relation(
            parentColumn = "id",
            entityColumn = "userId"
    )
    private List<Skills> skills;

    public User getUser(){
        return user;
    }

    public void setUser (User user){
        this.user = user;
    }

    public List<Skills> getSkills(){
        return skills;
    }

    public void setSkills (List<Skills> skills){
        this.skills = skills;
    }
}
