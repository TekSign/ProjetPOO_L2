package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import monde.Lieux;
import objets.Objets;

public class TestLieux {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    private Lieux lieuxDep;

    @Before
    public void setUp() throws Exception {
        lieuxDep = new Lieux("Depart", "C'est le départ.");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testAjoutEtRetraitObjetLieu() {
        lieuxDep.ajouterObjet(Objets.valueOf("bâton"));
        assertSame(0, lieuxDep.rechercherIndexObjet("bâton"));
        lieuxDep.retirerObjet(Objets.valueOf("bâton"));
        assertSame(-1, lieuxDep.rechercherIndexObjet("bâton"));
    }
}
