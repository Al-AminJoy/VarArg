package vararg;
public class Test {
 
    void show(int ... num){
        int sum=0;
        for(int i:num){
            sum=sum+i;
        }
        System.out.println("Sum Is : "+sum);
    }
}
