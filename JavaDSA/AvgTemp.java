package JavaDSA;
import java.util.*;
public class AvgTemp {
    public static void main(String[] args) {
        int i;
        float avgTemp=0;
        System.out.println("Enter the number of days: ");
        Scanner sc=new Scanner(System.in);
        int days =sc.nextInt();
        int temps[]=new int[days];
        for(i=0;i<days;i++){
            System.out.println("Enter day " + (i+1) + "'s temp: ");
            temps[i]=sc.nextInt();
            avgTemp=avgTemp+temps[i];

        }
        avgTemp=avgTemp/days;
        System.out.println("Avg temp: " + avgTemp);
        int x=0;
        for(i=0;i<days;i++){
            if(temps[i]>avgTemp){
                x++;
            }
        }
        System.out.println(x + " days have temp greater than avg. ");
        
    }
    
}
