package Rule01_ClassOrganization;

public class SpringMarathon {
	private String name;
	private String time;//format: hh:mm:ss
	
	public SpringMarathon(String name, String time){
		this.name = name;
		this.time = time;
	}
	
	public String getTime(){
		return this.time;
	}
	
	public static void main(String[] args) {
		SpringMarathon runnerA = new SpringMarathon("Teo","1:09:27");
		System.out.println(runnerA.getTime());	
		SpringMarathon runnerB = new SpringMarathon("Ty","1:19:36");
		System.out.println(runnerB.getTime());
	}

}
