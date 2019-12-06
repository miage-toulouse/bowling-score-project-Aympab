package miage.AMI.bowlingScore;

public class Strike extends Spare {

    private Jeu jeuBonus2;

    public Strike(Jeu jeuBonus, Jeu jeuBonus2) {
        super(10, null, jeuBonus);
        this.jeuBonus2 = jeuBonus2;
    }

    public Strike(Jeu jeuBonus) {
        super(10, null, jeuBonus);
        this.jeuBonus2 = null;
    }

    @Override
    public Integer calculerScore() {
        Integer score = super.calculerScore();

        if(this.jeuBonus2 == null){
            score += this.jeuBonus.lancer2;
        }
        else{
            score += this.jeuBonus2.lancer1;
        }

        return score;
    }


}
