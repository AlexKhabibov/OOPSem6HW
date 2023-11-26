public class Program {
    public static void main(String[] args) {
        Order order = new Order();
        SaveAsJson.saveToJson(order);
        SaveAsTxt.saveToTxt(order);
    }
}