package test;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import monde.Lieux;
import monde.SortiesSpeciales;

public class TestSorties {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    private Lieux lieuxFin;

    private SortiesSpeciales porteDepFin;

    @Test
    public void modifEtatPorte() {
        porteDepFin.modifEtat();
        assertTrue(porteDepFin.getEtat());
    }

    @Before
    public void setUp() throws Exception {
        lieuxFin = new Lieux("Fin", "C'est la fin.");
        porteDepFin = new SortiesSpeciales("porte", lieuxFin,
                "C'est une porte qui mène à la deuxième salle.");
    }

    @After
    public void tearDown() throws Exception {
    }
}
