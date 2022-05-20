package Level.Two;

//Create an abstract class 'Bank' with an abstract method 'getBalance'.
// $100, $150 and $200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'.
// Call this method by creating an object of each of the three classes.

abstract class Bank {


    public abstract void getBalance();

    public static void main(String[] args) {
        BankA a = new BankA();
        a.getBalance();

        BankB b = new BankB();
        b.getBalance();

        BankC c = new BankC();
        c.getBalance();
    }
}
