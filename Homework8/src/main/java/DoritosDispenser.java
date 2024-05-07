public class DoritosDispenser implements SnackDispenser{
    private SnackDispenser nextDispenser;
    @Override
    public void setNextDispenser(SnackDispenser nextDispenser) {
        // TODO Auto-generated method stub
        this.nextDispenser = nextDispenser;
    }

    @Override
    public void checkSnackType(Snack snack) {
        // TODO Auto-generated method stub
        if(snack.getName() == "Doritos"){
            System.out.println("Dispensing Doritos, For The Bold!");

        }else {
            nextDispenser.checkSnackType(snack);
        }
    }
}
