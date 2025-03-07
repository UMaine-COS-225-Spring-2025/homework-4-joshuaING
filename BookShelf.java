import java.util.ArrayList;

public class BookShelf {
    public char shelfLetter;
    public ArrayList<Book> books;

    public BookShelf(char shelfLetter){
        this.shelfLetter = shelfLetter;
        books = new ArrayList<>(8);

    }
    public char getShelfLetter(){
        return shelfLetter;
}
    public void setShelfLetter(char shelfLetter){
        this.shelfLetter = shelfLetter;
    }
    public ArrayList<Book> getBooks(){
        return books;
    }

    public void addBook(Book book){
        if(books.size() < 8){
            String title = book.title;
            if(title.charAt(0) == shelfLetter){ //spoke with Jacob + Chris about using charAt in Lab
                books.add(book);
            }
}   
            }
        public void removeBook(){
            if(books.size() > 0){
                books.remove(books.size());
            } 
        }
        public String toString(){
         String outStr = "";
         for(int i = 0; i < books.size(); i++){
            outStr += books.get(i) + "   ";
            
         }
         if(outStr.length() == 0){
            return "Empty";
         } else {
            return outStr;
         }
        }
    }