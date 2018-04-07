package test;

import hero.Hero;
import monde.Lieux;

/**
 * @author teksign
 */
public class TestHero {

    /**
     * @throws Exception setUpBeforeClass
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    /**
     * @throws Exception tearDownAfterClass
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    /**
     * .
     * Hero
     */
    private Hero hero;

    /**
     * .
     * Lieu depart
     */
    private Lieux lieuxDep;

    /**
     * .
     * Lieu arrivee
     */
    private Lieux lieuxFin;

    /**
     * .
     */
    @Test
    public void changementLieu() {
        hero.modifierLieuxActuel(lieuxDep);
        assertSame(lieuxDep, hero.getLocation());
        hero.modifierLieuxActuel(lieuxFin);
        assertSame(lieuxFin, hero.getLocation());
    }

    /**
     * .
     * @throws Exception setUp
     */
    @Before
    public void setUp() throws Exception {
        hero = new Hero("Hero");
        lieuxDep = new Lieux("Depart", "C'est le départ.");
        lieuxFin = new Lieux("Fin", "C'est la fin.");
    }

    /**
     * .
     * @throws Exception tearDown
     */
    @After
    public void tearDown() throws Exception {
    }

    /**
     * .
     */
    @Test
    public void testCreationHeroLieuInconnu() {
        assertNull(hero.getLocation());
    }

}
