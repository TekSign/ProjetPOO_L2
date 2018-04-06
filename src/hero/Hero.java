package hero;

import java.util.ArrayList;

import actions.Action;
import monde.Lieux;
import objets.Objets;

/**
 * @author mcousteau & sgerbaud
 */
public class Hero {

    /**
     * . Booleen gagné
     */
    private boolean aGagne = false;

    /**
     * . Booleen perdu
     */
    private boolean aPerdu = false;

    /**
     * . Identity
     */
    private final String identite;

    /**
     * . Inventaire
     */
    private final ArrayList<Objets> monSac;

    /**
     * . Lieux
     */
    private Lieux myLieux;

    /**
     * . Constructeur du héros
     * @param id
     *            Pseudo du joueur
     */
    public Hero(final String id) {
        this.identite = id;
        this.monSac = new ArrayList<Objets>();
    }

    /**
     * . Ajoute un objet à l'inventaire
     * @param o
     *            Objet choisi
     */
    public void ajouterObjets(final Objets o) {
        if (!this.chercherObjetInventaire(o)) {
            this.monSac.add(o);
        } else {
            System.out.println("Vous possédez déjà cet objet.");
        }
    }

    /**
     * . Test si un objet fait partie de l'inventaire
     * @param obj
     *            Objet à chercher
     * @return TRUE si présent / FALSE le cas contraire
     */
    public boolean chercherObjetInventaire(final Objets obj) {
        boolean test = false;
        for (final Objets o : monSac) {
            if (o.renvoiNomObjet().equals(obj.renvoiNomObjet())) {
                test = true;
            }
        }
        return test;
    }

    /**
     * . Transmet les arguments d'une commande entrés par le joueur
     * @param a
     *            Action
     * @param tab
     *            tableau
     * @return Finalité de l'action
     */
    public String execute(final Action a, final String[] tab) {
        return a.actionHero(this, tab);
    }

    /**
     * . Récupère le pseudo du joueur
     * @return Pseudo joueur
     */
    public String getIdentite() {
        return this.identite;
    }

    /**
     * . Rècupère le lieu où se trouve le héro
     * @return Lieu actuel
     */
    public Lieux getLocation() {
        return this.myLieux;
    }

    /**
     * . Rècupère le résultat du test si le joueur a gagné
     * @return Booléen victoire
     */
    public boolean getSiAGagne() {
        return this.aGagne;
    }

    /**
     * . Rècupère le résultat du test si le joueur a perdu
     * @return Booléen défaite
     */
    public boolean getSiAPerdu() {
        return this.aPerdu;
    }

    /**
     * . Déclenche la victoire du joueur
     */
    public void modifGagne() {
        this.aGagne = true;
    }

    /**
     * . Permet de changer le lieu dans lequel se trouve le héro
     * @param l
     *            Nouveau lieu choisi
     */
    public void modifierLieuxActuel(final Lieux l) {
        this.myLieux = l;
    }

    /**
     * . Déclenche la défaite du joueur
     */
    public void modifPerdu() {
        this.aPerdu = true;
    }

    /**
     * . Affiche le contenu de l'inventaire
     * @return Affichage standard du contenu
     */
    public String ouvrirInventaire() {
        String res = "";
        if (monSac.isEmpty()) {
            return "Le sac est vide.";
        }

        for (final Objets o : monSac) {
            res = res + " - " + o;
        }
        return res;
    }
}
