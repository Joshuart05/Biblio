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
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import models.Libro;

public class MainPage extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
    private final Main mainWindow;
    private OptObject open;
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
        lateralOptions = new javax.swing.JPanel();
        userOpt = new javax.swing.JPanel();
        showBook = new javax.swing.JButton();
        adminOpt = new javax.swing.JPanel();
        bibliotecaryOptionsPanel = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        adminOptionsPanel = new javax.swing.JPanel();
        showTables = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        elementsPanel = new javax.swing.JScrollPane();
        booksTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Consulta");
        setBackground(new java.awt.Color(255, 244, 236));
        setPreferredSize(new java.awt.Dimension(1500, 800));
        setSize(new java.awt.Dimension(0, 0));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        header.setBackground(new java.awt.Color(255, 244, 236));
        header.setLayout(new javax.swing.BoxLayout(header, javax.swing.BoxLayout.LINE_AXIS));

        backButton.setBackground(new java.awt.Color(255, 51, 51));
        backButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("<< Salir");
        backButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 1, true));
        backButton.setBorderPainted(false);
        backButton.setMaximumSize(new java.awt.Dimension(700, 700));
        backButton.setPreferredSize(new java.awt.Dimension(100, 100));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        header.add(backButton);

        searchField.setBackground(new java.awt.Color(255, 244, 236));
        searchField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        searchField.setForeground(new java.awt.Color(102, 102, 102));
        searchField.setText("Buscar...");
        searchField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 7, 0, new java.awt.Color(102, 102, 102)));
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

        footer.setBackground(new java.awt.Color(255, 244, 236));
        footer.setLayout(new java.awt.GridLayout(1, 0));

        bookUpdateButton.setBackground(new java.awt.Color(80, 84, 84));
        bookUpdateButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bookUpdateButton.setForeground(new java.awt.Color(204, 204, 204));
        bookUpdateButton.setText("Actualizar Libro");
        bookUpdateButton.setPreferredSize(new java.awt.Dimension(100, 80));
        bookUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookUpdateButtonActionPerformed(evt);
            }
        });
        footer.add(bookUpdateButton);

        genreUpdateButton.setBackground(new java.awt.Color(80, 84, 84));
        genreUpdateButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        genreUpdateButton.setForeground(new java.awt.Color(204, 204, 204));
        genreUpdateButton.setText("Actulizar Genero");
        genreUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genreUpdateButtonActionPerformed(evt);
            }
        });
        footer.add(genreUpdateButton);

        updateEditorialButton.setBackground(new java.awt.Color(80, 84, 84));
        updateEditorialButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updateEditorialButton.setForeground(new java.awt.Color(204, 204, 204));
        updateEditorialButton.setText("Actulizar Editorial");
        updateEditorialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateEditorialButtonActionPerformed(evt);
            }
        });
        footer.add(updateEditorialButton);

        updateAuthorButton.setBackground(new java.awt.Color(80, 84, 84));
        updateAuthorButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updateAuthorButton.setForeground(new java.awt.Color(204, 204, 204));
        updateAuthorButton.setText("Actulizar Autor");
        updateAuthorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateAuthorButtonActionPerformed(evt);
            }
        });
        footer.add(updateAuthorButton);

        getContentPane().add(footer, java.awt.BorderLayout.PAGE_END);

        lateralOptions.setBackground(new java.awt.Color(255, 244, 236));
        lateralOptions.setLayout(new java.awt.CardLayout());

        userOpt.setLayout(new java.awt.GridLayout());

        showBook.setBackground(new java.awt.Color(80, 84, 84));
        showBook.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        showBook.setForeground(new java.awt.Color(204, 204, 204));
        showBook.setText("Ver Libro");
        showBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBookActionPerformed(evt);
            }
        });
        userOpt.add(showBook);

        lateralOptions.add(userOpt, "card3");

        adminOpt.setLayout(new javax.swing.BoxLayout(adminOpt, javax.swing.BoxLayout.PAGE_AXIS));

        bibliotecaryOptionsPanel.setLayout(new java.awt.GridLayout(0, 1));

        addButton.setBackground(new java.awt.Color(80, 84, 84));
        addButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addButton.setForeground(new java.awt.Color(204, 204, 204));
        addButton.setText("Agregar");
        addButton.setPreferredSize(new java.awt.Dimension(100, 80));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        bibliotecaryOptionsPanel.add(addButton);

        adminOpt.add(bibliotecaryOptionsPanel);

        adminOptionsPanel.setLayout(new java.awt.GridLayout(1, 0));

        showTables.setBackground(new java.awt.Color(80, 84, 84));
        showTables.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        showTables.setForeground(new java.awt.Color(204, 204, 204));
        showTables.setText("Ver Tablas");
        showTables.setPreferredSize(new java.awt.Dimension(100, 80));
        showTables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showTablesActionPerformed(evt);
            }
        });
        adminOptionsPanel.add(showTables);

        adminOpt.add(adminOptionsPanel);

        lateralOptions.add(adminOpt, "card2");

        getContentPane().add(lateralOptions, java.awt.BorderLayout.LINE_START);

        mainPanel.setBackground(new java.awt.Color(255, 244, 236));
        mainPanel.setLayout(new java.awt.CardLayout());

        elementsPanel.setBackground(new java.awt.Color(255, 244, 236));

        booksTable.setBackground(new java.awt.Color(255, 244, 236));
        booksTable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        booksTable.setForeground(new java.awt.Color(102, 102, 102));
        booksTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Autor", "Editorial", "Año", "Genero", "Ubicacion", "Disponibles"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        booksTable.setGridColor(new java.awt.Color(255, 244, 236));
        booksTable.setSelectionBackground(new java.awt.Color(102, 102, 102));
        booksTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        booksTable.setShowGrid(false);
        booksTable.setShowHorizontalLines(true);
        elementsPanel.setViewportView(booksTable);

        mainPanel.add(elementsPanel, "card2");

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        int chi = JOptionPane.showConfirmDialog(rootPane, "Estas seguro de querer salir?");
        if (chi == 0) {
            dispose();
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

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        open.dispose();
        loadBooks();
    }//GEN-LAST:event_formFocusGained

    private void showBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBookActionPerformed
        if (1 == booksTable.getSelectedRowCount()) {
            String value = booksTable.getModel().getValueAt(booksTable.getSelectedRow(), 0).toString();
            System.out.println("Este es:" + value);
            ShowBook raf = new ShowBook(mainWindow, parseInt(value));
            raf.setVisible(true);
        }
    }//GEN-LAST:event_showBookActionPerformed

    private void showTablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showTablesActionPerformed
        showTables win = new showTables();
        win.setVisible(true);
    }//GEN-LAST:event_showTablesActionPerformed

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

    private void loadobject(int function) {
        if (1 == booksTable.getSelectedRowCount()) {
            Object obj = booksTable.getSelectedRow();

            booksTable.getSelectedRow();
            String value = booksTable.getModel().getValueAt(booksTable.getSelectedRow(), 0).toString();
            System.out.println(value);
            open = new OptObject(this, function, parseInt(value));
            open.setVisible(true);
        }

        if (0 == function) {
            open = new OptObject(this, function, 0);
            open.setVisible(true);
        }
    }

    public void loadBooks() {
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
        repaint();
    }

    private void typeUserInterface(int type) {
        switch (type) {
            case 1:
                userOpt.setVisible(true);
                userOpt.setEnabled(true);
                
                adminOpt.setVisible(false);
                adminOpt.setEnabled(false);

                footer.setVisible(false);
                footer.setEnabled(false);
                break;

            case 2:
                lateralOptions.setVisible(false);
                lateralOptions.setEnabled(false);
                break;
                
            case 3:
                userOpt.setVisible(false);
                userOpt.setEnabled(false);
                
                adminOpt.setVisible(true);
                adminOpt.setEnabled(true);
                break;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JPanel adminOpt;
    private javax.swing.JPanel adminOptionsPanel;
    private javax.swing.JButton backButton;
    private javax.swing.JPanel bibliotecaryOptionsPanel;
    private javax.swing.JButton bookUpdateButton;
    private javax.swing.JTable booksTable;
    private javax.swing.JScrollPane elementsPanel;
    private javax.swing.JPanel footer;
    private javax.swing.JButton genreUpdateButton;
    private javax.swing.JPanel header;
    private javax.swing.JPanel lateralOptions;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField searchField;
    private javax.swing.JButton showBook;
    private javax.swing.JButton showTables;
    private javax.swing.JButton updateAuthorButton;
    private javax.swing.JButton updateEditorialButton;
    private javax.swing.JPanel userOpt;
    // End of variables declaration//GEN-END:variables
}
