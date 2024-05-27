package com.Social.Funcion;

import com.Social.Facebook;
import com.Social.GooglePlus;
import com.Social.RedeSocial;
import com.Social.Twitter;

public class Func {
    public void acaoInsta(RedeSocial elemento, boolean[][] exe) {

        if (exe[0][0]) {
            elemento.postarVideo();
            exe[0][0] = false;
        }
        if (exe[1][0]) {
            elemento.postarFoto();
            exe[1][0] = false;
        }
        if (exe[2][0]) {
            elemento.postarComent();
            exe[2][0] = false;
        }
        if (exe[3][0]) {
            elemento.curtirPost();
            exe[3][0] = false;
        }

    }

    public void acaoGoogle(RedeSocial elemento, boolean[][] exe) {

        if (exe[0][1]) {
            elemento.postarVideo();
            exe[0][1] = false;
        }
        if (exe[1][1]) {
            elemento.postarFoto();
            exe[1][1] = false;
        }
        if (exe[2][1]) {
            elemento.postarComent();
            exe[2][1] = false;
        }
        if (exe[3][1]) {
            elemento.curtirPost();
            exe[3][1] = false;
        }
        if (exe[4][1]) {
            ((GooglePlus) elemento).compartilhar();
            exe[4][1] = false;
        }
        if (exe[5][1]) {
            ((GooglePlus) elemento).fazStreaming();
            exe[5][1] = false;
        }

    }

    public void acaoFace(RedeSocial elemento, boolean[][] exe) {

        if (exe[0][2]) {
            elemento.postarVideo();
            exe[0][2] = false;
        }
        if (exe[1][2]) {
            elemento.postarFoto();
            exe[1][2] = false;
        }
        if (exe[2][2]) {
            elemento.postarComent();
            exe[2][2] = false;
        }
        if (exe[3][2]) {
            elemento.curtirPost();
            exe[3][2] = false;
        }
        if (exe[4][2]) {
            ((Facebook) elemento).compartilhar();
            exe[4][2] = false;
        }
        if (exe[5][2]) {
            ((Facebook) elemento).fazStreaming();
            exe[5][2] = false;
        }

    }

    public void acaoTwitt(RedeSocial elemento, boolean[][] exe) {

        if (exe[0][3]) {
            elemento.postarVideo();
            exe[0][3] = false;
        }
        if (exe[1][3]) {
            elemento.postarFoto();
            exe[1][3] = false;
        }
        if (exe[2][3]) {
            elemento.postarComent();
            exe[2][3] = false;
        }
        if (exe[3][3]) {
            elemento.curtirPost();
            exe[3][3] = false;
        }
        if (exe[4][3]) {
            ((Twitter) elemento).compartilhar();
            exe[4][3] = false;
        }

    }
}
