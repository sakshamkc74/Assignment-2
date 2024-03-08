public class InvoiceItem {
    private String id;
    private String description;
    private int quantity;
    private double unitPrice;

    public InvoiceItem(String id, String description, int quantity, double unitPrice) {
        this.id = id;
        this.description = description;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal() {
        return quantity * unitPrice;
    }

    @Override
    public String toString() {
        return "InvoiceItem{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                '}';
    }

    public static void main(String[] args) {

        //Invoice Item
        InvoiceItem item = new InvoiceItem("001", "Product A", 2, 10.5);

        // Print the details of the invoice item
        System.out.println("Invoice Item Details:");
        System.out.println("ID: " + item.getId());
        System.out.println("Description: " + item.getDescription());
        System.out.println("Quantity: " + item.getQuantity());
        System.out.println("Unit Price: $" + item.getUnitPrice());
        System.out.println("Total: $" + item.getTotal());
    }
}
