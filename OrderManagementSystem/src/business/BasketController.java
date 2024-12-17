package business;

import dao.BasketDao;
import entity.Basket;
import entity.Customer;

import java.util.ArrayList;

public class BasketController {
    private final BasketDao basketDao = new BasketDao();

    public ArrayList<Basket> findAll() {
        return this.basketDao.findAll();
    }

    public boolean save(Basket basket) {
        return this.basketDao.save(basket);
    }
    public boolean clear() {
        return this.basketDao.clear();
    }
}

