package br.com.guilherme.musicapp.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio) {
        if(audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " é considerado um sucesso");
        } else {
            System.out.println(audio.getTitulo() + " vale a pena ouvir depois");
        }
    }
}
