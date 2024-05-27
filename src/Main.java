import com.Social.*;
import com.Social.Funcion.Func;
import com.User.Usuario;

import java.util.HashSet;
import java.util.Set;


public class Main {
    public static void main(String[] args) {

        Func func = new Func();

        Set<RedeSocial> redesSociais = new HashSet<>();
        redesSociais.add(new Instagram("123", 5));
        redesSociais.add(new GooglePlus("123", 3));
        redesSociais.add(new Facebook("123", 315));
        redesSociais.add(new Twitter("123", 563));

        Usuario usuario = new Usuario("Ramon", "Ramon@ramonzinho.com", redesSociais);

        boolean[][] exe = new boolean[][]{
                //Inst Google  Face  Twit
                {true, false, false, false},     //postVideo
                {true, false, false, false},    //PostFoto
                {false, true, false, true},      //PostComent
                {true, false, true, true},     //curtir
                {false, true, true, true},      //Compart (Google, Face, Twt)
                {false, true, true, false},    //stream (google, Face)

        };

        for (RedeSocial elemento : usuario.redesSociais) {
            if (elemento instanceof Instagram)
                func.acaoInsta(elemento, exe);

            if (elemento instanceof GooglePlus) {
                func.acaoGoogle(elemento, exe);
            }

            if (elemento instanceof Facebook) {
                func.acaoFace(elemento, exe);
            }

            if (elemento instanceof Twitter) {
                func.acaoTwitt(elemento, exe);
            }
        }

    }
}