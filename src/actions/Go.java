package actions;

import hero.Hero;

/**
 * @author mcousteau & sgerbaud
 */
public class Go extends Action {

    /**
     * . Constructeur GO
     */
    public Go() {
        super(1);
    }

    /**
     * . Effet commande GO : permet au joueur de changer de lieu
     */
    @Override
    public String actionHero(final Hero myHero, final String[] myStr) {
        String nomSortie = null;
        try {
            nomSortie = myStr[1];
        } catch (final ArrayIndexOutOfBoundsException e) {
            return "-Biiip- Pour utiliser la commande go, vous devez renseigner"
                    + " un lieu -Bip-, comme par exemple : go colline";
        }

        if (myStr.length == this.nbArg + 1) {

            final int s = myHero.getLocation().rechercherIndexSortie(nomSortie);

            if (s >= 0) {
                if (myHero.getLocation().retourneSortiesViaIndex(s).getEtat()) {
                    myHero.modifierLieuxActuel(myHero.getLocation()
                            .retourneSortiesViaIndex(s).getLieux());
                    if ((myHero.getLocation().getNom())
                            .equals("Capsules de sauvetage")) {
                        myHero.modifGagne();
                        return myHero.getLocation().getDescription() + "\n"
                                + "THE END - VICTOIRE";
                    } else {
                        return "Chargement de la nouvelle pièce en cours ..."
                                + "\n" + myHero.getLocation().getDescription();
                    }
                } else {
                    return "La porte n'est pas ouvrable pour le moment.";
                }
            } else {
                return "Le lieu saisi n'existe pas, veuillez recommencer.";
            }
        } else {
            return "-Biiiip- Pour utiliser la commande go, "
                    + "vous devez renseigner un lieu -Bip-, "
                    + "comme par exemple : go colline";
        }
    }
}
