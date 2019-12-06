package models;

import java.time.LocalDate;
import java.util.Scanner;

public class NonLoge extends Etudiant{
    private String adresse;
    private static int aide = 100000;

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

    public String show()
    {
        return "["+super.show()+", "+adresse+", "+aide+"]";
    }
    public String toString()
    {
        return "["+super.toString()+", "+adresse+", "+aide+"]";
    }
    public void saisie()
    {
        super.saisie();
        Scanner sc= new Scanner(System.in);
        System.out.println("Entrez votre adresse");
        adresse = sc.nextLine();

    }
    @Override
    public boolean isLoge() {
        return false;
    }
}
