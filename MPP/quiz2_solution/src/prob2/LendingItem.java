package prob2;

public class LendingItem {
	private int numCopiesInLib;

    public int getNumCopiesInLib() {
        return numCopiesInLib;
    }

    public void setNumCopiesInLib(int numCopiesInLib) {
        this.numCopiesInLib = numCopiesInLib;
    }
    @Override
    public boolean equals(Object obj) {

        if(obj == null)
            return false;

        if(getNumCopiesInLib()!=((LendingItem)obj).getNumCopiesInLib())
            return false;

        return true;
    }
}
