package actions;

import hero.Hero;

/**
 * @author mcousteau & sgerbaud
 */
public class Look extends Action {

    /**
     * . Constructeur LOOK
     */
    public Look() {
        super(1);
    }

    /**
     * . Effet commande LOOK : Décris les alentours au joueur
     */
    @Override
    public String actionHero(final Hero myHero, final String[] myStr) {
        String nomObjetOuSortie = null;
        if (myStr.length == 1) {
            return myHero.getLocation().getDescription();
        } else if (myStr.length == this.nbArg + 1) {
            try {
                nomObjetOuSortie = myStr[1];
            } catch (final ArrayIndexOutOfBoundsException e) {
                return "-Biiiip- Pour utiliser la commande look, "
                        + "-Bip- saisissez seulement une indication, "
                        + "comme -Biip- par exemple : look vaisseau";
            }

            final int s = myHero.getLocation()
                    .rechercherIndexSortie(nomObjetOuSortie);

            final int o = myHero.getLocation()
                    .rechercherIndexObjet(nomObjetOuSortie);

            if (s >= 0) {
                return myHero.getLocation().retourneSortiesViaIndex(s)
                        .getDescription();
            } else if (o >= 0) {
                return myHero.getLocation().retourneObjetViaIndex(o)
                        .renvoiObjet().renvoiDescrip();
            } else {
                return "Vous regardez " + nomObjetOuSortie;
            }

        } else {
            return "-Biiiip- Pour utiliser la commande look, "
                    + "-Bip- saisissez seulement une indication,"
                    + " comme -Biip- par exemple : look vaisseau";
        }
    }
}
