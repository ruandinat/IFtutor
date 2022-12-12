package com.example.IFTutor.model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.io.Serializable;
import java.util.Objects;

@Entity (tableName = "skills")
public class Skills implements  Serializable {
    @NonNull
    @PrimaryKey
    private String id;
    private String userId;
    private String skill;
    private String skill2;
    private String skill3;
    private String dificuldade;
    private String dificuldade2;

    public Skills(String userId, String skill, String skill2, String skill3, String dificuldade, String deficuldade2) {
        this.userId = userId;
        this.skill = skill;
        this.skill2 = skill2;
        this.skill3 = skill3;
        this.dificuldade = dificuldade;
        this.dificuldade2 = deficuldade2;
    }

    @Ignore
    public Skills(){
        this("", "", "" , "", "" ,"");
    }

    @NonNull
    public String getId() {
        return id;
    }

    public void setId(@NonNull String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getSkill2() {
        return skill2;
    }

    public void setSkill2(String skill2) {
        this.skill2 = skill2;
    }

    public String getSkill3() {
        return skill3;
    }

    public void setSkill3(String skill3) {
        this.skill3 = skill3;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public String getDificuldade2() {
        return dificuldade2;
    }

    public void setDificuldade2(String dificuldade2) {
        this.dificuldade2 = dificuldade2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Skills skills = (Skills) o;
        return id.equals(skills.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
