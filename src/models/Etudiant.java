package models;

import java.time.LocalDate;

public abstract class  Etudiant {
    protected String nom, prenom, mat;
    protected LocalDate datNais;

    public Etudiant() {
    }

    public Etudiant(String nom, String prenom, String mat, LocalDate datNais) {
        this.nom = nom;
        this.prenom = prenom;
        this.mat = mat;
        this.datNais = datNais;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMat() {
        return mat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }

    public LocalDate getDatNais() {
        return datNais;
    }

    public void setDatNais(LocalDate datNais) {
        this.datNais = datNais;
    }

    public abstract boolean isLoge();
}
