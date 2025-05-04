package front;

import back.DbRequest;
import static java.lang.Integer.parseInt;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author joshu
 */
public class Sign extends javax.swing.JFrame {

    DbRequest dbConsul = new DbRequest();
    private static String NAME_HINT = "Nombre...";
    private static String EMAIL_HINT = "Email...";
    private static String PHONE_HINT = "Telefono...";
    private static String LASTNAME_HINT = "Apellido...";
    private static String ADDRESS_HINT = "Direccion...";
    private static String NIP_HINT = "....";
    private static String PASSWORD_HINT = "......";
    private boolean[] flag = new boolean[9];

    public Sign() {
        initComponents();
        turnOffSpecificObjects();
        details.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jToggleButton1 = new javax.swing.JToggleButton();
        textPageTitleContext = new javax.swing.JLabel();
        infoText = new javax.swing.JLabel();
        pageButtons = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        formButtons = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        details = new javax.swing.JLabel();
        emptyButton = new javax.swing.JButton();
        signButton = new javax.swing.JButton();
        formUser = new javax.swing.JPanel();
        name = new javax.swing.JTextField();
        lastName = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        phoneNumber = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        direction = new javax.swing.JTextArea();
        userType = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        adminNipInfoText = new javax.swing.JLabel();
        adminNip = new javax.swing.JPasswordField();
        nipInfoText = new javax.swing.JLabel();
        nip = new javax.swing.JPasswordField();
        nipInfoTextValidate = new javax.swing.JLabel();
        nipValidate = new javax.swing.JPasswordField();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Registrarse");
        setLocation(new java.awt.Point(0, 0));
        setPreferredSize(new java.awt.Dimension(1800, 1000));

        textPageTitleContext.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textPageTitleContext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textPageTitleContext.setText("Registrarse");
        textPageTitleContext.setFocusable(false);
        textPageTitleContext.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(textPageTitleContext, java.awt.BorderLayout.PAGE_START);

        infoText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoText.setText("Todos Los Derechos Reservados de Este Software a JJEC SA de CV");
        infoText.setFocusable(false);
        infoText.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(infoText, java.awt.BorderLayout.PAGE_END);

        back.setText("<< Regresar");
        back.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        back.setMaximumSize(new java.awt.Dimension(83, 23));
        back.setMinimumSize(new java.awt.Dimension(83, 23));
        back.setPreferredSize(new java.awt.Dimension(87, 23));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pageButtonsLayout = new javax.swing.GroupLayout(pageButtons);
        pageButtons.setLayout(pageButtonsLayout);
        pageButtonsLayout.setHorizontalGroup(
            pageButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pageButtonsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pageButtonsLayout.setVerticalGroup(
            pageButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pageButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(284, Short.MAX_VALUE))
        );

        getContentPane().add(pageButtons, java.awt.BorderLayout.LINE_START);

        formButtons.setLayout(new javax.swing.BoxLayout(formButtons, javax.swing.BoxLayout.Y_AXIS));

        jPanel1.setLayout(new java.awt.GridLayout(0, 1));

        details.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        details.setText("Detalles");
        jPanel1.add(details);

        emptyButton.setText("Vaciar Todo");
        emptyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emptyButtonActionPerformed(evt);
            }
        });
        jPanel1.add(emptyButton);

        signButton.setText("Registrarse");
        signButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signButtonActionPerformed(evt);
            }
        });
        jPanel1.add(signButton);

        formButtons.add(jPanel1);

        getContentPane().add(formButtons, java.awt.BorderLayout.LINE_END);

        formUser.setLayout(new java.awt.GridLayout(0, 1));

        name.setText("Nombre...");
        name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameFocusLost(evt);
            }
        });
        formUser.add(name);

        lastName.setText("Apellido...");
        lastName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        lastName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lastNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lastNameFocusLost(evt);
            }
        });
        formUser.add(lastName);

        email.setText("Email...");
        email.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFocusLost(evt);
            }
        });
        formUser.add(email);

        phoneNumber.setText("Telefono...");
        phoneNumber.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        phoneNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                phoneNumberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                phoneNumberFocusLost(evt);
            }
        });
        formUser.add(phoneNumber);

        direction.setColumns(20);
        direction.setRows(5);
        direction.setText("Direccion...");
        direction.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        direction.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                directionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                directionFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(direction);

        formUser.add(jScrollPane1);

        userType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estudiante", "Bibliotecario", "Administrativo" }));
        userType.setBorder(null);
        userType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTypeActionPerformed(evt);
            }
        });
        formUser.add(userType);

        jLabel1.setText("Escribe una contraseña con al menos 6 caracteres");
        formUser.add(jLabel1);

        password.setText("......");
        password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFocusLost(evt);
            }
        });
        formUser.add(password);

        adminNipInfoText.setText("Para poder registrarte como Bibliotecario, requieres la llave de una persona autorizada");
        adminNipInfoText.setToolTipText("");
        adminNipInfoText.setAutoscrolls(true);
        adminNipInfoText.setFocusable(false);
        formUser.add(adminNipInfoText);

        adminNip.setText("....");
        adminNip.setToolTipText("");
        adminNip.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        adminNip.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                adminNipFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                adminNipFocusLost(evt);
            }
        });
        formUser.add(adminNip);

        nipInfoText.setText("Para registrate como Administrativo necesitasas tu propia llave unica de registro (5 digitos)");
        nipInfoText.setFocusable(false);
        formUser.add(nipInfoText);

        nip.setText("....");
        nip.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
        nip.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nipFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nipFocusLost(evt);
            }
        });
        formUser.add(nip);

        nipInfoTextValidate.setText("Confirma tu llave");
        nipInfoTextValidate.setFocusable(false);
        formUser.add(nipInfoTextValidate);

        nipValidate.setText("....");
        nipValidate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
        nipValidate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nipValidateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nipValidateFocusLost(evt);
            }
        });
        formUser.add(nipValidate);

        getContentPane().add(formUser, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Name Obtain Focus
    private void nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFocusGained
        if (name.getText().equals(NAME_HINT)) {
            name.setText("");
        }
    }//GEN-LAST:event_nameFocusGained

    private void nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFocusLost
        if (name.getText().isEmpty()) {
            name.setText(NAME_HINT);
            name.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 10, 1, new java.awt.Color(153, 0, 0)));
            flag[0] = false;
        } else {
            name.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 10, 1, new java.awt.Color(0, 153, 0)));
            flag[0] = true;
        }
        System.out.println("Bandera 0 Nombre es: " + flag[0]);
    }//GEN-LAST:event_nameFocusLost

    //Email Obtain Focus
    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
        if (email.getText().equals(EMAIL_HINT)) {
            email.setText("");
        }
    }//GEN-LAST:event_emailFocusGained

    private void emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusLost
        if (email.getText().isEmpty()) {
            email.setText(EMAIL_HINT);
            email.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 10, 1, new java.awt.Color(153, 0, 0)));
            flag[1] = false;
        } else if (email.getText().matches("[-\\w\\.]+@\\w+\\.\\w+")) {
            email.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 10, 1, new java.awt.Color(0, 153, 0)));
            flag[1] = true;
        } else {
            email.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 10, 1, new java.awt.Color(153, 0, 0)));
            flag[1] = false;
        }
        System.out.println("Bandera 1 email es: " + flag[1]);
    }//GEN-LAST:event_emailFocusLost

    //Phone Number Obtain Focus
    private void phoneNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneNumberFocusGained
        if (phoneNumber.getText().equals(PHONE_HINT)) {
            phoneNumber.setText("");
        }
    }//GEN-LAST:event_phoneNumberFocusGained

    private void phoneNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneNumberFocusLost
        if (phoneNumber.getText().isEmpty()) {
            phoneNumber.setText(PHONE_HINT);
            phoneNumber.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 10, 1, new java.awt.Color(153, 0, 0)));
            flag[2] = false;
        } else if (phoneNumber.getText().matches("[0-9]+")) {
            phoneNumber.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 10, 1, new java.awt.Color(0, 153, 0)));
            flag[2] = true;
        } else {
            phoneNumber.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 10, 1, new java.awt.Color(153, 0, 0)));
            flag[2] = false;
        }
        System.out.println("Bandera 2 numero es: " + flag[2]);
    }//GEN-LAST:event_phoneNumberFocusLost

    //Direction Obtain Focus
    private void directionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_directionFocusGained
        if (direction.getText().equals(ADDRESS_HINT)) {
            direction.setText("");
        }
    }//GEN-LAST:event_directionFocusGained

    private void directionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_directionFocusLost
        if (direction.getText().isEmpty()) {
            direction.setText(ADDRESS_HINT);
            direction.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 10, 1, new java.awt.Color(153, 0, 0)));
            flag[3] = false;
        } else {
            direction.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 10, 1, new java.awt.Color(0, 153, 0)));
            flag[3] = true;
        }
        System.out.println("Bandera 3 direccion es: " + flag[3]);
    }//GEN-LAST:event_directionFocusLost

    //ADmin nip Obtain Focus
    private void adminNipFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_adminNipFocusGained
        String pass = String.valueOf(adminNip.getPassword());
        if (pass.equals(NIP_HINT)) {
            adminNip.setText("");
        }
    }//GEN-LAST:event_adminNipFocusGained

    private void adminNipFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_adminNipFocusLost
        String pass = String.valueOf(adminNip.getPassword());
        if (pass.isEmpty()) {
            adminNip.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 10, 1, new java.awt.Color(153, 0, 0)));
            flag[4] = false;
        } else {
            adminNip.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 10, 1, new java.awt.Color(0, 0, 0)));
            flag[4] = true;
        }
    }//GEN-LAST:event_adminNipFocusLost

    //nip Obtain Focus
    private void nipFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nipFocusGained
        String pass = String.valueOf(nip.getPassword());
        if (pass.equals(NIP_HINT)) {
            nip.setText("");
        }
    }//GEN-LAST:event_nipFocusGained

    private void nipFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nipFocusLost
        String pass = String.valueOf(nip.getPassword());
        if (pass.isEmpty()) {
            nip.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 10, 1, new java.awt.Color(153, 0, 0)));
            flag[5] = false;
        } else if (5 == pass.length() && pass.matches("[0-9]+")) {
            nip.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 10, 1, new java.awt.Color(0, 153, 0)));
            flag[5] = true;
        } else {
            nip.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 10, 1, new java.awt.Color(153, 0, 0)));
            flag[5] = false;
        }

        System.out.println("Bandera 8 es: " + flag[5]);
    }//GEN-LAST:event_nipFocusLost

    //nip rec Obtain Focus
    private void nipValidateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nipValidateFocusGained
        String pass = String.valueOf(nip.getPassword());
        String nipPass = String.valueOf(nipValidate.getPassword());
        if (pass != nipPass) {
            nipValidate.setText("");
        }
    }//GEN-LAST:event_nipValidateFocusGained

    private void nipValidateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nipValidateFocusLost
        String pass = String.valueOf(nipValidate.getPassword());
        String nipPass = String.valueOf(nipValidate.getPassword());
        if (nipPass.isEmpty()) {
            nipValidate.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 10, 1, new java.awt.Color(153, 0, 0)));
            flag[6] = false;
        } else if (pass.equals(nipPass)) {
            nipValidate.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 10, 1, new java.awt.Color(0, 153, 0)));
            flag[6] = true;
        } else {
            nipValidate.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 10, 1, new java.awt.Color(153, 0, 0)));
            flag[6] = false;
        }
        System.out.println("Bandera 8 es: " + flag[6]);
    }//GEN-LAST:event_nipValidateFocusLost

    //password Obtain Focus
    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
        if (String.valueOf(password.getPassword()).equals(PASSWORD_HINT)) {
            password.setText("");
        }
    }//GEN-LAST:event_passwordFocusGained

    private void passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusLost
        String pass = String.valueOf(password.getPassword());
        if (pass.isEmpty()) {
            password.setText(PASSWORD_HINT);
            password.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 10, 1, new java.awt.Color(153, 0, 0)));
            flag[7] = false;
        } else if (pass.length() > 5) {
            password.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 10, 1, new java.awt.Color(0, 153, 0)));
            flag[7] = true;
        } else {
            password.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 10, 1, new java.awt.Color(153, 0, 0)));
            flag[7] = false;
        }
        System.out.println("Bandera 7 password es: " + flag[7]);
    }//GEN-LAST:event_passwordFocusLost

    private void showSpecificOptions(String type) {
        switch (type) {
            case "Estudiante":
                turnOffSpecificObjects();
                break;
            case "Bibliotecario":
                turnOffSpecificObjects();
                turnOnBibliotecary();
                break;
            case "Administrativo":
                turnOnAdmin();
                break;
        }
    }

    private boolean sign() throws SQLException {
        String type = (String) userType.getSelectedItem();
        int list = 0;
        for (boolean f : flag) {
            if (f) {
                list++;
            }
        }

        System.out.println(list);

        if (list < 6) {
            return false;
        }

        switch (type) {
            case "Estudiante":
                if (list == 6) {
                    String Name = name.getText();
                    String LastName = lastName.getText();
                    String Email = email.getText();
                    String PhoneNumber = phoneNumber.getText();
                    String Direction = direction.getText();
                    String pass = String.valueOf(password.getPassword());
                    System.out.println("Entro");
                    if (dbConsul.signUser(Name, Email, PhoneNumber, Direction, pass, LastName)) {
                        JOptionPane.showMessageDialog(null, "Agregado con exito");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Completa todos los campos", "Error de registro", JOptionPane.ERROR_MESSAGE);
                    System.out.println("Esto nodeberia");
                    return false;
                }

                break;
            case "Bibliotecario":
                if (list == 7) {
                    String Name = name.getText();
                    String LastName = lastName.getText();
                    String Email = email.getText();
                    String PhoneNumber = phoneNumber.getText();
                    String Direction = direction.getText();
                    String pass = String.valueOf(password.getPassword());
                    String Ddmin = String.valueOf(adminNip.getPassword());
                    System.out.println("Entro");

                    if (dbConsul.validateIdentify(Ddmin)) {
                        dbConsul.signUser(Name, LastName, Email, PhoneNumber, Direction, pass, 0, "Bbiliotecario");
                        JOptionPane.showMessageDialog(null, "Agregado con exito");
                    } else {
                        JOptionPane.showMessageDialog(this, "Ingresa un nip de administrador valido", "Error de registro", JOptionPane.ERROR_MESSAGE);
                        return false;
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Completa todos los campos", "Error de registro", JOptionPane.ERROR_MESSAGE);
                    return false;
                }

                break;
            case "Administrativo":
                if (list == 9) {
                    String Name = name.getText();
                    String LastName = lastName.getText();
                    String Email = email.getText();
                    String PhoneNumber = phoneNumber.getText();
                    String Direction = direction.getText();
                    String pass = String.valueOf(password.getPassword());
                    String Ddmin = String.valueOf(adminNip.getPassword());
                    int nip = parseInt(String.valueOf(nipValidate.getPassword()));
                    System.out.println("Entro");

                    if (dbConsul.validateIdentify(Ddmin)) {
                        dbConsul.signUser(Name, LastName, Email, PhoneNumber, Direction, pass, nip, "Administrador");
                        JOptionPane.showMessageDialog(null, "Agregado con exito");
                    } else {
                        JOptionPane.showMessageDialog(this, "Ingresa un nip de administrador valido", "Error de registro", JOptionPane.ERROR_MESSAGE);
                        return false;
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Completa todos los campos", "Error de registro", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
                break;
        }
        return true;
    }

    private void turnOffSpecificObjects() {
        adminNipInfoText.setVisible(false);
        adminNip.setVisible(false);
        nipInfoText.setVisible(false);
        nip.setVisible(false);
        nipInfoTextValidate.setVisible(false);
        nipValidate.setVisible(false);
    }

    private void turnOnAdmin() {
        adminNipInfoText.setVisible(true);
        adminNip.setVisible(true);
        nipInfoText.setVisible(true);
        nip.setVisible(true);
        nipInfoTextValidate.setVisible(true);
        nipValidate.setVisible(true);
    }

    private void signButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signButtonActionPerformed
        try {
            if (!sign()) {
                //JOptionPane.showMessageDialog(this, "Por favor, completa correctamente todos los campos requeridos.", "Error de registro", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Sign.class.getName()).log(Level.SEVERE, null, ex);
        }

        JOptionPane.showMessageDialog(this, "Usuario registrado exitosamente.", "Registro completo", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_signButtonActionPerformed

    private void userTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTypeActionPerformed
        String selected = (String) userType.getSelectedItem();
        turnOffSpecificObjects();
        toggleFieldsByUserType(selected);
    }//GEN-LAST:event_userTypeActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    //Empty Button
    private void emptyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emptyButtonActionPerformed
        clearForm();
    }//GEN-LAST:event_emptyButtonActionPerformed

    private void lastNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastNameFocusGained
        if (lastName.getText().equals(LASTNAME_HINT)) {
            lastName.setText("");
        }
    }//GEN-LAST:event_lastNameFocusGained

    private void lastNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastNameFocusLost
        if (lastName.getText().isEmpty()) {
            lastName.setText(LASTNAME_HINT);
            lastName.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 10, 1, new java.awt.Color(153, 0, 0)));
            flag[8] = false;
        } else {
            lastName.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 10, 1, new java.awt.Color(0, 153, 0)));
            flag[8] = true;
        }
        System.out.println("Bandera 8 apellido es: " + flag[8]);
    }//GEN-LAST:event_lastNameFocusLost

    private void turnOnBibliotecary() {
        adminNipInfoText.setVisible(true);
        adminNip.setVisible(true);
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
            java.util.logging.Logger.getLogger(Sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sign().setVisible(true);
            }
        });
    }

    private void clearForm() {
        // Campos de texto
        name.setText(NAME_HINT);
        email.setText("");
        phoneNumber.setText("");
        direction.setText("");

        // Campos de contraseña
        password.setText("");
        adminNip.setText("");
        nip.setText("");
        nipValidate.setText("");

        // Seleccionar "Estudiante" como opción por defecto
        userType.setSelectedItem("Estudiante");

        // Apagar campos condicionales
        turnOffSpecificObjects();
    }

    private void toggleFieldsByUserType(String type) {
        boolean isAdmin = type.equals("Administrativo");
        boolean isBiblio = type.equals("Bibliotecario");

        adminNipInfoText.setVisible(isAdmin || isBiblio);
        adminNip.setVisible(isAdmin || isBiblio);
        nipInfoText.setVisible(isAdmin);
        nip.setVisible(isAdmin);
        nipInfoTextValidate.setVisible(isAdmin);
        nipValidate.setVisible(isAdmin);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField adminNip;
    private javax.swing.JLabel adminNipInfoText;
    private javax.swing.JButton back;
    private javax.swing.JLabel details;
    private javax.swing.JTextArea direction;
    private javax.swing.JTextField email;
    private javax.swing.JButton emptyButton;
    private javax.swing.JPanel formButtons;
    private javax.swing.JPanel formUser;
    private javax.swing.JLabel infoText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField lastName;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField nip;
    private javax.swing.JLabel nipInfoText;
    private javax.swing.JLabel nipInfoTextValidate;
    private javax.swing.JPasswordField nipValidate;
    private javax.swing.JPanel pageButtons;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField phoneNumber;
    private javax.swing.JButton signButton;
    private javax.swing.JLabel textPageTitleContext;
    private javax.swing.JComboBox<String> userType;
    // End of variables declaration//GEN-END:variables
}
