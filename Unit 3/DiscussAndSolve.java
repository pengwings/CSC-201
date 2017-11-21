import java.util.Scanner;
public class DiscussAndSolve {
    public static void main(String[] args){
        double[][] points = new double[2][5];
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the x coordinate of 5 points.");
        for(int i = 0; i<5; i++){
            points[0][i] = keyboard.nextDouble();
        }
        System.out.println("Please enter the y coordinate of 5 points.");
        for(int i = 0; i<5; i++){
            points[1][i] = keyboard.nextDouble();
        }
        BoundingRectangle(points);
    }

    public static void BoundingRectangle(double[][] points){
        double minx = 0;
        double miny = 0;
        double maxx = 0;
        double maxy = 0;

        for(int j = 0; j<points[0].length; j++){
                if(minx>points[0][j]){
                    minx = points[0][j];
                }
                if(maxx<points[0][j]) {
                    maxx = points[0][j];
                }
        }

        for(int j = 0; j<points[1].length; j++){
            if(miny>points[1][j]){
                miny = points[1][j];
            }
            if(maxy<points[1][j]) {
                maxy = points[1][j];
            }
        }

        double centerx, centery, width, height;
        if(maxx<0 || minx<0) {
            centerx = (maxx + minx) / 2;
        } else {
            centerx = (maxx - minx) / 2;
        }
        if(maxy<0 || miny<0) {
            centery = (maxy + miny) / 2;
        } else {
            centery = (maxy - miny) / 2;
        }
        width = maxx-minx;
        height = maxy-miny;

        System.out.println("The bounding rectangle's center (" + centerx + ", " + centery + "), width " + width + ", height " + height);
    }


}
