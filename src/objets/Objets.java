package objets;

/**
 * @author mcousteau & sgerbaud
 */
public enum Objets {

    /**
     *
     */
    bâton(
            "bâton",
            new Bâton()),
    blaster(
            "blaster",
            new Blaster()),
    caisse(
            "caisse",
            new Caisse()),
    carte(
            "carte",
            new Carte()),
    casier(
            "casier",
            new Casier()),
    casque(
            "casque",
            new Casque()),
    panneau(
            "panneau",
            new Panneau()),
    pass(
            "pass",
            new Pass()),
    terminal(
            "terminal",
            new Terminal());
    /**
     * . Nom
     */
    private String nom;

    /**
     * . Objet
     */
    private Objet objet;

    /**
     * . Constructeur d'un objet
     * @param n
     *            Nom
     * @param o
     *            Type
     */
    Objets(final String n, final Objet o) {
        this.nom = n;
        this.objet = o;
    }

    /**
     * . Rècupère le nom d'un objet
     * @return Nom objet souhaité
     */
    public String renvoiNomObjet() {
        return this.nom;
    }

    /**
     * . Rècupère un objet .
     * @return Objet
     */
    public Objet renvoiObjet() {
        return this.objet;
    }
}
