
public class BasicMethods {
    static void change (int a)
    {
        a = 40;
    }

    static void change(int [] arr)
    {
        arr[1] = 40;
    }


    public static void main(String[] args) {
        //pass by Value
        int a  = 20;
        System.out.println("Before Calling change " + a );
        change(a);
        System.out.println("After Calling change " + a );

        //array always passs by reference
        int[] arr = {1,2,3};
        System.out.println("Before Calling change ");
        for(int ele:arr)
        {
            System.out.print(ele + " ");
        }
        change(arr);
        System.out.println("\nAfter Calling change " );
        for(int ele:arr)
        {
            System.out.print(ele + " ");
        }

        //if we do not make cahnge method static 
        // BasicMethods obj = new BasicMethods();
        // obj.change(a);
        
        
    }
}
