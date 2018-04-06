package objets;

import hero.Hero;

/**
 * @author mcousteau & sgerbaud
 */
public class Terminal extends Objet {

    /**
     * . Constructeur TERMINAL
     */
    public Terminal() {
        super("C'est le terminal qui permet l'ouverture "
                + "de la porte de la cellule.",
                "Le terminal a été hacké, la porte est ouverte.", false, true);
    }

    /**
     * . Selon la commande utilisé, affiche l'effet au joueur
     */
    @Override
    public String effet(final Hero myHero, final String[] tab) {
        final String action = tab[0];

        if (action == "use") {
            return "Vous ne pouvez pas vous en servir, il est cassé.";
        } else {
            return "Hack réussi sur le terminal de contrôle de la porte.";
        }
    }
}
