//Note-->IMPORTANT POINTS:

//1> As we know Object is the parent class of all the classes in JAVA.

// 2>With help of Parent class Object refernce we can create the child classes like 
//Integer,String,Float,Double,Array and all other non primitive data types/classes.

// 3>Generics class is applicable only for non primitive data types 
//i.e objects(like wraper class and other class which directly or indirectly refer to Object class)

package generics_in_java;

public class Generics_in_Java {

    
    public static void main(String[] args) {
    
        
 //Note: Due to the below examples Generics were introduced.  
   
/*Example:1> 

        Object obj = new String("Hello1"); 
// 1-->we can create child class object with refernce of Parent class object.
        String str = (String)obj; 
// 2-->we can typecast the parent object to its child class object.
        Integer i = (Integer)obj;
// 3-->Here we have Typecast parent class Objecrt refrence to Integer class.
        System.out.println( str);
   /* and we are printing the String class,this is an error which compiler not able to trace it.
    The current last status of parent class Object typecast to Integer and 
    we are trying to execute String statement in the end.
    which will throw compile time error. i.e String cant be typecase to Integer.
     */
     
  //Exapmle:2> 
   //Note: By creating an Array of parent class Object can store any type of class objects(Integer,Double,Float,String......)
   
     Object ob[]=new Object[3]; // created Parent clas Object array.
     ob[0]="hi";
     ob[1]="Bye";
     ob[2]=10; // Last entered value on Object class arry is an Integer
     
     String str1;
     for(int j=0;j<3;j++){
         
        str1=(String)ob[j];  //Typecasting Object class refrence ob to String class object.
        System.out.println(str1); 
       /* The current last status of parent class Object is Integer and 
          we are trying to execute String statement in the end.
          which will throw compile time error. i.e String cant be typecase to Integer.
    */    
        
     }
     
    } 
}
