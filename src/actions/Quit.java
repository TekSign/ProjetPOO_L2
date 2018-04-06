package actions;

import hero.Hero;

/**
 * @author mcousteau & sgerbaud
 */
public class Quit extends Action {

    /**
     * . Constructeur QUIT
     */
    public Quit() {
        super(0);
    }

    /**
     * . Effet commande QUIT : quitte le jeu/programme
     */
    @Override
    public String actionHero(final Hero myHero, final String[] myStr) {
        if (myStr.length != this.nbArg + 1) {
            return "-Biiiip- Pour utiliser la commande"
                    + " quit, -Bip- saisissez uniquement quit.";
        } else {
            System.exit(0);
            return "";
        }
    }
}
