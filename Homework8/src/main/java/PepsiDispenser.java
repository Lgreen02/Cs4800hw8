public class PepsiDispenser implements SnackDispenser{
    private SnackDispenser nextDispenser;
    @Override
    public void setNextDispenser(SnackDispenser nextDispenser) {
        // TODO Auto-generated method stub
        this.nextDispenser = nextDispenser;
    }

    @Override
    public void checkSnackType(Snack snack) {
        // TODO Auto-generated method stub
        if(snack.getName() == "Pepsi"){
            System.out.println("Dispensing Pepsi, That's What I Like!");

        }else {
            nextDispenser.checkSnackType(snack);
        }

    }

}
