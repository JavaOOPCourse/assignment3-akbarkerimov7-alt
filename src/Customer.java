public class Customer extends User {

    // TODO: constructor
    public Customer(String name, int id) {
        super(name, id);
    }


    @Override
    public void manageService(Service s) {
        System.out.println("customer cannot manage services");

        // TODO:
        // print that customer cannot manage services

    }

    @Override
    public void useService(Service s) {
        System.out.println("customer useing mass");
        s.performService();

        // TODO:
        // print customer using message
        // call performService()

    }
}