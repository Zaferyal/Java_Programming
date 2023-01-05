package withMentor.FlippTask2;

public class Task2_2_DivisibelBy3_5_15 {
    public static void main(String args[]) {
        System.out.println("\nDivisible by 3: ");
        for (int i=1; i<100; i++) {
            if (i%3==0) System.out.print(i+ "," );

        }
        System.out.println("\n\nDivisible by 5: ");
        for (int i=1; i<100; i++) {
            if (i%5==0) System.out.print(i +",");
        }
        System.out.println("\n\nDivisible by 15: ");
        for (int i=1; i<100; i++) {
            if (i%15==0) System.out.print(i +",");

        }

    }
}
