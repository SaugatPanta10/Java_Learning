public class testencapsulation {
    public static void main(String[] args) {
        bank b = new bank();
        b.setBalance(100);
        System.out.println("My balance is" + b.getBalance());
    }
}
