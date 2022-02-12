package prob;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.ListModel;

@SuppressWarnings("serial")
public class BookStore extends JFrame {

	ItemList listOfLoginItem = new ItemList("Login", true);
	ItemList listOfBookItem = new ItemList("Add Book", false);
	ItemList displayTitleItem = new ItemList("View Titles", false);
	String[] links;
	UserLogin userlp;
	InsertBookPanel insertedBookPanel;
	BooksTitles allBookTitles;
	JList<ItemList> linkList;
	JPanel cardPanel;
	public static JTextArea titleBar = new JTextArea("Welcome to the Book Club!");

	ItemList[] sellerItems = { listOfLoginItem, listOfBookItem };
	ItemList[] memberItems = { listOfLoginItem, displayTitleItem };

	public ItemList[] getSellerItems() {
		return sellerItems;
	}

	public ItemList[] getMemberItems() {
		return memberItems;
	}

	public JList<ItemList> getLinkList() {
		return linkList;
	}

	public BookStore() {
		Util.adjustLabelFont(titleBar, Util.DARK_BLUE, true);
		setSize(600, 450);

		makeLinkLabels();
		makeMainPanels();
		CardLayout clayout = (CardLayout) (cardPanel.getLayout());
		linkList.addListSelectionListener(event -> {
			String selectedValue = linkList.getSelectedValue().getNameOfItem();
			boolean allowed = linkList.getSelectedValue().highlight();
			
			titleBar.setText("");
			if (!allowed) {
				selectedValue = listOfLoginItem.getNameOfItem();
				linkList.setSelectedIndex(0);
			}
			if (selectedValue.equals("View Titles"))
				allBookTitles.modifyData();
			if (selectedValue.equals("Login"))
				userlp.clearAll();
			clayout.show(cardPanel, selectedValue);

		});

		// set up split panes

		JSplitPane innerPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, linkList, cardPanel);
		innerPane.setDividerLocation(180);
		JSplitPane outerPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, innerPane, titleBar);
		outerPane.setDividerLocation(350);
		add(outerPane, BorderLayout.CENTER);
		userlp.setBookStore(this);
		insertedBookPanel.setBookStore(this);

	}

	public JTextArea getStatusMenuBar() {
		return titleBar;
	}

	public void makeLinkLabels() {
		DefaultListModel<ItemList> ListOfmodel = new DefaultListModel<>();
		ListOfmodel.addElement(listOfLoginItem);
		ListOfmodel.addElement(displayTitleItem);
		ListOfmodel.addElement(listOfBookItem);

		linkList = new JList<ItemList>(ListOfmodel);
		linkList.setCellRenderer(new DefaultListCellRenderer() {

			@SuppressWarnings("rawtypes")
			@Override
			public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected,
					boolean cellHasFocus) {
				Component c = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
				if (value instanceof ItemList) {
					ItemList nextItem = (ItemList) value;
					setText(nextItem.getNameOfItem());
					if (nextItem.highlight()) {
						setForeground(Util.LINK_AVAILABLE);
					} else {
						setForeground(Util.LINK_NOT_AVAILABLE);
					}
					if (isSelected) {
						setForeground(Color.BLACK);
						setBackground(new Color(236, 243, 245));
						
					}
				}
				return c;
			}

		});
	}

	public void makeMainPanels() {
		// login
		userlp = new UserLogin();
		JPanel userLoginPanel = userlp.getMostTopPanel();

		// add book
		insertedBookPanel = new InsertBookPanel();
		JPanel addBookPanel = insertedBookPanel.getTopMostPanel();

		// all book IDs
		allBookTitles = new BooksTitles();
		JPanel allTitlesPanel = allBookTitles.getMainPanel();

		cardPanel = new JPanel(new CardLayout());
		cardPanel.add(userLoginPanel, listOfLoginItem.getNameOfItem());
		cardPanel.add(allTitlesPanel, displayTitleItem.getNameOfItem());
		cardPanel.add(addBookPanel, listOfBookItem.getNameOfItem());

	}

}