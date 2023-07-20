class Park{
	String name;
	String parkType;
	String location;
	int estYear;
	String owner;
	int noOfTress;
	int noOfBenches;
	double areaInAcre;
	Boolean containPool;
	

	Park(){
		super();
		System.out.println("Invoking no-arg constructor of Park");
	}
	Park(String name,String parkType){
		this();
		this.name=name;
		this.parkType=parkType;
		System.out.println("Invoking string,string constructor of Park");	
	}
	Park(String name,String parkType,String location){
		this(name,parkType);
		this.location=location;
		System.out.println("Invoking string,string,string constructor of Park");
	}
	Park(String name,String parkType,String location,int estYear){
		this(name,parkType,location);
		this.estYear=estYear;
		System.out.println("Invoking string,string,String,int constructor of Park");
	}
	Park(String name,String parkType,String location,int estYear,String owner){
		this(name,parkType,location,estYear);
		this.owner=owner;
		System.out.println("Invoking string,String,string,int,string constructor of Park");
	}
	Park(String name,String parkType,String location,int estYear,String owner,int noOfTress){
		this(name,parkType,location,estYear,owner);
		this.noOfTress=noOfTress;
		System.out.println("Invoking string,String,string,int,string,int constructor of Park");
	}
	Park(String name,String parkType,String location,int estYear,String owner,int noOfTress,int noOfBenches){
		this(name,parkType,location,estYear,owner,noOfTress);
		this.noOfBenches=noOfBenches;
		System.out.println("Invoking string,String,string,int,string,int,int constructor of Park");
	}
	Park(String name,String parkType,String location,int estYear,String owner,int noOfTress,int noOfBenches,double areaInAcre){
		this(name,parkType,location,estYear,owner,noOfTress,noOfBenches);
		this.areaInAcre=areaInAcre;
		System.out.println("Invoking string,String,string,int,string,int,int,double,boolean constructor of Park");
	}
	Park(String name,String parkType,String location,int estYear,String owner,int noOfTress,int noOfBenches,double areaInAcre,boolean containPool){
		this(name,parkType,location,estYear,owner,noOfTress,noOfBenches,areaInAcre);
		this.containPool=containPool;
		System.out.println("Invoking string,String,string,int,string,int,int,double,boolean constructor of Park");
	}
}
