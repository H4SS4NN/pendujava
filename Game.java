import java.util.List;

public class Game {

    private final String mot;
    private final StringBuilder motCache;
    private int vie = 5;

    public Game(String mot) {
        this.mot = mot;
        this.motCache = new StringBuilder("_".repeat(mot.length()));
        this.vie = 5;
    }


    public void afficherMot() {
        System.out.println(motCache);
    }



    public String getMot() {
        return mot;
    }


    public int getVie() {
        return vie;
    }

    public void proposerLettre(char lettre) {
        var index = mot.indexOf(lettre);
        if (index == -1) {
            vie--;
            System.out.println("Il vous reste " + vie + " vies");
        } else {
            while (index >= 0) {
                motCache.setCharAt(index, lettre);
                index = mot.indexOf(lettre, index + 1);
            }
        }
    }

    public String afficherMotcache() {
        return motCache.toString();
    }
}
