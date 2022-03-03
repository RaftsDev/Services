public abstract class Services {

    private boolean ordered;
    private double price;

    public abstract boolean order();

    public class OrderIn {
        private String location;
        private String dateTime;
    }

    public class OrderOut {
        private String location;
        private String dateTime;
    }




}
