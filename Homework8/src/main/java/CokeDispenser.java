public class CokeDispenser implements SnackDispenser{
    private SnackDispenser nextDispenser;
    @Override
    public void setNextDispenser(SnackDispenser nextDispenser) {
        // TODO Auto-generated method stub
        this.nextDispenser = nextDispenser;
    }

    @Override
    public void checkSnackType(Snack snack) {
        // TODO Auto-generated method stub
        if(snack.getName() == "Coke"){
            System.out.println("Dispensing Coke, Enjoy!");

        }else {
            nextDispenser.checkSnackType(snack);
        }
    }

}
