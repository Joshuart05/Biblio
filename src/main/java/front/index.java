/** * @authors Quezada Esteban Joshua Arturo
 *             Martínez Granados Emanuel
 *             Roldán López Christian Jair
 */

package front;

import back.Main;
import static java.lang.System.exit;
import javax.swing.JRootPane;

public class index extends javax.swing.JFrame {
    
    private final Main mainWindow;
    private final Sign windowSign;
    private final Login windowLogin;
    
    public index(Main parent) {
        this.mainWindow = parent;
        initComponents();
        this.windowSign = new Sign();
        this.windowLogin = new Login(parent); // PASAS EL CONTROLADOR
    }

    //Sign windowSign = new Sign();
    //Login windowLogin = new Login();
    //MainFrameController optionMainFrame = new MainFrameController();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcome = new javax.swing.JPanel();
        welcomeText = new javax.swing.JLabel();
        personalUserText = new javax.swing.JPanel();
        gestor = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        instructions = new javax.swing.JPanel();
        Info = new javax.swing.JLabel();
        options = new javax.swing.JPanel();
        signUp = new javax.swing.JButton();
        login = new javax.swing.JButton();
        info = new javax.swing.JPanel();
        infoText = new javax.swing.JLabel();
        outGestorButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Gestor Bibliotecario | UAEH");
        setBackground(new java.awt.Color(255, 244, 236));
        setLocation(new java.awt.Point(0, 0));
        setPreferredSize(new java.awt.Dimension(1000, 600));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        welcome.setBackground(new java.awt.Color(255, 244, 236));
        welcome.setForeground(new java.awt.Color(255, 255, 255));

        welcomeText.setBackground(new java.awt.Color(255, 244, 236));
        welcomeText.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        welcomeText.setForeground(new java.awt.Color(102, 102, 102));
        welcomeText.setText("Bienvenido...");
        welcomeText.setFocusable(false);
        welcomeText.setPreferredSize(new java.awt.Dimension(100, 30));

        personalUserText.setBackground(new java.awt.Color(255, 244, 236));
        personalUserText.setForeground(new java.awt.Color(255, 255, 255));

        gestor.setBackground(new java.awt.Color(51, 51, 51));
        gestor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        gestor.setForeground(new java.awt.Color(102, 102, 102));
        gestor.setText("Gestor Bibliotecario");
        gestor.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        user.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        user.setForeground(new java.awt.Color(102, 102, 102));
        user.setText("Para UAEH");
        user.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        user.setFocusable(false);

        javax.swing.GroupLayout personalUserTextLayout = new javax.swing.GroupLayout(personalUserText);
        personalUserText.setLayout(personalUserTextLayout);
        personalUserTextLayout.setHorizontalGroup(
            personalUserTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personalUserTextLayout.createSequentialGroup()
                .addGroup(personalUserTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, personalUserTextLayout.createSequentialGroup()
                        .addContainerGap(64, Short.MAX_VALUE)
                        .addComponent(gestor))
                    .addGroup(personalUserTextLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        personalUserTextLayout.setVerticalGroup(
            personalUserTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personalUserTextLayout.createSequentialGroup()
                .addComponent(gestor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout welcomeLayout = new javax.swing.GroupLayout(welcome);
        welcome.setLayout(welcomeLayout);
        welcomeLayout.setHorizontalGroup(
            welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, welcomeLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(welcomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 723, Short.MAX_VALUE)
                .addComponent(personalUserText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        welcomeLayout.setVerticalGroup(
            welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, welcomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(personalUserText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(welcomeText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64))
        );

        getContentPane().add(welcome);

        instructions.setBackground(new java.awt.Color(255, 244, 236));
        instructions.setForeground(new java.awt.Color(255, 255, 255));

        Info.setBackground(new java.awt.Color(255, 244, 236));
        Info.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Info.setForeground(new java.awt.Color(102, 102, 102));
        Info.setText("Entra o Registrate para poder entrar...");

        javax.swing.GroupLayout instructionsLayout = new javax.swing.GroupLayout(instructions);
        instructions.setLayout(instructionsLayout);
        instructionsLayout.setHorizontalGroup(
            instructionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(instructionsLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(Info, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1030, Short.MAX_VALUE))
        );
        instructionsLayout.setVerticalGroup(
            instructionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(instructionsLayout.createSequentialGroup()
                .addComponent(Info, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 84, Short.MAX_VALUE))
        );

        getContentPane().add(instructions);

        options.setBackground(new java.awt.Color(51, 51, 51));
        options.setForeground(new java.awt.Color(255, 244, 236));
        options.setMaximumSize(new java.awt.Dimension(900, 150));
        options.setMinimumSize(new java.awt.Dimension(300, 23));
        options.setPreferredSize(new java.awt.Dimension(300, 50));
        options.setLayout(new java.awt.BorderLayout());

        signUp.setBackground(new java.awt.Color(255, 255, 255));
        signUp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        signUp.setForeground(new java.awt.Color(0, 0, 0));
        signUp.setText("Registrarse");
        signUp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        signUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signUp.setMaximumSize(new java.awt.Dimension(9999, 99999));
        signUp.setMinimumSize(new java.awt.Dimension(120, 18));
        signUp.setPreferredSize(new java.awt.Dimension(120, 18));
        signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpActionPerformed(evt);
            }
        });
        options.add(signUp, java.awt.BorderLayout.LINE_END);

        login.setBackground(new java.awt.Color(255, 255, 255));
        login.setFont(login.getFont().deriveFont(login.getFont().getStyle() | java.awt.Font.BOLD));
        login.setForeground(new java.awt.Color(0, 0, 0));
        login.setText("Entrar");
        login.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login.setMaximumSize(new java.awt.Dimension(9999, 9999));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        options.add(login, java.awt.BorderLayout.CENTER);

        getContentPane().add(options);

        info.setBackground(new java.awt.Color(255, 244, 236));

        infoText.setBackground(new java.awt.Color(51, 51, 51));
        infoText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        infoText.setForeground(new java.awt.Color(102, 102, 102));
        infoText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoText.setText("Todos Los Derechos Reservados de Este Software a JJEC SA de CV");
        infoText.setFocusable(false);
        infoText.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        outGestorButton.setBackground(new java.awt.Color(255, 102, 102));
        outGestorButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        outGestorButton.setForeground(new java.awt.Color(255, 255, 255));
        outGestorButton.setText("Salir");
        outGestorButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 1, true));
        outGestorButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        outGestorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outGestorButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout infoLayout = new javax.swing.GroupLayout(info);
        info.setLayout(infoLayout);
        infoLayout.setHorizontalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(infoText, javax.swing.GroupLayout.DEFAULT_SIZE, 1337, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(outGestorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        infoLayout.setVerticalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoLayout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(outGestorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(infoText))
        );

        getContentPane().add(info);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        windowLogin.setVisible(true);
        buttonsShow(false);
    }//GEN-LAST:event_loginActionPerformed

    private void signUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpActionPerformed
        windowSign.setVisible(true);
        buttonsShow(false);
    }//GEN-LAST:event_signUpActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        
        boolean compare = mainWindow.MainIsActive();
        System.out.println(compare);
        if(false == compare){
            windowSign.dispose();
            windowLogin.dispose();
            mainWindow.destroyMainFrame();
            buttonsShow(true);
        }
    }//GEN-LAST:event_formFocusGained

    
    
    private void outGestorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outGestorButtonActionPerformed
        exit(0);
    }//GEN-LAST:event_outGestorButtonActionPerformed
    
    private void buttonsShow(boolean opt){
        signUp.setEnabled(opt);
        login.setEnabled(opt);
        outGestorButton.setEnabled(opt);
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new index(new Main()).setVisible(true); //  Le pasas un Main
        }
    });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Info;
    private javax.swing.JLabel gestor;
    private javax.swing.JPanel info;
    private javax.swing.JLabel infoText;
    private javax.swing.JPanel instructions;
    private javax.swing.JButton login;
    private javax.swing.JPanel options;
    private javax.swing.JButton outGestorButton;
    private javax.swing.JPanel personalUserText;
    private javax.swing.JButton signUp;
    private javax.swing.JLabel user;
    private javax.swing.JPanel welcome;
    private javax.swing.JLabel welcomeText;
    // End of variables declaration//GEN-END:variables

}
