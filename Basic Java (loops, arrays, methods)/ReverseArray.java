public class ReverseArray {
    public static void main(String[] args) {
        int [] arr = {1, 21, 3, 4, 5, 34, 67};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;
        for(int ele : arr)
        {
            System.out.print(ele + " ");
        }
        System.out.println();

        for(int i=0; i<n; i++){
            // Swap a[i] and a[l-1-i]
            // a   b   temp
            // |4| |3| ||
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for(int ele : arr)
        {
            System.out.print(ele + " ");
        }
    }
}
