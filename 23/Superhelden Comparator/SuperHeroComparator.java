import java.util.Comparator;
public class SuperHeroComparator {
    
    public static Comparator<SuperHero> powerComperator = new Comparator<SuperHero>() {
        @Override
        public int compare(SuperHero hero, SuperHero hero2) {
            return Integer.compare(hero.getPowerLevel(), hero2.getPowerLevel());
        }
    };

    public static Comparator<SuperHero> speedComperator = (hero, hero2) -> Integer.compare(hero.getSpeed(),
            hero2.getSpeed());
            public static Comparator<SuperHero> nameComperator = (hero, hero2) -> hero.getName().compareTo(hero2.getName());

}
