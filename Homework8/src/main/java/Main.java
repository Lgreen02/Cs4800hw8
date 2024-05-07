public class Main {
    public static void main(String[] args){
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.selectSnack("Coke");
        vendingMachine.insertMoney(1.8f);
        vendingMachine.dispenseSnack();

        vendingMachine.selectSnack("Doritos");
        vendingMachine.selectSnack("Cheetos");
        vendingMachine.insertMoney(4.0f);
        vendingMachine.dispenseSnack();

        vendingMachine.selectSnack("KitKat");
        vendingMachine.dispenseSnack();
        vendingMachine.insertMoney(2.6f);
        vendingMachine.dispenseSnack();
        vendingMachine.selectSnack("Snickers");

    }
}
