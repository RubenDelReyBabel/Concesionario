package org.example.repositories.invoice;

import org.example.model.Invoice;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class InvoiceRepositoryImpl implements InvoiceRepository {

    private final List<Invoice> invoices = new ArrayList<>();

    @Override
    public void save(Invoice invoice) {
        invoices.add(invoice);
    }

    @Override
    public void update(Invoice invoice) {
        invoices.stream().filter(i -> i.getId().equals(invoice.getId())).forEach(i -> {
            i.setArticles(invoice.getArticles());
            i.setClient(invoice.getClient());
            i.setDate(invoice.getDate());
        });
    }

    @Override
    public List<Invoice> findAll() {
        return invoices;
    }
}
