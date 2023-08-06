package inheritance;

public class Router {
	public String ipAddress;
	public String routing;
	public String server;
	public String portName;
	
	public Router(String ipAddress,String routing,String server,String portName)
	{
		System.out.println("Invoking string in Router");
		this.ipAddress=ipAddress;
		this.routing=routing;
		this.server=server;
		this.portName=portName;
	}


}
