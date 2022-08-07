public class invoice {
    private int id;
    private customer customer;
    private double amount;

    public invoice(int id, customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public customer getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setCustomer(customer customer) {
        this.customer = customer;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getcustomerid(){
        return customer.getId();

    }

   public String getcustomername(){

        return customer.getName();
   }

   public int getustomerdisount(){

        return customer.getDiscount();
   }
   public double getamountafterdisconut(){

        double s=100-customer.getDiscount();
        return (s*getAmount())/100;

   }

    @Override
    public String toString() {
        return "invoice{" +
                "id=" + id +
                ", customer=" + customer +
                ", amount=" + amount +
                '}';
    }
}
