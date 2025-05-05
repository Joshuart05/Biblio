/** * @authors Quezada Esteban Joshua Arturo
 *             Martínez Granados Emanuel
 *             Roldán López Christian Jair
 */

package front;

import back.Main;
import back.DbRequest;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
   private final Main mainWindow;
   
   DbRequest dbConsul = new DbRequest();

    public Login(Main parent){
        this.mainWindow = parent;
        initComponents();
    }

    private static String NAME_HINT = "Nombre...";
    private static String PASSWORD_HINT = "Contraseña...";
    private boolean[] flag = new boolean[1];

    private boolean ValidateComponentText(String field, String rule, String hint) {
        System.out.println("El field es:" + field + "La rule es: " + rule + "Y el hint es: " + hint);
        if (!field.equals("")) {
            if (!field.equals(hint)) {
                if (field.matches(rule)) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    private boolean ValidatePlaceHolder(JComponent component, String field, String rule, String hint) {
        if (ValidateComponentText(field, rule, hint)) {
            component.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 0), 2, true));
            return true;
        } else {
            component.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            return false;
        }
    }

    public Login() {
        initComponents();
       this.mainWindow = null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        container = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nameFiled = new javax.swing.JTextField();
        passField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        login = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Inicio de Sesion");
        setBackground(new java.awt.Color(255, 244, 236));
        setPreferredSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 244, 236));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel4.setBackground(new java.awt.Color(255, 244, 236));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.PAGE_AXIS));

        container.setBackground(new java.awt.Color(255, 244, 236));
        container.setLayout(new javax.swing.BoxLayout(container, javax.swing.BoxLayout.PAGE_AXIS));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Ingresa tus datos");
        container.add(jLabel1);

        nameFiled.setBackground(new java.awt.Color(102, 102, 102));
        nameFiled.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nameFiled.setForeground(new java.awt.Color(255, 255, 255));
        nameFiled.setText("Nombre...");
        nameFiled.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(204, 204, 204)));
        nameFiled.setPreferredSize(new java.awt.Dimension(600, 100));
        nameFiled.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameFiledFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameFiledFocusLost(evt);
            }
        });
        container.add(nameFiled);

        passField.setBackground(new java.awt.Color(102, 102, 102));
        passField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        passField.setForeground(new java.awt.Color(255, 255, 255));
        passField.setText("Contraseña...");
        passField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(204, 204, 204)));
        passField.setPreferredSize(new java.awt.Dimension(600, 100));
        passField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passFieldFocusLost(evt);
            }
        });
        container.add(passField);

        jPanel2.setBackground(new java.awt.Color(255, 244, 236));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        login.setBackground(new java.awt.Color(0, 102, 102));
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Entrar");
        login.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));
        login.setBorderPainted(false);
        login.setMaximumSize(new java.awt.Dimension(72, 50));
        login.setPreferredSize(new java.awt.Dimension(200, 100));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel2.add(login);

        jPanel3.setBackground(new java.awt.Color(255, 244, 236));

        back.setBackground(new java.awt.Color(255, 102, 102));
        back.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("<< Regresar");
        back.setActionCommand("Regresar");
        back.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 1, true));
        back.setBorderPainted(false);
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.setPreferredSize(new java.awt.Dimension(125, 50));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel3.add(back);

        jPanel2.add(jPanel3);

        container.add(jPanel2);

        jPanel4.add(container);

        jPanel1.add(jPanel4, new java.awt.GridBagConstraints());

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Name
    private void nameFiledFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFiledFocusGained
        String field = nameFiled.getText();
        ValidatePlaceHolder(nameFiled, field, field, NAME_HINT);
        if (ValidateComponentText(field, field, NAME_HINT)) {
        } else {
            nameFiled.setText("");
        }
    }//GEN-LAST:event_nameFiledFocusGained

    private void nameFiledFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFiledFocusLost
        String field = nameFiled.getText();
        flag[0] = ValidatePlaceHolder(nameFiled, field, field, NAME_HINT);
        if (field.equals(""))
            nameFiled.setText(NAME_HINT);
    }//GEN-LAST:event_nameFiledFocusLost

    //Pass
    private void passFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFieldFocusGained
        String field = passField.getText();
        ValidatePlaceHolder(passField, field, field, PASSWORD_HINT);
        if (ValidateComponentText(field, field, PASSWORD_HINT)) {
        } else {
            passField.setText("");
        }
    }//GEN-LAST:event_passFieldFocusGained

    private void passFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFieldFocusLost
        String field = passField.getText();
        flag[1] = ValidatePlaceHolder(passField, field, field, PASSWORD_HINT);
        if (field.equals(""))
            passField.setText(PASSWORD_HINT);
    }//GEN-LAST:event_passFieldFocusLost

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
         if(flagCompare()){
            String name = nameFiled.getText();
            String pass = passField.getText();
            
             try {
                 int type = dbConsul.loginUser(name, pass);
                 mainWindow.setUserType(type);
                 
                 if(type != 0){
                     mainWindow.showMain(true);
                     passField.setText(PASSWORD_HINT);
                     this.setVisible(false);
                 } else {
                     JOptionPane.showMessageDialog(this, "Tus credenciales son incorrectas", "Error", JOptionPane.ERROR_MESSAGE);
                 }} catch (SQLException ex) {
                 Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                 System.out.println("No encontrado");
                    JOptionPane.showMessageDialog(this, "Tus credenciales son incorrectas", "Error", JOptionPane.ERROR_MESSAGE);
             }
        }
    }//GEN-LAST:event_loginActionPerformed

    private boolean flagCompare() {
        int list = 0;
        for (boolean f : flag) {
            if (f) {
                list++;
            }
        }

        System.out.println(list);

        if (list < 1) {
            return false;
        } else {
            return true;
        }
    }

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
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login(new Main()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton login;
    private javax.swing.JTextField nameFiled;
    private javax.swing.JTextField passField;
    // End of variables declaration//GEN-END:variables
}
