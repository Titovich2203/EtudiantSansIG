package services;

import models.Etudiant;
import models.Loge;
import models.NonLoge;

import java.util.List;

public interface IEtudiant {

    public void ajoutEtudiant(List<Etudiant> list);

    public List<Loge> afficherLoge(List<Etudiant> list);

    public List<NonLoge> afficherNonLoge(List<Etudiant> list);

    public Etudiant afficher(List<Etudiant> list);

    public Etudiant rechercherEtudiant(List<Etudiant> list, String mat);

    public int sommeAide(List<Etudiant> list);
}
