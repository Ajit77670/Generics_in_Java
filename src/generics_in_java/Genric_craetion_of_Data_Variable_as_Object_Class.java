// Note: We just need to know how to implement Generics in Java as we have builtin Generic class provided by Java.
// But its good to know how to create the Genreic class.


package generics_in_java;

class Data<T>{
    
    private T obj; // Private Generic data type 
    
    public void setData (T v) // using setter method
    {
        obj=v;
    }
    
    public T getData() // using getter method
    {
        return obj;
    }
}

public class Genric_craetion_of_Data_Variable_as_Object_Class {
    
    public static void main(String[] args) {
        
        Data<Integer> d = new Data<>(); // Integer class Object Generic
        d.setData(10);
        System.out.println(d.getData());
        
        Data<String> str = new Data<>(); // String class Object Generic
        str.setData("Bhaiya");
        System.out.println(str.getData());
        
        Data<Double> dub =new Data<>(); // Double class Object Generic
        dub.setData(12.4);
        System.out.println(dub.getData());
        
    }
}
