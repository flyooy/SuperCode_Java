public enum Category {
    HERO(1),
    VILLAIN(2);

    private final int categ;

    Category(int categ) {
        this.categ = categ;
    }

    public int getCateg() {
        return categ;
    }
    
}
