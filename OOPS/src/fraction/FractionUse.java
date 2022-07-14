package fraction;

public class FractionUse {

	public static void main(String[] args) throws DivideByZeroException {
		Fraction f1;
		try {
			f1 = new Fraction(4,6);
		} catch (DivideByZeroException e) {
			f1=new Fraction(4, 1);
		}
		f1.print();
		Fraction f2=new Fraction(4,8);
		f2.print();
		
//		f1.add(f2);
//		f1.print();
		
		Fraction f3=Fraction.add(f1,f2);
		f3.print();
		
	}

}
