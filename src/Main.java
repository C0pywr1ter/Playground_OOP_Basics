import java.util.Date;
public class Main {
    void main(){
        Book mmm = new Book();
        mmm.author = "Fred Brooks";
        mmm.title = "The mythical man";
        mmm.edition = 2;
    }

}
class Book {
    String author;
    String title;
    int edition;

    void Borrow(Date s, Date e){

    }

    void GiveBack(Date today){

    }
}