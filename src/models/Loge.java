package models;

import java.time.LocalDate;
import java.util.Scanner;

public class Loge extends Etudiant {
    private String batiment , chambre;
    private int montant, typeBourse;

    public Loge() {
    }

    public Loge(String nom, String prenom, String mat, LocalDate datNais, String batiment, String chambre, int typeBourse, int montant) {
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

    public int getTypeBourse() {
        return typeBourse;
    }

    public void setTypeBourse(int typeBourse) {
        this.typeBourse = typeBourse;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }


    public String show()
    {
        return "["+super.show()+", "+batiment+", "+chambre+" ,"+typeBourse+","+montant+"]";
    }
    public String toString()
    {
        return "["+super.toString()+", "+batiment+", "+chambre+" ,"+typeBourse+","+montant+"]";
    }
    public void saisie()
    {
        super.saisie();
        Scanner sc= new Scanner(System.in);
        System.out.println("Entrez votre Numero de batiment");
        batiment = sc.nextLine();
        System.out.println("Entrez votre numero de chambre");
        chambre = sc.nextLine();
        do {
            System.out.println("Saisir 0 pour demi bourse ou 1 pour bourse entiere");
            typeBourse = sc.nextInt();
        }while (typeBourse!=0 && typeBourse!=1);
        montant=(typeBourse==0?20000:40000);

    }

    @Override
    public boolean isLoge() {
        return true;
    }
}
