import java.util.*; 

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.twilio.sdk.*; 
import com.twilio.sdk.resource.factory.*; 
import com.twilio.sdk.resource.instance.*; 
import com.twilio.sdk.resource.list.*; 
 
public class SendSMS
{ 
 // Find your Account Sid and Token at twilio.com/user/account 
 public static final String ACCOUNT_SID = "AC3cb67e446c7f22740b06d3a6adcfba55"; 
 public static final String AUTH_TOKEN = "358c0fafa460c527d479b67daaf114c5"; 
 
 
 public void send(String body)
 {
	 try
	 {
		 TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN); 
		 
		 // Build the parameters 
		 List<NameValuePair> params = new ArrayList<NameValuePair>(); 
		 params.add(new BasicNameValuePair("To", "4086502065")); 
		 params.add(new BasicNameValuePair("From", "+19073122158")); 
		 params.add(new BasicNameValuePair("Body", body));   
	 
		 MessageFactory messageFactory = client.getAccount().getMessageFactory(); 
		 Message message = messageFactory.create(params); 
	 }
	 catch(TwilioRestException e)
	 {
		 System.out.println(e.getErrorMessage());
	 }
 }

}