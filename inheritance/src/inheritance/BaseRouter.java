package inheritance;

public class BaseRouter extends Router {
	public BaseRouter()
	{
		this("134.909.09","Network","DHCP","LAN");
		System.out.println("Invoking no-args in BaseRouter");
	}
	public BaseRouter(String ipAddress,String routing,String server,String portName)
	{
		super(ipAddress,routing,server,portName);
		System.out.println("Invoking String in BaseRouter");
	}
}
