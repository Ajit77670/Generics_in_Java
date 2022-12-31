
package generics_in_java;

class A{}
class B extends A{}
class C extends A{} 

/*interface A{}
class B implements A{}
class C implements A{}
*/
//Note: In Generic class concept if a class implement other class but we should write as extend only.  
//Example:  class MyArray <T extends A>


class MyArray<T>{ // Created Genric Class 
  //Case 1:   
// class MyArray<T,Y> -->This will be using for passing multiple Parameter i.e <Sting,Intger> like that.
 
 //Case 2:   
//class MyArray <T extends Number>
// -->If we write like this it will allow the class which are Part of Number class i.e Double , Float , Interger, Short.
//--> This technique is used to bound the generics class to use defined Classes.    
    
 //Case:3
 // class MyArray<T extends A>{
    // when we have classes extending other classes , we can use the genric class by inheriting them also.
  //--> This way we can restrict Generic Array to extends a partular class  other than specified class(i.e class A here) 
    
    
    T A[]=(T[])new Object[10]; // Cretaed  Generic array T A[] of parent Object class whic can store any data type.
    
    int length=0; // initializing the array length with 0. 
   
    public void append(T v) // created append method to add elements to the array
    {
       A[length++]=v; // the value v store the inputs into the array A[] and hence lenth++ will be incremented
       
    }
    
   public void display() // display method to show the array inputs
   {
            for(int i=0;i<10;i++)
            {
                System.out.println(A[i]);
            }
  }
}       

class MyArray2 extends MyArray<String>{
    
// class MyArray2<T> extends MyArray<T>  
//--> THis will make Myarray2 as Object and MyArray as Object as well, and both can store any type of object type.  
        
}

public class Array2_Generics_Class_Creation {
    
    public static void main(String[] args) {
        
        MyArray <Integer> ma= new MyArray<>();
        
        //Case 1: When not assining any type of Generics 
        /*MyArray ma= new MyArray(); --> if we write like this it means it can store any Object type
         i.e it can sore String, Integer, Double, Float..etc */
        ma.append(10);
        ma.append(11);
        ma.append(12);
        
        ma.display();
        
        
        MyArray<String> maa = new MyArray<>();
        
        //Case 2: When we extends the Genric class
        /*MyArray2 maa = new MyArray2(); --> Here no need to assign type of object 
          as we declare as sting type in Myaaray2*/
        //i.e class MyArray2 extends MyArray<String>
        
        maa.append("Papa we miss u");
        maa.append("Maa");
        maa.append("Bunty");
        maa.append("Ajit");
        maa.append("Sweta");
        
        maa.display();
        
    }
    
}
