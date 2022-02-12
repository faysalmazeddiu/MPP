package prob1;

public class Person {

	private String name;

	Person(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object aPerson) {
		if (aPerson == null)
		{
			return false;
		}
		if ((aPerson instanceof PersonWithJob)==true) {
			PersonWithJob personWithJobObj = (PersonWithJob) aPerson;
			boolean isObjEqual = this.getName().equals(personWithJobObj.getPerson().getName());
			return isObjEqual;
		}
		if ((aPerson instanceof Person)==false)
		{
			return false;
		}
		Person personObj = (Person) aPerson;
		boolean isObjEqual = this.name.equals(personObj.name);
		return isObjEqual;
	}

	public static void main(String[] args) {

	}

}
