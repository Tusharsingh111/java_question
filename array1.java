public class array1 {
    public static void main(String[] args) {
        //int arr[]=new int[5];
        int[] arr = {1,2,3,5,7};
        try{
        System.out.println(args[4]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of bound "+e);
        }

    }
}
