package ch09.sec01.exam06;

// 터치(클릭을) 이용하여 (클랙하면 이벤트) 메시지를 보낸다
public class MessageListener implements Button.OnClickListener {

	@Override
	public void onClick() {
		System.out.println("메시지를 보냅니다.");
	}

}
