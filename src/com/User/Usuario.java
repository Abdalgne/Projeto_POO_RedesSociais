package com.User;

import com.Social.RedeSocial;

import java.util.HashSet;
import java.util.Set;

public class Usuario {

    private String name, email;

    public Set<RedeSocial> redesSociais = new HashSet<>();

    public Usuario(String name, String email, Set<RedeSocial> RedeSocial){
        this.name = name;
        this.email = email;

        this.redesSociais = RedeSocial;

    }

}
