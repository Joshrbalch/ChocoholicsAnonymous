package chocaholicsAnonymous;
/**
* The ETFReport class generates the report for the electronic transfer funds.
*
* @author Josh Balch and Evan McCullar
* @version 1.0
*/
public class ETFReport{
	double etfTransfers[]; //array of all etf transfers

    ETFReport(){
        etfTransfers = new double[100];
        etfTransfers[0] = 4.32;
        etfTransfers[1] = 5.32;
        etfTransfers[2] = 6.32;
        etfTransfers[3] = 7.32;
        etfTransfers[4] = 8.32;
    }

    public void generateETFReport(){
        System.out.println("ETF Report");
        System.out.println("ETF Transfers: ");
        for(int i = 0; i < etfTransfers.length; i++){
            if(etfTransfers[i] != 0) {
                System.out.println(etfTransfers[i]);
            }
        }
        System.out.println("\n");
    }
}