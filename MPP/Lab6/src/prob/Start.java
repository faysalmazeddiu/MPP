package prob;

import java.awt.*;
import javax.swing.*;


public class Start {
   public static void main(String[] args) {
      EventQueue.invokeLater(() -> 
         {
            JFrame frameForBookStore = new BookStore();
            frameForBookStore.setTitle("Book Club");
            frameForBookStore.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            middleFrame(frameForBookStore);
            frameForBookStore.setVisible(true);
         });
   }
   
   public static void middleFrame(Component component) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		int height = toolkit.getScreenSize().height;
		int width = toolkit.getScreenSize().width;
		int componentHeight = component.getSize().height;
		int componentWidth = component.getSize().width;
		component.setLocation(((width - componentWidth) / 2), (height - componentHeight) / 3);
	}
}