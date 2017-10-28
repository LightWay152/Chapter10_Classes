package Rule02_ClassesShouldBeSmall;

public class Developer {
	
	public String getFullName(String fullName){
		return fullName;
	}
	
	public String getJobPosition(String jobPosition){
		return jobPosition;
	}
	
	public static void main(String[] args) {
		//SingleResponsibilityPrinciple
		Developer webDeveloper = new Developer();
		String fullName = webDeveloper.getFullName("Nguyen Van Teo");
		String jobPosition = webDeveloper.getJobPosition("Frontend Developer");
		System.out.println("Web Developer Info");
		System.out.println("Full name: " + fullName);
		System.out.println("Job position: " + jobPosition);
	}

}
