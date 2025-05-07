/** * @authors Quezada Esteban Joshua Arturo
 *             Martínez Granados Emanuel
 *             Roldán López Christian Jair
 */
package front;

import back.DbRequest;
import back.Main;
import models.Libro;

public class ShowBook extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
    private final Main main;
    private int idObj;
    private Libro book;
    DbRequest dbConsul = new DbRequest();
    
    public ShowBook(Main parent, int id) {
        this.main = parent;
        loadBook(id);
        initComponents();
        setTitle(book.getTitulo());
    }
    
    public void loadBook(int idObj){
        book = dbConsul.searchBook(idObj);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        reserveButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        nameLa = new javax.swing.JLabel();
        authorLa = new javax.swing.JLabel();
        editorialYearLa = new javax.swing.JLabel();
        genreLa = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        amountLa = new javax.swing.JLabel();
        addressLa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Libro");
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 244, 236));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new java.awt.GridLayout());

        reserveButton.setBackground(new java.awt.Color(80, 84, 84));
        reserveButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        reserveButton.setForeground(new java.awt.Color(204, 204, 204));
        reserveButton.setText("Reservar");
        reserveButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        reserveButton.setBorderPainted(false);
        reserveButton.setMaximumSize(new java.awt.Dimension(7995, 8000));
        reserveButton.setPreferredSize(new java.awt.Dimension(75, 70));
        reserveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserveButtonActionPerformed(evt);
            }
        });
        jPanel2.add(reserveButton);

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setBackground(new java.awt.Color(255, 244, 236));
        jPanel3.setForeground(new java.awt.Color(102, 102, 102));

        nameLa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nameLa.setForeground(new java.awt.Color(102, 102, 102));
        nameLa.setText(book.getTitulo());

        authorLa.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        authorLa.setForeground(new java.awt.Color(102, 102, 102));
        authorLa.setText(book.getAutor());

        editorialYearLa.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        editorialYearLa.setForeground(new java.awt.Color(102, 102, 102));
        editorialYearLa.setText(book.getEditorial() + " | " + book.getAnio());

        genreLa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        genreLa.setForeground(new java.awt.Color(102, 102, 102));
        genreLa.setText(book.getGenero());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Disponibles:");

        amountLa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        amountLa.setForeground(new java.awt.Color(102, 102, 102));
        amountLa.setText("" + book.getCopiasDisponibles());

        addressLa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addressLa.setForeground(new java.awt.Color(102, 102, 102));
        addressLa.setText(book.getUbicacion());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(authorLa, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(genreLa)
                                    .addComponent(editorialYearLa)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(amountLa))
                            .addComponent(nameLa, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressLa))))
                .addContainerGap(380, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(nameLa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(authorLa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editorialYearLa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(genreLa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(amountLa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addressLa)
                .addGap(140, 140, 140))
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reserveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserveButtonActionPerformed
        System.out.println(book.getId()+ "<>" +main.showIdUser());
        dbConsul.createReserve(main.showIdUser(), book.getId());
    }//GEN-LAST:event_reserveButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ShowBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(int id) {
                new ShowBook(new Main(), id).setVisible(true);
            }

            @Override
            public void run() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLa;
    private javax.swing.JLabel amountLa;
    private javax.swing.JLabel authorLa;
    private javax.swing.JLabel editorialYearLa;
    private javax.swing.JLabel genreLa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel nameLa;
    private javax.swing.JButton reserveButton;
    // End of variables declaration//GEN-END:variables
}
