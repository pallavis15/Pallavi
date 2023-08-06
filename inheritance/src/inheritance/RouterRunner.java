package inheritance;

public class RouterRunner {
	

		public static void main(String[] args) {

			System.out.println("Invoking main in RouterRunner");
			Router router=new Router("454.989","Mobile Network","DHCP","WAN");
			System.out.println(router.ipAddress);
			System.out.println(router.routing);
			System.out.println(router.server);
			System.out.println(router.portName);
			
			System.out.println("--------------------------");
			BaseRouter baserouter=new BaseRouter();
			System.out.println(baserouter.ipAddress);
			System.out.println(baserouter.routing);
			System.out.println(baserouter.server);
			System.out.println(baserouter.portName);
			
			System.out.println("--------------------------");
			BaseRouter baserouter1=new BaseRouter("565.978","Network","DHCP","LAN");
			System.out.println(baserouter1.ipAddress);
			System.out.println(baserouter1.routing);
			System.out.println(baserouter1.server);
			System.out.println(baserouter1.portName);
		}

	}

