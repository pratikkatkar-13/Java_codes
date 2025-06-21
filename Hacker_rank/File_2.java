package Hacker_rank;

import java.util.*;

public class File_2 {
    
    // Method to count how many grains match the given name (case-insensitive)
    public static int countGrainByGivenName(Grain[] obj, String name) {
        int cnt = 0; 
        for (Grain g : obj) {
            if (g.getGrainName().toLowerCase().equals(name.toLowerCase())) {
                cnt++;
            }
        }
        return cnt;
    }

    // Method to find the grain from Maharashtra with the minimum quantity
    public static Grain getMinGrainFromMaharashtra(Grain[] obj) {
        int minQty = Integer.MAX_VALUE;
        Grain result = null;
        for (Grain g : obj) {
            if (g.getState().toLowerCase().equals("maharashtra")) {
                if (g.getQtylnQuintal() < minQty) {
                    minQty = g.getQtylnQuintal();
                    result = g;
                }
            }
        }
        return result;
    }

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        Grain[] obj = new Grain[n]; // Fixed: Use 'n' instead of hardcoded size
        
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            sc.nextLine(); // Clear newline
            String name = sc.nextLine();
            String state = sc.nextLine();
            int q = sc.nextInt();
            obj[i] = new Grain(id, name, state, q);
        }
        sc.nextLine(); // Clear leftover newline before reading name

        String name1 = sc.nextLine(); // Grain name to search for
        sc.close();
        int ans1 = countGrainByGivenName(obj, name1);
        if (ans1 > 0) {
            System.out.println(ans1);
        } else {
            System.out.println("No Grains with matching names are found");
        }

        Grain ans2 = getMinGrainFromMaharashtra(obj);
        if (ans2 == null) {
            System.out.println("No Grains from Maharashtra are found");
        } else {
            System.out.println(ans2.getGrainId());
            System.out.println(ans2.getGrainName());
            System.out.println(ans2.getState());
            System.out.println(ans2.getQtylnQuintal());
        }
    }
}

// Grain class definition
class Grain {
    private int grainId;
    private String grainName;
    private String state;
    private int qtylnQuintal;

    Grain(int grainId, String grainName, String state, int qtylnQuintal) {
        this.grainId = grainId;
        this.grainName = grainName;
        this.state = state;
        this.qtylnQuintal = qtylnQuintal;
    }

    public int getGrainId() {
        return grainId;
    }

    public void setGrainId(int grainId) {
        this.grainId = grainId;
    }

    public String getGrainName() {
        return grainName;
    }

    public void setGrainName(String grainName) {
        this.grainName = grainName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getQtylnQuintal() {
        return qtylnQuintal;
    }

    public void setQtylnQuintal(int qtylnQuintal) {
        this.qtylnQuintal = qtylnQuintal;
    }
}

