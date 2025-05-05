/** * @authors Quezada Esteban Joshua Arturo
 *             Martínez Granados Emanuel
 *             Roldán López Christian Jair
 */

package front;

import back.DbRequest;
import back.Main;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Libro;

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
        footer = new javax.swing.JPanel();
        bookUpdateButton = new javax.swing.JButton();
        genreUpdateButton = new javax.swing.JButton();
        updateEditorialButton = new javax.swing.JButton();
        updateAuthorButton = new javax.swing.JButton();
        adminOptions = new javax.swing.JPanel();
        bibliotecaryOptionsPanel = new javax.swing.JPanel();
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

        footer.setLayout(new java.awt.GridLayout());

        bookUpdateButton.setText("Actualizar Libro");
        bookUpdateButton.setPreferredSize(new java.awt.Dimension(100, 80));
        bookUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookUpdateButtonActionPerformed(evt);
            }
        });
        footer.add(bookUpdateButton);

        genreUpdateButton.setText("Actulizar Genero");
        genreUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genreUpdateButtonActionPerformed(evt);
            }
        });
        footer.add(genreUpdateButton);

        updateEditorialButton.setText("Actulizar Editorial");
        updateEditorialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateEditorialButtonActionPerformed(evt);
            }
        });
        footer.add(updateEditorialButton);

        updateAuthorButton.setText("Actulizar Autor");
        updateAuthorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateAuthorButtonActionPerformed(evt);
            }
        });
        footer.add(updateAuthorButton);

        getContentPane().add(footer, java.awt.BorderLayout.PAGE_END);

        adminOptions.setLayout(new javax.swing.BoxLayout(adminOptions, javax.swing.BoxLayout.PAGE_AXIS));

        bibliotecaryOptionsPanel.setLayout(new java.awt.GridLayout(0, 1));

        addButton.setText("Agregar");
        addButton.setPreferredSize(new java.awt.Dimension(100, 80));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        bibliotecaryOptionsPanel.add(addButton);

        adminOptions.add(bibliotecaryOptionsPanel);

        adminOptionsPanel.setLayout(new java.awt.GridLayout(1, 0));

        deleteButton.setText("Ver Tablas");
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

    private void bookUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookUpdateButtonActionPerformed
        loadobject(1);
    }//GEN-LAST:event_bookUpdateButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        loadobject(0);
    }//GEN-LAST:event_addButtonActionPerformed

    private void genreUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genreUpdateButtonActionPerformed
        loadobject(2);
    }//GEN-LAST:event_genreUpdateButtonActionPerformed

    private void updateEditorialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateEditorialButtonActionPerformed
        loadobject(4);
    }//GEN-LAST:event_updateEditorialButtonActionPerformed

    private void updateAuthorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateAuthorButtonActionPerformed
        loadobject(3);
    }//GEN-LAST:event_updateAuthorButtonActionPerformed

    //0 para agregar -
    //1 para editar libro 0
    //2 para editar genero 3
    //3 para editar autor 2
    //4 para editar editorial 1
    
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
    
    private void loadobject(int function){
        if(1 == booksTable.getSelectedRowCount()){
            Object obj = booksTable.getSelectedRow();
            
            booksTable.getSelectedRow();
            String value = booksTable.getModel().getValueAt(booksTable.getSelectedRow(), 0).toString();
            System.out.println(value);
            OptObject open = new OptObject(this, function, parseInt(value));
            open.setVisible(true);
        }
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
                adminOptions.setVisible(false);
                adminOptions.setEnabled(false);

                footer.setVisible(false);
                footer.setEnabled(false);
                break;

            case 2:
                adminOptions.setVisible(false);
                adminOptions.setEnabled(false);
                break;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JPanel adminOptions;
    private javax.swing.JPanel adminOptionsPanel;
    private javax.swing.JButton backButton;
    private javax.swing.JPanel bibliotecaryOptionsPanel;
    private javax.swing.JButton bookUpdateButton;
    private javax.swing.JTable booksTable;
    private javax.swing.JButton deleteButton;
    private javax.swing.JScrollPane elementsPanel;
    private javax.swing.JPanel footer;
    private javax.swing.JButton genreUpdateButton;
    private javax.swing.JPanel header;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField searchField;
    private javax.swing.JButton updateAuthorButton;
    private javax.swing.JButton updateEditorialButton;
    // End of variables declaration//GEN-END:variables
}
