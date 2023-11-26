import java.io.FileWriter;
import java.io.IOException;

public abstract class SaveAsJson {
    public static void saveToJson(Order order) {
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            Client client = order.getClient();
            Product product = order.getProduct();
            writer.write("{\n");
            writer.write("\"Имя клиента\":\"" + client.getClientName() + "\",\n");
            writer.write("\"Название продукта\":\"" + product.getProductName() + "\",\n");
            writer.write("\"Цена продукта\":" + product.getProductPrice() + ",\n");
            writer.write("\"Количество\":" + order.getProductQuantity() + "\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}