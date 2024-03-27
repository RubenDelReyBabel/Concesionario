package org.example.services.invoice;

import org.example.model.Article;
import org.example.model.Client;
import org.example.model.Invoice;

import java.util.Date;
import java.util.List;

public interface InvoiceService {

    Invoice generateInvoice(Client client, Date date);
    Invoice addArticle(Invoice invoice, Article article, int quantity);
    Invoice removeArticle(Invoice invoice, Article article);
    List<Invoice> getInvoices();
}
