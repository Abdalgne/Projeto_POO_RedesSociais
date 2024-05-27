package com.Social;

import com.Social.Interface.Compartilhamento;
import com.Social.Interface.VideoConferencia;

public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento {

    String social = "Facebook";
    public Facebook(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("postou uma foto no Facebook!");
    }

    @Override
    public void postarVideo() {
        System.out.println("postou um video no Facebook!");
    }

    @Override
    public void postarComent() {
        System.out.println("fez um comentario no Facebook");
    }

    @Override
    public void fazStreaming() {
        System.out.println("realizou uma vídeo conferência no Facebook");
    }

    @Override
    public void compartilhar() {
        System.out.println("compartilhou um post no Facebook");
    }
}
