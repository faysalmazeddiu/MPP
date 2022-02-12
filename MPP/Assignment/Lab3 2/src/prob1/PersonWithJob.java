package prob1;

public class PersonWithJob {

	private double salary;
	private Person person;

	PersonWithJob(Person personObj, double s) {
		this.person=personObj;
		this.salary = s;
	}
	
	public Person getPerson() {
		return this.person;
	}
	public double getSalary() {
		return salary;
	}

	@Override
	public boolean equals(Object aPerson) {
		if (aPerson == null)
		{
			return false;
		}
			
		if ((aPerson instanceof PersonWithJob)==false) {
			return false;
		}
			
		PersonWithJob personObj = (PersonWithJob) aPerson;
		boolean isObjEqual=false;
		if( person.getName().equals(personObj.person.getName()) && this.getSalary() == personObj.getSalary()) {
			isObjEqual=true;
		}
		return isObjEqual;
	}

	public static void main(String[] args) {
		Person p2 = new Person("Joe");
		PersonWithJob p1 = new PersonWithJob(p2, 30000);
		// As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
	}

}
