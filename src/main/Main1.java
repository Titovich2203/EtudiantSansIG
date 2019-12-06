package main;

import models.Etudiant;
import services.EtudiantI;
import services.IEtudiant;

import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        IEtudiant s = new EtudiantI();
        List<Etudiant> list = new List<Etudiant>;*/
        int choix;
        do {
            choix = menu();
            cls();
            switch (choix)
            {
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("4");
                    break;
                case 5:
                    System.out.println("5");
                    break;
            }
            pause();
        }while (choix!=6);
    }


    public static int menu()
    {
        Scanner sc = new Scanner(System.in);
        int x;
        cls();
        System.out.println("\t\t==============================");
        System.out.println("\t\t             MENU             ");
        System.out.println("\t\t==============================\n");
        System.out.println("\t\t1-              AJOUT ETUDIANT");
        System.out.println("\t\t2-          LISTE DES ETUDIANT");
        System.out.println("\t\t3-             LISTE DES LOGES");
        System.out.println("\t\t4-         LISTE DES NON LOGES");
        System.out.println("\t\t5-         RECHERCHER ETUDIANT");
        System.out.println("\t\t6-                     QUITTER\n");
        do {
            System.out.print("\t\t    VOTRE CHOIX : ");
            x = sc.nextInt();
        }while (x < 1 || x > 6);
        return x;
    }
    public static void cls()
    {
        try {
            Runtime.getRuntime().exec("cls");
        }catch (Exception e)
        {

        }
    }
    public static void pause()
    {
        System.out.print("Press Any Key To Continue...");
        new java.util.Scanner(System.in).nextLine();
    }
}
