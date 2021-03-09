
import beans.quotes;
import beans.author;
import beans.Album;
import java.util.ArrayList;
import java.util.List;
public class BeanTest {


    public static void main(String[] args) {
//        Book mybook = new Book(1,"The book","David Stephens", 3000F, 10000);

//        Book mybook = new Book();
//        mybook.setId(1);
//        mybook.setTitle("The book");
//        mybook.setAuthorsName("David Stephens");
//        mybook.setPrice(300F);
//        mybook.setBooksSold(1000000);


        List<quotes> quotesList = new ArrayList() {
        };



        quotes quoteOne = new quotes(1,"hello world","codeUp");
        quotes quoteTwo = new quotes(2,"goodbye world","codeDown");
quotesList.add(quoteOne);
quotesList.add(quoteTwo);
//        Person instructorTwo = new Person("David","Stephens");




        System.out.println("Here is a list of the instructors!");
        for (quotes currentQuote : quotesList) {
            System.out.println(currentQuote.getContent() + ", " + currentQuote.getAuthor());
        }

        List<Album> AlbumList = new ArrayList() {
        };
Album album1 = new Album(1,"Prince","Purple Rain",1984-6-25,25000000,"Pop");
 AlbumList.add(album1);
        System.out.println("Here is a list of the Albums!");
        for (Album currentAlbum : AlbumList) {
            System.out.println(currentAlbum.getArtist() + ", " + currentAlbum.getName());
        }

    }
}