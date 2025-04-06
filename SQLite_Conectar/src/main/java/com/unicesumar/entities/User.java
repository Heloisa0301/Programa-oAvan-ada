package com.unicesumar.entities;

import java.util.UUID;

public class User extends Entity{
    private String name;
    private String email;
    private String password;

    public User(UUID uuid, String name, String password, String email) {
        super(uuid);
        this.name = name;
        this.password = password;
        this.email = email;
    }

    public User(String name, String password, String email) {
        this.name = name;
        this.password = password;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return "User{" + //não quis deixar aparecer a senha do usuário... (então fiz uma gambiarra)
                "uuid: " + getUuid() +
                "| nome: " + name +
                "| e-mail: " + email +
                "}";
    }
}
