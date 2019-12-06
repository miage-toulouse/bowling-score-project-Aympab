package miage.AMI.bowlingScore;

import org.junit.Test;

import static org.junit.Assert.*;

//Bob Martin, Uncle Bob. Clean Code
public class PartieTest {


    @Test
    public void testCalculScorePartieSansStrikeSansSpare(){
        //given : une partie de 10 jeux avec 6 quilles tombées dans chaque jeu
        Jeu leJeu = new Jeu(6,0);
        Partie laPartie = new Partie(leJeu);

        //when : on calcule le score
        Integer score = laPartie.calculerScore();

        //then : on obtient un score de 60
        assertEquals(Integer.valueOf(60), score);
    }


    @Test
    public void testCalculScoreFullSpare(){
        //given : une partie de 10 jeux avec que des spares (5 quilles tombées au lancer1 et 5 au lancer2)
        Jeu jeu = new Jeu(5,5);
        Jeu unSpare = new Spare(5,5, jeu);
        Partie laPartie = new Partie(unSpare);

        //when : on calcule le score
        Integer score = laPartie.calculerScore();

        //then : on obtient un score de 150
        assertEquals(Integer.valueOf(150), score);

    }

    @Test
    public void testCalculScoreFullStrike(){
        //given : une partie de 10 jeux avec que des strikes (10 quilles tombées au lancer1)
        Jeu jeuBonus = new Jeu(10, null);
        Jeu unStrike = new Strike(jeuBonus,jeuBonus);
        Partie laPartie = new Partie(unStrike);

        //when : on calcule le score
        Integer score = laPartie.calculerScore();

        //then : on obtient un score de 300
        assertEquals(Integer.valueOf(300), score);

    }

    @Test
    public void testCalculScorePartieAvecToutesSortesDeJeux(){
        //given : une partie en alternant stike spare jeu normal 3 fois puis un autre jeu normal = (5 quilles tombées puis 0)
        Jeu jeuNormal = new Jeu(5,0);
        Jeu spare  = new Spare(5,5, jeuNormal);
        Jeu strike = new Strike(spare);

        Partie laPartie = new Partie(strike, spare, jeuNormal, strike, spare, jeuNormal, strike, spare, jeuNormal, jeuNormal);

        //when : on calcule le score
        Integer score = laPartie.calculerScore();

        //then on obtient un score de 125
        assertEquals(Integer.valueOf(125), score);

    }


}