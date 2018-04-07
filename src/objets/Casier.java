package objets;

import hero.Hero;

/**
 * @author mcousteau & sgerbaud
 */
public class Casier extends Objet {

    /**
     * . Constructeur CASIER
     */
    public Casier() {
        super("Il s'agit d'un casier où un stormtrooper mets ses affaires.",
                "Rien de bien intéressant, seulement les effets "
                        + "personnels du Trooper de garde sûrement, il "
                        + "semble avoir oublié une carte magnétique..."
                        + " A quoi peut-elle bien servir ?",
                false, true);
    }

    /**
     * . Selon la commande utilisée, affiche au joueur l'effet de cette dernière
     */
    @Override
    public String effet(final Hero myHero, final String[] tab) {
        final String action = tab[0];

        if (action.equals("use")) {
            return "Il n'y a rien à faire avec cette action.";
        } else {
            return "Le casier est ouvert.";
        }
    }

}
