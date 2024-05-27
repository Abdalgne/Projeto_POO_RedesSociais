package com.Social;

public class Instagram extends RedeSocial{
    String social = "Instagram";
    public Instagram(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("postou uma foto no Instagram!");
    }

    @Override
    public void postarVideo() {
        System.out.println("postou um video no Instagram!");
    }

    @Override
    public void postarComent() {
        System.out.println("fez um comentario no Instagram");
    }

}
