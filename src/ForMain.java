import Classes.Author;
import Classes.Book;

public class ForMain {
    public static void main(String[] args) {
        Author aleksandrPushkin = new Author("Aleksandr " , "Pushkin");
        Author andrewKurpatov = new Author("Andrew" , "Kurpatov");
        Book pikovayaDama = new Book(aleksandrPushkin, "Pikovaya Dama", 1910);
        Book krasnayaTabletka = new Book(andrewKurpatov, "Krasnaya Tabletka" , 2017);
        Author levTolstoi = new Author("Lev", "Tolstoi");
        Author michaelLomonosov = new Author("Michael", "Lomonosov");
        pikovayaDama.setYear(1944);
        System.out.println(krasnayaTabletka.toString());
    }
}
