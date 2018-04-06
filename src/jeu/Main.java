/**
 * Javadoc de jeu
 */
package jeu;

import java.util.Scanner;

/**
 * @author mcousteau & sgerbaud
 */
public class Main {

    /**
     * . Lancement du jeu.
     * @param args
     *            Arguments
     */
    public static void main(final String[] args) {
        String str, str2;
        Scanner sc = new Scanner(System.in);

        System.out.println("        #####################################\n"
                + "        ### BIENVENUE SUR .JAR .JAR Binks ###\n"
                + "        #####################################" + "\n");

        System.out.println("Veuillez tout d'abord, nommez votre avatar : ");
        System.out.print(">");
        str = sc.nextLine();

        System.out.println("\n"
                + "Un jeu développé par Gerbaud Sylvain & Cousteau Maxime\n"
                + "\n" + "Pour jouer, vous allez devoir écrire des phrases "
                + "courtes en ligne de commande dans ce terminal.\n"
                + "Afin de mener à bien votre mission, "
                + "les commandes suivantes sont à votre dispositions :\n"
                + "- look --> vous donnera une brève description "
                + "des lieux où vous vous trouvez\n"
                + "- go --> permet de vous déplacer dans un lieux "
                + "accessible depuis celui où vous êtes\n"
                + "- use --> permet d'utiliser un objet de votre choix "
                + "présent dans votre inventaire\n"
                + "- inventory --> vous donnera la liste des "
                + "objets présent dans votre inventaire\n"
                + "- take --> permet de ramasser un objet "
                + "ciblé présent dans le lieu\n"
                + "- hack --> permet de demander à "
                + "BB-R4 de pirater un terminal choisi\n"
                + "- help --> vous donnera les instructions de jeu\n"
                + "- quit --> permet de quitter le jeu à tout moment" + "\n");

        System.out.println("$-  Plus d'informations sur le contexte ? (O/n)\n");
        System.out.print(">");
        str2 = sc.nextLine();

        if (str2.equals("O") || str2.equals("o")) {
            System.out.println("\n" + "Vous êtes le lieutenant " + str
                    + ", leader de la section Delta de la Rébellion "
                    + "sur Yavin IV.\n"
                    + "Une escouade d'élite de l'Empire à entendu parler des "
                    + "nouveaux prototypes de droïde de catégorie "
                    + "MK que l'Alliance\n"
                    + "est en phase de perfectionner pour créer une armée dans "
                    + "l'objectif de faire enfin plier genoux à l'Empire.\n"
                    + "Ces soldats étant maître de la furtivité, "
                    + "vous avez été enlevé pour être interrogé "
                    + "par le Seigneur Vador en personne.\n"
                    + "Vous êtes entrain d'atterrir dans "
                    + "le hangar du Star Destroyer"
                    + "et une escouade de Stormtrooper se place "
                    + "devant le vaisseau pour\n"
                    + "vous accompagner dans votre cellule... "
                    + "Une fois dans celle-ci vous réfléchissez à une "
                    + "manière de sortir.." + "\n");

        }

        Creation_Partie jeu = new Creation_Partie(str);
        String st;

        System.out.println("\n" + "-Bip-Biiip- Lieutenant, ici BB-R4, "
                + "nous n'avons pas beaucoup de temps j'ai réussi\n"
                + "à me faufiler dans un conduit du hangar et "
                + "à accéder à un terminal pour pouvoir communiquer avec vous\n"
                + "je serais vos yeux pour vous sortir de cet endroit obscur..."
                + "-Biip- Envoyez moi les signaux que vous voulez via\n"
                + "les commandes que vous connaissez maintenant.-Bip-" + "\n");

        System.out.println("\n"
                + jeu.retourneHero().getLocation().getDescription() + "\n");
        System.out.print(">");
        while (sc.hasNextLine()) {

            st = sc.nextLine();
            String[] tab = st.split(" ");

            try {
                System.out.println(jeu.retourneHero().execute(
                        Command.valueOf(tab[0]).renvoiInstru(), tab) + "\n");
            } catch (IllegalArgumentException e) {
                System.out.println("La commande saisie n'existe pas.");
            } catch (NullPointerException e) {
                System.out.println("Je ne comprends pas.");
            }

            if (jeu.retourneHero().getSiAGagne()
                    || jeu.retourneHero().getSiAPerdu()) {
                System.out.println(jeu.retourneHero().execute(
                        Command.valueOf(null, "quit").renvoiInstru(), tab));
            }
            System.out.print(">");
        }
        sc.close();
    }

    /**
     *
     */
    protected Main() {
        throw new UnsupportedOperationException();
    }
}
