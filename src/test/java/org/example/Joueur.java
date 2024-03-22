package org.example;


public class Joueur{
    private String nom;
    private String prenom;
    private String pseudonyme;
    private int score;
    public Joueur(String nom, String prenom, String pseudonyme){
        this.nom = nom;
        this.prenom = prenom;
        this.pseudonyme = pseudonyme;

    }
    public int MockGetScoreKiki(){
        return 7;
    }
    public String MockGetNomKiki(){
        return "Mbappe";
    }
    public String MockGetPrenomKiki(){
        return "Kilian";
    }
    public String MockGetPseudonymeKiki(){
        return "Kiki";
    }
}