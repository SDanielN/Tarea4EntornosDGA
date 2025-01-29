import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

   // Funcionalidad mejorada para agregar un libro
public void addBook(Book book) {
    if (book == null) {
        System.out.println("❌ Error: No se puede agregar un libro nulo.");
        return;
    }

    if (books.contains(book)) {
        System.out.println("⚠️ El libro ya existe en la colección: " + book);
    } else {
        books.add(book);
        System.out.println("✅ Libro agregado con éxito: " + book);
    }
}

    // Funcionalidad para listar todos los libros
    public void listBooks() {
        System.out.println("Lista de libros:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    // Funcionalidad para buscar un libro por título
    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

}
