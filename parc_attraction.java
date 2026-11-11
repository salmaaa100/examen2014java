package exmaen2014;

public class parc_attraction {
    private attraction[] lesAttractions;
    private String nom;
    private int nb_attraction;
    public int taille;

    public parc_attraction(String nom, int taille) {
        this.nom = nom;
        this.taille = taille;
        this.lesAttractions = new attraction[taille];
        this.nb_attraction = 0;
    }

    public void ajouteAttraction(attraction att) {
        if (nb_attraction < taille) {
            lesAttractions[nb_attraction] = att;
            nb_attraction = nb_attraction + 1;
        } else {
            System.out.println("Erreur : le parc est plein !");
        }
    }

    public float getRecette() {
        float somme = 0;
        for (int i = 0; i < nb_attraction; i++) {
            somme = somme + lesAttractions[i].getRecette();
        }
        return somme;
    }

    public void affiche() {
        System.out.println("Parc : " + nom);
        for (int i = 0; i < nb_attraction; i++) {
            System.out.println("Nom : " + lesAttractions[i].getNom());
            System.out.println("Condition : Age minimum : " + lesAttractions[i].getCondition().getAgeMin());
            System.out.println("Recette : " + lesAttractions[i].getRecette() + " DT");
        }
    }
}