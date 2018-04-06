package jeu;

import java.util.ArrayList;

import hero.Hero;
import monde.Lieux;
import monde.Sorties;
import monde.SortiesSpeciales;
import objets.Objets;

/**
 * @author mcousteau & sgerbaud
 */
public class CreationPartie {

    /**
     * . Hero
     */
    private final Hero myHero;

    /**
     * . Map Lieux
     */
    private final ArrayList<Lieux> myMap;

    /**
     * . Constructeur partie
     * @param name
     *            Nom héro
     */
    public CreationPartie(final String name) {
        this.myMap = new ArrayList<Lieux>();
        this.myHero = new Hero(name);
        this.initLieux(myMap);
        this.myHero.modifierLieuxActuel(myMap.get(0));
    }

    /**
     * . Initialise tous les lieux
     * @param myLieux
     *            Liste contenant tous les lieux
     */
    public void initLieux(final ArrayList<Lieux> myLieux) {
        final Lieux l1 = new Lieux("Cellule de prison",
                "-Biiip- Vous n'avez pas beaucoup de chose dans votre cellule, "
                        + "seulement un lit dans le coin et un panneau"
                        + " -Bip- avec\n"
                        + "le numéro de votre cellule. Un terminal "
                        + "semble bloquer la porte donnant sur le-Bip-couloir");

        final Lieux l2 = new Lieux("Couloir prison",
                "-BipBip- Vous êtes dans le couloir reliant toutes les cellules"
                        + "du secteur prison du vaisseau, "
                        + "j’aperçois une salle avec\n"
                        + "quelques casiers servant probablement de "
                        + "petit dépôt. -Biiip- De l'autre côté du couloir "
                        + "vous devriez voir une salle de contrôle hexagonale "
                        + "donnant sur l’accès aux cellules de sauvetage "
                        + "d'urgence.. Faites attention je distingue une forme "
                        + "de vie hostile dans cette dernière -Biip-Bip-");

        final Lieux l3 = new Lieux("Dépôt",
                "-Biip-BIP- C'est une salle sans issue, plutôt délabré, "
                        + "à première vue inutile.. Il y a plusieurs casiers "
                        + "et une caisse "
                        + "de rangement à ouverture par carte magnétique\n"
                        + "et un casque avec une gravure au dos. -Bipbipbip-");

        final Lieux l4 = new Lieux("Salle de contrôle",
                "-BIP-biip- Vous êtes fou Lieutenant "
                        + this.myHero.getIdentite()
                        + ", je vous avez dit avoir détecté quelque chose, "
                        + "un Trooper est en face de vous, faites "
                        + "quelques chose -Biiip- vite !!\n"
                        + "Avant qu'il alerte le reste des gardes ! "
                        + "Vous avez qu'un seul essai sinon on va y rester ! "
                        + "-Biiip-Bip-");

        final Lieux l5 = new Lieux("Capsules de sauvetage",
                "-BIIIIIP- Lieutenant ! J'ai pu envoyer les coordonnées du "
                        + "Star Destroyer, si introuvable depuis tout ce temps,"
                        + "à notre base sur Yavin IV,la flotte rebelle arrive\n"
                        + "en embuscade pour mettre un terme à cette guerre ! "
                        + "Je vous rejoins immédiatement pour nous extraire, "
                        + "je vous félicite Lieutenant "
                        + this.myHero.getIdentite()
                        + " vous avez fait un travail remarquable "
                        + "aujourd'hui !!");

        final SortiesSpeciales s1 = new SortiesSpeciales("couloir", l2,
                "C'est une porte menant au couloir.");
        l1.ajouterSortie(s1);
        l1.ajouterObjet(Objets.valueOf("panneau"));
        l1.ajouterObjet(Objets.valueOf("terminal"));

        final Sorties s2 = new Sorties("dépôt", l3, true,
                "C'est une porte menant au dépôt.");
        final Sorties s3 = new Sorties("salle", l4, true,
                "C'est une porte menant à la salle de contrôle.");
        l2.ajouterSortie(s2);
        l2.ajouterSortie(s3);

        l3.ajouterObjet(Objets.valueOf("casier"));
        l3.ajouterObjet(Objets.valueOf("casque"));
        l3.ajouterObjet(Objets.valueOf("blaster"));
        l3.ajouterObjet(Objets.valueOf("bâton"));
        l3.ajouterObjet(Objets.valueOf("carte"));
        l3.ajouterSortie(s1);

        final SortiesSpeciales s4 = new SortiesSpeciales("sauvetage", l5,
                "C'est une porte, menant à votre sauvetage, "
                        + "nécessitant un pass.");
        l4.ajouterSortie(s4);
        l4.ajouterObjet(Objets.valueOf("pass"));
        l4.ajouterEnnemi();

        myLieux.add(l1);
        myLieux.add(l2);
        myLieux.add(l3);
        myLieux.add(l4);
        myLieux.add(l5);
    }

    /**
     * . Rècupère le héro
     * @return Héro
     */
    public Hero retourneHero() {
        return this.myHero;
    }
}
