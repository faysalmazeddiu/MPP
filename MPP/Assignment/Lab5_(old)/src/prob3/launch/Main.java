package prob3.launch;

import java.awt.EventQueue;

import prob3.ui.Login;

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable()
		{
			public void run() {
				Login l = new Login();
				l.setVisible(true);
			}
		});

	}

}
