/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.ControlProducto;
import Control.ControlVenta;
import Modelo.Detalle;
import Modelo.Producto;
import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author juanch0x
 */
public class Venta extends javax.swing.JInternalFrame {
            
                private TableRowSorter trsFiltro;
                AgregarStock robodecodigo;
                Double total;
                int variable;
                
            ImageIcon imagen = new ImageIcon(getClass().getResource("/Images/delete_1616.png"));

    public Venta() {
        initComponents();
        setTabla();
        tabla.setRowHeight(25);
        robodecodigo = new AgregarStock();
        total = 0.0;
        variable =0;
        
        
        codigo_field.requestFocusInWindow();
        
      

        
        
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventana = new javax.swing.JDialog();
        filtro_field = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_productos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        codigo_label = new javax.swing.JLabel();
        codigo_field = new javax.swing.JTextField();
        cantidad_label = new javax.swing.JLabel();
        cantidad_field = new javax.swing.JTextField();
        producto_label = new javax.swing.JLabel();
        producto_field = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        precio_field = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        total_field = new javax.swing.JTextField();

        filtro_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filtro_fieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                filtro_fieldKeyTyped(evt);
            }
        });

        tabla_productos.setModel(obtenerProductos());
        jScrollPane2.setViewportView(tabla_productos);

        jLabel1.setText("Producto");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        jButton4.setText("Agregar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ventanaLayout = new javax.swing.GroupLayout(ventana.getContentPane());
        ventana.getContentPane().setLayout(ventanaLayout);
        ventanaLayout.setHorizontalGroup(
            ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaLayout.createSequentialGroup()
                .addGroup(ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventanaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ventanaLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(filtro_field, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ventanaLayout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jButton4)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        ventanaLayout.setVerticalGroup(
            ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filtro_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap())
        );

        setBorder(null);
        setClosable(true);
        setTitle("Venta");
        setToolTipText(null);
        setNextFocusableComponent(codigo_field);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        codigo_label.setText("Codigo");

        codigo_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codigo_fieldKeyTyped(evt);
            }
        });

        cantidad_label.setText("Cantidad");

        cantidad_field.setText("1");

        producto_label.setText("Producto");

        producto_field.setEnabled(false);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        jButton1.setText("Cerrar Venta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        jButton2.setText("Agregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1450422891_Search.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setText("Precio");

        precio_field.setEnabled(false);

        jLabel3.setText("Total");

        total_field.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cantidad_label)
                                    .addGap(18, 18, 18)
                                    .addComponent(cantidad_field, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(codigo_label)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(codigo_field, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(producto_label)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(precio_field, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(producto_field))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(total_field, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cantidad_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantidad_label))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(codigo_label)
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(producto_label)
                                        .addComponent(producto_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(precio_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addComponent(jButton2))
                            .addComponent(codigo_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(total_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void filtro_fieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtro_fieldKeyTyped

    }//GEN-LAST:event_filtro_fieldKeyTyped

    private void filtro_fieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtro_fieldKeyReleased

        filtro_field.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String cadena = (filtro_field.getText());
                filtro_field.setText(cadena);
                repaint();
                filtro();
            }
        });
        trsFiltro = new TableRowSorter(tabla_productos.getModel());
        tabla_productos.setRowSorter(trsFiltro);
        
    }//GEN-LAST:event_filtro_fieldKeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        ventana.pack();
        ventana.setSize(475,300);
        ventana.setModal(rootPaneCheckingEnabled);
        ventana.setVisible(true);
        filtro_field.setText("");
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel(); 
        
        Float precio;
        
        
        
        precio = Float.parseFloat(precio_field.getText());
        
        if(Integer.parseInt(cantidad_field.getText())!=1){
        precio = precio * Integer.parseInt(cantidad_field.getText());
        }
        
        Object[] a = new Object[]{codigo_field.getText(),producto_field.getText(), cantidad_field.getText(), precio, new JButton(imagen)};
        
         
         
        modelo.addRow(a);
        tabla.setModel(modelo);
    
        
        
        total = 0.0;
        
        for(int i=0; i<tabla.getRowCount();i++){
            
            total = total + Double.parseDouble(tabla.getValueAt(i, 3).toString());
            
            
        }
            total_field.setText(String.valueOf(total));
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        ControlProducto a = new ControlProducto();
        Producto p = new Producto();
        
        String producto;
        
        producto = (String) tabla_productos.getValueAt(tabla_productos.getSelectedRow(), 0);
        
        producto_field.setText(producto);
        
                    try {
                        p = a.busqueda(producto);
                    } catch (SQLException ex) {
                        Logger.getLogger(Venta.class.getName()).log(Level.SEVERE, null, ex);
                    }

                   
                    
        codigo_field.setText(String.valueOf(p.getCodigo()));
        precio_field.setText(String.valueOf(p.getPrecio_v()));
        
        ventana.dispose();
        
        variable = 1;
        cantidad_field.setText("1");
        cantidad_field.requestFocus();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void codigo_fieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigo_fieldKeyTyped

        char c = evt.getKeyChar();
        
        if(c == com.sun.glass.events.KeyEvent.VK_ENTER){
        
            cantidad_field.requestFocus();
            try {
                AgregarPorCodigo();
            } catch (SQLException ex) {
                Logger.getLogger(Venta.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Se agrego la wea");
        
        }
        
        
    }//GEN-LAST:event_codigo_fieldKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
        
        Modelo.Venta venta = new Modelo.Venta();
        List <Detalle> detalle = new ArrayList<Detalle>();
        
       
        
        java.util.Date fecha = new Date();
        
        venta.setFecha_venta(fecha);
        venta.setTotal((float) Double.parseDouble(total_field.getText()));
        
        System.out.println(tabla.getModel().getColumnName(0));
        
        for(int i = 0 ; i < tabla.getModel().getRowCount() ; i++){
       
            Detalle aux = new Detalle();
            
            aux.setCodigo(Long.parseLong(tabla.getValueAt(i, 0).toString()));
            aux.setCantidad(Integer.parseInt(tabla.getValueAt(i, 2).toString()));
            detalle.add(aux);
        }
        
        
        
        ControlVenta controlventa = new ControlVenta();
        System.out.println(detalle.get(0).getCodigo());
                    try {
                        controlventa.AgregarVenta(venta, detalle);
                    } catch (SQLException ex) {
                        Logger.getLogger(Venta.class.getName()).log(Level.SEVERE, null, ex);

        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cantidad_field;
    private javax.swing.JLabel cantidad_label;
    private javax.swing.JTextField codigo_field;
    private javax.swing.JLabel codigo_label;
    private javax.swing.JTextField filtro_field;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField precio_field;
    private javax.swing.JTextField producto_field;
    private javax.swing.JLabel producto_label;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tabla_productos;
    private javax.swing.JTextField total_field;
    private javax.swing.JDialog ventana;
    // End of variables declaration//GEN-END:variables


private void setTabla() {
        
        
        //Creamos un objeto ImageIcon con el nombre de la imagen
        ImageIcon imagen = new ImageIcon(getClass().getResource("/Images/delete_1616.png"));
             

        // Esta lista contiene los nombres que se mostrarán en el encabezado de cada columna de la grilla
        String[] columnas = new String[]{
            "Codigo de Barras",
            "Producto",
            "Cantidad",
            "Precio",
            "Eliminar"};

        // Estos son los tipos de datos de cada columna de la lista
        final Class[] tiposColumnas = new Class[]{
            long.class,
            java.lang.String.class,
            int.class,
            float.class,
            //int.class,
            JButton.class // <- noten que aquí se especifica que la última columna es un botón
        };

        // Agrego los registros que contendrá la grilla.
        // Observen que el último campo es un botón
        Object[][] datos = new Object[][]{
            
           /* {"4444444444444", "Coca Cola", 12, 15.5, new JButton(imagen)},
            {"5551231232133", "PepsiCola", 15, 7.3, new JButton(imagen)},
            {"588192983198", "TalcaCola", 18, 9.3, new JButton(imagen)}
        */};

        // Defino el TableModel y le indico los datos y nombres de columnas
        tabla.setModel(new javax.swing.table.DefaultTableModel(
                datos,
                columnas) {
            // Esta variable nos permite conocer de antemano los tipos de datos de cada columna, dentro del TableModel
            Class[] tipos = tiposColumnas;

            @Override
            public Class getColumnClass(int columnIndex) {
                // Este método es invocado por el CellRenderer para saber que dibujar en la celda,
                // observen que estamos retornando la clase que definimos de antemano.
                return tipos[columnIndex];
            }

            @Override
            public boolean isCellEditable(int row, int column) {
                // Sobrescribimos este método para evitar que la columna que contiene los botones sea editada.
                return !(this.getColumnClass(column).equals(JButton.class));
            }
        });

        // El objetivo de la siguiente línea es indicar el CellRenderer que será utilizado para dibujar el botón
        tabla.setDefaultRenderer(JButton.class, new TableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object objeto, boolean estaSeleccionado, boolean tieneElFoco, int fila, int columna) {
                /**
                 * Observen que todo lo que hacemos en éste método es retornar el objeto que se va a dibujar en la 
                 * celda. Esto significa que se dibujará en la celda el objeto que devuelva el TableModel. También 
                 * significa que este renderer nos permitiría dibujar cualquier objeto gráfico en la grilla, pues 
                 * retorna el objeto tal y como lo recibe.
                 */
                return (Component) objeto;
            }
        });

        /**
         * Por último, agregamos un listener que nos permita saber cuando fue pulsada la celda que contiene el botón.
         * Noten que estamos capturando el clic sobre JTable, no el clic sobre el JButton. Esto también implica que en 
         * lugar de poner un botón en la celda, simplemente pudimos definir un CellRenderer que hiciera parecer que la 
         * celda contiene un botón. Es posible capturar el clic del botón, pero a mi parecer el efecto es el mismo y 
         * hacerlo de esta forma es más "simple"
         */
        tabla.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = tabla.rowAtPoint(e.getPoint());
                int columna = tabla.columnAtPoint(e.getPoint());

                /**
                 * Preguntamos si hicimos clic sobre la celda que contiene el botón, si tuviéramos más de un botón 
                 * por fila tendríamos que además preguntar por el contenido del botón o el nombre de la columna
                 */
                if (tabla.getModel().getColumnClass(columna).equals(JButton.class)) {
                    /**
                     * Aquí pueden poner lo que quieran, para efectos de este ejemplo, voy a mostrar
                     * en un cuadro de dialogo todos los campos de la fila que no sean un botón.
                     */
                 DefaultTableModel model = (DefaultTableModel) tabla.getModel(); 
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < tabla.getModel().getColumnCount(); i++) {
                        if (!tabla.getModel().getColumnClass(i).equals(JButton.class)) {
                      
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Seleccionada la fila " + fila + sb.toString());
                                       
                                
            
                            total =  total - Double.parseDouble(tabla.getValueAt(tabla.getSelectedRow(), 3).toString());
                                model.removeRow(fila);
                                        total_field.setText(String.valueOf(total));
                }
            }
        });
}

public void filtro() {
        
              
        trsFiltro.setRowFilter(RowFilter.regexFilter(filtro_field.getText(), 0));
    }


public DefaultTableModel obtenerProductos() {
        
        String encabezados[]= {"Nombre","Precio Venta","Stock"};
        ControlProducto c = new ControlProducto();
        List<Producto> productos = null;
        
        try {
            productos = c.obtenerProductos();
             
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AgregarStock.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
            
        String [][] data = new String[productos.size()][3];
        for (int i = 0; i < productos.size(); i++) {
        
            
            data[i][0] = productos.get(i).getNombre();
            data[i][1] = Float.toString(productos.get(i).getPrecio_v());
            data[i][2] = Integer.toString(productos.get(i).getCantidad());
                
           
        }
        
        return new DefaultTableModel(data,encabezados);
    }

public void AgregarPorCodigo() throws SQLException{

DefaultTableModel modelo = (DefaultTableModel) tabla.getModel(); 
    
ControlVenta controlventa = new ControlVenta();
Producto producto = new Producto();

producto = controlventa.BuscarPorCodigo(Long.parseLong(codigo_field.getText()));

if(Integer.parseInt(cantidad_field.getText())!=1){
        producto.setPrecio_v(producto.getPrecio_v() * Integer.parseInt(cantidad_field.getText()));
        }

Object[] a = new Object[]{codigo_field.getText(),producto.getNombre(), cantidad_field.getText(), producto.getPrecio_v(), new JButton(imagen)};

modelo.addRow(a);

tabla.setModel(modelo);

codigo_field.requestFocus();

total = 0.0;

codigo_field.setText("");
cantidad_field.setText("1");


        
        
        for(int i=0; i<tabla.getRowCount();i++){
            
            total = total + Double.parseDouble(tabla.getValueAt(i, 3).toString());
            
            
        }
            total_field.setText(String.valueOf(total));

}

}
    






