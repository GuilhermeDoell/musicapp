package br.com.guilherme.musicapp.principal;

import br.com.guilherme.musicapp.modelos.MinhasPreferidas;
import br.com.guilherme.musicapp.modelos.Musica;
import br.com.guilherme.musicapp.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("The Nights");
        minhaMusica.setCantor("Avicii");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Falando Abobrinhas");
        meuPodcast.setApresentador("Fulano de Tal");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}
