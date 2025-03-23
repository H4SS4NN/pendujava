import java.util.*;

public class Main {
    public static void main(String[] args) {
        var ListeDeMots = List.of("Pomme", "Banane", "Poire", "Fraise", "Cerise", "Orange", "Kiwi", "Ananas", "Mangue", "Framboise", "Groseille");
        var random = new Random();
        var result = random.nextInt(ListeDeMots.size());
        var mot = ListeDeMots.get(result);


        var game = new Game(mot);

        while (game.getVie() > 0 && game.afficherMotcache().contains("_")) {
            var scanner = new Scanner(System.in);
            game.afficherMot();
            System.out.println("Proposez une lettre : ");
            var letter = scanner.next().charAt(0);
            game.proposerLettre(letter);
        }



        System.out.println("Bienvenue dans le jeu du pendu !");
    }
}