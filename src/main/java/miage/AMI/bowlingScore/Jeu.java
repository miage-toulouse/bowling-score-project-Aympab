package miage.AMI.bowlingScore;

public class Jeu {

    //Nombre de quilles tombées lors des deux lancers
    protected Integer lancer1;
    protected Integer lancer2;

    public Jeu(Integer lancer1, Integer lancer2) {
        this.lancer1 = lancer1;
        this.lancer2 = lancer2;
    }

    public Integer calculerScore() {
        Integer score = 0;

        if(this.lancer1 != null){
            score += this.lancer1;
        }

        if(this.lancer2 != null){
            score += this.lancer2;
        }

        return score;
    }
}
