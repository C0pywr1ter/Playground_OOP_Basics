public class Main {
    void main(){
        Book mmm = new Book();
        mmm.author = "Fred Brooks";
        mmm.title = "The mythical man";
        mmm.edition = 2;

        Library HN = new Library();
        HN.books.add(mmm);
        HN.location = "TUM Campus Heilbronn";
        HN.openHours.add("11 am");
        HN.openHours.add("11 pm");
        HN.bookStorage[0] = 1;

    }

}
