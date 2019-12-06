package models;

import java.time.LocalDate;

public class NonLoge extends Etudiant{
    private int aide;
    private String adresse;

    public NonLoge() {
    }

    public NonLoge(String nom, String prenom, String mat, LocalDate datNais, int aide, String adresse) {
        super(nom, prenom, mat, datNais);
        this.aide = aide;
        this.adresse = adresse;
    }

    public int getAide() {
        return aide;
    }

    public void setAide(int aide) {
        this.aide = aide;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public boolean isLoge() {
        return false;
    }
}
