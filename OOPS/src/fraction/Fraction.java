package fraction;

public class Fraction {
	private int numerator;
	private int demomiator;
	
	public Fraction(int numerator,int demomiator) throws DivideByZeroException {
		if(demomiator==0) {
			throw new DivideByZeroException();
		}
		this.demomiator=demomiator;
		this.numerator=numerator;
		simplify();
	}

	private void simplify() {
		int gcd=gcd(this.numerator,this.demomiator);
		this.numerator=this.numerator/gcd;
		this.demomiator=this.demomiator/gcd;
	}
	
	private int gcd(int a, int b)
    {
      if (b == 0)
        return a;
      return gcd(b, a % b);
    }

	public void setNumerator(int numerator) {
		this.numerator = numerator;
		this.simplify();
	}
	public void setDemomiator(int demomiator) throws DivideByZeroException {
		if(demomiator==0) {
			throw new DivideByZeroException();
		}
		this.demomiator = demomiator;
		this.simplify();
		
	}
	
	public void print() {
		System.out.println(this.numerator+"/"+this.demomiator);
	}
	
	public void increment() {
		this.numerator=this.numerator+this.demomiator;
		this.simplify();
	}

	public void add(Fraction f2) {
//		Frist Fraction is the freacton on which function is called 
//		second fraction is passed as agruments
		
		this.numerator=this.numerator*f2.demomiator+this.demomiator*f2.numerator;
		this.demomiator=this.demomiator*f2.demomiator;
		this.simplify();
	}
	
	public static Fraction add(Fraction f1, Fraction f2) throws DivideByZeroException {
		int newNum=f1.numerator*f2.demomiator+f1.demomiator*f2.numerator;
		int newDem=f1.demomiator*f2.demomiator;
		Fraction f3=new Fraction(newNum, newDem);
		return f3;
	}
	
}
