package dao;

import core.Database;
import entity.Basket;
import entity.Customer;
import entity.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BasketDao {

    private Connection connection;
    private ProductDao productDao;

    public BasketDao() {
        this.connection = Database.getInstance();
        this.productDao = new ProductDao();
    }
    public boolean save(Basket basket) {
        String query = "INSERT INTO basket (product_id) VALUES (?)";

        try (PreparedStatement pr = this.connection.prepareStatement(query)) {
            pr.setInt(1, basket.getProductId());
            return pr.executeUpdate() > 0; // Eğer işlem başarılıysa true döner
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return false;
    }

    public ArrayList<Basket> findAll() {
        ArrayList<Basket> baskets = new ArrayList<>();
        try {
            ResultSet rs = this.connection.createStatement().executeQuery("SELECT * FROM basket");
            while (rs.next()) {
                Basket basket = this.match(rs);
                if (basket.getProduct() != null) { // Eğer Product null değilse listeye ekle
                    baskets.add(basket);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return baskets;
    }
    public boolean clear() {
        String query = "DELETE FROM basket";
        try {
            PreparedStatement pr = this.connection.prepareStatement(query);
            return pr.executeUpdate() != -1; // Sorgunun çalıştırılması ve sonucunun kontrol edilmesi
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return false;
    }

    public Basket match(ResultSet rs) throws SQLException {
        Basket basket = new Basket();
        basket.setId(rs.getInt("id"));
        basket.setProductId(rs.getInt("product_id"));

        // Product bilgisi atanıyor
        Product product = this.productDao.getById(rs.getInt("product_id"));
        if (product != null) {
            basket.setProduct(product);
        }
        return basket;
    }

}
