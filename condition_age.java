package exmaen2014;

public class condition_age implements condition_acces {
    private int ageMin;

    public condition_age(int ageMin) {
        this.ageMin = ageMin;
    }

    public boolean accesPossible(personne p) {
        if (p.getAge() >= ageMin) {
            return true;
        } else {
            return false;
        }
    }

    public int getAgeMin() {
        return ageMin;
    }
}