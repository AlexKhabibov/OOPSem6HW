public class Order {

    private Client client;
    private Product product;
    private int quantity;

    public Order() {
        inputFromConsole();
    }

    public Order(Client client, Product product, int quantity) {
        this.client = client;
        this.product = product;
        this.quantity = quantity;
    }

    public Client getClient() {
        return client;
    }

    public Product getProduct() {
        return product;
    }

    public int getProductQuantity() {
        return quantity;
    }

    public double getPrice() {
        return product.getProductPrice();
    }

    public void inputFromConsole(){
        client = InputFunction.inputClient(client);
        product = InputFunction.inputProduct(product);
        quantity = InputFunction.inputQuantity();
    }
}