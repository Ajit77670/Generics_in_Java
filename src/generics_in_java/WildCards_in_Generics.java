/*Important notes for Wild Card:

1> Wild card <?> used for Arguments and Parameters.
2> If we use wild card <?> as arguments , it means all type of object classes we can use
3> we can use wild card as Upper bound and Lower bound
4> (MyArray < ? extends Number> obj) -- This is an Upper bound.
5> (MyArray < ? super B> obj) --> This is Lower Bound
    // i.e when we have more than one clasess and they are extending each other in this case we can make use of super.
*/

package generics_in_java;

class A{}
interface B{}
interface C{}

class Test extends A implements B,C
{

}
//class MyArray4<T extends A>{ --> We can extends in generics to inherit the another class 
//Note 1: For implementing an interface also we will use extends in Generics. i.e 
//Note 2: As we know one class can inherit only one class and implementas as many interfaces.Same apply for Generics classes
//i.e class MyArray4<T extends A & B & C>{ --> Here A is class and B & C are interfaces.
// As we know in generics for implementing also we used extends keyword.

class MyArray4<T>{ // Genric class 
    
    T A[]=(T[])new Object[10];
    
    int length=0;
    public void append(T v){
        
        A[length++]= v;
    }
    
    public void display(){
        
        for(int i=0;i<10;i++){
            
            System.out.println(A[i]);
        }
    }
    
}
public class WildCards_in_Generics {
    
    static void fun(MyArray4<?> obj ){ // Passing Generic as Parameter
                                      // <?>--> it holds all the object classes(Integer, String, Float
          
     //static void fun(MyArray4<? extends Number> obj ){ -- This is Uper bound 
     
     // static void fun(MyArray4<? super B> obj ){ -- This is Lower bound
     
     
         obj.display();
                                      
    }                                 
        
        public static void main(String[] args) {

            
        MyArray4<String> ma = new MyArray4<>();
            
        ma.append("Hi");
        ma.append("Hello");
        ma.append("Bye");
        
        
        fun(ma); // we can call this fun() method directly as it is static method. This is new feature of JAVA8
        
        MyArray4<Integer> ma1 = new MyArray4<>();
            
        ma1.append(100);
        ma1.append(50);
        ma1.append(40);
        
        fun(ma1);// we can call this fun() method directly as it is static method. This is new feature of JAVA8
        
    }
    
}
