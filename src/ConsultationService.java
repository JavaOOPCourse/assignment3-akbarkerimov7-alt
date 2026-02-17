public class ConsultationService extends Service
        implements Billable {


    // TODO: constructor
    public ConsultationService(String name, int id) {
        super(name,id);

    }


    @Override
    public void performService() {
        if (!isActive()) {
            System.out.println(getServiceName() + " is not Active");
            return;
        }
        System.out.println("Providing onl cons.");

        // TODO:
        // check active
        // print consultation message

    }

    @Override
    public void generateBill() {
        System.out.println(getServiceName() + "Bill");

        // TODO:
        // print billing message

    }
}