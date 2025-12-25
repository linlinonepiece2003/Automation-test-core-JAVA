package Java_OOP;

public class Encapsulation_Account_ex5 {
    private int accno;
    private String name;
    private double amount;

    public int getAccno() {
        return accno;
    }

    public void setAccno(int accno) {
        this.accno = accno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    //    void setAccno(int accno){
//        this.accno = accno;
//    }
//    int getAccno(){
//        return accno;
//    }
    public static void main(String[] args) {
        Encapsulation_Account_ex5 acc1 = new Encapsulation_Account_ex5();
        acc1.setAccno(101);
        acc1.setAmount(56000);
        acc1.setName("John");
        System.out.println(acc1.getAccno());
        System.out.println(acc1.getAmount());
        System.out.println(acc1.getName());

    }
}
