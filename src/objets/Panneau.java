package objets;

import hero.Hero;

/**
 * @author mcousteau & sgerbaud
 */
public class Panneau extends Objet {

    /**
     * . Constructeur PANNEAU
     */
    public Panneau() {
        super("Sur le panneau apparaît un seul chiffre... le numéro 6", "",
                false, false);
    }

    /**
     * . Aucune utilisation de cet objet n'est possible, à part afficher sa
     * description
     */
    @Override
    public String effet(final Hero myHero, final String[] tab) {
        return "Il n'y a rien à faire avec cette objet.";
    }
}
