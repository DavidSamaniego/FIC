
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sama_
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    //Autómata
    validacionesAutomata obj;
    
    public main() {
        initComponents();
        this.setExtendedState(main.MAXIMIZED_BOTH);
        Dimension dim = super.getToolkit().getScreenSize();
        this.setSize(dim);
        body.setSize(dim);
        
        final StyleContext cont = StyleContext.getDefaultStyleContext();
        final AttributeSet red = cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground, Color.RED);// asignar
        final AttributeSet Black = cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground, Color.BLACK);//resto
        final AttributeSet blue = cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground, Color.blue);// consultas
        final AttributeSet pink = cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground, Color.pink);//tipos de datos
      
        DefaultStyledDocument doc;
        
        
        
        TextLineNumber lineas1 = new TextLineNumber(codeArea1);
        lineas1.setCurrentLineForeground(Color.white);
        lineas1.setForeground(Color.BLUE);
        jScrollPane4.setRowHeaderView(lineas1);
        codeArea1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {

            }

            public void keyTyped(java.awt.event.KeyEvent evt) {
                codeArea1KeyTyped(evt);
            }
        });
         jScrollPane4.setViewportView(codeArea1);
        TextLineNumber lineas2 = new TextLineNumber(codeArea2);
        lineas2.setCurrentLineForeground(Color.white);
        lineas2.setForeground(Color.BLUE);
        jScrollPane5.setRowHeaderView(lineas2);
        codeArea2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {

            }

            public void keyTyped(java.awt.event.KeyEvent evt) {
                codeArea2KeyTyped(evt);
            }
        });
        jScrollPane5.setViewportView(codeArea2);
        
        //Autómatas
        obj=new validacionesAutomata();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnAbrirArchivo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEjecutar = new javax.swing.JButton();
        btnCompilar = new javax.swing.JButton();
        body = new javax.swing.JPanel();
        jTabbedPane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        codeArea1 = new javax.swing.JTextPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        codeArea2 = new javax.swing.JTextPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tokenArea = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        SimboloArea = new javax.swing.JTextArea();
        footer = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        errorArea = new javax.swing.JTextArea();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        automataArea = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        gramaticaArea = new javax.swing.JTextArea();
        menu = new javax.swing.JMenuBar();
        menArchivo = new javax.swing.JMenu();
        menNuevo = new javax.swing.JMenuItem();
        menAbrir = new javax.swing.JMenuItem();
        menGuardar = new javax.swing.JMenuItem();
        menEjecutar = new javax.swing.JMenu();
        menEjecuta = new javax.swing.JMenuItem();
        menCompila = new javax.swing.JMenuItem();
        menVentana = new javax.swing.JMenu();
        menEjemplo = new javax.swing.JMenuItem();
        menCerrar = new javax.swing.JMenuItem();
        menAyuda = new javax.swing.JMenu();
        menDoc = new javax.swing.JMenuItem();
        menInfo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Find a ClassRoom");
        setName(""); // NOI18N
        setUndecorated(true);
        setSize(new java.awt.Dimension(1000, 900));

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/document-new.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnAbrirArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user-home.png"))); // NOI18N
        btnAbrirArchivo.setText("Abrir");

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/GuardarTodo.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEjecutar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Next.png"))); // NOI18N
        btnEjecutar.setText("Ejecutar");

        btnCompilar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/accept.png"))); // NOI18N
        btnCompilar.setText("Compilar");
        btnCompilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompilarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAbrirArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEjecutar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCompilar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEjecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnCompilar)
                                .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(27, 27, 27))
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAbrirArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        body.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        body.setName(""); // NOI18N

        jTabbedPane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        codeArea1.setText("grupo ( nombre , 30 , carreras );\nmaestro ( nombre , 1 , 23 , 1 );\naula ( Nombre , 32 );\nrecurso ( nombre , 1 , si );\nmateria ( nombre , carrera );\nasignarRecurso ( nombre , materia );\nasignarGrupo ( nombreGrupo , nombreMateria );\nasignarAula ( nombreAula , nombreGrupo );\nasignarMaestro ( nombreMaestro , nombreGrupo );\nasignarHora ( nombreGrupo , 12 );");
        codeArea1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codeArea1KeyTyped(evt);
            }
        });
        jScrollPane4.setViewportView(codeArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
        );

        jTabbedPane.addTab("Asignaciones", jPanel1);

        codeArea2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codeArea2KeyTyped(evt);
            }
        });
        jScrollPane5.setViewportView(codeArea2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5)
        );

        jTabbedPane.addTab("Consultas", jPanel2);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tokenArea.setColumns(20);
        tokenArea.setRows(5);
        jScrollPane1.setViewportView(tokenArea);

        jTabbedPane1.addTab("Token", jScrollPane1);

        SimboloArea.setColumns(20);
        SimboloArea.setRows(5);
        jScrollPane6.setViewportView(SimboloArea);

        jTabbedPane1.addTab("Tabla de simbolos", jScrollPane6);

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                .addComponent(jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addComponent(jTabbedPane))
                .addContainerGap())
        );

        errorArea.setColumns(20);
        errorArea.setRows(5);
        errorArea.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Salida"));
        jScrollPane3.setViewportView(errorArea);

        jTabbedPane2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        automataArea.setColumns(20);
        automataArea.setRows(5);
        jScrollPane2.setViewportView(automataArea);

        jTabbedPane2.addTab("Automata", jScrollPane2);

        gramaticaArea.setColumns(20);
        gramaticaArea.setRows(5);
        jScrollPane7.setViewportView(gramaticaArea);

        jTabbedPane2.addTab("Gramatica", jScrollPane7);

        javax.swing.GroupLayout footerLayout = new javax.swing.GroupLayout(footer);
        footer.setLayout(footerLayout);
        footerLayout.setHorizontalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                .addContainerGap())
        );
        footerLayout.setVerticalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerLayout.createSequentialGroup()
                .addGroup(footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        menArchivo.setText("Archivo");

        menNuevo.setText("Nuevo");
        menArchivo.add(menNuevo);

        menAbrir.setText("Abrir");
        menArchivo.add(menAbrir);

        menGuardar.setText("Guardar");
        menArchivo.add(menGuardar);

        menu.add(menArchivo);

        menEjecutar.setText("Operaciones");

        menEjecuta.setText("Ejecutar");
        menEjecutar.add(menEjecuta);

        menCompila.setText("Compilar");
        menEjecutar.add(menCompila);

        menu.add(menEjecutar);

        menVentana.setText("Ventana");

        menEjemplo.setText("Ejmplo");
        menVentana.add(menEjemplo);

        menCerrar.setText("Cerrar");
        menVentana.add(menCerrar);

        menu.add(menVentana);

        menAyuda.setText("Ayuda");

        menDoc.setText("Documentacion");
        menAyuda.add(menDoc);

        menInfo.setText("Info");
        menAyuda.add(menInfo);

        menu.add(menAyuda);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(body, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(footer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(footer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codeArea1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codeArea1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_codeArea1KeyTyped

    private void codeArea2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codeArea2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_codeArea2KeyTyped

    private void btnCompilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompilarActionPerformed
        // TODO add your handling code here:
        obj.analizarLxL(automataArea,errorArea,tokenArea,codeArea1.getText());
        
        
    }//GEN-LAST:event_btnCompilarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea SimboloArea;
    private javax.swing.JTextArea automataArea;
    private javax.swing.JPanel body;
    private javax.swing.JButton btnAbrirArchivo;
    private javax.swing.JButton btnCompilar;
    private javax.swing.JButton btnEjecutar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JTextPane codeArea1;
    private javax.swing.JTextPane codeArea2;
    private javax.swing.JTextArea errorArea;
    private javax.swing.JPanel footer;
    private javax.swing.JTextArea gramaticaArea;
    private javax.swing.JPanel header;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JMenuItem menAbrir;
    private javax.swing.JMenu menArchivo;
    private javax.swing.JMenu menAyuda;
    private javax.swing.JMenuItem menCerrar;
    private javax.swing.JMenuItem menCompila;
    private javax.swing.JMenuItem menDoc;
    private javax.swing.JMenuItem menEjecuta;
    private javax.swing.JMenu menEjecutar;
    private javax.swing.JMenuItem menEjemplo;
    private javax.swing.JMenuItem menGuardar;
    private javax.swing.JMenuItem menInfo;
    private javax.swing.JMenuItem menNuevo;
    private javax.swing.JMenu menVentana;
    private javax.swing.JMenuBar menu;
    private javax.swing.JTextArea tokenArea;
    // End of variables declaration//GEN-END:variables
}
