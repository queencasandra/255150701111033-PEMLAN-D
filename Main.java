public class Main {
    public static void main(String[] args) {

        Invoice inv1 = new Invoice("Blind Box", 6, 120000);
        Invoice inv2 = new Invoice("Kopi", 2, 30000);

        Invoice[] invoices = {inv1, inv2};

        Employee emp = new Employee(505, "Srintil", 4500000, invoices);

        emp.display();
    }
}