import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DrugStore ds = new DrugStore("Hayat", "Zahle");

        // Adding medicines to the store
        ds.addMedicine(new OverCounter("Panadol", 150, true));
        ds.addMedicine(new OverCounter("Paracetamol", 120, false));
        ds.addMedicine(new Prescription("Flagel", 350));

        System.out.println("Enter a medicine's name: ");
        String n = input.nextLine();

        double s = ds.buyMedicine(n);
        System.out.println("The price of the medicine bought is: " + s);

        System.out.println("The number of Over the Counter medicines is: " + ds.getOverCounterMeds().length);
    }
}
