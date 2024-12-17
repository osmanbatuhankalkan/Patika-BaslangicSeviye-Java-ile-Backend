package business;

import core.Helper;
import dao.CustomerDao;
import entity.Customer;

import java.util.ArrayList;

public class CustomerController {
    private final CustomerDao customerDao= new CustomerDao();

    public ArrayList<Customer> findAll() {
        return this.customerDao.findAll();
    }
    public boolean save(Customer customer) {
        return this.customerDao.save(customer);
    }
    public Customer getById(int id) {
        return this.customerDao.getById(id);
    }
    public boolean update(Customer customer) {
        if(this.getById(customer.getId()) == null) {
            Helper.showMsg(customer.getId()+"ID Kayıtlı müşteri bulunamadı.");
            return false;
        }
        return this.customerDao.update(customer);
    }
    public boolean delete(int id) {
        if(this.getById(id) == null) {
            Helper.showMsg(id+"ID Kayıtlı müşteri bulunamadı.");
            return false;
        }
        return this.customerDao.delete(id);
    }
    public ArrayList<Customer> filter(String name, Customer.TYPE type) {
        //SELECT * FROM customer WHERE name LIKE '%TEST%' AND type = 'PERSON'
        //SELECT * FROM customer WHERE name LIKE '%TEST%'
        //SELECT * FROM customer WHERE type = 'PERSON'
        //SELECT * FROM customer

        String query = "SELECT * FROM customer";
        ArrayList<String> whereList = new ArrayList<>();

        if (name.length() > 0) {
            whereList.add("name LIKE '%" + name + "%'");
        }

        if (type != null) {
            whereList.add("type = '" + type.toString() + "'");
        }

        if (!whereList.isEmpty()) {
            String whereQuery = String.join(" AND ", whereList);
            query += " WHERE " + whereQuery;
        }

        return this.customerDao.query(query);
    }
}
