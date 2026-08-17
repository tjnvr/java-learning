package operators;

class ArithmeticDemo {

    public static void main (String[] args){

        int result = 1;
        System.out.println(result+=2); // result is now 3

        System.out.println(result-=1);

        System.out.println(result*=2);

        System.out.println(result/=2);

        result +=8; // result is now 10
        result %= 7; // result is now 3
        System.out.println(result);
    }
}

