public class Main {
  
  
  static void myMethod(String name) {
    System.out.println(name);
  }
  
  public static int returnMethod1(){
      String names  =  returnMethod();
      System.out.println(names); 
      return 1;	  
  }
  
  public static String returnMethod(){
	 String name = "AjithReturn";	 
	  return name;	  
  }
  
  public static void main(String[] args){
      Main.myMethod("Ajith");
	  returnMethod1();
	   
   } 
}