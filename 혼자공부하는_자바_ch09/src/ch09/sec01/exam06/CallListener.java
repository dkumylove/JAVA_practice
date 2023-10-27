package ch09.sec01.exam06;

//터치(클릭을) 이용하여 (클랙하면 이벤트) 전화를 겁니다
public class CallListener implements Button.OnClickListener {

	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
	}

}
