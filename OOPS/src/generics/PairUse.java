package generics;

public class PairUse {

	public static void main(String[] args) {
//		Pair<Integer,String> p=new Pair<>(10,"aa");
//		Pair<String,Integer> s=new Pair<>("aa", 5);
//		Pair<Double,Integer> d=new Pair<>(10.0, 52);
//		System.out.println(p.getFirst()+" "+p.getSecond());
//		System.out.println(s.getFirst()+" "+s.getSecond());
//		System.out.println(d.getFirst()+" "+d.getSecond());

		
		
		Pair<String, Integer> InnerPair=new Pair<>("eeee",66);
		Pair<Pair<String, Integer>, String> p=new Pair<>(InnerPair,"abcd");
		
		System.out.print(p.getFirst().getFirst()+" "+p.getFirst().getSecond()+" ");
		
		System.out.print(p.getSecond());

	}

}
