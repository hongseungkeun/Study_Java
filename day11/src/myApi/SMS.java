package myApi;

import java.util.HashMap;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

// ctrl + shift + o 전체 임포트
public class SMS {
	public static void main(String[] args) {
		 String api_key = "NCS0BYOAXSKDYZCG";
		    String api_secret = "IOOCCZGMMMCPWXYBYTHRKAFAYZ6WQZGR";
		    Message coolsms = new Message(api_key, api_secret);

		    // 4 params(to, from, type, text) are mandatory. must be filled
		    HashMap<String, String> params = new HashMap<String, String>();
		    params.put("to", "01056275913");
		    params.put("from", "01087275913");
		    params.put("type", "SMS");
		    params.put("text", "잡시다 얼릉");
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
