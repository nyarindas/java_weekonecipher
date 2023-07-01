import java.util.ArrayList;
import java.util.List;

public class Squad {
    private String name;
    private int maxSize;
    private String cause;

    private List<Hero> heroes;

    public Squad(String name, int maxSize, String cause) {
        this.name = name;
        this.maxSize = maxSize;
        this.cause = cause;
        this.heroes = new ArrayList<>();
}

// Add getters and setters for the fields

    public boolean addHero(Hero hero) {
        if (heroes.size() < maxSize && !heroes.contains(hero)) {
            heroes.add(hero);
            return true;
        }
        return false;
    }

    public boolean removeHero(Hero hero) {
        return heroes.remove(hero);
    }
}
