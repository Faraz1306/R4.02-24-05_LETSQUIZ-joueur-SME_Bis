package org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.entities.dto.example.entities.dto;

public class JoueurDTO {

    private String pseudonyme ;
    private String prenom ;
    private StatistiqueDTO stats ;

    private String hobbies ;

    public JoueurDTO ( String pseudo, String prenom, StatistiqueDTO stats, String hobbies ) {

        this.pseudonyme = pseudo ;
        this.prenom = prenom ;
        this.stats = stats ;
        this.hobbies = hobbies ;

    }

    public String getPseudonyme() {
        return pseudonyme;
    }

    public StatistiqueDTO getStats() {
        return stats;
    }

    public String getHobbies() {
        return hobbies;
    }

}
