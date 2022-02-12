package prob1.rulesets;

import java.awt.Component;

import prob1.gui.CDWindow;

/**
 * Rules: 
 * 1. All fields must be nonempty 
 * 2. Price must be a floating point number with two decimal places 
 * 3. Price must be a number greater than 0.49.
 */

public class CDRuleSet implements RuleSet {
	//implemented
	private CDWindow cdWindowObj;

	@Override
	public void applyRules(Component ob) throws RuleException {
		cdWindowObj = (CDWindow) ob;
		setNonEmptyRule();
		setPriceRule();
		setMinimumPriceRule();
	}
	
	private void setNonEmptyRule() throws RuleException {
		if(cdWindowObj.getArtistValue().trim().isEmpty() ||
				cdWindowObj.getTitleValue().trim().isEmpty() ||
				cdWindowObj.getPriceValue().trim().isEmpty()) {
			throw new RuleException("all fields must be nonempty");
		}
	}
	
	private void setPriceRule() throws RuleException {
		String cdPrice = cdWindowObj.getPriceValue().trim();
		if (!Util.checkPriceValidty(cdPrice)) {
			throw new RuleException(" Price must be a floating point number with two decimal places");
		}
	}
	
	private void setMinimumPriceRule() throws RuleException {
		String cdPrice = cdWindowObj.getPriceValue().trim();
		if (Float.parseFloat(cdPrice) < 0.49) {
			throw new RuleException("Price must be a number greater than 0.49");
		}
	}

}
