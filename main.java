package exmaen2014;

public class main {
    public static void main(String[] args) {
        parc_attraction parc = new parc_attraction("Carthage Land", 5);
        attraction a1 = new attraction("dahdah", 5.0f, new condition_age(10));
        parc.ajouteAttraction(a1);

        personne p1 = new personne("Sana", 3, 165);
        personne p2 = new personne("Ahmed", 9, 125);

        a1.utilise(p1);
        a1.utilise(p2);

        parc.affiche();
        System.out.println("Recette totale : " + parc.getRecette());
    }
}