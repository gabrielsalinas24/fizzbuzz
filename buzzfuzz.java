public class buzzfuzz{
public void run() {
    int i=1;
    int fizz=3;
    int buzz=5;
    for (i= 1; i < 101; i++){
        if (i == fizz){
        fizz+=3;
        System.out.println("fuzz");
    } else System.out.println(i);
        if (i == buzz) {
        buzz+=5;
        System.out.println("buzz");
    }
}
}
public static void main(String[] args){ 
    buzzfuzz hw = new buzzfuzz();
    hw.run();
    } 
}   

    