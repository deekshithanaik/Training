import java.util.*;
public class Highestsale{
    public static void main(String[] args) {
        int[] sales={250,174,135,256,147,152,157,451};
        int maxDay=0;
        for(int i=1;i<sales.length;i++)
        if(sales[i]>sales[maxDay])
        maxDay=i;
        System.out.println(maxDay+1);
    }
}
