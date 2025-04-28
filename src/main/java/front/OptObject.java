package front;

/**
 *
 * @author joshu
 */
public class OptObject extends javax.swing.JFrame {
    public OptObject() {
        initComponents();
        chargeBoxes();
        showPanelInit(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        footer = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        cancelButton = new javax.swing.JButton();
        optionBox = new javax.swing.JComboBox<>();
        labelOption = new javax.swing.JLabel();
        lateralPanel = new javax.swing.JPanel();
        clearButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        biblioPanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        titleField = new javax.swing.JTextField();
        autorLabel = new javax.swing.JLabel();
        autorCombo = new javax.swing.JComboBox<>();
        editorialLabel = new javax.swing.JLabel();
        editorialCombo = new javax.swing.JComboBox<>();
        dateLabel = new javax.swing.JLabel();
        dateField = new javax.swing.JFormattedTextField();
        genderLabel = new javax.swing.JLabel();
        genderCombo = new javax.swing.JComboBox<>();
        addressLabel = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        availableLabel = new javax.swing.JLabel();
        availableField = new javax.swing.JTextField();
        editorialPanel = new javax.swing.JPanel();
        nameEditorialLabel = new javax.swing.JLabel();
        nameEditorialField = new javax.swing.JTextField();
        addressEditorialLabel = new javax.swing.JLabel();
        addressEditorialField = new javax.swing.JTextField();
        autorPanel = new javax.swing.JPanel();
        autorNameLabel = new javax.swing.JLabel();
        autorNameField = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        countryLabel = new javax.swing.JLabel();
        countryField = new javax.swing.JTextField();
        genderPanel = new javax.swing.JPanel();
        nameGenderLabel = new javax.swing.JLabel();
        nameGenderField = new javax.swing.JTextField();
        descriptionGenderLabel = new javax.swing.JLabel();
        descriptionGenderFiled = new javax.swing.JScrollPane();
        descriptionGenderField = new javax.swing.JTextArea();
        recommendedLabel = new javax.swing.JLabel();
        recommendedField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar o Actulizar");

        javax.swing.GroupLayout footerLayout = new javax.swing.GroupLayout(footer);
        footer.setLayout(footerLayout);
        footerLayout.setHorizontalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1570, Short.MAX_VALUE)
        );
        footerLayout.setVerticalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );

        getContentPane().add(footer, java.awt.BorderLayout.PAGE_END);

        header.setPreferredSize(new java.awt.Dimension(909, 100));
        header.setLayout(new javax.swing.BoxLayout(header, javax.swing.BoxLayout.LINE_AXIS));

        cancelButton.setText("<X Cancelar");
        cancelButton.setActionCommand("X Cancelar");
        cancelButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        cancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelButton.setMaximumSize(new java.awt.Dimension(9999, 9999));
        cancelButton.setMinimumSize(new java.awt.Dimension(15, 10));
        cancelButton.setPreferredSize(new java.awt.Dimension(76, 150));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        header.add(cancelButton);

        optionBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Material Bibliografico", "Autor", "Editorial", "Genero" }));
        optionBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionBoxActionPerformed(evt);
            }
        });
        header.add(optionBox);

        labelOption.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelOption.setText("...");
        labelOption.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelOption.setMaximumSize(new java.awt.Dimension(9999, 9999));
        labelOption.setMinimumSize(new java.awt.Dimension(120, 150));
        header.add(labelOption);

        getContentPane().add(header, java.awt.BorderLayout.PAGE_START);

        lateralPanel.setLayout(new java.awt.GridLayout(0, 1));

        clearButton.setText("Limpiar");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        lateralPanel.add(clearButton);

        saveButton.setText("Guardar");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        lateralPanel.add(saveButton);

        getContentPane().add(lateralPanel, java.awt.BorderLayout.LINE_START);

        mainPanel.setLayout(new javax.swing.BoxLayout(mainPanel, javax.swing.BoxLayout.PAGE_AXIS));

        biblioPanel.setLayout(new java.awt.GridLayout(16, 1));

        nameLabel.setText("Titulo");
        biblioPanel.add(nameLabel);
        biblioPanel.add(titleField);

        autorLabel.setText("Autor");
        biblioPanel.add(autorLabel);

        autorCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        biblioPanel.add(autorCombo);

        editorialLabel.setText("Editorial");
        biblioPanel.add(editorialLabel);

        editorialCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        biblioPanel.add(editorialCombo);

        dateLabel.setText("Fecha");
        biblioPanel.add(dateLabel);
        biblioPanel.add(dateField);

        genderLabel.setText("Genero");
        biblioPanel.add(genderLabel);

        genderCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        biblioPanel.add(genderCombo);

        addressLabel.setText("Ubicacion");
        biblioPanel.add(addressLabel);
        biblioPanel.add(addressField);

        availableLabel.setText("Cantidad Disponible");
        biblioPanel.add(availableLabel);
        biblioPanel.add(availableField);

        mainPanel.add(biblioPanel);

        editorialPanel.setLayout(new java.awt.GridLayout(2, 2));

        nameEditorialLabel.setText("Nombre");
        editorialPanel.add(nameEditorialLabel);
        editorialPanel.add(nameEditorialField);

        addressEditorialLabel.setText("Direccion");
        editorialPanel.add(addressEditorialLabel);
        editorialPanel.add(addressEditorialField);

        mainPanel.add(editorialPanel);

        autorPanel.setLayout(new java.awt.GridLayout(6, 2));

        autorNameLabel.setText("Nombre");
        autorPanel.add(autorNameLabel);
        autorPanel.add(autorNameField);

        lastNameLabel.setText("Apellido(s)");
        autorPanel.add(lastNameLabel);
        autorPanel.add(lastNameField);

        countryLabel.setText("Nacionalidad");
        autorPanel.add(countryLabel);

        countryField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryFieldActionPerformed(evt);
            }
        });
        autorPanel.add(countryField);

        mainPanel.add(autorPanel);

        genderPanel.setLayout(new java.awt.GridLayout(6, 2));

        nameGenderLabel.setText("Nombre");
        genderPanel.add(nameGenderLabel);
        genderPanel.add(nameGenderField);

        descriptionGenderLabel.setText("Descripcion");
        genderPanel.add(descriptionGenderLabel);

        descriptionGenderField.setColumns(20);
        descriptionGenderField.setRows(5);
        descriptionGenderFiled.setViewportView(descriptionGenderField);

        genderPanel.add(descriptionGenderFiled);

        recommendedLabel.setText("Edad Recomendada");
        genderPanel.add(recommendedLabel);
        genderPanel.add(recommendedField);

        mainPanel.add(genderPanel);

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        
    }//GEN-LAST:event_clearButtonActionPerformed

    private void countryFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryFieldActionPerformed
        
    }//GEN-LAST:event_countryFieldActionPerformed

    // Elementos Del Combo
    private void optionBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionBoxActionPerformed
        String show = (String) optionBox.getSelectedItem();
        checkPanelSelected(show);
    }//GEN-LAST:event_optionBoxActionPerformed

    //Guardar Boton
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        saveOptions();
    }//GEN-LAST:event_saveButtonActionPerformed

    private void saveOptions(){
        switch(checkPanelSelected((String) optionBox.getSelectedItem())){
            case 0:
                //createBook(nameField.getText(), dateField.getText(), addressField.getText(), (int) availableField.getText(), genderCombo.getItemSelected(), editorialCombo.getItemSelected());
                //public boolean createBook(String name, String year, String ubication, int avaible, String gender, String editorial){
                break;
            case 1:
                //createAutor(autorNameField.getText(), countryField.getText(), lastNameField.getText());
                //public boolean createAutor(String name, String nationality, String lastName){
                break;
            case 2:
                //createGender(nameGenderField.getText(), descriptionGenderField.getText(), (int) recommendedField.getText());
                //public boolean createGender(String name, String description, int age){
                break;
            case 3:
                //createEditorial(nameEditorialField.getText(), addressEditorialField.getText());
                //public boolean createEditorial(String name, String address){
                break;
        }
    }
    
    private int checkPanelSelected(String option){
        switch(option){
            case "Material Bibliografico": showPanelInit(0);
                return 0;
            case "Autor": showPanelInit(1);
                return 1;
            case "Editorial": showPanelInit(2);
                return 2;
            case "Genero": showPanelInit(3);
                return 3;
        }
        
        return 0;
    }
    
    private void showOffInit(){
        biblioPanel.setVisible(false);
        editorialPanel.setVisible(false);
        autorPanel.setVisible(false);
        genderPanel.setVisible(false);
    }
    
    private void showPanelInit(int show){
        switch(show){
            case 0: 
                showOffInit();
                labelOption.setText("Agregar Libro/Revista/Etc.");
                biblioPanel.setVisible(true);
            break;
            case 1: 
                showOffInit();
                labelOption.setText("Agregar Editorial");
                editorialPanel.setVisible(true);
            break;
            case 2: 
                showOffInit();
                labelOption.setText("Agregar Autor");
                autorPanel.setVisible(true);
            break;
            case 3: 
                showOffInit();
                labelOption.setText("Agregar Genero");
                genderPanel.setVisible(true);
                
            break;
        }
    }
    
    private void chargeBoxes(){
        //autorCombo.setModel(requestAutors());
        //genderCombo.setModel(requestGenders());
        //editorialCombo.setModel(requestEditorials());
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
            java.util.logging.Logger.getLogger(OptObject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OptObject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OptObject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OptObject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OptObject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressEditorialField;
    private javax.swing.JLabel addressEditorialLabel;
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JComboBox<String> autorCombo;
    private javax.swing.JLabel autorLabel;
    private javax.swing.JTextField autorNameField;
    private javax.swing.JLabel autorNameLabel;
    private javax.swing.JPanel autorPanel;
    private javax.swing.JTextField availableField;
    private javax.swing.JLabel availableLabel;
    private javax.swing.JPanel biblioPanel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextField countryField;
    private javax.swing.JLabel countryLabel;
    private javax.swing.JFormattedTextField dateField;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTextArea descriptionGenderField;
    private javax.swing.JScrollPane descriptionGenderFiled;
    private javax.swing.JLabel descriptionGenderLabel;
    private javax.swing.JComboBox<String> editorialCombo;
    private javax.swing.JLabel editorialLabel;
    private javax.swing.JPanel editorialPanel;
    private javax.swing.JPanel footer;
    private javax.swing.JComboBox<String> genderCombo;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JPanel genderPanel;
    private javax.swing.JPanel header;
    private javax.swing.JLabel labelOption;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JPanel lateralPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField nameEditorialField;
    private javax.swing.JLabel nameEditorialLabel;
    private javax.swing.JTextField nameGenderField;
    private javax.swing.JLabel nameGenderLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JComboBox<String> optionBox;
    private javax.swing.JTextField recommendedField;
    private javax.swing.JLabel recommendedLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField titleField;
    // End of variables declaration//GEN-END:variables
}
