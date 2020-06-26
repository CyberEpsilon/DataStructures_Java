public class CounterTest{
    public static void main (String[] args){
	int currentCount; 
	Counter A = new Counter(); //Initial new default counter
	A.getCount(); 
	Counter B  = new Counter(15);
	B.increment();
	B.increment(2);
	//System.out.println("The B_Counter is: " + B);
	//int myCount = B.getCount();
	B.reset(); 
	//A.increment(); 
	

	currentCount = A.getCount();
	System.out.println("The starting value of Counter A is: " + currentCount);
   	currentCount = B.getCount();
	System.out.println("The starting value of Counter B is: " + currentCount);
	B.increment(2);
	currentCount = B.getCount(); 
	System.out.println("Adding 2 to the Counter B is: " + currentCount);
	B.increment(); 
	currentCount = B.getCount(); 
	System.out.println("Incrementing the Counter B by 1 results in: " + currentCount);
	A.increment(10);
	currentCount =A.getCount(); 
	System.out.println("Incrementing the Counter A by 10 results in the value: " + currentCount);
	//B.reset(); 
	currentCount = B.getCount(); 
	System.out.println("Resetting B should result in the value 0: " + currentCount);
        B.isZero(currentCount); 
	
	
	if (B.isZero(currentCount) == true){
		System.out.println("B has been reset to 0!"); 
	} else {System.out.println("Hold on! We'll reset the value for you!"); B.reset(); B.getCount(); B.isZero(currentCount);}
   	

    }
}
