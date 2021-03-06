/*
 * JTwoPanelFrame.java
 *
 * Created on 11 January 2000, 17:59
 */

package jparticles.gui;

import javax.swing.*;
/**
 *
 * @author  carlos
 */
public class JTwoPanelFrame extends javax.swing.JFrame
{
    
    /** Creates new form JTwoPanelFrame */
    public JTwoPanelFrame(JPanel panelA, JPanel panelB, int width, int height)
    {
        initComponents();
        this.setSize(width,height);        
        jScrollPaneA.setViewportView(panelA);
        jScrollPaneB.setViewportView(panelB);             
    }
    public void setDividerLocation(double val)
    {
           jSplitPane.setDividerLocation(.5);
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents()//GEN-BEGIN:initComponents
    {
        jSplitPane = new javax.swing.JSplitPane();
        jScrollPaneA = new javax.swing.JScrollPane();
        jScrollPaneB = new javax.swing.JScrollPane();

        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                exitForm(evt);
            }
        });

        jSplitPane.setLeftComponent(jScrollPaneA);

        jSplitPane.setRightComponent(jScrollPaneB);

        getContentPane().add(jSplitPane, java.awt.BorderLayout.CENTER);

        pack();
    }//GEN-END:initComponents
    
    /** Exit the Application */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        JTwoPanelFrame frame = new JTwoPanelFrame(null,null,512,512);
        frame.show();
        frame.setDividerLocation(.5);
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPaneB;
    private javax.swing.JScrollPane jScrollPaneA;
    private javax.swing.JSplitPane jSplitPane;
    // End of variables declaration//GEN-END:variables
    
}
