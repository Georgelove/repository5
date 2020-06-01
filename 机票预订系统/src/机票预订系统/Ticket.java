package »úÆ±Ô¤¶©ÏµÍ³;
public class Ticket {
	private int AirlineCode,Distance,Fare,Discount;
	private String AirlineName,DNumber,ENumber,DepatureTime,ArrivalTime;
	public Ticket() {
	}
	public Ticket(int AirlineCode) {
		this.AirlineCode=AirlineCode;
	}
	public Ticket(int AirlineCode,String AirlineName,String DNumber,String ENumber,
			int Distance,int Fare,String DepatureTime,String ArrivalTime,int  Discount) {
		this.AirlineCode=AirlineCode;
		this.AirlineName=AirlineName;
		this.DNumber=DNumber;
		this.ENumber=ENumber;
		this.Distance=Distance;
		this.Fare=Fare;
		this.DepatureTime=DepatureTime;
		this.ArrivalTime=ArrivalTime;
	}
	public void setAirlineCode(int i) {
		this.AirlineCode=i;
	}
	public void seAirlineName(String i) {
		this.AirlineName=i;
	}
	public int getAirlineCode() {
		return AirlineCode;
	}
	public String getAirlineName() {
		return AirlineName;
	}
	public String  DNumber() {
		return  DNumber;
	}
	public String  ENumber() {
		return  ENumber;
	}
	public int getDistance() {
		return Distance;
	}
	public int getFare() {
		return Fare;
	}
	public String getDepatureTime() {
		return DepatureTime;
	}
	public String getArrivalTime() {
		return ArrivalTime;
	}
	public int getDiscount() {
		return Discount;
	}

}
