/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;

/**
 *
 * @author Lourdes
 */
public class Clientes extends javax.swing.JFrame {

    /**
     * Creates new form Clientes
     */
    public Clientes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        FormularioClientes = new javax.swing.JDialog();
        PanelPrincipalForm = new javax.swing.JPanel();
        PanelSuperior = new javax.swing.JPanel();
        LabelClientes = new javax.swing.JLabel();
        CancelButton = new javax.swing.JButton();
        SearchButton = new javax.swing.JButton();
        FormIcon = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        PanelBotones = new javax.swing.JPanel();
        AddButton = new javax.swing.JButton();
        UndoButton = new javax.swing.JButton();
        RemoveButton = new javax.swing.JButton();
        SaveButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        RewindButton = new javax.swing.JButton();
        PlayButton = new javax.swing.JButton();
        NextButton = new javax.swing.JButton();
        PanelFormulario = new javax.swing.JPanel();
        ClienteIdLabel = new javax.swing.JLabel();
        IdField = new javax.swing.JFormattedTextField();
        NombreLabel = new javax.swing.JLabel();
        NombreField = new javax.swing.JTextField();
        ApellidosLabel = new javax.swing.JLabel();
        ApellidosField = new javax.swing.JTextField();
        DireccionLabel = new javax.swing.JLabel();
        DireccionField = new javax.swing.JTextField();
        EmailLabel = new javax.swing.JLabel();
        EmailField = new javax.swing.JTextField();
        TelefonoLabel = new javax.swing.JLabel();
        TelefonoField = new javax.swing.JTextField();
        PanelPrincipal = new javax.swing.JPanel();
        FormButton = new javax.swing.JButton();

        FormularioClientes.setMinimumSize(new java.awt.Dimension(422, 422));
        FormularioClientes.setPreferredSize(new java.awt.Dimension(422, 422));
        FormularioClientes.setResizable(false);
        FormularioClientes.setSize(new java.awt.Dimension(422, 422));

        PanelPrincipalForm.setPreferredSize(new java.awt.Dimension(407, 50));
        PanelPrincipalForm.setLayout(new java.awt.BorderLayout());

        PanelSuperior.setBackground(new java.awt.Color(205, 231, 242));
        PanelSuperior.setMinimumSize(new java.awt.Dimension(383, 42));
        PanelSuperior.setPreferredSize(new java.awt.Dimension(407, 42));

        LabelClientes.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        LabelClientes.setForeground(new java.awt.Color(0, 102, 255));
        LabelClientes.setText("Clientes");

        CancelButton.setBackground(new java.awt.Color(255, 255, 255));
        CancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ej1/images/cerrar.png"))); // NOI18N
        CancelButton.setContentAreaFilled(false);
        CancelButton.setDefaultCapable(false);
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        SearchButton.setBackground(new java.awt.Color(255, 255, 255));
        SearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ej1/images/search.png"))); // NOI18N
        SearchButton.setContentAreaFilled(false);
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        FormIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ej1/images/form.png"))); // NOI18N

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.setText("RICARDO");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelSuperiorLayout = new javax.swing.GroupLayout(PanelSuperior);
        PanelSuperior.setLayout(PanelSuperiorLayout);
        PanelSuperiorLayout.setHorizontalGroup(
            PanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSuperiorLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(FormIcon)
                .addGap(6, 6, 6)
                .addComponent(LabelClientes)
                .addGap(82, 82, 82)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PanelSuperiorLayout.setVerticalGroup(
            PanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSuperiorLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(PanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FormIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1)
                .addContainerGap())
        );

        PanelPrincipalForm.add(PanelSuperior, java.awt.BorderLayout.PAGE_START);

        PanelBotones.setPreferredSize(new java.awt.Dimension(407, 50));
        PanelBotones.setLayout(new java.awt.GridBagLayout());

        AddButton.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.inactiveTitleGradient"));
        AddButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ej1/images/add.png"))); // NOI18N
        AddButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AddButton.setContentAreaFilled(false);
        AddButton.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 0);
        PanelBotones.add(AddButton, gridBagConstraints);

        UndoButton.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.inactiveTitleGradient"));
        UndoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ej1/images/undo.png"))); // NOI18N
        UndoButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        UndoButton.setContentAreaFilled(false);
        UndoButton.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 0);
        PanelBotones.add(UndoButton, gridBagConstraints);

        RemoveButton.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.inactiveTitleGradient"));
        RemoveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ej1/images/remove.png"))); // NOI18N
        RemoveButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        RemoveButton.setContentAreaFilled(false);
        RemoveButton.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 0);
        PanelBotones.add(RemoveButton, gridBagConstraints);

        SaveButton.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.inactiveTitleGradient"));
        SaveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ej1/images/save.png"))); // NOI18N
        SaveButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SaveButton.setContentAreaFilled(false);
        SaveButton.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 0);
        PanelBotones.add(SaveButton, gridBagConstraints);

        BackButton.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.inactiveTitleGradient"));
        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ej1/images/back.png"))); // NOI18N
        BackButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BackButton.setContentAreaFilled(false);
        BackButton.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 0);
        PanelBotones.add(BackButton, gridBagConstraints);

        RewindButton.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.inactiveTitleGradient"));
        RewindButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ej1/images/play(1).png"))); // NOI18N
        RewindButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        RewindButton.setContentAreaFilled(false);
        RewindButton.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 0);
        PanelBotones.add(RewindButton, gridBagConstraints);

        PlayButton.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.inactiveTitleGradient"));
        PlayButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ej1/images/play.png"))); // NOI18N
        PlayButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PlayButton.setContentAreaFilled(false);
        PlayButton.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 0);
        PanelBotones.add(PlayButton, gridBagConstraints);

        NextButton.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.inactiveTitleGradient"));
        NextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ej1/images/next.png"))); // NOI18N
        NextButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        NextButton.setContentAreaFilled(false);
        NextButton.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 7);
        PanelBotones.add(NextButton, gridBagConstraints);

        PanelPrincipalForm.add(PanelBotones, java.awt.BorderLayout.PAGE_END);

        PanelFormulario.setPreferredSize(new java.awt.Dimension(407, 50));
        PanelFormulario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ClienteIdLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ClienteIdLabel.setText("CLIENTE_ID");
        ClienteIdLabel.setAlignmentX(0.5F);
        PanelFormulario.add(ClienteIdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        IdField.setEditable(false);
        IdField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        IdField.setText("5");
        IdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdFieldActionPerformed(evt);
            }
        });
        PanelFormulario.add(IdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 44, -1));

        NombreLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        NombreLabel.setText("NOMBRE");
        NombreLabel.setAlignmentX(0.5F);
        PanelFormulario.add(NombreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        NombreField.setText("RICARDO");
        NombreField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreFieldActionPerformed(evt);
            }
        });
        PanelFormulario.add(NombreField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 174, -1));

        ApellidosLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ApellidosLabel.setText("APELLIDOS");
        ApellidosLabel.setAlignmentX(0.5F);
        PanelFormulario.add(ApellidosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        ApellidosField.setText("MARTINEZ JUAREZ");
        ApellidosField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidosFieldActionPerformed(evt);
            }
        });
        PanelFormulario.add(ApellidosField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 174, -1));

        DireccionLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DireccionLabel.setText("DIRECCION");
        DireccionLabel.setAlignmentX(0.5F);
        PanelFormulario.add(DireccionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        DireccionField.setText("EJIDO NVO AMANECER");
        DireccionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DireccionFieldActionPerformed(evt);
            }
        });
        PanelFormulario.add(DireccionField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 174, -1));

        EmailLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        EmailLabel.setText("EMAIL");
        EmailLabel.setAlignmentX(0.5F);
        PanelFormulario.add(EmailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        EmailField.setText("RICA8656@GMAIL.COM");
        EmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailFieldActionPerformed(evt);
            }
        });
        PanelFormulario.add(EmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 174, -1));

        TelefonoLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TelefonoLabel.setText("TELEFONO");
        TelefonoLabel.setAlignmentX(0.5F);
        PanelFormulario.add(TelefonoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        TelefonoField.setText("(898)-254-3698");
        PanelFormulario.add(TelefonoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 174, -1));

        PanelPrincipalForm.add(PanelFormulario, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout FormularioClientesLayout = new javax.swing.GroupLayout(FormularioClientes.getContentPane());
        FormularioClientes.getContentPane().setLayout(FormularioClientesLayout);
        FormularioClientesLayout.setHorizontalGroup(
            FormularioClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipalForm, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
        );
        FormularioClientesLayout.setVerticalGroup(
            FormularioClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipalForm, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(300, 200));

        PanelPrincipal.setLayout(new java.awt.GridBagLayout());

        FormButton.setText("Rellenar formulario");
        FormButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormButtonActionPerformed(evt);
            }
        });
        PanelPrincipal.add(FormButton, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FormButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormButtonActionPerformed
        // TODO add your handling code here:
        FormularioClientes.setModal(true);
        FormularioClientes.setVisible(true);
    }//GEN-LAST:event_FormButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void IdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdFieldActionPerformed

    private void NombreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreFieldActionPerformed

    private void ApellidosFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidosFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidosFieldActionPerformed

    private void DireccionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DireccionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DireccionFieldActionPerformed

    private void EmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailFieldActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JTextField ApellidosField;
    private javax.swing.JLabel ApellidosLabel;
    private javax.swing.JButton BackButton;
    private javax.swing.JButton CancelButton;
    private javax.swing.JLabel ClienteIdLabel;
    private javax.swing.JTextField DireccionField;
    private javax.swing.JLabel DireccionLabel;
    private javax.swing.JTextField EmailField;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JButton FormButton;
    private javax.swing.JLabel FormIcon;
    private javax.swing.JDialog FormularioClientes;
    private javax.swing.JFormattedTextField IdField;
    private javax.swing.JLabel LabelClientes;
    private javax.swing.JButton NextButton;
    private javax.swing.JTextField NombreField;
    private javax.swing.JLabel NombreLabel;
    private javax.swing.JPanel PanelBotones;
    private javax.swing.JPanel PanelFormulario;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel PanelPrincipalForm;
    private javax.swing.JPanel PanelSuperior;
    private javax.swing.JButton PlayButton;
    private javax.swing.JButton RemoveButton;
    private javax.swing.JButton RewindButton;
    private javax.swing.JButton SaveButton;
    private javax.swing.JButton SearchButton;
    private javax.swing.JTextField TelefonoField;
    private javax.swing.JLabel TelefonoLabel;
    private javax.swing.JButton UndoButton;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
