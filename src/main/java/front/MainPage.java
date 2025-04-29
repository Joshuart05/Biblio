package front;

import javax.swing.JComponent;
import javax.swing.JOptionPane;

/**
 *
 * @author joshu
 */
public class MainPage extends javax.swing.JFrame {
    
     private static String SEARCH_HINT = "Buscar...";

    public MainPage() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        adminOptions = new javax.swing.JPanel();
        bibliotecaryOptionsPanel = new javax.swing.JPanel();
        updateButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        adminOptionsPanel = new javax.swing.JPanel();
        deleteButton = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        elementsPanel = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Consulta");
        setPreferredSize(new java.awt.Dimension(1500, 800));
        setSize(new java.awt.Dimension(0, 0));

        header.setLayout(new javax.swing.BoxLayout(header, javax.swing.BoxLayout.LINE_AXIS));

        backButton.setText("<< Salir");
        backButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        backButton.setMaximumSize(new java.awt.Dimension(700, 700));
        backButton.setPreferredSize(new java.awt.Dimension(100, 100));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        header.add(backButton);

        searchField.setText("Buscar...");
        searchField.setPreferredSize(new java.awt.Dimension(64, 70));
        searchField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchFieldFocusLost(evt);
            }
        });
        header.add(searchField);

        searchButton.setText("Buscar");
        searchButton.setMaximumSize(new java.awt.Dimension(700, 700));
        searchButton.setPreferredSize(new java.awt.Dimension(100, 100));
        header.add(searchButton);

        getContentPane().add(header, java.awt.BorderLayout.PAGE_START);

        adminOptions.setLayout(new javax.swing.BoxLayout(adminOptions, javax.swing.BoxLayout.PAGE_AXIS));

        bibliotecaryOptionsPanel.setLayout(new java.awt.GridLayout(0, 1));

        updateButton.setText("Actualizar");
        updateButton.setPreferredSize(new java.awt.Dimension(100, 80));
        bibliotecaryOptionsPanel.add(updateButton);

        addButton.setText("Agregar");
        addButton.setPreferredSize(new java.awt.Dimension(100, 80));
        bibliotecaryOptionsPanel.add(addButton);

        adminOptions.add(bibliotecaryOptionsPanel);

        adminOptionsPanel.setLayout(new java.awt.GridLayout(1, 0));

        deleteButton.setText("Borrar");
        deleteButton.setPreferredSize(new java.awt.Dimension(100, 80));
        adminOptionsPanel.add(deleteButton);

        adminOptions.add(adminOptionsPanel);

        getContentPane().add(adminOptions, java.awt.BorderLayout.LINE_START);

        mainPanel.setLayout(new java.awt.CardLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        elementsPanel.setViewportView(jTable1);

        mainPanel.add(elementsPanel, "card2");

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        int chi = JOptionPane.showConfirmDialog(rootPane, "Estas seguro de querer salir?");
        if(chi == 0){
            setVisible(false);
        }
    }//GEN-LAST:event_backButtonActionPerformed

    private void searchFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFieldFocusGained
        String field = searchField.getText();
        if(field.equals(SEARCH_HINT)) searchField.setText("");
    }//GEN-LAST:event_searchFieldFocusGained

    private void searchFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFieldFocusLost
        String field = searchField.getText();
        if (field.equals("")) searchField.setText(SEARCH_HINT);
    }//GEN-LAST:event_searchFieldFocusLost
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JPanel adminOptions;
    private javax.swing.JPanel adminOptionsPanel;
    private javax.swing.JButton backButton;
    private javax.swing.JPanel bibliotecaryOptionsPanel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JScrollPane elementsPanel;
    private javax.swing.JPanel header;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
