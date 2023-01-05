package withMentor.FlippTask2;

public class Task2_3_2_PrintConsecutiveNumbers2 {
    public static void main(String[] args) {
        printConsecutiveNumbers(24);

    }
    static void printConsecutiveNumbers(int n){

        for (int i = 1; i <= n; i++) {
            String str = "";
            if (i%2 ==0){
                str = "Codility";
            }
            if (i%3 ==0){
                str += "Test";
            }
            if (i%5==0){
                str += "Coders";
            }
            if (str.equals("")){
                str= i +"";
            }
            System.out.println(str);
        }
    }
}
