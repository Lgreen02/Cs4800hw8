public class IdleState implements StateOfVendingMachine{
    @Override
    public boolean selectSnack() {
        // TODO Auto-generated method stub
        System.out.println("Selecting Snack. . .");
        return true;
    }
    @Override
    public boolean insertMoney() {
        // TODO Auto-generated method stub
        System.out.println("You must select a snack before payment begins.");
        return false;
    }

    @Override
    public boolean dispenseSnack() {
        // TODO Auto-generated method stub
        System.out.println("You must select a snack and pay before it can be dispensed");
        return false;
    }

}
