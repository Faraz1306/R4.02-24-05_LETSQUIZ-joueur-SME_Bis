package org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.entities.dto.example.services.interfaces;


import org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.entities.dto.example.entities.dto.JoueurDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.entities.dto.example.utils.pseudoNonUniqueException;

public interface IJoueur {
    public void ajouterJoueur(JoueurDTO j) throws pseudoNonUniqueException;

}
