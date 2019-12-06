package models;

import java.text.DecimalFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public abstract class  Etudiant {
    protected String nom, prenom, mat;
    protected LocalDate datNais;
    private static int nbEtudiant = 0;

    public Etudiant() {
        nbEtudiant++;
    }

    public Etudiant(String nom, String prenom, String mat, LocalDate datNais) {
        this.nom = nom;
        this.prenom = prenom;
        this.mat = mat;
        this.datNais = datNais;
        nbEtudiant++;
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


    public String show()
    {
        return "["+mat+", "+nom+", "+prenom+" ,"+datNais+"]";
    }

    public String toString()
    {
        return "["+mat+", "+nom+", "+prenom+" ,"+datNais+"]";
    }
    public long getAge()
    {
        return Duration.between(datNais.atTime(0,0),
                LocalDate.now().atTime(0,0)).toDays()/365;
    }

    public static int getNbEtudiant() {

        return nbEtudiant; //constructeur qui na pas de setter
        //on ne peu pas utiliser des variable non static dans la methode
    }
    public void saisie()
    {
        Scanner sc= new Scanner(System.in);
        mat ="M"+new DecimalFormat("0000").format(Etudiant.getNbEtudiant());
        System.out.println("Matricule: "+mat);
        System.out.println("Entrez votre Prenom");
        prenom = sc.nextLine();
        System.out.println("Entrez votre Nom");
        nom = sc.nextLine();
        DateTimeFormatter df= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Entrez votre Date de naissance");
        datNais = LocalDate.parse(sc.nextLine(),df);
        //sc.close();
    }
    public abstract boolean isLoge();

}
