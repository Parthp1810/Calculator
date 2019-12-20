/*

 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author Anil Patel
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new loginform().setVisible(true);
            }
        });
    }
}
