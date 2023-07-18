public class ExceptionHandling {
/*
* Exception Handling is not about solving the problem but make another way to execute
* Ex: Rutine of our is fix but one day some problem are there and then we are finishing our problem in anothor way */

    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println(100/0); //this is ArithmeticException which will not print next anything
        System.out.println("5");
        System.out.println("6");
        System.out.println("7");
        System.out.println("8");
        System.out.println("9");
        System.out.println("10");

    }

    /*
    OBJECT  class is the parent class of all the classes i  Java
    THROWABLE class is a child class of OBLECT class
    ======
    THROWABLE class has two child class 1) Exception , 2) Error
    ======
    1) EXCEPTION : It occurs when program execute
    : It is recoverable
    2) ERROR : It occurs when lack of System Resources
    : It are not Recoverable
     */


}
