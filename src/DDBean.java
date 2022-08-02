public class DDBean {
    private String id;
    private String title;

    public DDBean(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "DDBean{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
