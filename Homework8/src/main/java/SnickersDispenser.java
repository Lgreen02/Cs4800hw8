public class SnickersDispenser implements SnackDispenser{
    private SnackDispenser nextDispenser;
    @Override
    public void setNextDispenser(SnackDispenser nextDispenser) {
        // TODO Auto-generated method stub
        this.nextDispenser = nextDispenser;
    }

    @Override
    public void checkSnackType(Snack snack) {
        // TODO Auto-generated method stub
        if(snack.getName() == "Snickers"){
            System.out.println("Dispensing Snickers, You are Not You When You are Hungry!");

        }else {
            nextDispenser.checkSnackType(snack);
        }
    }

}
