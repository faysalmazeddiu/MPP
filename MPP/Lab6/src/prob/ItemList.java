package prob;

public class ItemList {
	
	public ItemList(String itemParam, boolean visibleParam) {
		nameOfItem = itemParam;
	   highlight = visibleParam;
    }
	public String getNameOfItem() {
		return nameOfItem;
	}
	public boolean highlight() {
		return highlight;
	}
	@Override
	public boolean equals(Object object) {
		if(object.getClass() != ItemList.class) return false;
		ItemList itemObj = (ItemList)object;
		return nameOfItem.equals(itemObj.nameOfItem);
	}
	
	public void setNameOfItem(String itemName) {
		this.nameOfItem = itemName;
	}
	public void setHighlight(boolean highlight) {
		this.highlight = highlight;
	}
	private String nameOfItem;
	private boolean highlight = false;
}
