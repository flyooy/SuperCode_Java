import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private ArrayList<Book> books;
    private List<Loan> loans;

    public Library() {
        this.books = new ArrayList<>();
        this.loans = new ArrayList<>();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBooks(Book book) {
        books.add(book);
    }

    public void remove(Loan loan) {
        loans.remove(loan);
    }

    public void addLoan(Loan loan) {
        loans.add(loan);
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public void printBookDetails(Book book) {
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Isbn: " + book.getIsbn());
        System.out.println("Year: " + book.getYear());
    }

    public ArrayList<Book> findBooksByAuthor(String author) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }

        }
        return result;
    }

    public void ausleihen(User user, Book book) {
        if (books.contains(book)) {
            LocalDate now = LocalDate.now();
            Loan loan = new Loan(now, book, user);
            addLoan(loan);
            System.out.println("User: " + user.getUsername() + " hat " + book.getTitle() + " ausgeliehen");
        } else
            System.out.println("Das Buch '" + book.getTitle() + "' ist nicht verfügbar.");
    }

    public void displayLoans() {
        for (Loan loan : loans) {
            System.out.println(loan);
        }
    }

    public void zurückgeben(User user, Book book) {
        Loan loanToRemove = null;
        for (Loan loan : loans) {
            if (loan.getBook().equals(book) && loan.getUser().equals(user)) {
                loanToRemove = loan;
                break;
            }
        }
            if (loanToRemove != null) {
                loans.remove(loanToRemove);
                System.out.println("User: " + user.getUsername() + " hat " + book.getTitle() + " zurückgegeben");
            } else
                System.out.println("Das Buch '" + book.getTitle()
                        + "' wurde nicht gefunden oder wurde nicht von diesem Benutzer ausgeliehen.");
        }
    }

