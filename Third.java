// Method with parameter with return value 

 class Addition{
   int add(int a,int b){
      int c = a+b;
      return c;
    }
}
class Demo{
 public static void main(String[] args) {
    
    Addition a = new Addition();                         
    int x= 10;
    int y = 20;
   int res =  a.add(x,y);
   System.out.println(res);
 }
    
}
