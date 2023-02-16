/* Calling class
 * create a myGreeterObject that can hold objects created from the Greeter class
 */
public class HelloApp2 {
    public  static void main(String[] args){
        Greeter myGreeterObject = new Greeter();
        // call the sayHello() method located in Greeter class.
        myGreeterObject.sayHello();
    } 


    
}