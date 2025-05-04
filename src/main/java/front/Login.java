package front;

import back.Main;
import back.DbRequest;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JOptionPane;


/**
 *
 * @author joshu
 */
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
            component.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 0), 1, true));
            return true;
        } else {
            component.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
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
        jLabel1 = new javax.swing.JLabel();
        nameFiled = new javax.swing.JTextField();
        passField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        login = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Inicio de Sesion");
        setPreferredSize(new java.awt.Dimension(1800, 1000));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.PAGE_AXIS));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Ingresa tus datos");
        jPanel1.add(jLabel1);

        nameFiled.setText("Nombre...");
        nameFiled.setPreferredSize(new java.awt.Dimension(600, 100));
        nameFiled.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameFiledFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameFiledFocusLost(evt);
            }
        });
        jPanel1.add(nameFiled);

        passField.setText("Contraseña...");
        passField.setPreferredSize(new java.awt.Dimension(600, 100));
        passField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passFieldFocusLost(evt);
            }
        });
        jPanel1.add(passField);

        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        login.setText("Entrar");
        login.setPreferredSize(new java.awt.Dimension(200, 100));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel2.add(login);

        back.setText("<< Regresar");
        back.setActionCommand("Regresar");
        back.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 51)));
        back.setPreferredSize(new java.awt.Dimension(125, 50));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel3.add(back);

        jPanel2.add(jPanel3);

        jPanel1.add(jPanel2);

        getContentPane().add(jPanel1, new java.awt.GridBagConstraints());

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton login;
    private javax.swing.JTextField nameFiled;
    private javax.swing.JTextField passField;
    // End of variables declaration//GEN-END:variables
}
