
package generics_in_java;


public class Genrics_Methods {
    
    static <E> void show(E[] list){  // Generic Method  
                                    // we have to use generic reference before the method name.
                                   // list array is a dynalic array  so no need to assign the length of it.
                                        
// static<E extends Number> void show(E[] list)
//i.e with generic method we can assign bound type generics as well.
//it will allow only those classes whic are inherting from Number class like Integer, Float, Double,Short....
                                        
        for(E x : list){  // for each loop 
            
            System.out.println(x); 
        }
        
    }
    
    public static void main(String[] args) {
        
     show(new String []{"Hi","Bye","Go"}); // storing String value in array E[] list.
     
     show(new Integer []{1,2,3,4,5});  //storing Integer value in array E[] list.
    }
    
}
