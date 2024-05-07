public class KitKatDispenser implements SnackDispenser{
    private SnackDispenser nextDispenser;
    @Override
    public void setNextDispenser(SnackDispenser nextDispenser) {
        // TODO Auto-generated method stub
        this.nextDispenser = nextDispenser;
    }

    @Override
    public void checkSnackType(Snack snack) {
        // TODO Auto-generated method stub
        if(snack.getName() == "KitKat"){
            System.out.println("Dispensing KitKat, Have a break with a KitKat!");

        }else {
            nextDispenser.checkSnackType(snack);
        }
    }

}
