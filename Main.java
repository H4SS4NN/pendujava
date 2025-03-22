import java.util.*;

public class Main {
    public static void main(String[] args) {
        var ListeDeMots = List.of("Pomme", "Banane", "Poire", "Fraise", "Cerise", "Orange", "Kiwi", "Ananas", "Mangue", "Framboise", "Groseille");

        int vie = 5;
        var random = new Random();
        var result = random.nextInt(ListeDeMots.size());
        var mot = ListeDeMots.get(result);
        var motCache = new StringBuilder("_".repeat(mot.length()));

        System.out.println("Le mot est composé de " + mot.length() + " lettres.");

        Scanner scanner = new Scanner(System.in);

        while (vie > 0 && motCache.toString().contains("_")) {
            System.out.print("Entrez votre lettre: ");
            var lettre = scanner.next().charAt(0);

            if (mot.contains(String.valueOf(lettre))) {
                System.out.println(lettre + " est dans le mot");
                for (int i = 0; i < mot.length(); i++) {
                    if (mot.charAt(i) == lettre) {
                        motCache.setCharAt(i, lettre);
                    }
                }
            } else {
                vie--;
                System.out.println(lettre + " n'est pas dans le mot. Il vous reste " + vie + " vies");
            }

            System.out.println("Mot actuel: " + motCache);
        }

        if (motCache.toString().equals(mot)) {
            System.out.println("Félicitations! Vous avez deviné le mot: " + mot);
        } else {
            System.out.println("Désolé, vous avez perdu. Le mot était: " + mot);
        }

        scanner.close();
    }
}