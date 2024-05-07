import java.util.HashMap;

public class VendingMachine {
    private Snack coke;
    private Snack pepsi;
    private Snack cheetos;
    private Snack doritos;
    private Snack kitKat;
    private Snack snickers;
    private Snack selectedSnack;
    private float totalMoney;
    private HashMap<String, Snack> snackMap;
    private StateOfVendingMachine currentState;
    private IdleState idle;
    private WaitingForMoneyState moneyState;
    private DispensingSnackState dispensingSnackState;
    private CokeDispenser cokeD;
    private PepsiDispenser pepsiD;
    private CheetosDispenser cheetosD;
    private DoritosDispenser doritosD;
    private KitKatDispenser kitKatD;
    private SnickersDispenser snickersD;

    public VendingMachine(){
        totalMoney = 0.0f;
        initDispensers();
        initSnacks();
        initStates();
    }
    private void initDispensers(){
        cokeD = new CokeDispenser();
        pepsiD = new PepsiDispenser();
        cheetosD = new CheetosDispenser();
        doritosD = new DoritosDispenser();
        kitKatD = new KitKatDispenser();
        snickersD = new SnickersDispenser();
        initDispensingOrder();
    }
    private void initDispensingOrder(){
        cokeD.setNextDispenser(pepsiD);
        pepsiD.setNextDispenser(cheetosD);
        cheetosD.setNextDispenser(doritosD);
        doritosD.setNextDispenser(kitKatD);
        kitKatD.setNextDispenser(snickersD);
        snickersD.setNextDispenser(cokeD);
    }
    private void initSnacks(){
        coke = new Snack("Coke", 1.0f, 6);
        pepsi =  new Snack("Pepsi", 0.75f, 6);
        cheetos = new Snack("Cheetos", 1.75f, 3);
        doritos = new Snack("Doritos", 1.60f, 2);
        kitKat = new Snack("KitKat", 2.50f, 4);
        snickers = new Snack("Snickers", 3.10f, 0);

        snackMap = new HashMap<>();
        snackMap.put(coke.getName(), coke);
        snackMap.put(pepsi.getName(), pepsi);
        snackMap.put(cheetos.getName(), cheetos);
        snackMap.put(doritos.getName(), doritos);
        snackMap.put(kitKat.getName(), kitKat);
        snackMap.put(snickers.getName(), snickers);
    }
    private void initStates(){
        idle = new IdleState();
        moneyState = new WaitingForMoneyState();
        dispensingSnackState = new DispensingSnackState();
        currentState = idle;
    }
    public HashMap<String, Snack> getSnackMap(){
        return snackMap;
    }
    public SnackDispenser getSnackDispenser(){
        return cokeD;
    }
    public void selectSnack(String snackName){
        selectedSnack = snackMap.get(snackName);
        if(currentState.selectSnack() && selectedSnack.getQuantity() != 0)
            currentState = moneyState;
        else if(selectedSnack.getQuantity() == 0)
            System.out.println("Fresh out of " + selectedSnack.getName());
    }
    public void insertMoney(float insertedMoney){
        totalMoney += insertedMoney;
        if(currentState.insertMoney() && totalMoney >= selectedSnack.getPrice()) {
            currentState = dispensingSnackState;
            totalMoney -= selectedSnack.getPrice();
        }
        else if(currentState.insertMoney())
            currentState = currentState;

    }
    public void dispenseSnack(){
        if(currentState.dispenseSnack()) {
            currentState = idle;
            cokeD.checkSnackType(selectedSnack);
        }
    }

    public Snack getSelectedSnack(){
        return selectedSnack;
    }
    public float getTotalMoney(){
        return totalMoney;
    }

}
