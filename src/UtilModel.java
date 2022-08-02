public class UtilModel {
   private String id;
   private String errorText;

    public UtilModel(String id, String errorText) {
        this.id = id;
        this.errorText = errorText;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getErrorText() {
        return errorText;
    }

    public void setErrorText(String errorText) {
        this.errorText = errorText;
    }

    @Override
    public String toString() {
        return "UtilModel{" +
                "id='" + id + '\'' +
                ", errorText='" + errorText + '\'' +
                '}';
    }
}
