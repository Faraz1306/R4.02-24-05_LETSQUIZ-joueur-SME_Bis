package org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.entities.dto.example.services.impls;


import org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.entities.dto.example.entities.dto.JoueurDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.entities.dto.example.services.interfaces.IJoueur;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.entities.dto.example.utils.pseudoNonUniqueException;

import java.util.ArrayList;

public class JoueurImpl implements IJoueur {

    ArrayList<JoueurDTO> listeJoueur ;

    public JoueurImpl () {
        this.listeJoueur = new ArrayList<>() ;
    }

    @Override
    public void ajouterJoueur(JoueurDTO j) throws pseudoNonUniqueException {

        if ( j.getPseudonyme().isEmpty() ) { System.out.printf("Le pseudo est vide !"); }

        if (!listeJoueur.isEmpty()) {

            for( int i = 0 ; i < listeJoueur.size() ; i++ ) {
                if (j.getPseudonyme().equals(listeJoueur.get(i).getPseudonyme())) {
                    throw new pseudoNonUniqueException("Pseudo déja existant ! : " + j.getPseudonyme() ) ;
                }
            }

        }

        listeJoueur.add(j) ;
        System.out.printf( "Pseudo ajouté: " + j.getPseudonyme() );
    }

    public void ajouterJoueur2( ArrayList<JoueurDTO> listeJoueur, JoueurDTO j) throws pseudoNonUniqueException {

        if ( j.getPseudonyme().isEmpty() ) { System.out.printf("Le pseudo est vide !"); }

        if (!listeJoueur.isEmpty()) {

            for( int i = 0 ; i < listeJoueur.size() ; i++ ) {
                if (j.getPseudonyme().equals(listeJoueur.get(i).getPseudonyme())) {
                    throw new pseudoNonUniqueException("Pseudo déja existant ! : " + j.getPseudonyme() ) ;
                }
            }

        }

        listeJoueur.add(j) ;
        System.out.printf( "Pseudo ajouté: " + j.getPseudonyme() );
    }

}
