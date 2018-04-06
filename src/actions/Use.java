package actions;

import hero.Hero;
import objets.Objets;

/**
 * @author mcousteau & sgerbaud
 */
public class Use extends Action {

    /**
     * . Constructeur USE
     */
    public Use() {
        super(2);
    }

    /**
     * . Effet commande USE : utilise un objet donné présent dans l'inventaire
     * sur quelque chose
     */
    @Override
    public String actionHero(final Hero myHero, final String[] myStr) {
        String objet = null;
        try {
            objet = myStr[1];
        } catch (final ArrayIndexOutOfBoundsException e) {
            return "-Biiiip- Pour utiliser la commande"
                    + " use, vous devez renseigner l'objet "
                    + "à utiliser et sur -Bip- quoi, "
                    + "comme par exemple : use clé porte";
        }

        if (myStr.length != this.nbArg + 1) {
            return "-Biiiip- Pour utiliser la commande use, "
                    + "vous devez renseigner l'objet à utiliser et "
                    + "sur -Bip- quoi, comme par exemple : use clé porte";
        } else {

            final int o = myHero.getLocation().rechercherIndexObjet(objet);

            if (o >= 0) {
                return Objets.valueOf(objet).renvoiObjet().effet(myHero, myStr);
            } else if (myHero.chercherObjetInventaire(Objets.valueOf(objet))) {
                return Objets.valueOf(objet).renvoiObjet().effet(myHero, myStr);
            } else {
                return "L'objet est introuvable.";
            }
        }
    }
}
