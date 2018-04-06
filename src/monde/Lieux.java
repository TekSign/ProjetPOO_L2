package monde;

import java.util.ArrayList;

import objets.Objets;

/**
 * @author mcousteau & sgerbaud
 */
public class Lieux {

    private final String description;
    private final ArrayList<Objets> myObjets;
    private final ArrayList<Sorties> mySorties;
    private int nbEnnemi;
    private final String nom;

    /**
     * . Constructeur d'un lieu
     * @param n
     *            Nom
     * @param d
     *            Description
     */
    public Lieux(final String n, final String d) {
        this.nom = n;
        this.mySorties = new ArrayList<Sorties>();
        this.myObjets = new ArrayList<Objets>();
        this.description = d;
        this.nbEnnemi = 0;
    }

    /**
     * . Augmente de 1 le nombre d'ennemi du lieu
     */
    public void ajouterEnnemi() {
        this.nbEnnemi++;
    }

    /**
     * . Lie un objet au lieu
     * @param o
     *            Objet à lier
     */
    public void ajouterObjet(final Objets o) {
        this.myObjets.add(o);
    }

    /**
     * . Lier une sortie au lieu
     * @param s
     *            Sortie choisie
     */
    public void ajouterSortie(final Sorties s) {
        this.mySorties.add(s);
    }

    /**
     * . Rècupère la description du lieu.
     * @return Description du lieu
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * . Rècupère le nombre d'ennemis du lieu
     * @return Nombre d'ennemis
     */
    public int getnbEnnemi() {
        return this.nbEnnemi;
    }

    /**
     * . Rècupère le nom du lieu.
     * @return Nom du lieu
     */
    public String getNom() {
        return this.nom;
    }

    /**
     * . VOIR : rechercherIndexSortie, pour un objet
     * @param sor
     *            Objet à chercher
     * @return Index correspondant
     */
    public int rechercherIndexObjet(final String sor) {
        int test = -1;
        for (final Objets o : myObjets) {
            if (o.renvoiNomObjet().equals(sor)) {
                test = myObjets.indexOf(o);
            }
        }
        return test;
    }

    /**
     * . Recherche l'index d'une sortie dans la liste
     * @param sor
     *            Sortie à chercher
     * @return Index correspondant
     */
    public int rechercherIndexSortie(final String sor) {
        int index = -1;

        for (final Sorties s : mySorties) {
            if (s.getNom().equals(sor)) {
                index = mySorties.indexOf(s);
            }
        }
        return index;
    }

    /**
     * . VOIR : rechercherIndexSortie, pour une sortie spéciale
     * @param sor
     *            Sortie spéciale à chercher
     * @return Index correspondant
     */
    public int rechercherIndexSortieSpe(final String sor) {
        int index = -1;

        for (final Sorties s : mySorties) {
            if (s.getNom().equals(sor) && (s instanceof SortiesSpeciales)) {
                index = mySorties.indexOf(s);
            }
        }
        return index;
    }

    /**
     * . Enlève la liaison entre l'objet et le lieu
     * @param obj
     *            Objet à retirer du lieu
     */
    public void retirerObjet(final Objets obj) {
        if (this.myObjets.indexOf(obj) != -1) {
            this.myObjets.remove(obj);
        }
    }

    /**
     * . VOIR : retourneObjetViaIndex, pour un objet
     * @param index
     *            Index à trouver
     * @return Objet correspondant
     */
    public Objets retourneObjetViaIndex(final int index) {
        return myObjets.get(index);
    }

    /**
     * . VOIR : retourneSortiesViaIndex, pour une sortie spéciale
     * @param index
     *            Index à trouver
     * @return Sortie correspondante
     */
    public SortiesSpeciales retourneSortiesSpeViaIndex(final int index) {
        return (SortiesSpeciales) mySorties.get(index);
    }

    /**
     * . Recherche une sortie dans la liste via son index
     * @param index
     *            Index à trouver
     * @return Sortie correspondantes
     */
    public Sorties retourneSortiesViaIndex(final int index) {
        return mySorties.get(index);
    }

    /**
     * . Diminue de 1 le nombre d'ennemis du lieu
     */
    public void supprimerEnnemi() {
        this.nbEnnemi--;
    }

    /**
     * . Retire une sortie spéciale de la liste
     * @param sor
     *            Sortie à supprimer
     */
    public void supprimeSortiesSpeciale(final Sorties sor) {
        if (this.mySorties.indexOf(sor) != -1) {
            this.mySorties.remove(sor);
        }
    }
}
