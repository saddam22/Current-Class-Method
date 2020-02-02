
package CurrentClassMethod;

public class CurrentClassMethod {
    
    void m(){
        System.out.println("Method is invoked!!");
    }
    void n(){
    this.m();//no need because compiler does it for you
    }
    void p(){
    n();//compiler will add this to invokenn() method as this.n()
    }
    public static void main(String[] args) {
        
      CurrentClassMethod s1 = new CurrentClassMethod();  
      s1.p();
    }
    
}
