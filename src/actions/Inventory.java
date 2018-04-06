package actions;

import hero.Hero;

/**
 * @author mcousteau & sgerbaud
 */
public class Inventory extends Action {

    /**
     * . Constructeur INVENTORY
     */
    public Inventory() {
        super(0);
    }

    /**
     * . Effet commande INVENTORY : ouvre et affiche l'inventaire du joueur.
     * @return affiche inventaire
     */
    @Override
    public String actionHero(final Hero myHero, final String[] myStr) {
        if (myStr.length != this.nbArg + 1) {
            return "-Biiiip- Pour utiliser la commande "
                    + "inventory, -Bip- saisissez uniquement inventory";
        } else {
            return myHero.ouvrirInventaire();
        }
    }
}
