package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import hero.Hero;
import monde.Lieux;
import monde.SortiesSpeciales;

public class TestGlobal {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    private Hero hero;
    private Lieux lieuxDep;

    private Lieux lieuxFin;

    private SortiesSpeciales sortieCode;

    @Before
    public void setUp() throws Exception {
        hero = new Hero("Maxime");
        lieuxDep = new Lieux("Depart", "C'est le départ.");
        lieuxFin = new Lieux("Fin", "C'est la fin.");
        sortieCode = new SortiesSpeciales("SortieAcode", lieuxFin,
                "C'est la sortie a code");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testChangementLieu() {
        hero.modifierLieuxActuel(lieuxDep);
        assertSame(lieuxDep, hero.getLocation());
        hero.modifierLieuxActuel(lieuxFin);
        assertSame(lieuxFin, hero.getLocation());
    }

    @Test
    public void testCreationHeroLieuInconnu() {
        assertNull(hero.getLocation());
    }

    @Test
    public void testModifEtatSortieCode() {
        sortieCode.modifEtat();
        assertTrue(sortieCode.getEtat());
    }
}
