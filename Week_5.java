
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Week_5{
    public static void main(String[] args) throws IOException {
        
    //     InputStreamReader in = new InputStreamReader(System.in);
    //     BufferedReader bf = new BufferedReader(in);
    //     int num = Integer.parseInt(bf.readLine());
    //     System.out.println("No. is="+num);
    //     bf.close();
    // }
    //Easy way
    Scanner sc= new Scanner(System.in);
    int num = sc.nextInt();
    System.out.println("No. is="+num);
    sc.close();
    }
}
// In this lecture we are discussing about different ways to take input in java:
// how to take input from user :
// in C++ we use  cin
// in C we use scanf()
// in python we use input()

// How to take input in java?
// #1
// using System.in.read()
// -- using System.in.read() we can take single character input only, if we provide multiplecharacterr
//  itconsidersr the firstcharacterr of enter sequence.

// -- if we want to show result of multiple character we can use loop (not in video lecture forcuriosityy)
// e.g 
//  class Main{
// public static void main(String[] args) throws Exception{
//    int i =System.in.read(); // read a byte from the keyboard
//    System.out.println(i); // print the byte value
//    /*
//     input: a
//       output: 97
//    input: A
//       output: 65
//    input: 345 /considere 3 digit from number
//       output: 51
//    input: 3456 //consider 3 digit from number
//       output: 51
//    input: 3
//       output: 51

// return ascii value of the input
//     */
//    // to get actual number 
//    // 1. convert ascii value to char
// System.out.println((char)i); // print the char value

//   // 2. subtract 48 from the ascii value
// System.out.println(i-48); // print the actual number 
// //but it is only for single digit number 

// // formultiple-digittnumbersr we have to use loop
// // 3. use loop
// int n=0;
// while(i!=13){ // 13 is ascii value of enter key
//    n=n*10+(i-48);
//    i=System.in.read();
// }
// System.out.println(n);

//    }
//  }
// using InputStreamReader class:
// In Java, the InputStreamReader class is used to read data from an input stream and convert it into characters. 
// It is often used with the BufferedReader class, which provides a buffered way to read characters from an input stream.
// e.g 
// class Main{
// public static void main(String[] args) {
//         BufferedReader br = null;
//         try {
//             // create a new InputStreamReader to read from System.in
//             InputStreamReader isr = new InputStreamReader(System.in);
//             // create a new BufferedReader to read from the InputStreamReader
//             br = new BufferedReader(isr);

//             System.out.println("Enter your name:");
//             // read a line of text from the BufferedReader
//             String name = br.readLine();

//             System.out.println("Hello, " + name + "!");
//         } catch (IOException e) {
//             System.err.println("Error reading input: " + e.getMessage());
//         }
//         finally{
//             if(br!=null){
//               try{
//             br.close();
//          }
//          catch(IOException e){
//             System.out.println("There might some problem to closing the resource");
//          }
//             }
//         }
//     }
// }
// Note: if open the resource then close is important 

// Use of Scanner Class : 
// To make programmer life easy 
// Scanner class was introduced in Java 1.5 as part of the Java API  to provide an easy way
// to read user input from various sources such as the keyboard.

// a) Reading input through keyboard:
// -- import java.util.Scanner;  need to import in java file

// Scanner scanner = new Scanner(System.in);
// System.out.print("Enter your name: ");
// String name = scanner.nextLine();
// System.out.println("Hello, " + name + "!");

// -- Scanner object using the System.in input stream, which represents the keyboard. 
// We then use the nextLine() method to read a line of text entered by the user.

// Important: From here this part is not in video, for your cursoity we are put only in this description.

// b) read through file 
// import java.io.File;
// import java.io.FileNotFoundException;
// import java.util.Scanner;

// File file = new File("input.txt");
// try {
//     Scanner scanner = new Scanner(file);
//     while (scanner.hasNextLine()) {
//         String line = scanner.nextLine();
//         System.out.println(line);
//     }
// } catch (FileNotFoundException e) {
//     System.out.println("File not found: " + e.getMessage());
// }
// we create a Scanner object using a File object that represents the input file. 
// We then use the hasNextLine() and nextLine() methods to read each line of text from the file.

// c) Read input though String
// import java.util.Scanner;

// String input = "156 2 3 4 5";
// Scanner scanner = new Scanner(input);
// while (scanner.hasNextInt()) {
//     int number = scanner.nextInt();
//     System.out.println(number);
// }
// -- Scanner object using a String object that contains the input. We then use the hasNextInt() and nextInt() methods to read each integer from the string.