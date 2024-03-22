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
    public int MockGetScore(){
        return 7;
    }
    public String MockGetNom(){
        return "Mbappe";
    }
    public String MockGetPrenom(){
        return "Kilian";
    }
    public String MockGetPseudonyme(){
        return "Kiki";
    }public boolean MockSetscore(int score){
        this.score = score;
        return true;
    }
}