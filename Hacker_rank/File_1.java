package Hacker_rank;

import java.util.*;

public class File_1 {

    // Returns the Bike with the highest price
    public static Bike findMaxPriceOfBike(Bike[] b) {
        int max = b[0].getPrice();
        Bike ans1 = b[0];
        for (int i = 1; i < b.length; i++) {
            if (b[i].getPrice() > max) {
                max = b[i].getPrice();
                ans1 = b[i];
            }
        }
        return ans1;
    }

    // Returns the Bike matching the given name (case-insensitive)
    public static Bike searchBikeByName(Bike[] b, String sname) {
        for (Bike b1 : b) {
            if (b1.getName().toLowerCase().equals(sname.toLowerCase())) {
                return b1;
            }
        }
        return null;
    }

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Bike[] b = new Bike[n];

        for (int i = 0; i < n; i++) {
            int id_ = sc.nextInt();
            int quantity_ = sc.nextInt();
            sc.nextLine(); // Consume leftover newline
            String name_ = sc.nextLine();
            int price_ = sc.nextInt();

            b[i] = new Bike(id_, quantity_, name_, price_);
        }

        // Find and print bike with max price
        Bike ans1 = findMaxPriceOfBike(b);
        if (ans1 != null) {
            System.out.println("id-" + ans1.getId());
            System.out.println("quantity-" + ans1.getQuantity());
            System.out.println("name-" + ans1.getName());
            System.out.println("price-" + ans1.getPrice());
        } else {
            System.out.println("No Bike found with mentioned attribute");
        }

        // Read search name
        sc.nextLine(); // Consume leftover newline
        String sname = sc.nextLine();

        // Search bike by name and print
        Bike ans2 = searchBikeByName(b, sname);
        if (ans2 == null) {
            System.out.println("No Bike found with mentioned attribute");
        } else {
            System.out.println("id-" + ans2.getId());
            System.out.println("quantity-" + ans2.getQuantity());
            System.out.println("name-" + ans2.getName());
            System.out.println("price-" + ans2.getPrice());
        }

        sc.close();
    }
}

// Bike class with private fields and getters/setters
class Bike {
    private int id;
    private int quantity;
    private String name;
    private int price;

    Bike(int id, int quantity, String name, int price) {
        this.id = id;
        this.quantity = quantity;
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}

