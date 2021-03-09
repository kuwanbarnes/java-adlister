package beans;

public class quotes {
    private int id;
    private String content;
    private author author_id;

    public quotes(){}
    public quotes(int id, String content, author author_id){
        this.id=id;
        this.content=content;
        this.author_id= author_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public author getAuthor() {
        return author_id;
    }

    public void setAuthor(author author_id) {
        this.author_id = author_id;
    }
}
