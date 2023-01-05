package withMentor.FlippTask2;

public class Task2_1_3_SwapNumbersWithoutThirdVariable {
    public static void main(String[] args) {


    System.out.println("Swap two variables without using a third variable");

    int x= 4 ;
    int y= 2;
        System.out.println("Before swap: "+" x= "+x+" y= "+y);
    x = x-y;
    y = x+y;
    x = y-x;
        System.out.println("After swap: "+" x= "+x+" y= "+y);
}
}