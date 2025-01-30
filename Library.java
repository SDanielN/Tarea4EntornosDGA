import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

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
        System.out.println("Lista de libros ordenados por título:");
        
        // Ordenar la lista de libros por título
        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book book1, Book book2) {
                return book1.getTitle().compareToIgnoreCase(book2.getTitle());
            }
        });

        // Mostrar los libros ordenados
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

    // Funcionalidad para eliminar un libro por título
    public boolean removeBookByTitle(String title) {
        Book bookToRemove = findBookByTitle(title);
        if (bookToRemove != null) {
            books.remove(bookToRemove);
            System.out.println("Libro eliminado: " + bookToRemove);
            return true;
        }
        System.out.println("Libro no encontrado para eliminar.");
        return false;
    }
}

