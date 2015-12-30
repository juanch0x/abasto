/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.ControlCategoria;
import Modelo.Categoria;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juanch0x
 */
public class categorias extends javax.swing.JInternalFrame {

    private DefaultTableModel model;
    /**
     * Creates new form NewJInternalFrame
     */
    
  
    
    public categorias() {
        initComponents();
     jButton2.setVisible(false);
        ventanaAgregar2.setLocationRelativeTo(this);
        ventanaModificar.setLocationRelativeTo(this);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventanaAgregar2 = new javax.swing.JDialog();
        categoriaAgregar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        ventanaModificar = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        categoria_actual_dialog = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        categoria_nueva_dialogo = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable()
        {
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        }
        ;
        ventanaAgregar = new javax.swing.JInternalFrame();
        ventanaEditar = new javax.swing.JInternalFrame();

        addEscapeListenerWindowDialog(ventanaAgregar2);

        categoriaAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaAgregarActionPerformed(evt);
            }
        });
        categoriaAgregar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                categoriaAgregarKeyTyped(evt);
            }
        });

        jLabel1.setText("Categoria");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        jButton4.setText("Agregar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ventanaAgregar2Layout = new javax.swing.GroupLayout(ventanaAgregar2.getContentPane());
        ventanaAgregar2.getContentPane().setLayout(ventanaAgregar2Layout);
        ventanaAgregar2Layout.setHorizontalGroup(
            ventanaAgregar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaAgregar2Layout.createSequentialGroup()
                .addGroup(ventanaAgregar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventanaAgregar2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jButton4))
                    .addGroup(ventanaAgregar2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(categoriaAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ventanaAgregar2Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel1)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        ventanaAgregar2Layout.setVerticalGroup(
            ventanaAgregar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaAgregar2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(categoriaAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        ventanaModificar.setAlwaysOnTop(true);
        ventanaModificar.setPreferredSize(new java.awt.Dimension(184, 145));
        ventanaModificar.setType(java.awt.Window.Type.POPUP);
        addEscapeListenerWindowDialog(ventanaModificar);

        jLabel2.setText("Nombre Actual");

        categoria_actual_dialog.setEnabled(false);

        jLabel3.setText("Nuevo Nombre");

        categoria_nueva_dialogo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                categoria_nueva_dialogoKeyTyped(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit.png"))); // NOI18N
        jButton5.setText("Modificar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ventanaModificarLayout = new javax.swing.GroupLayout(ventanaModificar.getContentPane());
        ventanaModificar.getContentPane().setLayout(ventanaModificarLayout);
        ventanaModificarLayout.setHorizontalGroup(
            ventanaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaModificarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ventanaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ventanaModificarLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(categoria_actual_dialog, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ventanaModificarLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(categoria_nueva_dialogo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaModificarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(44, 44, 44))
        );
        ventanaModificarLayout.setVerticalGroup(
            ventanaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaModificarLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(ventanaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(categoria_actual_dialog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(ventanaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(categoria_nueva_dialogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, Short.MAX_VALUE)
                .addGap(7, 7, 7))
        );

        setClosable(true);
        setTitle("Categorias");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        jButton1.setText("Agregar ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete.png"))); // NOI18N
        jButton2.setText("Eliminar");
        jButton2.setName(""); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit.png"))); // NOI18N
        jButton3.setText("Modificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "null"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setModel(obtenerCategorias());
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
        }

        ventanaAgregar.setVisible(false);

        javax.swing.GroupLayout ventanaAgregarLayout = new javax.swing.GroupLayout(ventanaAgregar.getContentPane());
        ventanaAgregar.getContentPane().setLayout(ventanaAgregarLayout);
        ventanaAgregarLayout.setHorizontalGroup(
            ventanaAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ventanaAgregarLayout.setVerticalGroup(
            ventanaAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        ventanaEditar.setVisible(false);

        javax.swing.GroupLayout ventanaEditarLayout = new javax.swing.GroupLayout(ventanaEditar.getContentPane());
        ventanaEditar.getContentPane().setLayout(ventanaEditarLayout);
        ventanaEditarLayout.setHorizontalGroup(
            ventanaEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ventanaEditarLayout.setVerticalGroup(
            ventanaEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(ventanaAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(214, 214, 214)
                        .addComponent(ventanaEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ventanaAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ventanaEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        categoriaAgregar.setText("");
        ventanaAgregar2.pack();
        ventanaAgregar2.setSize(195,175);
        ventanaAgregar2.setModal(rootPaneCheckingEnabled);
        ventanaAgregar2.setVisible(true);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void categoriaAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoriaAgregarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        DefaultTableModel model = (DefaultTableModel) tabla.getModel(); 
        
        if(categoriaAgregar.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Hay algun campo vacio.");   
        }
        else{
        ControlCategoria e=new ControlCategoria();
        Categoria nueva=new Categoria();
        
        nueva.setCategoria(categoriaAgregar.getText());
        
        try {
            e.agregarCategoria(nueva);
        } catch (SQLException ex) {
            Logger.getLogger(categorias.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        model = obtenerCategorias();
        tabla.setModel(model);
        
        ventanaAgregar2.dispose();
        }      
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

                 DefaultTableModel model = (DefaultTableModel) tabla.getModel(); 
                 ControlCategoria control = new ControlCategoria();
                 
         
                 
          int a = tabla.getSelectedRow(); 
           
                 
          if (a<0){ 
 
                JOptionPane.showMessageDialog(null, 
                "Debe seleccionar una fila de la tabla" ); 
 
         }else {

             
           //Sección 4
            int confirmar=JOptionPane.showConfirmDialog(null, 
           "Esta seguro que desea Eliminar el registro? "); 
 
           //Sección 5 
 if(JOptionPane.OK_OPTION==confirmar) {

                     
                  //Sección 6
                   
                try {
                    control.eliminarCategoria(Integer.parseInt(new String((String) tabla.getValueAt(a, 0))));
                    
                } catch (SQLException ex) {
                    Logger.getLogger(categorias.class.getName()).log(Level.SEVERE, null, ex);
                }
                    model.removeRow(a); 
                  //Sección 7
                   JOptionPane.showMessageDialog(null,"Registro Eliminado" );
 
            } 
 
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        
         if (tabla.getSelectedRow()<0){ 
 
                JOptionPane.showMessageDialog(null, 
                "Debe seleccionar una categoria de la tabla" ); 
 
         }else{
        
        categoria_actual_dialog.setText((String) tabla.getValueAt(tabla.getSelectedRow(), 1));
        categoria_nueva_dialogo.setText("");
        ventanaModificar.pack();
        ventanaModificar.setSize(240,200);
        ventanaModificar.setModal(rootPaneCheckingEnabled);
        ventanaModificar.setVisible(true);
         }

       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

            if(categoria_nueva_dialogo.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Hay algun campo vacio.");
            }
            else{
            
        ControlCategoria control = new ControlCategoria();
        Categoria categoria = new Categoria();
        categoria.setCategoria(categoria_nueva_dialogo.getText());
        categoria.setId_categoria(Integer.parseInt(new String((String) tabla.getValueAt(tabla.getSelectedRow(), 0))));
        
        try {
            control.modificarCategoria(categoria);
        } catch (SQLException ex) {
            Logger.getLogger(categorias.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        tabla.setValueAt(categoria_nueva_dialogo.getText(), tabla.getSelectedRow(), 1);
        ventanaModificar.dispose();
            }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void categoriaAgregarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_categoriaAgregarKeyTyped

        char c = evt.getKeyChar();
        
        if(c == com.sun.glass.events.KeyEvent.VK_ENTER){
        
            jButton4ActionPerformed(null);
        
        }
        
    }//GEN-LAST:event_categoriaAgregarKeyTyped

    private void categoria_nueva_dialogoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_categoria_nueva_dialogoKeyTyped

        char c = evt.getKeyChar();
        
        if(c == com.sun.glass.events.KeyEvent.VK_ENTER){
        
            jButton5ActionPerformed(null);
        
        }
        
    }//GEN-LAST:event_categoria_nueva_dialogoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField categoriaAgregar;
    private javax.swing.JTextField categoria_actual_dialog;
    private javax.swing.JTextField categoria_nueva_dialogo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JInternalFrame ventanaAgregar;
    private javax.swing.JDialog ventanaAgregar2;
    private javax.swing.JInternalFrame ventanaEditar;
    private javax.swing.JDialog ventanaModificar;
    // End of variables declaration//GEN-END:variables


public DefaultTableModel obtenerCategorias() {
        
        String encabezados[]= {"ID","Categoria"};
        ControlCategoria c = new ControlCategoria();
        List<Categoria> categoria = null;
        try {
            categoria = c.obtenerCategorias();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(categorias.class.getName()).log(Level.SEVERE, null, ex);
        }
        String [][] data = new String[categoria.size()][2];
        for (int i = 0; i < categoria.size(); i++) {
            data[i][0]= Integer.toString(categoria.get(i).getId_categoria());
            data[i][1]= categoria.get(i).getCategoria();
           
        }
        
        return new DefaultTableModel(data,encabezados);
    }


//Funcion para poder cerrar los jDialog con escape

public static void addEscapeListenerWindowDialog( final JDialog windowDialog) {ActionListener escAction = new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
windowDialog.dispose();
}
};
windowDialog.getRootPane().registerKeyboardAction(escAction,
KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0),
JComponent.WHEN_IN_FOCUSED_WINDOW);}




}
