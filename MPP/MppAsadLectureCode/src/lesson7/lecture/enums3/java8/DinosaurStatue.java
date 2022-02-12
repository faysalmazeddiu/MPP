package lesson7.lecture.enums3.java8;

import java.time.LocalDate;

/** How to integerate with the other DisplayItems for processing?
    DinosaurStatue is one of a kind -- with Java 8, we can implement it
 *  as a singleton and also allow it to "inherit" from DisplayItem
 */
public enum DinosaurStatue implements DisplayItem { 
	
	Dinosaur_Item;
	
	
	
	public static final String OWNER = "Tom Ripley";
	public static final LocalDate RETURN_DATE = LocalDate.of(2017, 11, 1);
	public static final String NAME = "Tyrannosaurus";
	
	
	@Override
	public String getOwner() {
		return OWNER;
	}
	@Override
	public LocalDate getDateToReturnToOwner() {
		return RETURN_DATE;
	}
	
	
/*	
	 	// amar nijer poditi
	    Dinosaur_Item,
		OWNER("Tom Ripley"),
		RETURN_DATE(LocalDate.of(2017, 11, 1)),
		NAME("Tyrannosaurus");
		
		String valString="";
		
		DinosaurStatue(){
			getOwner();
	
			getDateToReturnToOwner();
			
		}
		DinosaurStatue(String str){
			valString=str;
		}
		
		LocalDate date=LocalDate.of(2019,12,01);
		DinosaurStatue(LocalDate localDate){
			date=localDate;
		}
		
		@Override
		public String getOwner() {
			return valString;
		}
		@Override
		public LocalDate getDateToReturnToOwner() {
			return date;
		}
		*/
	
}
