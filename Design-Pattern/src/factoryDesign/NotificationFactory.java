package factoryDesign;

public class NotificationFactory {
	
	public Notification CreateNotification(String channel) {
		
		if(channel == null || channel.isEmpty()) {
			return null;
		}else {
		switch (channel) {
		case "Email":
			return new EmailNotification();
		case "SMS":
			return new SMSNotification();
		case "PUSH":
			return new PushNotification();
		default:
			throw new IllegalArgumentException("");
					
		}
		}
	}

}
