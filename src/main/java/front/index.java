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
        setLocation(new java.awt.Point(0, 0));
        setPreferredSize(new java.awt.Dimension(1000, 600));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.PAGE_AXIS));

        welcomeText.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        welcomeText.setText("Bienvenido...");
        welcomeText.setFocusable(false);
        welcomeText.setPreferredSize(new java.awt.Dimension(100, 30));

        gestor.setText("Gestor Bibliotecario");
        gestor.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

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
                .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout welcomeLayout = new javax.swing.GroupLayout(welcome);
        welcome.setLayout(welcomeLayout);
        welcomeLayout.setHorizontalGroup(
            welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, welcomeLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(welcomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 468, Short.MAX_VALUE)
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

        Info.setText("Entra o Registrate para poder entrar");

        javax.swing.GroupLayout instructionsLayout = new javax.swing.GroupLayout(instructions);
        instructions.setLayout(instructionsLayout);
        instructionsLayout.setHorizontalGroup(
            instructionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(instructionsLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(Info, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(581, Short.MAX_VALUE))
        );
        instructionsLayout.setVerticalGroup(
            instructionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(instructionsLayout.createSequentialGroup()
                .addComponent(Info, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(instructions);

        options.setMaximumSize(new java.awt.Dimension(900, 150));
        options.setMinimumSize(new java.awt.Dimension(300, 23));
        options.setPreferredSize(new java.awt.Dimension(300, 50));
        options.setLayout(new java.awt.BorderLayout());

        signUp.setText("Registrarse");
        signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpActionPerformed(evt);
            }
        });
        options.add(signUp, java.awt.BorderLayout.LINE_END);

        login.setText("Entrar");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        options.add(login, java.awt.BorderLayout.CENTER);

        getContentPane().add(options);

        infoText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoText.setText("Todos Los Derechos Reservados de Este Software a JJEC SA de CV");
        infoText.setFocusable(false);
        infoText.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        outGestorButton.setText("Salir");
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
                .addComponent(infoText, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(outGestorButton)
                .addGap(21, 21, 21))
        );
        infoLayout.setVerticalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoLayout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addComponent(outGestorButton)
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
