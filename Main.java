public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Agregar algunos libros
        library.addBook(new Book("1984", "George Orwell"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));

        // Listar los libros
        library.listBooks();

        // Buscar y eliminar un libro
        System.out.println("\nEliminando libro...");
        library.removeBookByTitle("1984");

        // Listar los libros después de la eliminación
        library.listBooks();

        // Intentar buscar un libro que ya fue eliminado
        Book foundBook = library.findBookByTitle("1984");
        if (foundBook != null) {
            System.out.println("Libro encontrado: " + foundBook);
        } else {
            System.out.println("Libro no encontrado.");
        }
    }
}

