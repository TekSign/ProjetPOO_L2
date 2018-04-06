package test;

import hero.Hero;
import jeu.Command;
import monde.Lieux;
import monde.Sorties;
import monde.SortiesSpeciales;
import objets.Objets;

public class TestCommand {
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    private Hero hero;
    private Lieux lieuxDep;
    private Lieux lieuxFin;

    private SortiesSpeciales s;

    private String[] tab;

    @Test
    public void listeObjetLieux() {
        hero.execute(Command.valueOf("take").renvoiInstru(), tab);
        assertSame(lieuxDep, hero.getLocation());
        assertSame(-1, hero.getLocation().rechercherIndexObjet("pass"));
        assertTrue(hero.chercherObjetInventaire(Objets.valueOf("pass")));
    }

    @Before
    public void setUp() throws Exception {
        hero = new Hero("Hero");
        lieuxDep = new Lieux("Début", "C'est le début.");
        lieuxFin = new Lieux("Fin", "C'est la fin.");
        lieuxDep.ajouterObjet(Objets.valueOf("pass"));
        final Sorties s1 = new Sorties("porte", lieuxFin, true,
                "C'est une porte.");
        final SortiesSpeciales s2 = new SortiesSpeciales("couloir", lieuxFin,
                "C'est une autre porte.");
        lieuxDep.ajouterSortie(s1);
        lieuxDep.ajouterSortie(s2);
        hero.modifierLieuxActuel(lieuxDep);
        tab = new String[] { "take", "pass" };
        s = hero.getLocation().retourneSortiesSpeViaIndex(
                hero.getLocation().rechercherIndexSortieSpe("couloir"));

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testChangementFonctionnementPorte() {
        hero.getLocation().supprimeSortiesSpeciale(s);
        assertSame(-1, hero.getLocation().rechercherIndexSortieSpe(s.getNom()));
        s.modifEtat();
        hero.getLocation().ajouterSortie(s);
        assertTrue(
                hero.getLocation().rechercherIndexSortieSpe(s.getNom()) >= 0);
    }
}
