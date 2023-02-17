/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Front;

import Back.Barbero;
import Back.Cliente;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author enriq
 */
public class Barberia extends javax.swing.JFrame {

    /**
     * Creates new form Barberia
     */
    

    Queue<Cliente> clientes = new LinkedList<>();
    Barbero[] barberos = new Barbero[6];

    int IDBarberoSiguiente = 0;
    int IDClienteSiguiente = 1;
    int cantClientes = 0;

    public Barberia() {
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

        btnAgregarCliente = new javax.swing.JButton();
        btnAgregarBarbero = new javax.swing.JButton();
        btnEliminarBarbero = new javax.swing.JButton();
        btnEliminarCliente = new javax.swing.JButton();
        barbero0 = new javax.swing.JPanel();
        lblBarbero0 = new javax.swing.JLabel();
        barbero1 = new javax.swing.JPanel();
        lblBarbero1 = new javax.swing.JLabel();
        barbero2 = new javax.swing.JPanel();
        lblBarbero2 = new javax.swing.JLabel();
        barbero3 = new javax.swing.JPanel();
        lblBarbero3 = new javax.swing.JLabel();
        barbero4 = new javax.swing.JPanel();
        lblBarbero4 = new javax.swing.JLabel();
        lblCantidadClientes = new javax.swing.JLabel();
        lblClientes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaClientes = new javax.swing.JTextArea();
        lblIDClientes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Barberia");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregarCliente.setText("Agregar Cliente");
        btnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 404, 145, 43));

        btnAgregarBarbero.setText("Agregar Barbero");
        btnAgregarBarbero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarBarberoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarBarbero, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 404, 145, 43));

        btnEliminarBarbero.setText("Eliminar barbero");
        btnEliminarBarbero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarBarberoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarBarbero, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 329, 145, 43));

        btnEliminarCliente.setText("Eliminar Cliente");
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 329, 145, 43));

        barbero0.setBackground(new java.awt.Color(0, 0, 0));
        barbero0.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout barbero0Layout = new javax.swing.GroupLayout(barbero0);
        barbero0.setLayout(barbero0Layout);
        barbero0Layout.setHorizontalGroup(
            barbero0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barbero0Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblBarbero0, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        barbero0Layout.setVerticalGroup(
            barbero0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barbero0Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblBarbero0)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        getContentPane().add(barbero0, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, 83));

        barbero1.setBackground(new java.awt.Color(0, 0, 0));
        barbero1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout barbero1Layout = new javax.swing.GroupLayout(barbero1);
        barbero1.setLayout(barbero1Layout);
        barbero1Layout.setHorizontalGroup(
            barbero1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barbero1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblBarbero1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        barbero1Layout.setVerticalGroup(
            barbero1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barbero1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblBarbero1)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        getContentPane().add(barbero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 6, -1, 83));

        barbero2.setBackground(new java.awt.Color(0, 0, 0));
        barbero2.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout barbero2Layout = new javax.swing.GroupLayout(barbero2);
        barbero2.setLayout(barbero2Layout);
        barbero2Layout.setHorizontalGroup(
            barbero2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barbero2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lblBarbero2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        barbero2Layout.setVerticalGroup(
            barbero2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barbero2Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(lblBarbero2)
                .addGap(38, 38, 38))
        );

        getContentPane().add(barbero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 6, -1, 83));

        barbero3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout barbero3Layout = new javax.swing.GroupLayout(barbero3);
        barbero3.setLayout(barbero3Layout);
        barbero3Layout.setHorizontalGroup(
            barbero3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barbero3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblBarbero3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        barbero3Layout.setVerticalGroup(
            barbero3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barbero3Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(lblBarbero3)
                .addGap(40, 40, 40))
        );

        getContentPane().add(barbero3, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 6, -1, 83));

        barbero4.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout barbero4Layout = new javax.swing.GroupLayout(barbero4);
        barbero4.setLayout(barbero4Layout);
        barbero4Layout.setHorizontalGroup(
            barbero4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barbero4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblBarbero4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        barbero4Layout.setVerticalGroup(
            barbero4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barbero4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblBarbero4)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        getContentPane().add(barbero4, new org.netbeans.lib.awtextra.AbsoluteConstraints(587, 6, -1, 83));

        lblCantidadClientes.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCantidadClientes.setText("0");
        getContentPane().add(lblCantidadClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, -1, -1));

        lblClientes.setText("Cantidad de clientes en la cola");
        getContentPane().add(lblClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, -1, -1));

        txtaClientes.setColumns(20);
        txtaClientes.setRows(5);
        jScrollPane1.setViewportView(txtaClientes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 160, 150));

        lblIDClientes.setText("Clientes en la cola");
        getContentPane().add(lblIDClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarBarberoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarBarberoActionPerformed
        if (IDBarberoSiguiente == 0) {
            timer.start();
        }
        if (IDBarberoSiguiente >= 5) {
            
            if (estaVacio() != 99) {
                Barbero objBarbero = new Barbero();
                objBarbero.setLibre(true);
                objBarbero.setID(estaVacio());
                barberos[estaVacio()] = objBarbero;
            } else {
                timer.stop();
                JOptionPane.showMessageDialog(this, "Lo siento, solo tenemos espacio para 5 barberos");
                timer.start();
            }

        } else {
            Barbero objBarbero = new Barbero();
            objBarbero.setLibre(true);
            objBarbero.setID(IDBarberoSiguiente);
            barberos[IDBarberoSiguiente] = objBarbero;
            IDBarberoSiguiente++;

        }
    }//GEN-LAST:event_btnAgregarBarberoActionPerformed

    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
        Cliente objCliente = new Cliente();
        objCliente.setTurno(IDClienteSiguiente);
        objCliente.setAtendido(false);
        clientes.add(objCliente);
        IDClienteSiguiente++;
        cantClientes++;
        escribirCantidadClientes();
        escribirClientes();
    }//GEN-LAST:event_btnAgregarClienteActionPerformed

    private void btnEliminarBarberoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarBarberoActionPerformed
        int barberoEliminado =0;
        for (int i = 0; i < 5; i++) {
            if (barberos[i] != null) {
                if (barberos[i].getLibre() == true) {
                    barberos[i] = null;
                    barberoEliminado =1;
                    break;
                }
            }
        }
        if(barberoEliminado==0){
            JOptionPane.showMessageDialog(this, "No hay ningun barbero disponible para borrarlo");
        }
    }//GEN-LAST:event_btnEliminarBarberoActionPerformed

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
        if (clientes.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay clientes para borrar");
            
        }else{
            clientes.remove();
            cantClientes--;
            escribirCantidadClientes();
            escribirClientes();
        }

    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    Timer timer = new Timer(1000, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            int i = 0;
            barberosActivos();
            while (i < 5) {
                if (barberos[i] != null) {
                    if (barberos[i].getLibre() == true && !clientes.isEmpty()) {
                        clientes.remove();
                        cantClientes--;
                        barberos[i].barberoEmpieza();
                    }
                    if (barberos[i].getLibre() == false) {

                        if (barberos[i].getTiempo() == 0) {
                            barberos[i].barberoTermina();
                        }
                        if (barberos[i].getLibre() == false) {
                            barberos[i].disminuirTiempo();
                        }
                    }

                }
                i++;
                escribirCantidadClientes();
                escribirClientes();
            }
        }
    });

    public int estaVacio() {
        for (int i = 0; i < 5; i++) {
            if (barberos[i] == null) {
                return i;
            }
        }
        return 99;
    }

    public void barberosActivos() {

        if (barberos[0] != null) {
            if (barberos[0].getLibre() == false) {
                barbero0.setBackground(Color.red);
                lblBarbero0.setText("" + barberos[0].getTiempo());

            } else {
                barbero0.setBackground(Color.green);
                lblBarbero0.setText("LIBRE");
            }
        } else {
            barbero0.setBackground(Color.black);
            lblBarbero0.setText("");
        }

        if (barberos[1] != null) {
            if (barberos[1].getLibre() == false) {
                barbero1.setBackground(Color.red);
                lblBarbero1.setText("" + barberos[1].getTiempo());

            } else {
                barbero1.setBackground(Color.green);
                lblBarbero1.setText("LIBRE");
            }
        } else {
            barbero1.setBackground(Color.black);
            lblBarbero1.setText("");
        }

        if (barberos[2] != null) {
            if (barberos[2].getLibre() == false) {
                barbero2.setBackground(Color.red);
                lblBarbero2.setText("" + barberos[2].getTiempo());

            } else {
                barbero2.setBackground(Color.green);
                lblBarbero2.setText("LIBRE");
            }
        } else {
            barbero2.setBackground(Color.black);
            lblBarbero2.setText("");
        }

        if (barberos[3] != null) {
            if (barberos[3].getLibre() == false) {
                barbero3.setBackground(Color.red);
                lblBarbero3.setText("" + barberos[3].getTiempo());

            } else {
                barbero3.setBackground(Color.green);
                lblBarbero3.setText("LIBRE");
            }
        } else {
            barbero3.setBackground(Color.black);
            lblBarbero3.setText("");
        }

        if (barberos[4] != null) {
            if (barberos[4].getLibre() == false) {
                barbero4.setBackground(Color.red);
                lblBarbero4.setText("" + barberos[4].getTiempo());

            } else {
                barbero4.setBackground(Color.green);
                lblBarbero4.setText("LIBRE");
            }
        } else {
            barbero4.setBackground(Color.black);
            lblBarbero4.setText("");
        }
    }
    public void escribirClientes(){
        
        String texto = "";
        
        for(Cliente objcliente : clientes){
            texto +=objcliente.getTurno()+"\n";
        }
        txtaClientes.setText(texto);
        
    }
    public void escribirCantidadClientes() {
        lblCantidadClientes.setText("" + cantClientes);
    }

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
            java.util.logging.Logger.getLogger(Barberia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Barberia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Barberia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Barberia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Barberia().setVisible(true);

            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barbero0;
    private javax.swing.JPanel barbero1;
    private javax.swing.JPanel barbero2;
    private javax.swing.JPanel barbero3;
    private javax.swing.JPanel barbero4;
    private javax.swing.JButton btnAgregarBarbero;
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnEliminarBarbero;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBarbero0;
    private javax.swing.JLabel lblBarbero1;
    private javax.swing.JLabel lblBarbero2;
    private javax.swing.JLabel lblBarbero3;
    private javax.swing.JLabel lblBarbero4;
    private javax.swing.JLabel lblCantidadClientes;
    private javax.swing.JLabel lblClientes;
    private javax.swing.JLabel lblIDClientes;
    private javax.swing.JTextArea txtaClientes;
    // End of variables declaration//GEN-END:variables
}