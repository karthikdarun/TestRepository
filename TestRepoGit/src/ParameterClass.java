
public class ParameterClass {

	public String Name;
	public String Place;
	public int RollNo;

	public int setRollNo(int RollNo)
	{
		this.RollNo = RollNo;
		return RollNo;
	}

	public void getRollNo()
	{
		System.out.print(RollNo+" ");
	}

	public String setName(String Name)
	{
		this.Name = Name;
		return Name;
	}
	public void getName()
	{
		System.out.print(Name +" ");
	}
	
	public String setPlace(String Place )
	{
		this.Place= Place;
		return Place;
	}
	
	public void getPlace()
	{
		System.out.print ("" + Place);
	}
	
	public static void main(String[] args) {
		ParameterClass p = new ParameterClass();
		p.setName("Karthik");
		p.setPlace("Chennai");
		p.setRollNo(50);
		p.getName();
		p.getRollNo();
		p.getPlace();
	}
}
