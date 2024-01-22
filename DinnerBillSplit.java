import java.util.Scanner;

public class DinnerBillSplit {

    public static void takeInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many people are splitting the bill?");
        int NumOfPeople = scanner.nextInt();
        System.out.println("Okay so " + NumOfPeople + " people are splitting the bill...");
        System.out.println("How much is the tab?");
        double tabAmount = scanner.nextDouble();
        System.out.println("Okay so the tab amount is " + "$" + tabAmount);
        System.out.println("Calculating...");
        
        calc(NumOfPeople, tabAmount);
    }

    public static void calc(int NumOfPeople, double tabAmount){
        double pricePerPerson = tabAmount / NumOfPeople;
        double roundedNum = Math.round(pricePerPerson * 100.0) / 100.0;
        System.out.println("Everybody should pay " + roundedNum);
    }
    public static void main(String[] args) {
        takeInfo();
    }
    
}
