package Codes;
import java.util.*;

class DepartmentalStore {
    private String storeId;
    private String storeName;
    private String location;
    private int noOfWorkers;
    private int rating;

    public DepartmentalStore(String storeId, String storeName, String location, int noOfWorkers, int rating) {
        this.storeId = storeId;
        this.storeName = storeName;
        this.location = location;
        this.noOfWorkers = noOfWorkers;
        this.rating = rating;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNoOfWorkers() {
        return noOfWorkers;
    }

    public void setNoOfWorkers(int noOfWorkers) {
        this.noOfWorkers = noOfWorkers;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}

public class Library {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DepartmentalStore[] stores = new DepartmentalStore[4];

        for (int i = 0; i < 4; i++) {
            String storeId = sc.nextLine();
            String storeName = sc.nextLine();
            String location = sc.nextLine();
            int noOfWorkers = sc.nextInt();
            int rating = sc.nextInt();
            sc.nextLine(); // consume newline
            stores[i] = new DepartmentalStore(storeId, storeName, location, noOfWorkers, rating);
        }

        String startsWithInput = sc.nextLine();
        String locationInput = sc.nextLine();
        sc.close();

        int avgWorkers = findAverageWorkersInSpecificLocation(stores, startsWithInput);
        if (avgWorkers > 0) {
            System.out.println(avgWorkers);
        } else {
            System.out.println("No stores are available with the given input");
        }

        DepartmentalStore[] filteredStores = findStoreDetailsForGivenLocation(stores, locationInput);
        if (filteredStores != null) {
            for (DepartmentalStore store : filteredStores) {
                System.out.println(store.getStoreName());
            }
        } else {
            System.out.println("No stores present in the given location");
        }
    }

    public static int findAverageWorkersInSpecificLocation(DepartmentalStore[] stores, String startsWithInput) {
        int sum = 0, count = 0;
        for (DepartmentalStore store : stores) {
            if (store.getStoreId().startsWith(startsWithInput)) {
                sum += store.getNoOfWorkers();
                count++;
            }
        }
        return count > 0 ? sum / count : 0;
    }

    public static DepartmentalStore[] findStoreDetailsForGivenLocation(DepartmentalStore[] stores, String location) {
        List<DepartmentalStore> matched = new ArrayList<>();
        for (DepartmentalStore store : stores) {
            if (store.getLocation().equals(location)) {
                matched.add(store);
            }
        }
        if (matched.isEmpty()) return null;

        matched.sort(Comparator.comparingInt(DepartmentalStore::getRating));
        return matched.toArray(new DepartmentalStore[0]);
    }
}