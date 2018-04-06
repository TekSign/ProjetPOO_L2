/**
 *
 */
package monde;

/**
 * @author mcousteau & sgerbaud
 */
public class Sorties {

    /**
     * . Description
     */
    private final String description;

    /**
     * . Booleen sur l'ouverture de sortie
     */
    private final boolean estOuvert;

    /**
     * . Lieux
     */
    private final Lieux lieux;

    /**
     * . Nom
     */
    private final String nom;

    /**
     * . Constructeur d'une sortie.
     * @param n
     *            Nom
     * @param l
     *            Lieu correspondant
     * @param b
     *            Etat de l'ouverture
     * @param d
     *            Description
     */
    public Sorties(final String n, final Lieux l, final boolean b,
            final String d) {
        this.nom = n;
        this.lieux = l;
        this.estOuvert = b;
        this.description = d;
    }

    /**
     * . Rècupère la description de la sortie
     * @return Description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * . Rècupère l'état de la sortie
     * @return TRUE si sortie ouverte, FALSE si fermée
     */
    public boolean getEtat() {
        return this.estOuvert;
    }

    /**
     * . Rècupère le lieu associé à la sortie
     * @return Lieu correspondant
     */
    public Lieux getLieux() {
        return this.lieux;
    }

    /**
     * . Rècupère le nom de la sortie
     * @return Nom
     */
    public String getNom() {
        return this.nom;
    }
}
