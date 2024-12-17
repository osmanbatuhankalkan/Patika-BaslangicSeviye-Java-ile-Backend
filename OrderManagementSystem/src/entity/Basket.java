package entity;

public class Basket {
    private int id;
    private int productId;

    private Product product;

    public Basket() {
    }
    public Basket(int productId) {
        this.productId = productId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "id=" + id +
                ", productId=" + productId +
                ", product=" + product +
                '}';
    }
}
