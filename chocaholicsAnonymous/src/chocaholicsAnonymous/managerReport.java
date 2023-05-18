package chocaholicsAnonymous;
/**
* The managerReport class holds and generates a report that will be sent to the manager.
*
* @author Josh Balch and Evan McCullar
* @version 1.0
*/
public class managerReport{
	providerDatabase providersToBePaid;
    int consultationsPerProvider[];
    int amountDuePerProvider[];

    managerReport() {
        providersToBePaid = new providerDatabase();
        consultationsPerProvider = new int[100];
        amountDuePerProvider = new int[100];

        consultationsPerProvider[0] = 4;
        consultationsPerProvider[1] = 5;
        consultationsPerProvider[2] = 6;

        amountDuePerProvider[0] = 4;
        amountDuePerProvider[1] = 5;
        amountDuePerProvider[2] = 6;
    }

    void generateManagerReport() {
        System.out.println("\n");
        System.out.println("Manager Report");
        System.out.println("Providers to be paid: ");
        printProvidersToBePaid();
        System.out.println("Consultations per provider: ");
        for(int i = 0; i < consultationsPerProvider.length; i++){
            if(consultationsPerProvider[i] != 0) {
                System.out.println(consultationsPerProvider[i]);
            }
        }
        System.out.println("Amount due per provider: ");
        for(int i = 0; i < amountDuePerProvider.length; i++){
            if(amountDuePerProvider[i] != 0) {
                System.out.println(amountDuePerProvider[i]);
            }
        }

        System.out.println("\n");
    }

    void printProvidersToBePaid() {
        for(int i = 0; i < providersToBePaid.getProviderList().size(); i++) {
            printProvider(providersToBePaid.getProviderList().get(i));
        }
    }

    void printProvider(Provider p) {
        System.out.println("Provider Name: " + p.getpersonName());
        System.out.println("Provider Number: " + p.getProviderNum());
        System.out.println("Provider Street Address: " + p.getpersonAddress());
        System.out.println("Provider City: " + p.getpersonCity());
        System.out.println("Provider State: " + p.getpersonState());
        System.out.println("Provider Zip: " + p.getpersonZip());
        System.out.println("\n");
    }
}