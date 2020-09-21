
/**
 * Q 2) Write a java program to display Progress Bar.
 */

import javax.swing.*;

public class progressbar {

    public static void main(String[] args) {

        JFrame f = new JFrame("ProgressBar ");
        JPanel panel = new JPanel();

        JProgressBar progressBar = new JProgressBar(0, 20);
        progressBar.setValue(0);
        progressBar.setStringPainted(true);
        panel.add(progressBar);

        f.add(panel);
        f.setSize(500, 500);
        f.setVisible(true);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
  
        progressBar.setValue(100);

    }
   
    
}
