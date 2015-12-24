/*

Prueba de como funciona git


*/
package Vista;

import Control.Conexion;
import java.beans.PropertyVetoException;
import java.io.File;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author juanch0x
 */
public class principal extends javax.swing.JFrame {
    categorias categoria;
    CrearProducto crearproducto;
    AgregarStock agregarstock;
    Venta venta;
    Vencimientos vencimientos;
    private static Connection conn;
    boolean menuAbierto;


    
    public principal() {
        
        this.setResizable(false);
              
        initComponents();
        popup_cantidad_stock.setLocationRelativeTo(this);
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        popup_cantidad_stock = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        stock_field = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        boton_stock = new javax.swing.JButton();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        menu_item_crearproducto = new javax.swing.JMenuItem();
        menu_item_agregarstock = new javax.swing.JMenuItem();
        menu_item_venta = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        menu_item_categoria = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        menu_item_cierrecaja = new javax.swing.JMenuItem();
        menu_item_controlstock = new javax.swing.JMenuItem();
        menu_item_vencimiento = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("jMenu5");

        jMenuItem4.setText("jMenuItem4");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Ingrese la cantidad de stock mínima");

        boton_stock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/print.png"))); // NOI18N
        boton_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_stockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout popup_cantidad_stockLayout = new javax.swing.GroupLayout(popup_cantidad_stock.getContentPane());
        popup_cantidad_stock.getContentPane().setLayout(popup_cantidad_stockLayout);
        popup_cantidad_stockLayout.setHorizontalGroup(
            popup_cantidad_stockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(popup_cantidad_stockLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(popup_cantidad_stockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(popup_cantidad_stockLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(83, 83, 83)
                        .addComponent(boton_stock))
                    .addComponent(stock_field))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        popup_cantidad_stockLayout.setVerticalGroup(
            popup_cantidad_stockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(popup_cantidad_stockLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(stock_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(popup_cantidad_stockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(popup_cantidad_stockLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2))
                    .addGroup(popup_cantidad_stockLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(boton_stock)))
                .addGap(31, 31, 31))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Abasto");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setExtendedState(6);
        setMinimumSize(new java.awt.Dimension(600, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));

        escritorio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        escritorio.setMinimumSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 829, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jMenu6.setText("Producto");

        menu_item_crearproducto.setText("Crear Producto");
        menu_item_crearproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_crearproductoActionPerformed(evt);
            }
        });
        jMenu6.add(menu_item_crearproducto);

        menu_item_agregarstock.setText("Agregar Stock");
        menu_item_agregarstock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_agregarstockActionPerformed(evt);
            }
        });
        jMenu6.add(menu_item_agregarstock);

        menu_item_venta.setText("Venta");
        menu_item_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_ventaActionPerformed(evt);
            }
        });
        jMenu6.add(menu_item_venta);

        jMenuBar1.add(jMenu6);

        jMenu1.setText("Categoria");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        menu_item_categoria.setText("Categoria");
        menu_item_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_categoriaActionPerformed(evt);
            }
        });
        jMenu1.add(menu_item_categoria);

        jMenuBar1.add(jMenu1);

        jMenu7.setText("Reportes");
        jMenu7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu7ActionPerformed(evt);
            }
        });

        menu_item_cierrecaja.setText("Cierre de Caja");
        menu_item_cierrecaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_cierrecajaActionPerformed(evt);
            }
        });
        jMenu7.add(menu_item_cierrecaja);

        menu_item_controlstock.setText("Control de Stock");
        menu_item_controlstock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_controlstockActionPerformed(evt);
            }
        });
        jMenu7.add(menu_item_controlstock);

        menu_item_vencimiento.setText("Vencimientos");
        menu_item_vencimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_vencimientoActionPerformed(evt);
            }
        });
        jMenu7.add(menu_item_vencimiento);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
       
        
        
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void menu_item_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_categoriaActionPerformed
        // TODO add your handling code here:
        if(checkInternalFrame(venta)==true){
        
        categoria = new categorias();
        
        this.getContentPane().add(escritorio);
        categoria.setVisible(true);
        escritorio.add(categoria);
        
         categoria.moveToFront(); 
        try { 
            categoria.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
        }}else{
          
          crearproducto.moveToFront();
          try {
              crearproducto.setSelected(true);
          } catch (PropertyVetoException ex) {
              Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
          }
            }
    }//GEN-LAST:event_menu_item_categoriaActionPerformed

    private void menu_item_crearproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_crearproductoActionPerformed
          if(checkInternalFrame(venta)==true){

        try {
            crearproducto = new CrearProducto();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.getContentPane().add(escritorio);
        
        crearproducto.setVisible(true);
        escritorio.add(crearproducto);
         crearproducto.moveToFront(); 
        try { 
            crearproducto.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
        }}
          else{
          
          crearproducto.moveToFront();
          try {
              crearproducto.setSelected(true);
          } catch (PropertyVetoException ex) {
              Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
          }
            }
    }//GEN-LAST:event_menu_item_crearproductoActionPerformed

    private void menu_item_vencimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_vencimientoActionPerformed
          if(checkInternalFrame(venta)==true){

         vencimientos = new Vencimientos();
         this.getContentPane().add(escritorio);
         vencimientos.setVisible(true);
         escritorio.add(vencimientos);
         vencimientos.moveToFront(); 
        try { 
            vencimientos.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
        }}
        else{
          
          vencimientos.moveToFront();
          try {
              vencimientos.setSelected(true);
          } catch (PropertyVetoException ex) {
              Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
          }
            }
        
    }//GEN-LAST:event_menu_item_vencimientoActionPerformed

    private void menu_item_agregarstockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_agregarstockActionPerformed

              if(checkInternalFrame(venta)==true){

        agregarstock = new AgregarStock();
        
        this.getContentPane().add(escritorio);
        
        agregarstock.setVisible(true);
        escritorio.add(agregarstock);
         agregarstock.moveToFront(); 
        try { 
            agregarstock.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
        }}
        else{
          
          agregarstock.moveToFront();
          try {
              agregarstock.setSelected(true);
          } catch (PropertyVetoException ex) {
              Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
          }
            }
        
    }//GEN-LAST:event_menu_item_agregarstockActionPerformed

    private void menu_item_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_ventaActionPerformed

  
      if(checkInternalFrame(venta)==true){
          venta = new Venta();
           this.getContentPane().add(escritorio);
           
           venta.setVisible(true);
           escritorio.add(venta);
           venta.moveToFront(); 
        try { 
            venta.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
      else{
          
          venta.moveToFront();
          try {
              venta.setSelected(true);
          } catch (PropertyVetoException ex) {
              Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
          }
            }
        
    }//GEN-LAST:event_menu_item_ventaActionPerformed

    private void menu_item_cierrecajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_cierrecajaActionPerformed

        
        Conexion e = new Conexion();

conn = e.conectado();
String path;
path = new File("").getAbsolutePath();
System.out.println(path);
path= path+"\\src\\Reportes\\ventasdiarias.jrxml";
System.out.println(path);
 JasperReport reporteJasper = null; 
                    try {
                        reporteJasper = JasperCompileManager.compileReport(path);
                    } catch (JRException ex) {
                        Logger.getLogger(Venta.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JasperPrint mostrarReporte = null;
                    try {
                        mostrarReporte = JasperFillManager.fillReport(reporteJasper, null, e.conectado());
                    } catch (JRException ex) {
                        Logger.getLogger(Venta.class.getName()).log(Level.SEVERE, null, ex);
                    }
                   
                    //Jasper es la ventana
                    JasperViewer jasper;
                    jasper = new JasperViewer(mostrarReporte,false);
                    
                    jasper.setTitle("Cierre de Caja");
                    jasper.setVisible(true);
        
        
    }//GEN-LAST:event_menu_item_cierrecajaActionPerformed

    private void menu_item_controlstockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_controlstockActionPerformed
 
        popup_cantidad_stock.pack();
        popup_cantidad_stock.setSize(300,171);
        popup_cantidad_stock.setModal(rootPaneCheckingEnabled);
        popup_cantidad_stock.setVisible(true);
               
    
    }//GEN-LAST:event_menu_item_controlstockActionPerformed

    private void jMenu7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu7ActionPerformed

    private void boton_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_stockActionPerformed

        Conexion e = new Conexion();

conn = e.conectado();
String path;
path = new File("").getAbsolutePath();
System.out.println(path);
path= path+"\\src\\Reportes\\consulta_stock.jrxml";
System.out.println(path);
 JasperReport reporteJasper = null; 

/*Map<Integer, String> parametros = new HashMap<Integer, String>();
parametros.put(12, "Juan");
*/

Map parametros = new HashMap();
parametros.put("stock_minimo", Integer.parseInt(stock_field.getText()));


                    try {
                        reporteJasper = JasperCompileManager.compileReport(path);
                    } catch (JRException ex) {
                        Logger.getLogger(Venta.class.getName()).log(Level.SEVERE, null, ex);
                    }
                        JasperPrint mostrarReporte = null;
                    try {
                         mostrarReporte = JasperFillManager.fillReport(reporteJasper, parametros, e.conectado());
                        
                    } catch (JRException ex) {
                        Logger.getLogger(Venta.class.getName()).log(Level.SEVERE, null, ex);
                    }
                   
                    //Jasper es la ventana
                    
                    JasperViewer jasper;
                    jasper = new JasperViewer(mostrarReporte,false);
                    
                    jasper.setTitle("Consulta de Stock");
                    jasper.setVisible(true);
                    
                   popup_cantidad_stock.dispose();
                   jasper.requestFocus();
    }//GEN-LAST:event_boton_stockActionPerformed

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_stock;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem menu_item_agregarstock;
    private javax.swing.JMenuItem menu_item_categoria;
    private javax.swing.JMenuItem menu_item_cierrecaja;
    private javax.swing.JMenuItem menu_item_controlstock;
    private javax.swing.JMenuItem menu_item_crearproducto;
    private javax.swing.JMenuItem menu_item_vencimiento;
    private javax.swing.JMenuItem menu_item_venta;
    private javax.swing.JDialog popup_cantidad_stock;
    private javax.swing.JTextField stock_field;
    // End of variables declaration//GEN-END:variables

      private boolean checkInternalFrame(Object obj){
       
          
          
        JInternalFrame[] activos= this.escritorio.getAllFrames();
       
        boolean cerrado = true;
       
        int i=0;
        while(i<activos.length && cerrado){
            if(activos[i] == obj)
                cerrado = false;
                i++;
                       
        }
        
        return cerrado;
       
    }

}
