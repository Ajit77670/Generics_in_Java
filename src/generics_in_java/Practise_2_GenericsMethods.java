//Create Generic Methods as an Array
package generics_in_java;

//public class Practise_2_GenericsMethods {
    class Test{
        
    public static <T> void show(T[] List){ //Static Generic Metod
        
        for(T d : List){
            
            System.out.println(d);
            }
    }
    

public static int display()  //Static Metod
{

return 0;

}
    }

   public class Practise_2_GenericsMethods {
       
      
    public static void main(String[] args) {
        Test.show(new String[]{"Hi111"});
        Test.show(new Integer[]{1,2,3,4,5});
        
        System.out.println(Test.display());
    }
    
}
