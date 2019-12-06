package miage.AMI.bowlingScore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Partie {

    private List<Jeu> jeux = new ArrayList<Jeu>();


    public Partie(Jeu leJeu) {
        for(int i = 0; i < 10; i++){
            this.jeux.add(leJeu);
        }
    }

    public Partie(Jeu jeu1, Jeu jeu2, Jeu jeu3, Jeu jeu4, Jeu jeu5, Jeu jeu6, Jeu jeu7, Jeu jeu8, Jeu jeu9, Jeu jeu10) {
        this.jeux.add(jeu1);
        this.jeux.add(jeu2);
        this.jeux.add(jeu3);
        this.jeux.add(jeu4);
        this.jeux.add(jeu5);
        this.jeux.add(jeu6);
        this.jeux.add(jeu7);
        this.jeux.add(jeu8);
        this.jeux.add(jeu9);
        this.jeux.add(jeu10);
    }

    public Integer calculerScore() {

        Integer score = 0;
        Iterator<Jeu> ite = this.jeux.iterator();

        while(ite.hasNext()){
            score += ite.next().calculerScore();
        }

        return score;
    }
}
