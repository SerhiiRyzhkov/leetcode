package leet1523;

public class Count_Odd_Numbers_in_an_Interval_Range {
    public static void main(String[] args) {
    int l=10;
    int h=24;
        System.out.println(countOdds(l,h));
    }

    public static int countOdds(int low, int high) {
int result=0;

        if((low%2==0)&&(high%2==0))
        {
            //both even
            result = (high-low)/2;
            return result-1;

        }
        else if((low%2==0)&&(high%2!=0))
        {
            //low=even and high=odd
            result=(high-low)/2;
            return result+1;

        }
        else if((low%2!=0)&&(high%2==0))
        {
            //low=odd      high= even
        result = (high-low)/2;
        return result+1;

        }
        else {
            // both odd
            result=(high-low)/2;
            return result+1;
        }


    }
}
