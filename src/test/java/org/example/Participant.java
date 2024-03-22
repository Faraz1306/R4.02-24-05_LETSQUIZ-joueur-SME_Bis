package org.example;

import java.util.ArrayList;

public class Participant {
    private ArrayList<Joueur> joueurs;
    public Participant (){
        this.joueurs = new ArrayList<>();

    }
    public boolean ajouterjoueur(Joueur joueur){
        if(this.joueurs.add(joueur)) {
            return true;
        }
        else{
            return false;
        }
    }
    public boolean supprimerJoueur(Joueur joueur){
        if(this.joueurs.remove(joueur)){
            return true;
        }
        return false;
    }
}
