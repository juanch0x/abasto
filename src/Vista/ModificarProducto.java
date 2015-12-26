/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.ControlCategoria;
import Control.ControlProducto;
import Modelo.Categoria;
import Modelo.Producto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author juanch0x
 */
public class ModificarProducto extends javax.swing.JInternalFrame {

  
    private TableRowSorter trsFiltro;
    
    public ModificarProducto() throws ClassNotFoundException {
        initComponents();
        
        ventana_Modificar.setLocationRelativeTo(this);
        
        List <Categoria> lista = new ArrayList();
        ControlCategoria controlcategoria = new ControlCategoria();
        lista = controlcategoria.buscarCategoria();
        categoria_combo.removeAllItems();
        for (int i = 0; i < lista.size(); i++) { 
            categoria_combo.addItem(lista.get(i).getCategoria());
               }
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventana_Modificar = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        categoria_combo = new javax.swing.JComboBox();
        preciov_jfield = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        precioc_jfield = new javax.swing.JTextField();
        nombre_jfield = new javax.swing.JTextField();
        nombre_label = new javax.swing.JLabel();
        codigo_label = new javax.swing.JLabel();
        codigo_jfield = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        comboFiltro = new javax.swing.JComboBox();
        filtro_field = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable(){

            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        boton_Modificar = new javax.swing.JButton();

        jLabel4.setText("Categoria");

        preciov_jfield.setToolTipText("Precio de venta unitario");
        preciov_jfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preciov_jfieldActionPerformed(evt);
            }
        });
        preciov_jfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                preciov_jfieldKeyTyped(evt);
            }
        });

        jLabel2.setText("Precio Venta");

        jLabel3.setText("Precio de Costo");

        precioc_jfield.setToolTipText("Precio de costo unitario");
        precioc_jfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precioc_jfieldKeyTyped(evt);
            }
        });

        nombre_jfield.setToolTipText("Nombre del producto");
        nombre_jfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombre_jfieldKeyTyped(evt);
            }
        });

        nombre_label.setText("Nombre del Producto");

        codigo_label.setText("Codigo de Barras");

        codigo_jfield.setToolTipText("Si no posee codigo de barras dejar en blanco");
        codigo_jfield.setEnabled(false);
        codigo_jfield.setFocusable(false);
        codigo_jfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codigo_jfieldKeyTyped(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit.png"))); // NOI18N
        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ventana_ModificarLayout = new javax.swing.GroupLayout(ventana_Modificar.getContentPane());
        ventana_Modificar.getContentPane().setLayout(ventana_ModificarLayout);
        ventana_ModificarLayout.setHorizontalGroup(
            ventana_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventana_ModificarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ventana_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventana_ModificarLayout.createSequentialGroup()
                        .addGroup(ventana_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre_label)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(codigo_label))
                        .addGap(18, 18, 18)
                        .addGroup(ventana_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codigo_jfield, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ventana_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(preciov_jfield)
                                .addComponent(precioc_jfield)
                                .addComponent(categoria_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nombre_jfield, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        ventana_ModificarLayout.setVerticalGroup(
            ventana_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventana_ModificarLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(ventana_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigo_jfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigo_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ventana_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre_jfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ventana_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioc_jfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ventana_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(preciov_jfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ventana_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(categoria_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        addEscapeListenerWindowDialog(ventana_Modificar);

        setClosable(true);
        setTitle("Editar productos");

        comboFiltro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Codigo", "Nombre" }));
        comboFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFiltroActionPerformed(evt);
            }
        });

        filtro_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filtro_fieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                filtro_fieldKeyTyped(evt);
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
        tabla.setModel(obtenerProductos());
        jScrollPane1.setViewportView(tabla);

        boton_Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit.png"))); // NOI18N
        boton_Modificar.setText("Modificar");
        boton_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_ModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(filtro_field, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(boton_Modificar)))
                .addContainerGap(118, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filtro_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                .addComponent(boton_Modificar)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(72, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void filtro_fieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtro_fieldKeyReleased
        filtro_field.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String cadena = (filtro_field.getText());
                filtro_field.setText(cadena);
                repaint();
                filtro();
            }
        });
        trsFiltro = new TableRowSorter(tabla.getModel());
        tabla.setRowSorter(trsFiltro);
    }//GEN-LAST:event_filtro_fieldKeyReleased

    private void filtro_fieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtro_fieldKeyTyped

    }//GEN-LAST:event_filtro_fieldKeyTyped

    private void comboFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboFiltroActionPerformed

    private void boton_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_ModificarActionPerformed

        if(tabla.getSelectedRow()<0){
            JOptionPane.showMessageDialog(null, 
                "Debe seleccionar un producto de la tabla" );
        }
        else{
        Producto producto = new Producto();
        Categoria categoria = new Categoria();
        ControlProducto controlp = new  ControlProducto();
        ControlCategoria controlc = new ControlCategoria();
        
        
               
        try {
            producto = controlp.busqueda(Long.parseLong(new String((String) tabla.getValueAt(tabla.getSelectedRow(), 1))));
        } catch (SQLException ex) {
            Logger.getLogger(ModificarProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        codigo_jfield.setText(String.valueOf(producto.getCodigo()));
        nombre_jfield.setText(producto.getNombre());
        precioc_jfield.setText(String.valueOf(producto.getPrecio_c()));
        preciov_jfield.setText(String.valueOf(producto.getPrecio_v()));
        
        try {
            categoria = controlc.busqueda(producto.getId_categoria());
        } catch (SQLException ex) {
            Logger.getLogger(ModificarProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        for(int i=0; i<categoria_combo.getItemCount();i++){
            if(Objects.equals(categoria_combo.getItemAt(i), categoria.getCategoria())){
            
                categoria_combo.setSelectedIndex(i);
            }
        }
        
        ventana_Modificar.pack();
        ventana_Modificar.setSize(400,400);
        ventana_Modificar.setModal(rootPaneCheckingEnabled);
        ventana_Modificar.setVisible(true);
        }              
    }//GEN-LAST:event_boton_ModificarActionPerformed

    private void preciov_jfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preciov_jfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_preciov_jfieldActionPerformed

    private void preciov_jfieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_preciov_jfieldKeyTyped

        //Validación sólo decimales

        char caracter = evt.getKeyChar();
        if(((caracter < '0') || (caracter > '9')) && (caracter != KeyEvent.VK_BACK_SPACE)
            && (caracter !='.')){

            evt.consume();
        }

    }//GEN-LAST:event_preciov_jfieldKeyTyped

    private void precioc_jfieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioc_jfieldKeyTyped

        //Validación sólo decimales

        char caracter = evt.getKeyChar();
        if(((caracter < '0') || (caracter > '9')) && (caracter != KeyEvent.VK_BACK_SPACE)
            && (caracter !='.')){

            evt.consume();
        }

        char c = evt.getKeyChar();

        if(c == com.sun.glass.events.KeyEvent.VK_ENTER){

            preciov_jfield.requestFocus();

        }
    }//GEN-LAST:event_precioc_jfieldKeyTyped

    private void nombre_jfieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombre_jfieldKeyTyped

        char c = evt.getKeyChar();

        if(c == com.sun.glass.events.KeyEvent.VK_ENTER){

            precioc_jfield.requestFocus();

        }

    }//GEN-LAST:event_nombre_jfieldKeyTyped

    private void codigo_jfieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigo_jfieldKeyTyped
        //Validación sólo decimales

        char caracter = evt.getKeyChar();
        if(((caracter < '0') || (caracter > '9')) && (caracter != KeyEvent.VK_BACK_SPACE)){

            evt.consume();
        }
        char c = evt.getKeyChar();

        if(c == com.sun.glass.events.KeyEvent.VK_ENTER){

            nombre_jfield.requestFocus();

        }

    }//GEN-LAST:event_codigo_jfieldKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 ControlProducto controlp = new ControlProducto();
         
    //Se valida que no halla ningun campo vacio    
        
    if(preciov_jfield.getText().trim().isEmpty()||precioc_jfield.getText().trim().isEmpty()||nombre_jfield.getText().trim().isEmpty()){
               JOptionPane.showMessageDialog(this, "Hay algun campo vacio.");
     }
       
    //Validación de precio
    
    else if(Float.parseFloat(precioc_jfield.getText())>=Float.parseFloat(preciov_jfield.getText())){
        JOptionPane.showMessageDialog(this, "El precio de costo debe ser menor al precio de venta.");
     }
     
//Validación de Código de Barras repetido//
        
               
   else try {
        
//Validación de Nombre repetido//
        
         if(controlp.validarDatos(nombre_jfield.getText())){
            JOptionPane.showMessageDialog(this, "Ya existe un producto con el mismo nombre!");
        }
        
        //Empieza la ejecución normal
        
        else{
            
            
            Producto producto = new Producto();
            Categoria categoria = new Categoria();
            ControlCategoria controlc = new ControlCategoria();
            
            
            producto.setCodigo(Long.parseLong(codigo_jfield.getText()));
            producto.setNombre(nombre_jfield.getText());
            producto.setPrecio_c(Float.parseFloat(precioc_jfield.getText()));
            producto.setPrecio_v(Float.parseFloat(preciov_jfield.getText()));
            
            try {
                categoria = controlc.busqueda(categoria_combo.getSelectedItem().toString());
                
                producto.setId_categoria(categoria.getId_categoria());
                
                controlp.ModificarProducto(producto);
            } catch (SQLException ex) {
                Logger.getLogger(ModificarProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
            ventana_Modificar.dispose();
            
            DefaultTableModel modelo = new DefaultTableModel();
            
            modelo = obtenerProductos();
            
            tabla.setModel(modelo);
        }
 } catch (SQLException ex) {
     Logger.getLogger(ModificarProducto.class.getName()).log(Level.SEVERE, null, ex);
 }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_Modificar;
    private javax.swing.JComboBox categoria_combo;
    private javax.swing.JTextField codigo_jfield;
    private javax.swing.JLabel codigo_label;
    private javax.swing.JComboBox comboFiltro;
    private javax.swing.JTextField filtro_field;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombre_jfield;
    private javax.swing.JLabel nombre_label;
    private javax.swing.JTextField precioc_jfield;
    private javax.swing.JTextField preciov_jfield;
    private javax.swing.JTable tabla;
    private javax.swing.JDialog ventana_Modificar;
    // End of variables declaration//GEN-END:variables

public void filtro() {
        int columnaABuscar = 0;
        if (comboFiltro.getSelectedItem() == "Codigo") {
            columnaABuscar = 1;
        }
        if (comboFiltro.getSelectedItem().toString() == "Nombre") {
            columnaABuscar = 0;
        }
       
        trsFiltro.setRowFilter(RowFilter.regexFilter(filtro_field.getText().toLowerCase(), columnaABuscar));
    }

public DefaultTableModel obtenerProductos() {
        
        String encabezados[]= {"Nombre","Codigo","Precio Costo","Precio Venta","Stock"};
        ControlProducto c = new ControlProducto();
        List<Producto> productos = null;
        
        try {
            productos = c.obtenerProductos();
             
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AgregarStock.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
            
        String [][] data = new String[productos.size()][5];
        for (int i = 0; i < productos.size(); i++) {
        
            
            data[i][0] = productos.get(i).getNombre();
            data[i][1] = Long.toString(productos.get(i).getCodigo());
            data[i][2] = Float.toString(productos.get(i).getPrecio_c());
            data[i][3] = Float.toString(productos.get(i).getPrecio_v());
            data[i][4] = Integer.toString(productos.get(i).getCantidad());
                
           
        }
        
        return new DefaultTableModel(data,encabezados);
    }

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
