public class CloudStorageService extends Service
        implements PremiumFeature, Billable {

    // TODO: declare premium field
    private boolean isPremium = false;
    private int storageUsed = 50;



    // TODO: constructor
    public CloudStorageService(String name, int id) {
        super(name, id);
    }


    @Override
    public void performService() {

        // TODO:
        if (!isActive()) {
            System.out.println(getServiceName() + "not active");
            return;
        }
        System.out.println("Used:" + storageUsed + "GB");// check if active
        // print cloud access message

    }

    @Override
    public void upgradeToPremium() {
        isPremium = true;
        System.out.println(getServiceName() + "storage expanade with PREMIUM.");

        // TODO:
        // enable premium
        // print message

    }

    @Override
    public void generateBill() {
        double cost = storageUsed * 0.5;
        System.out.println(getServiceName() + "Bill:" + cost);

        // TODO:
        // print billing message

    }
}