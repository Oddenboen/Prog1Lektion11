package opgave06;

public class Hero {
    double lifePoints;
    double damagePoints;
    double chanceOfHit;
    String name;
    String pronoun;
    String weapon;

    public Hero (double lifePoints, double damagePoints, double chanceOfHit, String name, String pronoun, String weapon) {
        this.lifePoints = lifePoints;
        this.damagePoints = damagePoints;
        this.chanceOfHit = chanceOfHit;
        this.name = name;
        this.pronoun = pronoun;
        this.weapon = weapon;
    }
}
