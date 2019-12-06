package miage.AMI.bowlingScore;

public class Spare extends Jeu{

    protected Jeu jeuBonus;

    public Spare(Integer lancer1, Integer lancer2, Jeu jeuBonus) {
        super(lancer1, lancer2);
        this.jeuBonus = jeuBonus;
    }

    @Override
    public Integer calculerScore() {
        Integer score = super.calculerScore();
        score += this.jeuBonus.lancer1;

        return score;
    }
}
