package com.Social;

import javax.xml.namespace.QName;

public abstract class RedeSocial {

    private String pass;
    String social;
    private int NumAmigos;

    public RedeSocial(String senha, int numAmigos) {
        pass = senha;
        NumAmigos = numAmigos;
    }

    public abstract void postarFoto();

    public abstract void postarVideo();

    public abstract void postarComent();

    public void curtirPost() {
        System.out.println("curtiu uma publicação");
    }
}
