package multiple_catch_blocks;

public class MultipleCatchDemo {
    public static void generateException(int [] arr,int index){
        try{
            System.out.println("Value at index X : "+arr[index]);
        } catch (NullPointerException e) {
            System.err.println("Array is not initialized!");
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Invalid index!");
        }
    }
}
