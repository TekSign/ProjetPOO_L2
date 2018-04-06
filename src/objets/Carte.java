package objets;

import hero.Hero;

/**
 * @author mcousteau & sgerbaud
 */
public class Carte extends Objet {

    /**
     * .
     * Constructeur CARTE
     */
    public Carte() {
        super("Je suis une carte magnétique", "", true, false);
    }

    /**
     * . Affichage après avoir récupéré une carte
     */
    @Override
    public String effet(final Hero myHero, final String[] tab) {
        final String porte = tab[2];

        if (porte.equals("caisse")) {
            return "-Biip- La caisse contient un blaster et un bâton -Bip-.";
        } else {
            return "Vous avez ramassé la carte magnétique.";
        }

    }
}
