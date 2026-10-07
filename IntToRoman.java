import java.util.Scanner;

public class IntToRoman {

    public static String toRoman(int number) {
        String s = "";
        int[] val = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symb = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        for (int i = 0; i < val.length; i++){
            while(number >= val[i]){
                s += symb[i];
                number -= val[i];
            }
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner lala = new Scanner(System.in);
        int number = lala.nextInt();
        System.out.println(toRoman(number));
        lala.close();
    }
}