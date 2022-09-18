public class Main {

    // define function printSorted which takes 3 args of same dataType that prints them to console in sorted order
    public static <T extends Comparable <T>> void printSorted (T a, T b, T c) {


        if (a.compareTo(b)>=0){
            T temp;
            temp = a;
            a = b;
            b = temp;
        }
        if (c.compareTo(a)<0){
            System.out.println(c + "," + a + "," + b);
        } else if (c.compareTo(b) > 0 ) {

            System.out.println(a + "," + b + "," + c);
        } else {
            System.out.println(a + "," + c + "," + b);
        }

    }


    // do not change main
    public static void main(String[] args) {

        printSorted(1,5,7); // should output "1, 5, 7"
        printSorted("Steriogram", "Foo Fighters", "Sum41"); //should output "Foo Fighters, Steriogram, Sum41"
        printSorted(-2.3, 5.6, 3.5); //should output "-2.3, 3.5, 5.6"
    }

}
