package actions;

import hero.Hero;
import monde.SortiesSpeciales;
import objets.Objets;

/**
 * @author mcousteau & sgerbaud
 */
public class Hack extends Action {

    /**
     * . Constructeur HACK
     */
    public Hack() {
        super(2);
    }

    /**
     * . Effet commande HACK : débloque l'ouverture d'un objet avec un code
     */
    @Override
    public String actionHero(final Hero myHero, final String[] myStr) {
        String nomObjet = null;
        String codeAssocie = null;
        try {
            nomObjet = myStr[1];
            codeAssocie = myStr[2];
        } catch (final ArrayIndexOutOfBoundsException e) {
            return "-Biiiip- Pour utiliser la commande hack, vous devez "
                    + "renseigner l'objet à hacker et -Bip- le code pour "
                    + "le hacker, comme par exemple : hack telephone 12.34";
        }

        if (myStr.length != this.nbArg + 1) {
            return "-Biiiip- Pour utiliser la commande hack, "
                    + "vous devez renseigner l'objet à hacker et -Bip- "
                    + "le code pour le hacker, comme par exemple "
                    + ": hack telephone 12.34";
        } else {
            final int indexobj = myHero.getLocation()
                    .rechercherIndexObjet(nomObjet);
            Objets o;

            if (indexobj >= 0) {
                o = Objets.valueOf(myHero.getLocation()
                        .retourneObjetViaIndex(indexobj).renvoiNomObjet());
            } else {
                o = null;
            }

            if (o == Objets.terminal) {
                if (codeAssocie.equals("6")) {
                    myHero.getLocation().retirerObjet(Objets.valueOf(nomObjet));
                    Objets.valueOf(nomObjet).renvoiObjet().modifApresHack();
                    myHero.getLocation().ajouterObjet(Objets.valueOf(nomObjet));

                    final SortiesSpeciales s = myHero.getLocation()
                            .retourneSortiesSpeViaIndex(myHero.getLocation()
                                    .rechercherIndexSortieSpe("couloir"));
                    myHero.getLocation().supprimeSortiesSpeciale(s);
                    s.modifEtat();
                    myHero.getLocation().ajouterSortie(s);
                    return Objets.valueOf(nomObjet).renvoiObjet().effet(myHero,
                            myStr);
                } else {
                    return "Le code donné n'est pas le bon.";
                }
            } else if (o == Objets.casier) {
                if (codeAssocie.equals("13-12")) {
                    myHero.getLocation().retirerObjet(Objets.valueOf(nomObjet));
                    Objets.valueOf(nomObjet).renvoiObjet().modifApresHack();
                    myHero.getLocation().ajouterObjet(Objets.valueOf(nomObjet));

                    final SortiesSpeciales s = myHero.getLocation()
                            .retourneSortiesSpeViaIndex(myHero.getLocation()
                                    .rechercherIndexSortieSpe("couloir"));
                    myHero.getLocation().supprimeSortiesSpeciale(s);
                    s.modifEtat();
                    myHero.getLocation().ajouterSortie(s);
                    return Objets.valueOf(nomObjet).renvoiObjet().effet(myHero,
                            myStr);
                } else {
                    return "Le code donné n'est pas le bon.";
                }
            } else {
                return "Vous ne pouvez pas hacker cette objet.";
            }
        }
    }
}
