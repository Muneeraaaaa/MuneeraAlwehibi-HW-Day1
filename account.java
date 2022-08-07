public class account {

    private int id;
    private customer customer;
    private double balance=0.0;

    public account(int id, customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public account(int id, customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "account{" +
                "id=" + id +
                ", customer=" + customer +
                ", balance=" +  Math.round(balance*100)/100+
                '}';
    }


    public String getcustomername(){

        return customer.getName();
    }
    public account deposit (double amount){

        //double balance=getBalance()+amount;

        this.balance+=amount;
        return this;
    }

    public account withdraw(double amount){

        if(getBalance()>=amount){

            balance-=amount;
            return this;

        }

        System.out.println("amount withdraw exceeds the current balance ");

        return this;

        }




    }

