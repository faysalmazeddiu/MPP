package prob;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InsertBookPanel {
	BookStore bookStore;
    public void setBookStore(BookStore bookStore) {
    	this.bookStore = bookStore;
    }
	public JPanel getTopMostPanel() {
		return topMostPanel;
	}
	private JPanel topMostPanel;
	private JPanel upperPanel;
	private JPanel outerMiddlePanel;
	
	
	private JTextField firstNameFieldAuth;
	private JTextField lastNameFieldAuth;
	private JTextField titleField;

	public void resetData() {
		firstNameFieldAuth.setText("");
		lastNameFieldAuth.setText("");
		titleField.setText("");	
	}
	public InsertBookPanel() {
		topMostPanel = new JPanel();
		topMostPanel.setLayout(new BorderLayout());
		setUpperPanel();
		setOuterMiddlePanel();
		topMostPanel.add(upperPanel, BorderLayout.NORTH);
		topMostPanel.add(outerMiddlePanel, BorderLayout.CENTER);
	}
	
	public void setUpperPanel() {
		upperPanel = new JPanel();
		JLabel AddBookLabel = new JLabel("Add Book Title");
		Util.adjustLabelFont(AddBookLabel, Util.DARK_BLUE, true);
		upperPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		upperPanel.add(AddBookLabel);
	}
	
	public void setOuterMiddlePanel() {
		outerMiddlePanel = new JPanel();
		outerMiddlePanel.setLayout(new BorderLayout());
		
		//set up left and right panels		
		JPanel panelForMiddle = new JPanel();
		FlowLayout fl = new FlowLayout(FlowLayout.CENTER, 25, 25);
		panelForMiddle.setLayout(fl);
		JPanel panelForLeft = new JPanel();
		JPanel panelForRight = new JPanel();
		panelForLeft.setLayout(new BoxLayout(panelForLeft, BoxLayout.Y_AXIS));
		panelForRight.setLayout(new BoxLayout(panelForRight, BoxLayout.Y_AXIS));
		
		JLabel firstNameLabelAuth = new JLabel("Author First Name");
		JLabel lastNameLabelAuth = new JLabel("Author Last Name");
		JLabel titleLabel = new JLabel("Book Title");
		
		firstNameFieldAuth = new JTextField(10);
		lastNameFieldAuth = new JTextField(10);
		titleField = new JTextField(10);
		
		panelForLeft.add(firstNameLabelAuth);
		panelForLeft.add(Box.createRigidArea(new Dimension(0,12)));
		panelForLeft.add(lastNameLabelAuth);
		panelForLeft.add(Box.createRigidArea(new Dimension(0,12)));
		panelForLeft.add(titleLabel);
		
		
		panelForRight.add(firstNameFieldAuth);
		panelForRight.add(Box.createRigidArea(new Dimension(0,8)));
		panelForRight.add(lastNameFieldAuth);
		panelForRight.add(Box.createRigidArea(new Dimension(0,8)));
		panelForRight.add(titleField);
		
		panelForMiddle.add(panelForLeft);
		panelForMiddle.add(panelForRight);
		outerMiddlePanel.add(panelForMiddle, BorderLayout.NORTH);
		
		//add button at bottom
		JButton addBookButton = new JButton("Add Book");
		attachAddBookButtonListener(addBookButton);
		JPanel addBookButtonPanel = new JPanel();
		addBookButtonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		addBookButtonPanel.add(addBookButton);
		outerMiddlePanel.add(addBookButtonPanel, BorderLayout.CENTER);
		
	}
	private void attachAddBookButtonListener(JButton butn) {
		butn.addActionListener(evt -> {
			List<BookAuthor> authors = new ArrayList<BookAuthor>();
			String fname = firstNameFieldAuth.getText();
			String lname = lastNameFieldAuth.getText();
			
			String title = titleField.getText();
			authors.add(new BookAuthor(fname, lname));
			
			Data.addBookTitle(title);
			bookStore.titleBar.setForeground(Util.INFO_MESSAGE_COLOR);
			bookStore.titleBar.setText("The book "+title+" inserted Successfully!");
					
		
	    });
	}
//	public void updateData() {
//		// nothing to do
//		
//	}
}
