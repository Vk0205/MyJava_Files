public abstract class Item {
    private String title;
    private String author;

    public Item(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public abstract String getType();
}

public class Book extends Item {
    public Book(String title, String author) {
        super(title, author);
    }

    @Override
    public String getType() {
        return "Book";
    }
}

public class DVD extends Item {
    public DVD(String title, String author) {
        super(title, author);
    }

    @Override
    public String getType() {
        return "DVD";
    }
}

public interface Loanable {
    boolean isAvailable();
    void loan();
    void returnItem();
}

public class Library {
    private List<Item> items;

    public Library() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }
}

public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();
        library.addItem(new Book("To Kill a Mockingbird", "Harper Lee"));
        library.addItem(new DVD("The Shawshank Redemption", "Frank Darabont"));

        List<Item> items = library.getItems();
        for (Item item : items) {
            System.out.println(item.getTitle() + " by " + item.getAuthor() 
                               + " (" + item.getType() + ")");
            if (item instanceof Loanable) {
                Loanable loanable = (Loanable) item;
                if (loanable.isAvailable()) {
                    loanable.loan();
                    System.out.println("Item has been loaned.");
                } else {
                    System.out.println("Item is not available for loan.");
                }
            } else {
                System.out.println("Item is not loanable.");
            }
        }
    }
}
