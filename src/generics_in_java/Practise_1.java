// To create a Generic Array.


package generics_in_java;

class MyGenerics<T>{
    
    T A[] = (T[])new Object[5];
    
    int length=0;
    public void append(T v){
        
        A[length++]=v;
       
    }
    
    public void display(){
        
        for(T x : A){
            
            System.out.println(x);
    }
    
    
    }
}
 class Practise_1 {
    
    public static void main(String[] args) {
        
        MyGenerics<String> mg = new MyGenerics();
        
        
        mg.append("Hi");
        mg.append("Bye");
        
        
        mg.display();
        
        MyGenerics<Integer> mg1 = new MyGenerics(); 
        
        mg1.append(10);
        mg1.append(2);
        mg1.append(11);
        
        mg1.display();
    }
}
    


