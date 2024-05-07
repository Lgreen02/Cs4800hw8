public class DispensingSnackState implements StateOfVendingMachine{
    @Override
    public boolean selectSnack() {
        // TODO Auto-generated method stub
        System.out.println("Wait for the snack to be dispensed before selecting another");
        return false;
    }
    @Override
    public boolean insertMoney() {
        // TODO Auto-generated method stub
        System.out.println("wait for transaction to be complete before paying again");
        return false;
    }

    @Override
    public boolean dispenseSnack() {
        // TODO Auto-generated method stub
        System.out.println("Starting up dispenser. . .");
        return true;
    }

}
