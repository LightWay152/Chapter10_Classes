package Rule01_ClassOrganization;

public class AutumnMarathon {
	private String name;
	private int time;//format: seconds
	
	public AutumnMarathon(String name, int time){
		this.name = name;
		this.time = time;
	}
	
	public String getTime(){
		int h = time / 3600;
		int remain = time % 3600;
		int m = remain / 60;
		int s = remain % 60;
		return h + ":" + m + ":" + s;
	}
	
	public static void main(String[] args) {
		AutumnMarathon runnerA = new AutumnMarathon("Ty",4167);
		System.out.println(runnerA.getTime());//"1:09:27"	
		AutumnMarathon runnerB = new AutumnMarathon("Teo",4776);
		System.out.println(runnerB.getTime());//"1:19:36"
	}

}
