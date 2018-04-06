package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import hero.Hero;
import monde.Lieux;

public class TestHero {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    private Hero hero;

    private Lieux lieuxDep;

    private Lieux lieuxFin;

    @Test
    public void ChangementLieu() {
        hero.modifierLieuxActuel(lieuxDep);
        assertSame(lieuxDep, hero.getLocation());
        hero.modifierLieuxActuel(lieuxFin);
        assertSame(lieuxFin, hero.getLocation());
    }

    @Before
    public void setUp() throws Exception {
        hero = new Hero("Hero");
        lieuxDep = new Lieux("Depart", "C'est le départ.");
        lieuxFin = new Lieux("Fin", "C'est la fin.");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testCreationHeroLieuInconnu() {
        assertNull(hero.getLocation());
    }

}
