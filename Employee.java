public class Employee implements Payable { 
    private int registrationNumber; 
    private String name; 
    private int salaryPerMonth; 
    private Invoice[] invoices; 

    public Employee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices) { 
        this.registrationNumber = registrationNumber; 
        this.name = name; 
        this.salaryPerMonth = salaryPerMonth; 
        this.invoices = invoices; 
    } 

    @Override 
    public double getPayableAmount() { 
        double totalBelanja = 0; 
        for (Invoice i : invoices) {
            totalBelanja += i.getPayableAmount(); 
        } 
        return salaryPerMonth - totalBelanja; 
    } 

    public void display() { 
        System.out.println("\n        DATA KARYAWAN"); 
        System.out.println("======================================"); 
        System.out.println("No Registrasi : " + registrationNumber); 
        System.out.println("Nama          : " + name); 
        System.out.println("Gaji Bulanan  : Rp " + salaryPerMonth); 

        System.out.println("\n----------- DETAIL BELANJA -----------"); 
        double totalBelanja = 0; 
        int no = 1; 

        for (Invoice i : invoices) { 
            System.out.println("Belanja ke-" + no++); 
            System.out.println(i); 
            System.out.println("--------------------------------------"); 
            totalBelanja += i.getPayableAmount(); 
        } 

        System.out.println("Total Belanja : Rp " + totalBelanja); 
        System.out.println("======================================"); 
        System.out.println("Gaji Bersih   : Rp " + getPayableAmount()); 
    } 
}