import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SuperHero h1 = new SuperHero("Halk", 10, 2, Category.HERO);
        SuperHero h2 = new SuperHero("Halk", 1, 12, Category.HERO);
        SuperHero h3 = new SuperHero("Superman", 8, 20, Category.HERO);
        SuperHero h4 = new SuperHero("Superman", 8, 15, Category.HERO);
        SuperHero h5 = new SuperHero("Batman", 1, 12, Category.HERO);

        List<SuperHero> heroList = new ArrayList<>();
        heroList.add(h1);
        heroList.add(h2);
        heroList.add(h3);
        heroList.add(h4);
        heroList.add(h5);
        System.out.println("Before sorting:");
        heroList.forEach(System.out::println);
        System.out.println("====================++=====================");
        heroList.sort(SuperHeroComparator.powerComperator.thenComparing(SuperHeroComparator.speedComperator)
                .thenComparing(SuperHeroComparator.nameComperator));
        System.out.println("After sorting:");
        heroList.forEach(System.out::println);
    }
}
