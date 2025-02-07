 class Addition{
   int add(){
    int x = 10,y=20;
    int z = x+y;
     return z;
   }
 }
 
 class Demo{
    public static void main(String[] args) {
        Addition a=  new Addition();
     int res= a.add();
     System.out.println(res);
    }
}
