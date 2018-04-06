package actions;

import hero.Hero;

/**
 * @author mcousteau & sgerbaud
 */
public class Help extends Action {

    /**
     * . Constructeur HELP
     */
    public Help() {
        super(0);
    }

    /**
     * . Effet commande HELP : affiche la description de chaque commande en
     * rappel au joueur.
     * @return affichage utilisateur
     */
    @Override
    public String actionHero(final Hero myHero, final String[] myStr) {
        if (myStr.length != this.nbArg + 1) {
            return "-Biiiip- Pour utiliser la commande help, "
                    + "-Bip- saisissez uniquement help";
        } else {
            return "- look --> vous donnera une brève "
                    + "description des lieux où vous vous trouvez\n"
                    + "- go --> permet de vous déplacer "
                    + "dans un lieux accessible depuis celui où vous êtes\n"
                    + "- use --> permet d'utiliser un "
                    + "objet de votre choix présent dans votre inventaire\n"
                    + "- inventory --> vous donnera la "
                    + "liste des objets présent dans votre inventaire\n"
                    + "- take --> permet de ramasser un "
                    + "objet ciblé présent dans le lieu\n"
                    + "- hack --> permet de demander à BB-R4 "
                    + "de pirater un terminal choisi\n"
                    + "- help --> vous donnera les instructions de jeu\n"
                    + "- quit --> permet de quitter le jeu à tout moment";
        }
    }
}
