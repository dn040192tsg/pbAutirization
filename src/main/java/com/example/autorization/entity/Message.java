package com.example.autorization.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String username;
    private String birthday;
    private String fullName;
    private String email;

    public Message() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public void setBirthday(String text) {
        this.birthday = text;
    }

    public String getBirthday() {
        return birthday;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String tag) {
        this.username = tag;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", birthday='" + birthday + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return id == message.id &&
                Objects.equals(username, message.username) &&
                Objects.equals(birthday, message.birthday) &&
                Objects.equals(fullName, message.fullName) &&
                Objects.equals(email, message.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, birthday, fullName, email);
    }
}
