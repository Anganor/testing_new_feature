package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    ProductDao productDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        // Given / Arrange
        Product toy = new Product("Toy");
        Product car = new Product("Car");
        Item item1 = new Item(new BigDecimal(100), 2, new BigDecimal(50));
        Item item2 = new Item(new BigDecimal(5), 100, new BigDecimal(10));
        Invoice invoice = new Invoice("#1");

        item1.setInvoice(invoice);
        item1.setProduct(toy);
        invoice.getItems().add(item1);

        item2.setInvoice(invoice);
        item2.setProduct(car);
        invoice.getItems().add(item2);

        // When / Act
        productDao.save(invoice);
        itemDao.save(item1);
        itemDao.save(item2);
        invoiceDao.save(toy);
        invoiceDao.save(car);

        int size = invoice.getItems().size();
        String invoiceNumber = item1.getInvoice().getNumber();
        String productName = item2.getProduct().getName();

        // Then / Assert
        Assert.assertEquals(2, size);
        Assert.assertEquals("#1", invoiceNumber);
        Assert.assertEquals("Car", productName);


        // CleanUp
        productDao.deleteAll();
        invoiceDao.deleteAll();
        itemDao.deleteAll();
    }
}
