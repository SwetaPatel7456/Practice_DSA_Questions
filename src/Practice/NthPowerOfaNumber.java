package Practice;

public class NthPowerOfaNumber {

    public static void main(String[] args) {
        System.out.println(power(3,3));
        System.out.println(power1(3,3));
    }
    //Time complexity for this code  O(n)
    //Space Complexity for this code o(n)
    public static int power(int n ,int m){

        if(m==1){
            return n;
        }
        return n*power(n,m-1);

    }

    //we have a approach to do better than this appproach
    //Time complexity for this code  O(log(n))
    //Space Complexity for this code o(log(n))
    //n/2;n/4,......n/2^k=1  \\\k = logn
    public static int power1(int n ,int m){

        if(m==1){
            return n;
        }
        else if(m%2!=0){
            return n*power1(n,m/2)*power1(n,m/2);
        }
        else if(m%2==0){
            return power1(n,m/2)*power1(n,m/2);
        }
        return 1;
    }
    }
