public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        UtilModel errorMessage = UtilBean.getErrorMessage();
        System.out.println(errorMessage.toString());
    }
}