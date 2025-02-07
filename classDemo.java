// Method without parameter without return value 
class Addition{
   void add(){
     int x= 10,y= 20;
     int z = x+y;
     System.out.println(z);
    }
}
class Demo{
    public static void main(String[] args) {
        Addition a = new Addition();
        a.add();
    }
}