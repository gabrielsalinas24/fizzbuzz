public class buzzfizz{
    public void run () {
        int a = 3;
        int b = 5;
        int c = 15;
        for ( int i = 1; i <101; i ++ ){
            if (i == c){
                c += 15; 
                a += 3;
                b += 5;
                System.out.println("fizzbuzz");
            }else if (i == a) {
                a += 3;
                System.out.println("fizz");
            }else if (i == b) {
                b += 5;
                System.out.println("buzz");
            } else System.out.println(i);
        }
    }

    public static void main(String[] args){ 
        buzzfizz hw = new buzzfizz();
        hw.run();
    }
} 