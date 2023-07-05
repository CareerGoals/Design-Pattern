package factoryDesign;

public class NotificationService {
	
	public static void main(String args[]) {
		NotificationFactory notificationFactory = new NotificationFactory();
		Notification notification = notificationFactory.CreateNotification("SMS");
		notification.notifyUser();
	}

}
