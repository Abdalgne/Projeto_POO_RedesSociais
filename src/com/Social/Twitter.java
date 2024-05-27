package com.Social;

import com.Social.Interface.Compartilhamento;

public class Twitter extends RedeSocial implements Compartilhamento {
    String social = "Twitter";
    public Twitter(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("postou uma foto no Twitter!");
    }

    @Override
    public void postarVideo() {
        System.out.println("postou um video no Twitter!");
    }

    @Override
    public void postarComent() {
        System.out.println("fez um comentario no Twitter");
    }

    @Override
    public void compartilhar() {
        System.out.println("compartilhou um post no Twitter");
    }
}
