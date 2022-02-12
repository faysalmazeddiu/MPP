package prob;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.TextArea;
import java.util.Collections;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class BooksTitles  {
	
	public JPanel getMainPanel() {
		return topMostPanel;
	}
	private JPanel topMostPanel;
	private JPanel upperPanel;
	private JPanel centerPanel;
	private JTextArea textArea;
	

	
	public BooksTitles() {
		topMostPanel = new JPanel();
		topMostPanel.setLayout(new BorderLayout());
		setUpperPanel();
		setCenterPanel();
		topMostPanel.add(upperPanel, BorderLayout.NORTH);
		topMostPanel.add(centerPanel, BorderLayout.CENTER);
		
	}
	
	public void setUpperPanel() {
		upperPanel = new JPanel();
		JLabel titlesLabel = new JLabel("View Titles");
		Util.adjustLabelFont(titlesLabel, Util.DARK_BLUE, true);
		upperPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		upperPanel.add(titlesLabel);
	}
	
	public void setCenterPanel() {
		centerPanel = new JPanel();
		FlowLayout fl = new FlowLayout(FlowLayout.CENTER, 25, 25);
		centerPanel.setLayout(fl);
		textArea = new JTextArea(8, 20);
		modifyData();
		centerPanel.add(textArea);
		
	}
	
	public void modifyData() {
		//populate
		List<String> titles = Data.INSTANCE.bookTitles;
		StringBuilder sb = new StringBuilder();
		Collections.sort(titles);
		for(String s: titles) {
			sb.append(s + "\n");
		}
		textArea.setText(sb.toString());
		topMostPanel.repaint();
	}
	
}
