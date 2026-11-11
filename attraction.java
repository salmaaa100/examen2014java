package exmaen2014;

public class attraction {
    private String nom;
    private float cout;
    private condition_age condition;
    private int nbPersonnes;
    private float recette;

    public attraction(String nom, float cout, condition_age condition) {
        this.nom = nom;
        this.cout = cout;
        this.condition = condition;
        this.nbPersonnes = 0;
        this.recette = 0;
    }

    public void affiche() {
        System.out.println("Attraction : " + nom);
        System.out.println("Cout : " + cout + " dinars");
        System.out.println("Age minimal : " + condition.getAgeMin());
        System.out.println("Nombre de personnes : " + nbPersonnes);
        System.out.println("Recette : " + recette + " dinars");
    }

    public boolean utilise(personne p) {
        if (condition.accesPossible(p)) {
            nbPersonnes = nbPersonnes + 1;
            recette = recette + cout;
            return true;
        } else {
            System.out.println("Acces interdit : " + p.getNom() + " est trop jeune !");
            return false;
        }
    }

    public String getNom() {
        return nom;
    }

    public condition_age getCondition() {
        return condition;
    }

    public float getRecette() {
        return recette;
    }
}