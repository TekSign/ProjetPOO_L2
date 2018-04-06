package objets;

import hero.Hero;
import monde.SortiesSpeciales;

/**
 * @author mcousteau & sgerbaud
 */
public class Pass extends Objet {

    /**
     * . Constructeur PASS
     */
    public Pass() {
        super("Il s'agit d'un pass laissé tombé par le soldat assommé.", "",
                true, false);
    }

    /**
     * . Permet l'ouverture d'un accés sécurisé pour le transformer en simple
     * sortie
     */
    @Override
    public String effet(final Hero myHero, final String[] tab) {
        final String nomSortie = tab[2];

        final int s = myHero.getLocation().rechercherIndexSortieSpe(nomSortie);
        SortiesSpeciales sor;
        System.out.println(Integer.toString(s));

        if (s >= 0) {
            sor = myHero.getLocation().retourneSortiesSpeViaIndex(s);
            myHero.getLocation().supprimeSortiesSpeciale(sor);
            sor.modifEtat();
            myHero.getLocation().ajouterSortie(sor);

            return "La porte est ouverte.";
        } else {
            return "Le pass ne sert pas à ouvrir cette porte.";
        }
    }
}
