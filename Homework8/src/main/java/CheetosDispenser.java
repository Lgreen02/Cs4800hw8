public class CheetosDispenser implements SnackDispenser{
    private SnackDispenser nextDispenser;
    @Override
    public void setNextDispenser(SnackDispenser nextDispenser) {
        // TODO Auto-generated method stub
        this.nextDispenser = nextDispenser;
    }

    @Override
    public void checkSnackType(Snack snack) {
        // TODO Auto-generated method stub
        if(snack.getName() == "Cheetos"){
            System.out.println("Dispensing Cheetos, Dangerously Cheesy!");

        }else {
            nextDispenser.checkSnackType(snack);
        }

    }

}
