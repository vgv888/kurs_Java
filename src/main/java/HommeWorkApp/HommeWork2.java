package HommeWorkApp;


public class HommeWork2 {
    public static void main(String[] args) {
        summTwoInt(10,80);
        oneIntPositive(-15);
        oneIntNegativeTrue(-15);
        stringAndInt("Привет", 2);
        isLeapYear(2021);
    }

    private static boolean summTwoInt(int a, int b) {
        int c = a + b;
        if (c >=10 && c <= 20){
            System.out.println(true); return true;
        }else {
            System.out.println(false); return false;
        }
    }

    private static int oneIntPositive(int a) {
        if (a >= 0){
            System.out.println("Число положительное");
        }else{
            System.out.println("Число отрицательное");
        }return a;
    }

    private static boolean oneIntNegativeTrue(int a) {
        if (a <0){
            System.out.println(true); return true;
        }else{
            System.out.println(false); return  false;
        }
    }

    private static String stringAndInt(String str, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
        return str;
    }

    private static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 !=0 || year % 400 ==0){
            System.out.println("год высокосный");return true;
        }else{
            System.out.println("год не высокосный"); return false;
        }
    }
}

