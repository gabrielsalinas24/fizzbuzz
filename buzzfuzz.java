public class buzzfuzz{
    public void run() {
        int i=1;
        int fizz=3;
        int buzz=5;
        int fizzbuzz=15;
        for (i= 1; i < 100; i++){
            if (i == fizzbuzz){
                buzz+=5;
                fizz+=3;
                fizzbuzz+=15;
                System.out.println("fizzbuzz");
            }
            else if (i == buzz) {
                buzz+=5;
                System.out.println("buzz");
            } else if (i == fizz){
                fizz+=3;
                System.out.println("fizz");
            } else System.out.println(i);
        }

    }

    public static void main(String[] args){ 
        buzzfuzz hw = new buzzfuzz();
        hw.run();
    } 
}   

