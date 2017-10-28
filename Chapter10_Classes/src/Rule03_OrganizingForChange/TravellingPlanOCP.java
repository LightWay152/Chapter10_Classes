package Rule03_OrganizingForChange;

public class TravellingPlanOCP {

	public static final int SAVING_MONEY = 1000;

	public static int payTotalFee(){
		return SAVING_MONEY;
	}
	
	public static void main(String[] args) {
		System.out.println(payTotalFee());
	}

}

class Bonus1Year extends TravellingPlanOCP {
	public static int payTotalFee() {
		return SAVING_MONEY + 100;
	}
}
class Bonus2Year extends TravellingPlanOCP {
	public static int payTotalFee() {
		return SAVING_MONEY + 200;
	}
}