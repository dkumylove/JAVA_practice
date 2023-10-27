package ch02.sec03.exam07;

public class PrimitivaAndStringConversionExample {

	public static void main(String[] args) {
		int value1 = Integer.parseInt("10") ;
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		// printformat
		System.out.printf("value1 : %s \n", value1);
		System.out.printf("value2 : %s \n", value2);
		System.out.printf("value3 : %s \n", value3);
		
		System.out.println("value1 : " + value1);
		System.out.println("value2 : " + value2);
		System.out.println("value3 : " + value3);
		
		String str1 = String.valueOf(10) ;
		String str2 = String.valueOf(3.14) ;
		String str3 = String.valueOf(true) ;
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		
		
		//String strValue = "A";
		//char var = (char)strValue;
		// 스트링은 기본타입이 아닌 참조타입이기때문에 

		
		long var1 = 2L;
		float var2 = 1.8F;
		double var3 = 2.5;
		String var4 = "3.9";
		int result = (int)(var1 + var2 + var3) + (int)Double.parseDouble(var4);
		System.out.printf("result : %d",result);
	}

}
