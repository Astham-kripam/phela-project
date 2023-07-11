import java.util.Scanner;

//Its the first program every programmer go through its journey.
class helloworld{
    public static void main(String args[]){
        System.out.println("Hello World"); // prints "Hello World" to the console when
    }
}
// use of basic data typesa(int,boolean,string,double)
class datatype{
    public static void main(String args[]){
    int num=5;
    int num1=10;
    int sum = num + num1;
    System.out.println("sum = " + sum);
    //string and boolean
    String A= "hello";
    String b ="Aditya";
    System.out.println(A);  
    double x = 444.444;
    System.out.println(x);    
    }
}
//operators in Java language
/* 1 Arthmetic oprators(+,_,%,*,\) 
 * 2 Assisment oprators(=)
 * 3 Comparision oprators(>= <= == etc)
 * logical oprators(&& || !)
 */
class oprators{
    public static void main (String[]args){
        int a= 5;
        int b=6;
        int c = b%a;
        System.out.println(c);
    }
} 
/*  control statements(if if-else switch) also loops(for and while)
are used here for better understanding programming logic flow.*/
class statement{
    public static void main(String args[]){
        int age=27;
        char gender='M';
        float height=189.5f ;
        long salary=5000L;
        if ((age>=20) && (height>180f));
        System.out.println("perfect");
        int aged = 17;

if (aged >= 18) {
    System.out.println("You are an adult.");
} else {
    System.out.println("You are a minor.");
    }
     System.out.println("   ");
    }
}
// simple java if-else problems 
/*take input and check whether positive or negative*/
class practice1{
    public static void main (String args[]){
        Scanner num = new Scanner(System.in);
        System.out.println("enter the num = ");
        int input = num.nextInt();
        if (input>=0){
            System.out.println(" num is positive");
        } else {
            System.out.println("num is negative");
        }                         
     }
 }





