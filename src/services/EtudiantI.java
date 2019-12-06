package services;

import models.Etudiant;
import models.Loge;
import models.NonLoge;

import java.util.*;

public class EtudiantI implements IEtudiant {


    @Override
    public void ajoutEtudiant(ArrayList<Etudiant> list) {
        Scanner sc = new Scanner(System.in);
        String rep;
        Etudiant et;
        System.out.println("\n\n\t\tAJOUT ETUDIANT\n");
        do {
            System.out.println("L'ETUDIANT EST - IL LOGE ?? [O/N] : ");
            rep = sc.nextLine();
        }while(!(rep.equals("N") || rep.equals("O") || rep.equals("o") || rep.equals("n") ));
        if(rep.equals("O") || rep.equals("o"))
        {
            et = new Loge();
        }
        else
        {
            et = new NonLoge();
        }
        et.saisie();
        list.add(et);
    }

    @Override
    public ArrayList<Loge> afficherLoge(ArrayList<Etudiant> list) {
        ArrayList<Loge> L = new ArrayList<Loge>();
        for(Etudiant et:list){
            if(et.isLoge())
                L.add((Loge) et);
        }
        return L;
    }

    @Override
    public ArrayList<NonLoge> afficherNonLoge(ArrayList<Etudiant> list) {
        ArrayList<NonLoge> nonL = new ArrayList<NonLoge>();
        for(Etudiant et:list){
            if(!et.isLoge())
                nonL.add((NonLoge) et);
        }
        return nonL;
    }

    @Override
    public void afficher(ArrayList<Etudiant> list) {
        for(Etudiant et:list){
            System.out.println("\n==================================");
            System.out.println(et.show());
            System.out.println("\n==================================");
        }
    }

    @Override
    public Etudiant rechercherEtudiant(ArrayList<Etudiant> list, String mat) {
        for (Etudiant et: list){
            if(et.getMat().equals(mat))
            {
                return et;
            }
        }
        return null;
    }

    @Override
    public int sommeAide(ArrayList<Etudiant> list) {
        int somme = 0;
        for(Etudiant et:list){
            if(!et.isLoge())
            {
                somme += ((NonLoge)et).getAide();
            }
        }
        return somme;
    }
}
