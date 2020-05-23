public class PrimeNumber {
	    public static void main(String[] args) {
	    	  System.out.println("Prime numbers from 1 to 100 are :");
	        for (int i=1; i<=100; i++) {
	            int count=0;
	            for (int j=i-1; j>1; j--) {
	                if (i%j!=0)
	                    count++;
	            }
	            if (count==(i-2))
	                System.out.println(i);
	 }}}
