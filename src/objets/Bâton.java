package objets;

import hero.Hero;

/**
 * @author mcousteau & sgerbaud
 */
public class Bâton extends Objet {

    /**
     * . Constructeur BATON
     */
    public Bâton() {
        super("Cela ne sera pas létal mais ça devrait "
                + "suffir pour arrêter un garde que vous croiseriez..", "",
                true, false);
    }

    /**
     * . Affiche le résultat de l'utilisation du baton selon la cible choisie
     */
    @Override
    public String effet(final Hero myHero, final String[] tab) {
        if (myHero.getLocation().getnbEnnemi() > 0) {
            if (tab[2].equals("trooper") || tab[2].equals("Trooper")) {
                myHero.getLocation().supprimerEnnemi();
                return "Vous vous jetez sur le garde avant qu'il "
                        + "n'ait le temps de faire quoi que ce soit, "
                        + "le bâton que vous avez ramassé à permis de "
                        + "l'immobiliser ! Le pass qu'il a utilisé pour ouvrir la porte à l'instant est tombé par terre avant que la porte ne se referme devant vous...";
            } else {
                myHero.modifPerdu();
                return "Vous avez été repéré !" + "\n"
                        + "Une section de Trooper se charge de vous immobiliser et vous emmène devant le Seigneur Vador... Ce dernier après vous avoir torturer et avoir\n"
                        + "obtenu les informations dont il avait besoin pour finaliser la destruction de l'Alliance rebelle, c'est a dire les coordonnées de la dernière base principale sur Yavin IV,\n"
                        + "vous achève d'un étranglement des plus douloureux... La Galaxie comptait sur vous Lieutenant "
                        + myHero.getIdentite()
                        + "... Vous avez failli à votre mission qui fût la dernière aujourd'hui."
                        + "\n" + "THE END - DEFAITE";
            }
        } else {
            return "Cela n'a aucun effet ici.";
        }

    }
}
