package org.example.repositories.invoice;

import org.example.model.Invoice;

import java.util.List;

public interface InvoiceRepository {

    void save(Invoice invoice);
    void update(Invoice invoice);
    List<Invoice> findAll();
}
