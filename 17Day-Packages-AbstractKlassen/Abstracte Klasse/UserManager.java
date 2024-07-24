import java.util.ArrayList;

public class UserManager {
    private ArrayList<User> users;

    public UserManager() {
        this.users = new ArrayList<>();
    }
    
    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(String username) {
        users.removeIf(user -> user.getUsername().equals(username));
    }

    public void displayAllUsers() {
        for (User user : users) {
            user.displayuserDetails();
        }
    }

    public void performAdminTask(User user) {
        if (user.isAdmin()) {
            System.out.println("Performing admin task for " + user.getUsername());
        } else {
            System.out.println("User " + user.getUsername() + " does not have admin rights.");
        }
    }
}
