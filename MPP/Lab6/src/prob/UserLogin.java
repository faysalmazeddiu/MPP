package prob;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Box;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.SwingConstants;

import com.sun.jdi.event.EventQueue;


public class UserLogin  {
	BookStore bookStore;
    public void setBookStore(BookStore store) {
    	bookStore = store;
    }
	public JPanel getMostTopPanel() {
		return mostTopPanel;
	}
	private JPanel mostTopPanel;
	private JPanel upperHalf;
	private JPanel middleHalf;
	//private JPanel lowerHalf;
	private JPanel containerPanel;
	
	private JPanel upperPanel;
	private JPanel middlePositionPanel;
	private JPanel lowerPositionPanel;
	private JPanel leftPositionTextPanel;
	private JPanel rightPositionTextPanel;
	
	private JTextField usernameTextField;
	private JTextField passwordTextField;
	private JLabel label;
	private JButton loginBtn;
	private JButton logoutBtn;
	public UserLogin() {
		
		mostTopPanel = new JPanel();
		setUpperHalf();
		setMiddleHalf();
		//defineLowerHalf();
		BorderLayout borderLayoutl = new BorderLayout();
		borderLayoutl.setVgap(30);
		mostTopPanel.setLayout(borderLayoutl);
					
		mostTopPanel.add(upperHalf, BorderLayout.NORTH);
		mostTopPanel.add(middleHalf, BorderLayout.CENTER);
		//mostTopPanel.add(lowerHalf, BorderLayout.SOUTH);

	}
	private void setUpperHalf() {
		
		upperHalf = new JPanel();
		upperHalf.setLayout(new BorderLayout());
		setUpperPanel();
		setmiddlePositionPanel();
		setLowerPositionPanel();
		upperHalf.add(upperPanel, BorderLayout.NORTH);
		upperHalf.add(middlePositionPanel, BorderLayout.CENTER);
		upperHalf.add(lowerPositionPanel, BorderLayout.SOUTH);
		
	}
	private void setMiddleHalf() {
		middleHalf = new JPanel();
		middleHalf.setLayout(new BorderLayout());
		JSeparator s = new JSeparator();
		s.setOrientation(SwingConstants.HORIZONTAL);
		//middleHalf.add(Box.createRigidArea(new Dimension(0,50)));
		middleHalf.add(s, BorderLayout.SOUTH);
		
	}

	private void setUpperPanel() {
		upperPanel = new JPanel();
		
		JLabel loginLabel = new JLabel("Login");
		Util.adjustLabelFont(loginLabel, Color.BLUE.darker(), true);
		
		upperPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		upperPanel.add(loginLabel);
		
	}
	
	
	
	private void setmiddlePositionPanel() {
		middlePositionPanel=new JPanel();
		middlePositionPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		setLeftPositionTextPanel();
		setRightPositionTextPanel();
		middlePositionPanel.add(leftPositionTextPanel);
		middlePositionPanel.add(rightPositionTextPanel);
	}
	private void setLowerPositionPanel() {
		lowerPositionPanel = new JPanel();
		loginBtn = new JButton("Login");
		addLoginButtonListener(loginBtn);
		lowerPositionPanel.add(loginBtn);
	}

	private void setLeftPositionTextPanel() {
		
		JPanel topTextPanel = new JPanel();
		JPanel bottomTextPanel = new JPanel();
		topTextPanel.setLayout(new FlowLayout(FlowLayout.LEFT,5,0));
		bottomTextPanel.setLayout(new FlowLayout(FlowLayout.LEFT,5,0));		
		
		usernameTextField = new JTextField(10);
		label = new JLabel("Username");
		label.setFont(Util.makeSmallFont(label.getFont()));
		topTextPanel.add(usernameTextField);
		bottomTextPanel.add(label);
		
		leftPositionTextPanel = new JPanel();
		leftPositionTextPanel.setLayout(new BorderLayout());
		leftPositionTextPanel.add(topTextPanel,BorderLayout.NORTH);
		leftPositionTextPanel.add(bottomTextPanel,BorderLayout.CENTER);
	}
	private void setRightPositionTextPanel() {
		
		JPanel topText = new JPanel();
		JPanel bottomText = new JPanel();
		topText.setLayout(new FlowLayout(FlowLayout.LEFT,5,0));
		bottomText.setLayout(new FlowLayout(FlowLayout.LEFT,5,0));		
		
		passwordTextField = new JPasswordField(10);
		label = new JLabel("Password");
		label.setFont(Util.makeSmallFont(label.getFont()));
		topText.add(passwordTextField);
		bottomText.add(label);
		
		rightPositionTextPanel = new JPanel();
		rightPositionTextPanel.setLayout(new BorderLayout());
		rightPositionTextPanel.add(topText,BorderLayout.NORTH);
		rightPositionTextPanel.add(bottomText,BorderLayout.CENTER);
	}
	
	private void addLoginButtonListener(JButton butn) {
		butn.addActionListener(evt -> {
			
				String user = usernameTextField.getText().trim();
				String pwd = passwordTextField.getText().trim();
				if(user.length() == 0 || pwd.length() == 0) {
					
				}
				else { 
					User login = new User(user,pwd, null);
					
					List<User> list = Data.logins;
					User u = Util.findUser(list, login);
					if(u == null) {
						bookStore.titleBar.setForeground(Util.ERROR_MESSAGE_COLOR);
						bookStore.titleBar.setText("Sorry Login failed! Please Try again");
					
					}
					else {
						Data.currentAuth = u.authorization;
						bookStore.titleBar.setForeground(Util.INFO_MESSAGE_COLOR);
						bookStore.titleBar.setText("Successfully Login");
						modifyLeftPanel(Data.currentAuth);
						bookStore.repaint();
					}
					
				}	
			

		});
	}
	private void modifyLeftPanel(Auth auth) {
		if(auth == Auth.SELLER) sellerBook();
		else if(auth == Auth.MEMBER) memberBook();
		else if(auth == Auth.BOTH) bookForBothMemeber();
		
	}
	
	private void sellerBook() {
		ItemList[] adminIBooks = bookStore.getSellerItems();
		modifyList(adminIBooks);
	}
	private void memberBook() {
		ItemList[] librarianBooks = bookStore.getMemberItems();
		modifyList(librarianBooks);
	}
	private void bookForBothMemeber() {
		modifyList(null);
	}
	
	@SuppressWarnings("unchecked")
	private void modifyList(ItemList[] items) {
		JList<ItemList> linkList = bookStore.getLinkList();
		DefaultListModel<ItemList> model = (DefaultListModel)linkList.getModel();
		int size = model.getSize();
		if(items != null) {	
			java.util.List<Integer> indices = new ArrayList<>();
			for(ItemList itemInfo : items) {
				int index = model.indexOf(itemInfo);
				indices.add(index);
				ItemList nextItem = (ItemList)model.get(index);
				nextItem.setHighlight(true);
				
			}
			for(int index = 0; index <size; ++index) {
				if(!indices.contains(index)) {
					ItemList nextItem = (ItemList)model.get(index);
					nextItem.setHighlight(false);
				}
			}
		} else {
			for(int index = 0; index <size; ++index) {
				ItemList nextItem = (ItemList)model.get(index);
				nextItem.setHighlight(true);	
			}
			
		}
	}
	
	
	public void clearAll() {
		usernameTextField.setText("");
		passwordTextField.setText("");
	}
	
	
	private static final long serialVersionUID = 3618976789175941432L;
	
	
}


