import java.util.Random;
import java.util.Scanner;

public class Menu
{
    // Exercice n°1
    // NE PAS EFFACER
    static int[] tabFrequence = new int[11];
    static String[] tabEntetes = new String[]{"2","3","4","5","6","7","8","9","10","11","12"};

    // Exercice n°2
    // NE PAS EFFACER
    static int[][] tableau1Exo2 = new int[][]{{1,2,4},{5,6,7},{2,1,3}};
    static int[][] tableau2Exo2 = new int[][]{{2,2,4},{1,3,5},{1,4,8}};
    static int[][] tableauProduitExo2 = new int[3][3];
    public static void main(String[] args)
    {
        int choix;
        Scanner scanner = new Scanner(System.in);
        do
        {
            do
            {
                System.out.println("1 - Exercice 1");
                System.out.println("2 - Exercice 2");
                System.out.println("0 - Quitter");
                System.out.print("Votre choix : ");
                choix = scanner.nextInt();
            } while (choix > 4);

            switch (choix)
            {
                case 0:
                    System.out.println("Fin du programme");
                    break;
                case 1:
                    Random random = new Random();
                    int totalLancers = 20;
                    int somme;
                    for (int i = 0; i < tabFrequence.length; i++) {
                        tabFrequence[i] = 0;
                    }
                    for (int i = 0; i < totalLancers; i++) {
                        somme = random.nextInt(6) + 1 + random.nextInt(6) + 1;
                        tabFrequence[somme - 2]++;
                    }
                    for (String entete : tabEntetes) {
                        System.out.print(entete + "\t");
                    }
                    System.out.println();
                    String[] tabligne = new String[tabFrequence.length];
                    for (int i = 0; i < tabFrequence.length; i++) {
                        tabligne[i] = "";
                        for (int j = 0; j < tabFrequence[i]; j++) {
                            tabligne[i] += "*";
                        }
                    }
                    boolean affichageComplet = false;
                    int niveau = 0;
                    while (!affichageComplet) {
                        affichageComplet = true;

                        for (int i = 0; i < tabligne.length; i++) {
                            if (niveau < tabligne[i].length()) {
                                System.out.print("*\t");
                                affichageComplet = false;
                            } else {
                                System.out.print("\t");
                            }
                        }
                        System.out.println();
                        niveau++;
                    }
                    for (int frequence : tabFrequence) {
                        System.out.print(frequence + "\t");
                    }
                    System.out.println();


                    break;
                case 2:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            tableauProduitExo2[i][j] = 0;
                            for (int k = 0; k < 3; k++) {
                                tableauProduitExo2[i][j] += tableau1Exo2[i][k] * tableau2Exo2[k][j];
                            }
                        }
                    }
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(tableauProduitExo2[i][j] + " ");
                        }
                        System.out.println();
                    }

                    break;
            }
        }while (choix != 0);
    }
}
