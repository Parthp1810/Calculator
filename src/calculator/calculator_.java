/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import javax.swing.ImageIcon;
/**
 *
 * @author Anil Patel
 */
public class calculator_ extends javax.swing.JFrame {

    /**
     * Creates new form calculator_
     */
    public calculator_() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        r10 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        r1 = new javax.swing.JButton();
        r2 = new javax.swing.JButton();
        r3 = new javax.swing.JButton();
        r4 = new javax.swing.JButton();
        r5 = new javax.swing.JButton();
        r6 = new javax.swing.JButton();
        r7 = new javax.swing.JButton();
        r8 = new javax.swing.JButton();
        r9 = new javax.swing.JButton();
        r11 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculators Form");
        setIconImage(new ImageIcon("D://parth.jpg").getImage());
        setPreferredSize(new java.awt.Dimension(585, 350));
        getContentPane().setLayout(null);

        r10.setBackground(new java.awt.Color(0, 0, 204));
        r10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        r10.setForeground(new java.awt.Color(255, 0, 0));
        r10.setText("Exit");
        r10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r10ActionPerformed(evt);
            }
        });
        getContentPane().add(r10);
        r10.setBounds(450, 270, 80, 37);

        jLabel1.setBackground(new java.awt.Color(0, 255, 204));
        jLabel1.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 0));
        jLabel1.setText("            CALCULATOR");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 570, 60);

        r1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        r1.setText("Age Calculator");
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });
        getContentPane().add(r1);
        r1.setBounds(10, 70, 200, 37);

        r2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        r2.setText("Simple Calculator");
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });
        getContentPane().add(r2);
        r2.setBounds(270, 120, 240, 37);

        r3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        r3.setText("Advance Calculator");
        r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3ActionPerformed(evt);
            }
        });
        getContentPane().add(r3);
        r3.setBounds(10, 120, 240, 37);

        r4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        r4.setText("Simple Interset Calculator");
        r4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4ActionPerformed(evt);
            }
        });
        getContentPane().add(r4);
        r4.setBounds(230, 220, 320, 37);

        r5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        r5.setText("Expensive Product Calculator");
        r5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5ActionPerformed(evt);
            }
        });
        getContentPane().add(r5);
        r5.setBounds(220, 70, 350, 37);

        r6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        r6.setText("Table ");
        r6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6ActionPerformed(evt);
            }
        });
        getContentPane().add(r6);
        r6.setBounds(380, 170, 140, 37);

        r7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        r7.setText("Work Calculator");
        r7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7ActionPerformed(evt);
            }
        });
        getContentPane().add(r7);
        r7.setBounds(10, 220, 210, 37);

        r8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        r8.setText("Area & Perimeter Calculator");
        r8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8ActionPerformed(evt);
            }
        });
        getContentPane().add(r8);
        r8.setBounds(10, 170, 350, 37);

        r9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        r9.setText("Average Calculator");
        r9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9ActionPerformed(evt);
            }
        });
        getContentPane().add(r9);
        r9.setBounds(10, 270, 240, 37);

        r11.setBackground(new java.awt.Color(0, 255, 153));
        r11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        r11.setText("About");
        r11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r11ActionPerformed(evt);
            }
        });
        getContentPane().add(r11);
        r11.setBounds(270, 270, 140, 37);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/3.jpg"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(480, 415));
        jLabel2.setMinimumSize(new java.awt.Dimension(480, 415));
        jLabel2.setPreferredSize(new java.awt.Dimension(480, 415));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 580, 330);

        setSize(new java.awt.Dimension(594, 366));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
 agecalc ob=new agecalc();
        ob.setVisible(true); 
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_r1ActionPerformed

    private void r9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9ActionPerformed
averagecalculator ob=new averagecalculator();
        ob.setVisible(true); 
         this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_r9ActionPerformed

    private void r5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5ActionPerformed
expensiveproduct ob=new expensiveproduct();
        ob.setVisible(true); 
         this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_r5ActionPerformed

    private void r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3ActionPerformed
calculator1 ob=new calculator1();
        ob.setVisible(true); 
         this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_r3ActionPerformed

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
calcu ob=new calcu();
        ob.setVisible(true); 
         this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_r2ActionPerformed

    private void r8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8ActionPerformed
 areaandperimeter ob=new areaandperimeter();
        ob.setVisible(true); 
         this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_r8ActionPerformed

    private void r6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6ActionPerformed
tablemaker ob=new tablemaker();
        ob.setVisible(true); 
         this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_r6ActionPerformed

    private void r7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7ActionPerformed
work ob=new work();
        ob.setVisible(true); 
         this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_r7ActionPerformed

    private void r4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4ActionPerformed
 simpleinterest ob=new simpleinterest();
        ob.setVisible(true); 
         this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_r4ActionPerformed

    private void r10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r10ActionPerformed
System.exit(0);       // TODO add your handling code here:
    }//GEN-LAST:event_r10ActionPerformed

    private void r11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r11ActionPerformed
     about_ ob=new about_();
        ob.setVisible(true); 
         this.setVisible(false);   // TODO add your handling code here:
    }//GEN-LAST:event_r11ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(calculator_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculator_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculator_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculator_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new calculator_().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton r1;
    private javax.swing.JButton r10;
    private javax.swing.JButton r11;
    private javax.swing.JButton r2;
    private javax.swing.JButton r3;
    private javax.swing.JButton r4;
    private javax.swing.JButton r5;
    private javax.swing.JButton r6;
    private javax.swing.JButton r7;
    private javax.swing.JButton r8;
    private javax.swing.JButton r9;
    // End of variables declaration//GEN-END:variables
}