package prob2;

import java.time.LocalDate;

public class CheckoutRecordEntry {
    private LocalDate checkoutDate;
    private LocalDate dueDate;
    private LendingItem lendingItem;
    private ItemType lendingItemType;

    public CheckoutRecordEntry(LendingItem item, LocalDate chDate, LocalDate dueDate, ItemType type) {
        lendingItem = item;
        checkoutDate = chDate;
        this.dueDate = dueDate;
        lendingItemType = type;
    }

    public LocalDate getCheckoutDate() {
        return checkoutDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public LendingItem getLendingItem() {
        return lendingItem;
    }

    public ItemType getLendingItemType() {
        return lendingItemType;
    }


}

