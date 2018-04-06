package objets;

import hero.Hero;

/**
 * @author mcousteau & sgerbaud
 */
public class Blaster extends Objet {

    /**
     * . Constructeur BLASTER
     */
    public Blaster() {
        super("L'arme est cassé. Si vous l'utilisez vous "
                + "vous feriez repérer directement, et vous "
                + "pourriez vous blesser, ce n'est pas une bonne idée", "",
                false, false);
    }

    /**
     * . Affiche au joueur le résultat de l'utilisation du blaster
     */
    @Override
    public String effet(final Hero myHero, final String[] tab) {
        return "L'arme est cassé, elle est inutilisable.";
    }
}
