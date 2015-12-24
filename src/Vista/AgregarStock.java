/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and kkopen the template in the editor.
 */
package Vista;

import Control.ControlProducto;
import Modelo.Producto;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author juanch0x
 */
public class AgregarStock extends javax.swing.JInternalFrame {

    /**
     * Creates new form AgregarProducto
     */
    
    private TableRowSorter trsFiltro;
    
    public AgregarStock() {
        initComponents();
        
        SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                      filtro_field.requestFocus();
                }
          });
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        filtro_field = new javax.swing.JTextField();
        comboFiltro = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable(){

            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        stock_label = new javax.swing.JLabel();
        stock_field = new javax.swing.JTextField();
        lote_label = new javax.swing.JLabel();
        lote_field = new javax.swing.JTextField();
        agregar_boton = new javax.swing.JButton();
        fecha = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Carga de Stock");
        setToolTipText(null);

        jPanel1.setToolTipText(null);

        filtro_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filtro_fieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                filtro_fieldKeyTyped(evt);
            }
        });

        comboFiltro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Codigo", "Nombre" }));

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

        stock_label.setText("Ingreso  Stock");

        lote_label.setText("Lote");

        agregar_boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        agregar_boton.setText("Agregar");
        agregar_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_botonActionPerformed(evt);
            }
        });

        jLabel1.setText("Vencimiento");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(filtro_field, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(stock_label)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(stock_field, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                                        .addComponent(lote_label)
                                        .addGap(18, 18, 18)
                                        .addComponent(lote_field, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(132, 132, 132))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(agregar_boton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filtro_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stock_label)
                            .addComponent(stock_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lote_label)
                            .addComponent(lote_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(agregar_boton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void filtro_fieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtro_fieldKeyTyped
    
    }//GEN-LAST:event_filtro_fieldKeyTyped

    private void agregar_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_botonActionPerformed

        
      DefaultTableModel model = (DefaultTableModel) tabla.getModel(); 
      ControlProducto c = new ControlProducto();  
                 
          int a = tabla.getSelectedRow(); 
         
         
          
          if (a<0){ 
 
                JOptionPane.showMessageDialog(null, 
                "Debe seleccionar una fila de la tabla" ); 
 
         }else {

             
           //Sección 4
            int confirmar=JOptionPane.showConfirmDialog(null, 
           "¿Esta seguro de agregar este lote?"); 
 
           //Sección 5 
            
 if(JOptionPane.OK_OPTION==confirmar) {
   
          int cantidad;
          long codigo;
          
          //Declaro dos objetos de tipo util date para comparar y validar que no sea una fecha pasada
          java.util.Date fechaVto = new Date();
          java.util.Date fechaActual = new Date();
           
          
          //Valido campos vacios..
           if(stock_field.getText().trim().isEmpty()||lote_field.getText().trim().isEmpty()){
           JOptionPane.showMessageDialog(this, "Hay algun campo vacio");
           }
           if(fecha.getDate() == null){
           JOptionPane.showMessageDialog(this, "Es obligatorio definir la fecha de vencimiento");
           }
          
           else{
            
           //Convierto la fecha del jcalendar en un objeto date    
           fechaVto = fecha.getDate();
           
           //Valido que la fecha no halla pasado
           
           if(fechaActual.compareTo(fechaVto)!=-1){
           JOptionPane.showMessageDialog(this, "Esa fecha ya paso!");
           }
           
           else{
           //Ejecución normal
               
               
          //Calculo la nueva cantidad de stock disponible para la actualización
               int aux,aux2;
               aux = Integer.parseInt(tabla.getValueAt(a, 4).toString());
               aux2 = Integer.parseInt(stock_field.getText());
               cantidad = aux+aux2;
          
          

           
           
           codigo = Long.parseLong(tabla.getValueAt(a, 1).toString().trim());
           
           
           
                try {
                    c.AgregarStock(cantidad,codigo,lote_field.getText(),fechaVto);
                } catch (SQLException ex) {
                    Logger.getLogger(AgregarStock.class.getName()).log(Level.SEVERE, null, ex);
                }
 
 
           
 
 }}}
 
        }  
        
        
    }//GEN-LAST:event_agregar_botonActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar_boton;
    private javax.swing.JComboBox comboFiltro;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JTextField filtro_field;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lote_field;
    private javax.swing.JLabel lote_label;
    private javax.swing.JTextField stock_field;
    private javax.swing.JLabel stock_label;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

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

//Metodo para hacer el filtro de busqueda

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

}
