package monde;

/**
 * @author mcousteau & sgerbaud
 */
public class SortiesSpeciales extends Sorties {

    /**
     * . Constructeur d'une sortie spéciale
     * @param n
     *            Nom
     * @param l
     *            Lieu associé
     * @param d
     *            Description
     */
    public SortiesSpeciales(final String n, final Lieux l, final String d) {
        super(n, l, false, d);
    }

    /**
     * . Change l'état de l'ouverture de la sortie
     */
    public void modifEtat() {
        if (!this.estOuvert) {
            this.estOuvert = true;
        }
    }
}
