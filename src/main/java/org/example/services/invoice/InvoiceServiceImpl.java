package org.example.services.invoice;

import org.example.model.Article;
import org.example.model.Client;
import org.example.model.Invoice;
import org.example.repositories.invoice.InvoiceRepositoryImpl;

import java.util.Date;
import java.util.List;

public class InvoiceServiceImpl implements InvoiceService {

    private final InvoiceRepositoryImpl invoiceRepository;

    public InvoiceServiceImpl(InvoiceRepositoryImpl invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    @Override
    public Invoice generateInvoice(Client client, Date date) {
        Invoice invoice = new Invoice();
        invoice.setClient(client);
        invoice.setDate(date);
        invoiceRepository.save(invoice);
        return invoice;
    }

    @Override
    public Invoice addArticle(Invoice invoice, Article article, int quantity) {
        invoice.getArticles().put(article, quantity);
        invoiceRepository.update(invoice);
        return invoice;
    }

    @Override
    public Invoice removeArticle(Invoice invoice, Article article) {
        invoice.getArticles().remove(article);
        invoiceRepository.update(invoice);
        return invoice;
    }

    @Override
    public List<Invoice> getInvoices() {
        return invoiceRepository.findAll();
    }
}
