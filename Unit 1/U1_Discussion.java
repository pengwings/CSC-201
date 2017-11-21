/**
 * Created by byu on 9/7/2017.
 */
public class U1_Discussion {
    public static void main(String args[]){
        System.out.println("i"+"\t\t"+"m(i)");
        System.out.println("------------");
        for(int i = 1; i<21; i++){
            System.out.println(i + "\t\t" + mseries(i));
        }
    }

    public static double mseries(int i){
        double m = 0;
        for(int j = 1; j<=i; j++){
            m = (double)j/(j+1) + m;
        }
        return m;
    }
}
