package front;

import back.DbRequest;
import back.Main;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Libro;

/**
 *
 * @author joshu
 */
public class MainPage extends javax.swing.JFrame {

    private final Main mainWindow;
    private DefaultTableModel table;
    private List<Libro> books = new ArrayList<>();
    DbRequest dbConsul = new DbRequest();

    private static String SEARCH_HINT = "Buscar...";

    public MainPage(Main parent) {
        this.mainWindow = parent;
        initComponents();
        table = (DefaultTableModel) booksTable.getModel();
        loadBooks();
        typeUserInterface(mainWindow.showUserType());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        adminOptions = new javax.swing.JPanel();
        bibliotecaryOptionsPanel = new javax.swing.JPanel();
        updateButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        adminOptionsPanel = new javax.swing.JPanel();
        deleteButton = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        elementsPanel = new javax.swing.JScrollPane();
        booksTable = new javax.swing.JTable();

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
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });
        header.add(searchField);

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

        booksTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Autor", "Editorial", "Año", "Genero", "Ubicacion", "Disponibles"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        elementsPanel.setViewportView(booksTable);

        mainPanel.add(elementsPanel, "card2");

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        int chi = JOptionPane.showConfirmDialog(rootPane, "Estas seguro de querer salir?");
        if (chi == 0) {
            setVisible(false);
        }
    }//GEN-LAST:event_backButtonActionPerformed

    private void searchFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFieldFocusGained
        String field = searchField.getText();
        if (field.equals(SEARCH_HINT))
            searchField.setText("");
    }//GEN-LAST:event_searchFieldFocusGained

    private void searchFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFieldFocusLost
        String field = searchField.getText();
        if (field.equals(""))
            searchField.setText(SEARCH_HINT);
    }//GEN-LAST:event_searchFieldFocusLost

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        if (!"".equals(searchField.getText())) {

            books = dbConsul.searchBook(searchField.getText());
            table.setRowCount(0);

            for (Libro book : books) {
                table.addRow(new Object[]{
                    book.getId(),
                    book.getTitulo(),
                    book.getAutor(),
                    book.getEditorial(),
                    book.getAnio(),
                    book.getGenero(),
                    book.getUbicacion(),
                    book.getCopiasDisponibles()
                });
            }
        } else {
            loadBooks();
        }
    }//GEN-LAST:event_searchFieldKeyReleased

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
                new MainPage(new Main()).setVisible(true);
            }
        });
    }

    private void loadBooks() {
        books = dbConsul.requestBooks();
        table.setRowCount(0);

        for (Libro book : books) {
            table.addRow(new Object[]{
                book.getId(),
                book.getTitulo(),
                book.getAutor(),
                book.getEditorial(),
                book.getAnio(),
                book.getGenero(),
                book.getUbicacion(),
                book.getCopiasDisponibles()
            });
        }
    }

    private void typeUserInterface(int type) {
        switch (type) {
            case 1:
                deleteButton.setVisible(false);
                deleteButton.setEnabled(false);

                addButton.setVisible(false);
                addButton.setEnabled(false);

                updateButton.setVisible(false);
                updateButton.setEnabled(false);
                break;

            case 2:
                deleteButton.setVisible(false);
                deleteButton.setEnabled(false);
                break;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JPanel adminOptions;
    private javax.swing.JPanel adminOptionsPanel;
    private javax.swing.JButton backButton;
    private javax.swing.JPanel bibliotecaryOptionsPanel;
    private javax.swing.JTable booksTable;
    private javax.swing.JButton deleteButton;
    private javax.swing.JScrollPane elementsPanel;
    private javax.swing.JPanel header;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField searchField;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
