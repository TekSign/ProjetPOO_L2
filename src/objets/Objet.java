package objets;

import hero.Hero;

/**
 * @author mcousteau & sgerbaud
 */
public abstract class Objet {
    private String description;
    private final String descriptionHacke;
    private final boolean estHackable;
    private final boolean estRamassable;

    /**
     * . Constructeur d'un objet
     * @param d
     *            Description normale de l'objet
     * @param d2
     *            Description (une fois piraté) de l'objet
     * @param b
     *            Booléen qui sait si un objet est rammassable ou non
     * @param b2
     *            Booléen qui sait si un objet est piratable ou non
     */
    public Objet(final String d, final String d2, final boolean b,
            final boolean b2) {
        this.description = d;
        this.descriptionHacke = d2;
        this.estRamassable = b;
        this.estHackable = b2;
    }

    /**
     * . Fonction abstraite redéfini dans chaque type d'objet décrivant l'effet
     * de chacun
     * @param myHero
     *            Héro
     * @param tab
     *            Arguments passé par le joueur
     * @return Affichage standard pour le joueur
     */
    public abstract String effet(Hero myHero, String[] tab);

    /**
     * . Rècupère l'état d'un objet pour savoir si il est ramassable
     * @return Booléen
     */
    public boolean getEstRamassable() {
        return this.estRamassable;
    }

    /**
     * . Permet de changer la description d'un objet pour une différente si
     * l'objet est hackable
     */
    public void modifApresHack() {
        if (this.estHackable) {
            this.description = this.descriptionHacke;
        }
    }

    /**
     * . Rècupère la description d'un objet
     * @return Description
     */
    public String renvoiDescrip() {
        return this.description;
    }
}
