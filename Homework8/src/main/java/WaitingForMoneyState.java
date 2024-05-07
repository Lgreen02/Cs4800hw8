public class WaitingForMoneyState implements StateOfVendingMachine{

    @Override
    public boolean selectSnack() {
        // TODO Auto-generated method stub
        System.out.println("Please wait until the process is complete before selecting another snack");
        return false;
    }
    @Override
    public boolean insertMoney() {
        // TODO Auto-generated method stub
        System.out.println("inserting money...");
        return true;
    }
    @Override
    public boolean dispenseSnack() {
        // TODO Auto-generated method stub
        System.out.println("insufficient funds");
        return false;
    }

}
