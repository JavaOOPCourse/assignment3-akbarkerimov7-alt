public class StreamingService extends Service implements PremiumFeature {

    // TODO: declare premium field
    private boolean  isPremium = false;


    // TODO: constructor
    public StreamingService(String name, int id) {
        super(name, id);
    }


    @Override
    public void performService() {

        // TODO:
        if (!isActive()) {
            System.out.println(getServiceName() + " is not active");
            return;

        }
        if (isPremium) {
            System.out.println("4K HD");
        }
        else {
            System.out.println("Standart");
        }
        // check if service is active
        // print different message for premium and normal

    }

    @Override
    public void upgradeToPremium() {
        isPremium = true;
        System.out.println(getServiceName() + " upgraded to PREMIUM.");


        // TODO:
        // set premium = true
        // print message

    }
}