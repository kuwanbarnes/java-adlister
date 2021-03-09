
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

        List<Album> AlbumList = new ArrayList() {
        };
        Album album1 = new Album(1,"Prince","Purple Rain",1984,25F,"Pop");
        AlbumList.add(album1);
        System.out.println("Here is a list of the Albums!");
        for (Album currentAlbum : AlbumList) {
            System.out.println(currentAlbum.getArtist() + ", " + currentAlbum.getName()+ ","+ currentAlbum.getRelease_date());
        }


        List<author> authorsList = new ArrayList() {
        };
        author author1 = new author();
        author1.setFirstname("james");
        author1.setLastname("brown");
        authorsList.add(author1);
        System.out.println("Here is a list of the authors!");
        for (author currentAuthor : authorsList) {
            System.out.println(currentAuthor.getLastname() + ", " + currentAuthor.getFirstname());
        }





        quotes quoteOne = new quotes(1,"its a man's world",author1);
        quotes quoteTwo = new quotes(2,"jump back gotta kiss myself",new author(1,"james","brown"));
        List<quotes> quotesList = new ArrayList() {
        };
quotesList.add(quoteOne);
quotesList.add(quoteTwo);
//        Person instructorTwo = new Person("David","Stephens");




        System.out.println("Here is a list of the quotes!");
        for (quotes currentQuote : quotesList) {
            System.out.println(currentQuote.getContent());
            System.out.println( "~"+currentQuote.getAuthor().getFirstname()+","+currentQuote.getAuthor().getLastname());

        }




    }
}