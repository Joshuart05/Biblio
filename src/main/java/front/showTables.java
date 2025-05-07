/** * @authors Quezada Esteban Joshua Arturo
 *             Martínez Granados Emanuel
 *             Roldán López Christian Jair
 */
package front;

import back.DbRequest;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import models.Autor;
import models.Editorial;
import models.Genero;

public class showTables extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
    private DefaultTableModel genre;
    private DefaultTableModel author;
    private DefaultTableModel editorial;
    DbRequest dbConsul = new DbRequest();

    public showTables() {
        initComponents();
        System.out.println("Table load");
        genre = (DefaultTableModel) genreTableModel.getModel();
        author = (DefaultTableModel) authorTableModel.getModel();
        editorial = (DefaultTableModel) editorialTableModel.getModel();
        chargeBoxes();
        backButton.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FramePanel = new javax.swing.JPanel();
        ComboPanel = new javax.swing.JPanel();
        tableType = new javax.swing.JComboBox<>();
        footer = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        content = new javax.swing.JPanel();
        genrePanel = new javax.swing.JPanel();
        genreTable = new javax.swing.JScrollPane();
        genreTableModel = new javax.swing.JTable();
        authorPanel = new javax.swing.JPanel();
        authorTable = new javax.swing.JScrollPane();
        authorTableModel = new javax.swing.JTable();
        editorialPanel = new javax.swing.JPanel();
        editorialTable = new javax.swing.JScrollPane();
        editorialTableModel = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tablas");
        setBackground(new java.awt.Color(255, 244, 236));
        setPreferredSize(new java.awt.Dimension(1500, 800));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new java.awt.CardLayout());

        FramePanel.setLayout(new java.awt.BorderLayout());

        ComboPanel.setBackground(new java.awt.Color(255, 244, 236));
        ComboPanel.setLayout(new java.awt.GridLayout(1, 0));

        tableType.setBackground(new java.awt.Color(80, 84, 84));
        tableType.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tableType.setForeground(new java.awt.Color(204, 204, 204));
        tableType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Genero", "Autor", "Editorial" }));
        tableType.setPreferredSize(new java.awt.Dimension(77, 60));
        tableType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableTypeActionPerformed(evt);
            }
        });
        ComboPanel.add(tableType);

        FramePanel.add(ComboPanel, java.awt.BorderLayout.PAGE_START);

        footer.setLayout(new java.awt.CardLayout());

        backButton.setBackground(new java.awt.Color(255, 51, 51));
        backButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("<< Regresar");
        backButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        backButton.setBorderPainted(false);
        backButton.setMaximumSize(new java.awt.Dimension(755555, 23333));
        backButton.setPreferredSize(new java.awt.Dimension(75, 40));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        footer.add(backButton, "card2");

        FramePanel.add(footer, java.awt.BorderLayout.PAGE_END);

        content.setLayout(new java.awt.CardLayout());

        genrePanel.setLayout(new java.awt.GridLayout(1, 0));

        genreTableModel.setBackground(new java.awt.Color(255, 244, 236));
        genreTableModel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        genreTableModel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Descripcion", "Edad Recomendada"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        genreTableModel.setGridColor(new java.awt.Color(255, 244, 236));
        genreTableModel.setSelectionBackground(new java.awt.Color(102, 102, 102));
        genreTableModel.setSelectionForeground(new java.awt.Color(255, 255, 255));
        genreTable.setViewportView(genreTableModel);

        genrePanel.add(genreTable);

        content.add(genrePanel, "card3");

        authorPanel.setLayout(new java.awt.GridLayout(1, 0));

        authorTableModel.setBackground(new java.awt.Color(255, 244, 236));
        authorTableModel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellidos", "Nacionalidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        authorTableModel.setGridColor(new java.awt.Color(255, 244, 236));
        authorTableModel.setSelectionBackground(new java.awt.Color(102, 102, 102));
        authorTableModel.setSelectionForeground(new java.awt.Color(255, 255, 255));
        authorTable.setViewportView(authorTableModel);

        authorPanel.add(authorTable);

        content.add(authorPanel, "card2");

        editorialPanel.setLayout(new java.awt.GridLayout(1, 0));

        editorialTableModel.setBackground(new java.awt.Color(255, 244, 236));
        editorialTableModel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Direccion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        editorialTableModel.setGridColor(new java.awt.Color(255, 244, 236));
        editorialTableModel.setSelectionBackground(new java.awt.Color(102, 102, 102));
        editorialTableModel.setSelectionForeground(new java.awt.Color(255, 255, 255));
        editorialTable.setViewportView(editorialTableModel);

        editorialPanel.add(editorialTable);

        content.add(editorialPanel, "card4");

        FramePanel.add(content, java.awt.BorderLayout.CENTER);

        getContentPane().add(FramePanel, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void tableTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableTypeActionPerformed
        switch ((String) tableType.getSelectedItem()) {
            case "Genero":
                genrePanel.setVisible(true);
                authorPanel.setVisible(false);
                editorialPanel.setVisible(false);
                break;

            case "Autor":
                genrePanel.setVisible(false);
                authorPanel.setVisible(true);
                editorialPanel.setVisible(false);
                break;

            case "Editorial":
                genrePanel.setVisible(false);
                authorPanel.setVisible(false);
                editorialPanel.setVisible(true);
                break;
        }
    }//GEN-LAST:event_tableTypeActionPerformed

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
            java.util.logging.Logger.getLogger(showTables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(showTables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(showTables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(showTables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new showTables().setVisible(true);
            }
        });
    }

    private void chargeBoxes() {
        // Load Authors
        List<Autor> authors = dbConsul.requestAutors();
        author.setRowCount(0);
        for (Autor book : authors) {
            author.addRow(new Object[]{
                book.getId(),
                book.getNombre(),
                book.getApellidos(),
                book.getNacionalidad()
            });
        }

        // Load Genres
        List<Genero> genres = dbConsul.requestGenders();
        genre.setRowCount(0);
        for (Genero book : genres) {
            genre.addRow(new Object[]{
                book.getId(),
                book.getNombre(),
                book.getDescripcion(),
                book.getEdadRecomendada() + "+ Años"
            });
        }

        // Load Editorials
        List<Editorial> editorials = dbConsul.requestEditors();
        editorial.setRowCount(0);
        for (Editorial book : editorials) {
            editorial.addRow(new Object[]{
                book.getId(),
                book.getNombre(),
                book.getDireccion()
            });
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ComboPanel;
    private javax.swing.JPanel FramePanel;
    private javax.swing.JPanel authorPanel;
    private javax.swing.JScrollPane authorTable;
    private javax.swing.JTable authorTableModel;
    private javax.swing.JButton backButton;
    private javax.swing.JPanel content;
    private javax.swing.JPanel editorialPanel;
    private javax.swing.JScrollPane editorialTable;
    private javax.swing.JTable editorialTableModel;
    private javax.swing.JPanel footer;
    private javax.swing.JPanel genrePanel;
    private javax.swing.JScrollPane genreTable;
    private javax.swing.JTable genreTableModel;
    private javax.swing.JComboBox<String> tableType;
    // End of variables declaration//GEN-END:variables
}
