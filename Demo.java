// Method with parameter without return value 
 
 class Addition{
   void add(int x,int y){
     int z = x+y;
     System.out.println(z);
    }
 }
 
 class Demo{
    public static void main(String[] args) {
        Addition a = new Addition();
        int x= 10;
        int y = 20;
        a.add(x,y);
    }

}
// class Addition{
//     void add(int a,int b){
//         int c = a+b;
//         System.out.println(c);
//      }
//  }
//  class Demo{
//      public static void main(String[] args) {
//          Addition a = new Addition();
//          int x= 10;
//         int y = 20;
//         a.add(x,y);
//      }
//  }