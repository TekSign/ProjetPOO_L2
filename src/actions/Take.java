package actions;

import hero.Hero;
import objets.Objets;

/**
 * @author mcousteau & sgerbaud
 */
public class Take extends Action {

    /**
     * . Constructeur TAKE
     */
    public Take() {
        super(1);
    }

    /**
     * . Effet commande TAKE : prends un objet choisi,ramassable et présent dans
     * la pièce et le place dans l'inventaire du joueur
     */
    @Override
    public String actionHero(final Hero myHero, final String[] myStr) {
        String nomObjet = null;
        try {
            nomObjet = myStr[1];
        } catch (final ArrayIndexOutOfBoundsException e) {
            return "-Biiiip- Pour utiliser la commande take, "
                    + "-Bip- saisissez l'objet que vous voulez "
                    + "prendre et placer dans votre inventaire, "
                    + "comme par exemple : take pistolet.";
        }

        if (myStr.length != this.nbArg + 1) {
            return "-Biiiip- Pour utiliser la commande take, "
                    + "-Bip- saisissez l'objet que vous voulez prendre "
                    + "et placer dans votre inventaire, "
                    + "comme par exemple : take pistolet.";
        } else {

            final int o = myHero.getLocation().rechercherIndexObjet(nomObjet);

            if (o >= 0) {

                if (myHero.getLocation().retourneObjetViaIndex(o).renvoiObjet()
                        .getEstRamassable()) {
                    myHero.ajouterObjets(Objets.valueOf(myHero.getLocation()
                            .retourneObjetViaIndex(o).renvoiNomObjet()));
                    myHero.getLocation().retirerObjet(
                            myHero.getLocation().retourneObjetViaIndex(o));
                    return nomObjet + " est ajouté(e) à votre sac";
                } else {
                    return nomObjet + " ne peut pas être ajouté(e) à votre sac";
                }
            } else {
                return "Vous ne pouvez ramasser que "
                        + "des objets disponibles en ce lieu.";
            }

        }
    }
}
