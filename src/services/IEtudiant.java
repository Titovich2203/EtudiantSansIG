package services;

import models.Etudiant;
import models.Loge;
import models.NonLoge;

import java.util.ArrayList;

public interface IEtudiant {

    public void ajoutEtudiant(ArrayList<Etudiant> list);

    public ArrayList<Loge> afficherLoge(ArrayList<Etudiant> list);

    public ArrayList<NonLoge> afficherNonLoge(ArrayList<Etudiant> list);

    public void afficher(ArrayList<Etudiant> list);

    public Etudiant rechercherEtudiant(ArrayList<Etudiant> list, String mat);

    public int sommeAide(ArrayList<Etudiant> list);
}
