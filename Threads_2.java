
class a extends Thread{
    public void run(){
        for(int i = 0; i <100;i++){
            System.out.println("HI");
        }
    }
}
class b extends Thread{
    public void run(){
        try{
        for(int i = 0; i < 100;i++){
            System.out.println("Hello");
            Thread.sleep(100);
        }
    }catch(Exception e){
        System.out.println(e);
    }
    }
}

public class Threads_2 {
    public static void main(String[] args){
        a obj = new a();
        b obj1 = new b();
    
        obj.start();
        obj1.start();
        

    }
}
/*Notes
 * In this lecture we will learn:
- Using thread through Runnable interface
- How to start a thread with a Runnable interface
- Difference between extending a thread and implementing a runnable interface
- Use of anonymous class with runnable interface
- Creating a thread with lambda expression


#1
Multiple Inheritance is not supported by Java. So, extending a thread is not a good practice to follow.
- Thread is a class that implements Runnable and Runnable contains a method known as the run() method.
- Instead of extending a thread, we can also implement it through an interface called Runnable.
 class A implements Runnable
 {
  public void run()
  {
   statements;
  }
 }

#2
- In the Runnabe method, the start() method is not present so we can not use it by implementing Runnable simply.
- Thread has multiple constructors and one of the constructors takes a runnable object.
- We cannot create an object of a thread by using a class name.
- Objects for a thread will be created by using a Runnable keyword. So, we create a reference of an interface and an object of a class
e.g., Runnable obj= new A();
- We have to pass a reference to an object in the thread class.
- After creating a reference of the Runnable class, we can use the start() method with the thread.

#3
- We can create a thread by using two methods:
 1. Extend a thread class
 2. Implement a Runnable interface
The runnable interface does not have thread methods, in that case, we need to create a separate thread object to use features.

#4 
- We can also instantiate a runnable interface by using an anonymous class.
- Runnable is a functional interface so we also use lambda expression with it.
*/
