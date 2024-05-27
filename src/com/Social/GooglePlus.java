package com.Social;

import com.Social.Interface.Compartilhamento;
import com.Social.Interface.VideoConferencia;

public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento {

    String social = "Google Plus";
    public GooglePlus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("postou uma foto no Google Plus!");
    }

    @Override
    public void postarVideo() {
        System.out.println("postou um video no Google Plus!");
    }

    @Override
    public void postarComent() {
        System.out.println("fez um comentario no Google Plus");
    }

    @Override
    public void fazStreaming() {
        System.out.println("realizou uma vídeo conferência no Google Plus");
    }

    @Override
    public void compartilhar() {
        System.out.println("compartilhou um post no Google Plus");
    }
}
