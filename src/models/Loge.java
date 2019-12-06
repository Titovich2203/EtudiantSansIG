package models;

import java.time.LocalDate;

public class Loge extends Etudiant {
    private String batiment , chambre, typeBourse;
    private int montant;

    public Loge() {
    }

    public Loge(String nom, String prenom, String mat, LocalDate datNais, String batiment, String chambre, String typeBourse, int montant) {
        super(nom, prenom, mat, datNais);
        this.batiment = batiment;
        this.chambre = chambre;
        this.typeBourse = typeBourse;
        this.montant = montant;
    }

    public String getBatiment() {
        return batiment;
    }

    public void setBatiment(String batiment) {
        this.batiment = batiment;
    }

    public String getChambre() {
        return chambre;
    }

    public void setChambre(String chambre) {
        this.chambre = chambre;
    }

    public String getTypeBourse() {
        return typeBourse;
    }

    public void setTypeBourse(String typeBourse) {
        this.typeBourse = typeBourse;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    @Override
    public boolean isLoge() {
        return true;
    }
}
