package Behavioral.Observer;

public class Client {
    public static void main(String[] args) {

        //Amazon will be single object which follows singleton design
        Amazon amazon= Amazon.getInstance();
        EmailService emailService= new EmailService();
        InventoryService inventoryService = new InventoryService();
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();

        amazon.OrderPlaced();
    }
}


//The observer pattern is a software design pattern in which an object, called the subject, maintains a list of its dependents, called observers, and
//notifies them automatically of any state changes, usually by calling one of their methods.