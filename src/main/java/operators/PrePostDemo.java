package operators;

class PrePostDemo {
    public static void main(String[] args){
        int i = 3;
        i++;
        System.out.println(i);    // "4"
        ++i;
        System.out.println(i);    // "5"
        System.out.println(++i);  // "6": prefix incr/decr operator evaluates to the updated value
        System.out.println(i++);  // "6": postfix incr/decr operator evaluates to the original value
        System.out.println(i);    // "7"
    }
}
