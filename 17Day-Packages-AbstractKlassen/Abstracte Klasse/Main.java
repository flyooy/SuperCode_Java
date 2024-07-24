public class Main {

    public static void main(String[] args) {
        UserManager userManager = new UserManager();

        User admin = new User("admin1", "admin");
        User user1 = new User("user1", "normal");
        User user2 = new User("user2", "normal");

        userManager.addUser(admin);
        userManager.addUser(user1);
        userManager.addUser(user2);

        System.out.println("All users:");
        userManager.displayAllUsers();

        System.out.println("\nPerforming admin task:");
        userManager.performAdminTask(admin);
        userManager.performAdminTask(user1);

        Library library1 = new Library();
        Book book1 = new EBook("Nuul", "Picasssso?!", "1223", 1934, 24);
        Book book2 = new PrintedBook("Coconuts", "Picashuuu", "1273", 1997, 117);
        library1.addBooks(book1);
        library1.addBooks(book2);
        library1.ausleihen(user2, book2);
        library1.displayLoans();
        library1.zurückgeben(user2, book2);
        library1.displayLoans();

    }
}
