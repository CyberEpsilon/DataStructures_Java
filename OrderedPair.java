public class OrderedPair<K,V> implements Pair<K,V> {
    //instance variables
    private K key;
    private V value;

    static class Box<T>{
        private T t;

        public void set(T t){this.t =t;}
        public T get(){return t;}
    }

    static class Util{
        /*Generic method example
        A method named compare that compares two pairs and return a boolean
        It is standard that the type parameters be included inside <> and appear before method's return type
         */
        public static <K,V> boolean compare(Pair<K, V> p1, Pair<K, V> p2){
            return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
        }
    }

    //Constructor
    public OrderedPair(K key, V value){
        this.key = key;
        this.value = value;
    }

    //instance methods
   public K getKey() {return key;}
   public V getValue() {return value;}


//Ordered Pair Demo
public static void main(String[] args) {
    Pair<Integer,String> p1 = new OrderedPair<>(1,"apple");
    Pair<String, String> p2 = new OrderedPair<>("hello","world");
    OrderedPair<String,Integer> p3 = new OrderedPair<>("Even", 8);
    OrderedPair<String,String> p4 = new OrderedPair<>("hello", "world");
    Box<Integer> integerBox = new Box<>();
    OrderedPair<String,Box<Integer>> p5 = new OrderedPair<>("primes", new Box<Integer>());

    //Raw Types: generic class or interface without type arguments
    Box<String> stringBox = new Box<>();
    Box rawBox = stringBox; //OK to assign raw type to parameterized type

    //Raw type Error: Cannot assign parameterized type to raw type
    //Box rawBox2 = new Box();
    //Box<Integer> intBox = rawBox2;

}
}
