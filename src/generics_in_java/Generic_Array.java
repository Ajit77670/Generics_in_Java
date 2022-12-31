
package generics_in_java;

public class Generic_Array <T>{ // To create Generic arry we must declared class as genreic this 
                                    //is the first step in cration of genric
    
    T data[]= (T[])new object[3]; // Created Genric Array
    
    // Mostly T is used to represent as Generics in Java.
    //  This Genric Array can be used as Object class which can store Integer, String,Double,Float,Short....
    // But we can define which type of object we want to use,by  specifiying the Generic while creating the object.
    
    public static void main(String[] args) {
        
        
        Generic_Array<String> ga = new Generic_Array();
        
        ga.data[0]="Hi";
        ga.data[1]="Bye";
    //  ga.data[2]=10; --> By specifing the Genric as String we cant enter Integer. 
    // This is the problem Genric solves. 
        ga.data[2]="Hello";
        
        String str; //Takes String class reference as str.
        for(int i=0;i<3;i++){
          
        System.out.println(i);
        }
        
    }
    
}
