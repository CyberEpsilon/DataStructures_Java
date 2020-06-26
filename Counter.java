public class Counter{

//instance variables
	private int count;

//default constructor 
	public Counter() {};
//alternate constructor 
	public Counter(int initial) {count = initial;}

//accessor method
	public int getCount() {return count;}

//Mutator/update methods 
	public void increment() {count++;}
	public void increment(int delta) {count += delta;}
	public void reset() {count = 0;}
	public boolean isZero(int currentCount) {
		if (currentCount == 0){
			return true; 
		} else { return false;}
	}
}

