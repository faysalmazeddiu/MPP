package prob3.control;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JFrame;

import prob3.data.Data;
import prob3.data.Logins;
import prob3.ui.*;

public enum Control {
	INSTANCE;
	Start start;
	Grades grades;
	Login login;
	String username;
	Remarks remarks;
	private boolean isLoggedIn = false;
	public boolean isLoggedIn() {
		return isLoggedIn;
	}
	public void setLoggedIn(boolean b) {
		isLoggedIn = b;
	}
	
	public void setStart(Start st) {
		this.start = st;
	}
	public void backToStart(JFrame frame) {
		frame.setVisible(false);
		start.setMessage("");
		start.setVisible(true);
	}
	
	class LoginListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			login = new Login();
			start.setVisible(false);
			login.setVisible(true);
		}
	}
	class RemarksListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			if (isLoggedIn) {
				remarks = new Remarks();
				HashMap<String, String> rem 
					= Data.dataMap.get(username).getTeacherRemarks();
				StringBuilder sb = new StringBuilder();
				for(String key : rem.keySet()) {
					sb.append(key + " : " + rem.get(key) + "\n");
				}
				remarks.setRemarks(sb.toString());
				remarks.setTitle("Teacher Remarks for " + username);
				remarks.setHeading("Teacher Remarks for " + username);
				Control.INSTANCE.start.setMessage("");
				Control.INSTANCE.start.setVisible(false);
				remarks.setVisible(true);
			}else {
				login = new Login();
				start.setVisible(false);
				login.setVisible(true);
			}
		}
	}
	class GradesListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			if (isLoggedIn) {
				grades = new Grades();
				HashMap<String, String> gr 
					= Data.dataMap.get(username).getGrades();
				StringBuilder sb = new StringBuilder();
				for(String key : gr.keySet()) {
					sb.append(key + " : " + gr.get(key) + "\n");
				}
				grades.setGrades(sb.toString());
				grades.setTitle("Grades for " + username);
				grades.setHeading("Grades for " + username);
				Control.INSTANCE.start.setMessage("");
				Control.INSTANCE.start.setVisible(false);
				grades.setVisible(true);
			}else {
				login = new Login();
				start.setVisible(false);
				login.setVisible(true);
			}
		}
	}
	class SubmitLoginListener implements ActionListener {
		
		SubmitLoginListener(Component com){
			login = (Login) com;
		}
		
		public void actionPerformed(ActionEvent evt) {
			String username = login.getUserName();
			String password = login.getPassword();
			if(!Logins.foundUserNamePwd(username, password)) {
				login.setMessage("Login failed.");
				setLoggedIn(false);
			} else {
				Control.this.username = username;
				Control.this.isLoggedIn = true;
				login.setMessage("Successful login");
				start = new Start();
				start.setVisible(true);
				login.setVisible(false);
			}
		}
	}
	public String getUserName() {
		return this.username;
	}
	public void setUserName(String username) {
		this.username = username;
	}
	public SubmitLoginListener getSubmitLoginListener(Component com) {
		return new SubmitLoginListener(com);
	}
	public LoginListener getLoginListener() {
		return new LoginListener();
	}
	public RemarksListener getRemarksListener() {
		return new RemarksListener();
	}
	public GradesListener getGradesListener() {
		return new GradesListener();
	}
}
