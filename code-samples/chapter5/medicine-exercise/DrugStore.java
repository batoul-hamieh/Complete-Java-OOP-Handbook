import java.util.ArrayList;

public class DrugStore {
    private String name;
    private String location;
    private ArrayList<Medicine> medicines;

    public DrugStore(String N, String loc) {
        name = N;
        location = loc;
        medicines = new ArrayList<Medicine>();
    }

    public void addMedicine(Medicine m) {
        medicines.add(m);
    }

    public double buyMedicine(String name) {
        for (int i = 0; i < medicines.size(); i++) {
            Medicine m = medicines.get(i);
            if (m.getName().equals(name)) {
                if (m instanceof OverCounter) {
                    return ((OverCounter) m).findPriceAfterTax();
                } else if (m instanceof Prescription) {
                    return ((Prescription) m).getPrice();
                }
            }
        }
        return 0;
    }

    public OverCounter[] getOverCounterMeds() {
        int num = 0;
        for (int i = 0; i < medicines.size(); i++) {
            if (medicines.get(i) instanceof OverCounter) {
                num++;
            }
        }

        OverCounter[] oc = new OverCounter[num];
        for (int i = 0, j = 0; i < medicines.size(); i++) {
            if (medicines.get(i) instanceof OverCounter) {
                oc[j] = (OverCounter) medicines.get(i);
                j++;
            }
        }
        return oc;
    }
}
