package exmaen2014;

public class personne {
    private String nom;
    private int age;
    private int taille;

    public personne(String nom, int age, int taille) {
        this.nom = nom;
        this.age = age;
        this.taille = taille;
    }

    public int getAge() {
        return age;
    }

    public String getNom() {
        return nom;
    }
}