package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class UserField {

	// 회원을 저장할 자료구조 선언
	ArrayList<User> users = new ArrayList<>();

	// 암호키
	private static final int KEY = 3;

	// 아이디 중복검사
	// boolean보다 User타입으로 리턴하는 것이 좋다.
	public User checkId(String id) {
		User user = null;
		for (int i = 0; i < users.size(); i++) { // 전체 회원의 사이즈만큼
			if (users.get(i).getId().equals(id)) { // 유저아이디를 받아온값과 입력한 id와 같은게 있으면
				user = users.get(i); // 그 값을 그대로 브레이크
				break;
			}
		}
		return user; // 중복이 없다면 유저에 리턴
	}

	// 회원가입
	public void join(User user) {
		user.setPw(encrypt(user.getPw())); // 입력한 패스워드를 암호화해서 기존 패스워드에 수정
		users.add(user); // arrayList에 추가
	}

	// 로그인
	public boolean login(String id, String pw) {
		User user = checkId(id);
		if (user != null) { // 아이디가 있다면
			if (user.getPw().equals(encrypt(pw))) { // 입력받은 패스워드를 암호화한뒤 비밀번호 비교
				return true;
			}
		}
		return false;
	}

	// 암호화
	public String encrypt(String pw) {
		String en_pw = "";
		for (int i = 0; i < pw.length(); i++) {
			en_pw += (char) (pw.charAt(i) * KEY);
		}
		return en_pw;
	}
	
	//복호화
	public String decrypt(String pw) {
	String de_pw = "";
	for (int i = 0; i < pw.length(); i++) { // en_pw를 써야함
		de_pw += (char)(pw.charAt(i) / KEY);
	}
	return de_pw;
}

	// 비밀번호찾기(이름과 핸드폰 번호로 찾기, SMS로 임시 비밀번호 전송)
	// 임시 비밀번호는 숫자, 문자의 랜덤한 조합으로 6자리를 전송한다.
	public boolean findPw(String name, String phone) {
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getName().equals(name) && users.get(i).getPhone().equals(phone)) {
				// 문자 발송
				sendSMS(phone, decrypt(users.get(i).getPw()));
				return true;
			}
		}
		return false;
	}
	
	//SMS
	public void sendSMS(String phone,String pw) {
		String api_key = "NCS0BYOAXSKDYZCG";
	    String api_secret = "IOOCCZGMMMCPWXYBYTHRKAFAYZ6WQZGR";
	    Message coolsms = new Message(api_key, api_secret);

	    // 4 params(to, from, type, text) are mandatory. must be filled
	    HashMap<String, String> params = new HashMap<String, String>();
	    params.put("to", phone);
	    params.put("from", "01087275913");
	    params.put("type", "SMS");
	    params.put("text", pw);
	    params.put("app_version", "test app 2.2"); // application name and version

	    try {
	      JSONObject obj = (JSONObject) coolsms.send(params);
	      System.out.println(obj.toString());
	    } catch (CoolsmsException e) {
	      System.out.println(e.getMessage());
	      System.out.println(e.getCode());
	    }

	}
}
	
