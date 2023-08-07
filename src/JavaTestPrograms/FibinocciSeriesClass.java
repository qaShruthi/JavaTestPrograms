package JavaTestPrograms;

public class FibinocciSeriesClass {

	// Next number is the sum of previous two numbers
	public static void main(String[] args) {
		int count=10;
		int Num1=0, Num2=1, Num3;
		System.out.print(Num1+" "+Num2);//printing 0 and 1 
		for(int i=2;i<count;++i)
		{
			Num3=Num1+Num2;
			System.out.print(" " + Num3);
			Num1=Num2;
			Num2=Num3;
		}

	}

}
