package puntoCuatro;

public class Factorial {
	
	public static int num = 10;

    int getFactorial() {
        int factorial = 1;
        for(int i = num; i > 0; i--){
            factorial *= num;
        }
        return factorial;
    }

    public String toString() {
        String factorialStr = "Factorial: " + num + "! = ";
        int factorial = 1;
        for(int i = 1; i <= num; i++) {
            factorial *= i;
            factorialStr += i;
            if(i != num) {
                factorialStr += " * ";
            }
        }
        factorialStr += " = " + factorial;
        return factorialStr;
    }

    public static void main(String[] args) {
        Factorial fa = new Factorial();
        System.out.println(fa);
    }
}
