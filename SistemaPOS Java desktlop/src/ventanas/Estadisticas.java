package ventanas;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class Estadisticas extends javax.swing.JFrame implements KeyListener{


    CardLayout cardLayout;
    
    public Estadisticas() {
        initComponents();
        cardLayout = (CardLayout)(this.panel3.getLayout());
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JPanel();
        jtitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jl_usuario = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        panel_botones = new javax.swing.JPanel();
        btn_dashboard = new javax.swing.JButton();
        btn_orden = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_agregarProd = new javax.swing.JButton();
        btn_imprimir = new javax.swing.JButton();
        btn_cobrar = new javax.swing.JButton();
        btn_estadisticas = new javax.swing.JButton();
        btn_administracion = new javax.swing.JButton();
        panel3 = new javax.swing.JPanel();
        Dashboard = new javax.swing.JPanel();
        tf_lector = new javax.swing.JTextField();
        lb_lector = new javax.swing.JLabel();
        tf_buscar = new javax.swing.JTextField();
        Orden = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        titulo.setBackground(new java.awt.Color(179, 25, 18));

        jtitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jtitulo.setForeground(new java.awt.Color(255, 255, 255));
        jtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jtitulo.setText("Estadisticas");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/usuario.png"))); // NOI18N
        jLabel1.setToolTipText("salir");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
        });

        jl_usuario.setBackground(new java.awt.Color(255, 255, 255));
        jl_usuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jl_usuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jl_usuario.setText("Usuario");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/boton-de-menu-de-tres-lineas-horizontales.png"))); // NOI18N
        jLabel7.setToolTipText("Menu");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tituloLayout = new javax.swing.GroupLayout(titulo);
        titulo.setLayout(tituloLayout);
        tituloLayout.setHorizontalGroup(
            tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tituloLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jtitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        tituloLayout.setVerticalGroup(
            tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jl_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panel_botones.setBackground(new java.awt.Color(102, 102, 102));

        btn_dashboard.setBackground(new java.awt.Color(233, 235, 238));
        btn_dashboard.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/casa 32.png"))); // NOI18N
        btn_dashboard.setText("    Dashboard");
        btn_dashboard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_dashboard.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dashboardActionPerformed(evt);
            }
        });

        btn_orden.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_orden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/nuevo 32.png"))); // NOI18N
        btn_orden.setText("    Nueva orden");
        btn_orden.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_orden.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_orden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ordenActionPerformed(evt);
            }
        });

        btn_modificar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/modificar 32.png"))); // NOI18N
        btn_modificar.setText("    Modificar");
        btn_modificar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_modificar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        btn_agregarProd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_agregarProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mas 32.png"))); // NOI18N
        btn_agregarProd.setText("    Agregar Producto");
        btn_agregarProd.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_agregarProd.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_agregarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarProdActionPerformed(evt);
            }
        });

        btn_imprimir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_imprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/boton-de-impresion.png"))); // NOI18N
        btn_imprimir.setText("    Imprimir");
        btn_imprimir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_imprimir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imprimirActionPerformed(evt);
            }
        });

        btn_cobrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_cobrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ahorrar-dinero.png"))); // NOI18N
        btn_cobrar.setText("    Cobrar");
        btn_cobrar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_cobrar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_cobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cobrarActionPerformed(evt);
            }
        });

        btn_estadisticas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_estadisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/grafico-de-barras (1).png"))); // NOI18N
        btn_estadisticas.setText("    Estadisticas");
        btn_estadisticas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_estadisticas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_estadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_estadisticasActionPerformed(evt);
            }
        });

        btn_administracion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_administracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ajustes.png"))); // NOI18N
        btn_administracion.setText("    Administracion");
        btn_administracion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_administracion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_administracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_administracionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_botonesLayout = new javax.swing.GroupLayout(panel_botones);
        panel_botones.setLayout(panel_botonesLayout);
        panel_botonesLayout.setHorizontalGroup(
            panel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_orden, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
            .addComponent(btn_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_agregarProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_cobrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_imprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_estadisticas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_administracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_botonesLayout.setVerticalGroup(
            panel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_botonesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btn_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_orden, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_agregarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_cobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_administracion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_estadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panel3.setLayout(new java.awt.CardLayout());

        Dashboard.setBackground(new java.awt.Color(233, 235, 238));
        Dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DashboardMouseClicked(evt);
            }
        });
        Dashboard.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DashboardKeyPressed(evt);
            }
        });

        tf_lector.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf_lectorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_lectorFocusLost(evt);
            }
        });
        tf_lector.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_lectorKeyPressed(evt);
            }
        });

        lb_lector.setText("On");

        tf_buscar.setText("jTextField1");
        tf_buscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_buscarFocusLost(evt);
            }
        });
        tf_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_buscarKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_buscarKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout DashboardLayout = new javax.swing.GroupLayout(Dashboard);
        Dashboard.setLayout(DashboardLayout);
        DashboardLayout.setHorizontalGroup(
            DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DashboardLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(tf_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 567, Short.MAX_VALUE)
                .addComponent(lb_lector, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_lector, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        DashboardLayout.setVerticalGroup(
            DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_lector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_lector)
                    .addComponent(tf_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(576, Short.MAX_VALUE))
        );

        panel3.add(Dashboard, "Dashboard");

        javax.swing.GroupLayout OrdenLayout = new javax.swing.GroupLayout(Orden);
        Orden.setLayout(OrdenLayout);
        OrdenLayout.setHorizontalGroup(
            OrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1157, Short.MAX_VALUE)
        );
        OrdenLayout.setVerticalGroup(
            OrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 668, Short.MAX_VALUE)
        );

        panel3.add(Orden, "Orden");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_botones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseEntered

    private void btn_dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dashboardActionPerformed
        tf_lector.requestFocus();
       
    }//GEN-LAST:event_btn_dashboardActionPerformed


    
    
    private void btn_ordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ordenActionPerformed

    }//GEN-LAST:event_btn_ordenActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed

    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_agregarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarProdActionPerformed

        
    }//GEN-LAST:event_btn_agregarProdActionPerformed

    private void btn_imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imprimirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_imprimirActionPerformed

    private void btn_cobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cobrarActionPerformed

    }//GEN-LAST:event_btn_cobrarActionPerformed

    private void btn_estadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_estadisticasActionPerformed

    }//GEN-LAST:event_btn_estadisticasActionPerformed

    private void btn_administracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_administracionActionPerformed

    }//GEN-LAST:event_btn_administracionActionPerformed

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        // TODO add your handling code here:
        System.out.println(evt.getKeyChar()+"ho");
    }//GEN-LAST:event_formKeyTyped

    private void DashboardKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DashboardKeyPressed
        char a = evt.getKeyChar();
        System.out.println(a);
    }//GEN-LAST:event_DashboardKeyPressed

    private void tf_lectorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_lectorFocusLost
        // TODO add your handling code here:
        lb_lector.setText("Leyendo codigo");
        tf_lector.setBackground(Color.RED);
    }//GEN-LAST:event_tf_lectorFocusLost

    private void tf_lectorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_lectorFocusGained
        // TODO add your handling code here:
        tf_lector.setBackground(Color.GREEN);
        lb_lector.setText("No leyendo");
    }//GEN-LAST:event_tf_lectorFocusGained

    private void tf_buscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_buscarFocusLost
        // TODO add your handling code here:
        //tf_lector.setFocusable(true);
    }//GEN-LAST:event_tf_buscarFocusLost

    private void tf_buscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_buscarKeyTyped
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
      
           tf_lector.requestFocus();
        }
    }//GEN-LAST:event_tf_buscarKeyTyped

    private void tf_lectorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_lectorKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            System.out.println(tf_lector.getText());
            tf_lector.setText("");
           tf_lector.setFocusable(true);
        }
    }//GEN-LAST:event_tf_lectorKeyPressed

    private void tf_buscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_buscarKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            tf_buscar.setText("");
           tf_lector.requestFocus();
        }
    }//GEN-LAST:event_tf_buscarKeyPressed

    private void DashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashboardMouseClicked
        // TODO add your handling code here:
        tf_lector.requestFocus();
    }//GEN-LAST:event_DashboardMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        
        if (panel_botones.isVisible()==true) {
            this.panel_botones.setVisible(false);
        } else {
            this.panel_botones.setVisible(true);
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estadisticas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Dashboard;
    private javax.swing.JPanel Orden;
    private javax.swing.JButton btn_administracion;
    private javax.swing.JButton btn_agregarProd;
    private javax.swing.JButton btn_cobrar;
    private javax.swing.JButton btn_dashboard;
    private javax.swing.JButton btn_estadisticas;
    private javax.swing.JButton btn_imprimir;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_orden;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jl_usuario;
    private javax.swing.JLabel jtitulo;
    private javax.swing.JLabel lb_lector;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel panel_botones;
    private javax.swing.JTextField tf_buscar;
    private javax.swing.JTextField tf_lector;
    private javax.swing.JPanel titulo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent ke) {
        System.out.println(ke.getKeyChar());
        System.out.println("t");
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        System.out.println("p");
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        System.out.println("r");
    }
}
