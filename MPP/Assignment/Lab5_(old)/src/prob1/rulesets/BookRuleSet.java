package prob1.rulesets;

import java.awt.Component;
import java.util.regex.Pattern;

import prob1.gui.*;


/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Isbn must be numeric and consist of either 10 or 13 characters
 * 3. If Isbn has length 10, the first digit must be 0 or 1
 * 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
 * 5. Price must be a floating point number with two decimal places 
 * 6. Price must be a number greater than 0.49.
 *
 */
public class BookRuleSet implements RuleSet {
	//implemented
	private BookWindow bookWindowobj;
	
	@Override
	public void applyRules(Component ob) throws RuleException {
		bookWindowobj = (BookWindow) ob;
		setNonemptyRule();
		setIsbnNumericRule();
		setIsbnLengthRule();
		setIsbnStartWithRule();
		setPriceRule();
		SetMinimumPriceRule();
	}
	
	private void setNonemptyRule() throws RuleException {
		if(bookWindowobj.getIsbnValue().trim().isEmpty() ||
				bookWindowobj.getTitleValue().trim().isEmpty() ||
				bookWindowobj.getPriceValue().trim().isEmpty()) {
			throw new RuleException("all fields must be nonempty!");
		}
	}
	
	private void setIsbnNumericRule() throws RuleException {
		String isbnNumber = bookWindowobj.getIsbnValue().trim();
		String regularEx = "-?\\d+(\\.\\d+)?";
		if (!Pattern.matches(regularEx, isbnNumber))
			{
				throw new RuleException("Please Enter a numeric Id Number");
			}
			
		
	}
	
	private void setIsbnLengthRule() throws RuleException {
		String isbnNumber = bookWindowobj.getIsbnValue().trim();
		if (!Util.checkLength10or13(isbnNumber)) {
			throw new RuleException("Isbn must be numeric and consist of either 10 or 13 characters");
		}
	}
	
	private void setIsbnStartWithRule() throws RuleException {
		String isbnNumber = bookWindowobj.getIsbnValue().trim();
		
		if (!Util.checkIsbnStartsWithValidation(isbnNumber)) {
			throw new RuleException("Invalid ISBN number!");
		}
	}
	
	private void setPriceRule() throws RuleException {
		String bookPrice = bookWindowobj.getPriceValue().trim();
		if (!Util.checkPriceValidty(bookPrice)) 
			{throw new RuleException("price must be a floating point number with two decimal places");}
	}
	
	private void SetMinimumPriceRule() throws RuleException {
		String bookPrice = bookWindowobj.getPriceValue().trim();
		if (Float.parseFloat(bookPrice) < 0.49) {
			throw new RuleException("Pirce should not be less than 0.49!");
		}
	}

}
