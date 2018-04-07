package objets;

import hero.Hero;

public class Caisse extends Objet {

    /**
     * . Constructeur CAISSE
     */
    public Caisse() {
        super("Cette caisse renferme probablement "
                + "des objets importants pour les troopers.", "", false, false);
    }

    /**
     * . Affiche au joueur le résultat de l'utilisation de la caisse
     */
    @Override
    public String effet(final Hero myHero, final String[] tab) {
        return "Ceci n'a aucun effet.";
    }
}
