public class Admin extends User {

    // TODO: constructor
    public Admin(String name, int id) {
        super(name, id);
    }


    @Override
    public void manageService(Service s) {

        // TODO:
        System.out.println("managing massage");
        // print admin managing message

    }

    @Override
    public void useService(Service s) {

        // TODO:
        System.out.println("use massage");
        s.performService();
        // print admin using message
        // call performService()

    }
}