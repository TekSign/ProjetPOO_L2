package objets;

import hero.Hero;

/**
 * @author mcousteau & sgerbaud
 */
public class Casque extends Objet {

    /**
     * .
     * Constructeur CASQUE
     */
    public Casque() {
        super("Il y a une inscription sur "
                + "ce casque de trooper. On peut voir noté 13-12", "", false,
                false);
    }

    /**
     * . Affiche au joueur la description du casque
     */
    @Override
    public String effet(final Hero myHero, final String[] tab) {
        final String action = tab[0];

        if (action.equals("use")) {
            return "Il n'y a rien à faire avec cette action.";
        } else {
            return "Le casque ne vous servira à rien.";
        }

    }
}
