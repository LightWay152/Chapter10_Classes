package Rule03_OrganizingForChange;

public class TravellingPlan {
	public static final int SAVING_MONEY = 1000;

	public static int payTotalFee(int experienceYear) {
		if(experienceYear == 1)
			return SAVING_MONEY + 100;
		else if(experienceYear == 2)
			return SAVING_MONEY + 200;
		else
			return SAVING_MONEY;
	}
	
	public static void main(String[] args) {
		System.out.println(payTotalFee(2));
	}

}
