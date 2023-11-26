import java.util.Scanner;

public abstract class InputFunction {
    private static String prompt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextLine();
    }

    public static Client inputClient(Client client){
        String clientName = prompt("Имя клиента: ");
        
        if(client != null) {
            client.setClientName(clientName);
        } else
            client = new Client(clientName);
        return client;
    }

    public static Product inputProduct(Product product){
        String productName = prompt("Название продукта: ");
        double productPrice = Double.parseDouble(prompt("Цена товара: "));

        if(product != null) {
            product.setProductName(productName);
            product.setProductPrice(productPrice);
        } else
            product = new Product(productName, productPrice);
        return product;
    }

    public static int inputQuantity(){
        return Integer.parseInt(prompt("Кол-во товаров: "));
    }
}