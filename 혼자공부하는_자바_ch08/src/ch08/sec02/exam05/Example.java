package ch08.sec02.exam05;

public class Example {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		//InterfaceA변수는 methodA()만 호출가능
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println();
		
		//InterfaceB변수는 methodB()만 호출가능
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();
				
		//InterfaceC변수는 methodA(), methodB(), methodC() 모두호출가능
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
	}

}
