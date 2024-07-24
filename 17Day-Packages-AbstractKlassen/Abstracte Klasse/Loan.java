import java.time.LocalDate;


public class Loan {

    private LocalDate time;
    private Book book;
    private User user;

    public Loan(LocalDate time, Book book, User user) {
        this.time = time;
        this.book = book;
        this.user = user;
    }

    public LocalDate getTime() {
        return time;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }

    public Book getBook() {
        return book;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "time=" + time +
                ", book=" + book.getTitle() +
                ", user=" + user.getUsername() +
                '}';
    }
}

    
    



