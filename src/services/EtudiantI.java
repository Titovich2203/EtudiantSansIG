package services;

import models.Etudiant;
import models.Loge;
import models.NonLoge;

import java.util.*;

public class EtudiantI implements IEtudiant {


    @Override
    public void ajoutEtudiant(List<Etudiant> list) {
        Scanner sc = new Scanner(System.in);
        String rep;
        Etudiant et;
        System.out.println("\n\n\t\tAJOUT ETUDIANT\n");
        do {
            System.out.println("L'ETUDIANT EST - IL LOGE ?? [O/N] : ");
            rep = sc.nextLine();
        }while(!(rep.equals('N') || rep.equals('O') || rep.equals('o') || rep.equals('n')));
        if(rep.equals('O') || rep.equals('o'))
        {
            et = new Loge();
        }
        else
        {
            et = new NonLoge();
        }
        list.add(et);
    }

    @Override
    public List<Loge> afficherLoge(List<Etudiant> list) {
        List<Loge> L = new List<Loge>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Loge> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Loge loge) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Loge> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Loge> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Loge get(int index) {
                return null;
            }

            @Override
            public Loge set(int index, Loge element) {
                return null;
            }

            @Override
            public void add(int index, Loge element) {

            }

            @Override
            public Loge remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Loge> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Loge> listIterator(int index) {
                return null;
            }

            @Override
            public List<Loge> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        for(Etudiant et:list){
            if(et.isLoge())
                L.add((Loge) et);
        }
        return L;
    }

    @Override
    public List<NonLoge> afficherNonLoge(List<Etudiant> list) {
        List<NonLoge> nonL = new List<NonLoge>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<NonLoge> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(NonLoge nonLoge) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends NonLoge> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends NonLoge> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public NonLoge get(int index) {
                return null;
            }

            @Override
            public NonLoge set(int index, NonLoge element) {
                return null;
            }

            @Override
            public void add(int index, NonLoge element) {

            }

            @Override
            public NonLoge remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<NonLoge> listIterator() {
                return null;
            }

            @Override
            public ListIterator<NonLoge> listIterator(int index) {
                return null;
            }

            @Override
            public List<NonLoge> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        for(Etudiant et:list){
            if(!et.isLoge())
                nonL.add((NonLoge) et);
        }
        return nonL;
    }

    @Override
    public Etudiant afficher(List<Etudiant> list) {
        return null;
    }

    @Override
    public Etudiant rechercherEtudiant(List<Etudiant> list, String mat) {
        for (Etudiant et: list){
            if(et.getMat().equals(mat))
            {
                return et;
            }
        }
        return null;
    }

    @Override
    public int sommeAide(List<Etudiant> list) {
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
