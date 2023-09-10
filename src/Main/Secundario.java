package Main;

import db.Conectar;
import java.awt.*;
import javax.swing.*;
import java.sql.*;

public class Secundario extends javax.swing.JFrame {

    Conectar con = new Conectar();
    Connection cn = con.conexion();

    int xMouse, yMouse;
    int idAdmin = 0;

    public Secundario() {
        initComponents();

        this.setLocationRelativeTo(null);

        idAdmin = Login.idAdmin;

        try {
            PreparedStatement ps = cn.prepareStatement("SELECT nombre FROM alumnos WHERE id_alumno ='" + idAdmin + "'");
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String nombre = rs.getString("nombre");
                if (nombre.indexOf(" ") != -1) {
                    nombre = nombre.substring(0, rs.getString("nombre").indexOf(" "));
                }

                nombreTxt.setText(nombre.toUpperCase());
            }
        } catch (Exception e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "Error al cargar su nombre... Contacte al administrador");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        userIcon = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JLabel();
        bienvenido = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JPanel();
        logoutBtnTxt = new javax.swing.JLabel();
        gestionCalificacionesBtn = new javax.swing.JPanel();
        gestionCalificacionesBtnTxt = new javax.swing.JLabel();
        fondoLog = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitLabel = new javax.swing.JLabel();
        alumnosBtn = new javax.swing.JPanel();
        alumnosBtnTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 500));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        bg.setRequestFocusEnabled(false);
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Roboto Black", 1, 43)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("MENÚ PRINCIPAL");
        bg.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 570, 70));

        userIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/userIcon.png"))); // NOI18N
        bg.add(userIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 160, 160));

        nombreTxt.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        nombreTxt.setForeground(new java.awt.Color(255, 255, 255));
        nombreTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreTxt.setText("(Nombre)");
        bg.add(nombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 230, 50));

        bienvenido.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        bienvenido.setForeground(new java.awt.Color(255, 255, 255));
        bienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bienvenido.setText("Bienvenido(a)");
        bg.add(bienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 230, 50));

        logoutBtnTxt.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        logoutBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoutBtnTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoutIcon.png"))); // NOI18N
        logoutBtnTxt.setText("Cerrar Sesión");
        logoutBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout logoutBtnLayout = new javax.swing.GroupLayout(logoutBtn);
        logoutBtn.setLayout(logoutBtnLayout);
        logoutBtnLayout.setHorizontalGroup(
            logoutBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoutBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        logoutBtnLayout.setVerticalGroup(
            logoutBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logoutBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logoutBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 120, 30));

        gestionCalificacionesBtn.setBackground(new java.awt.Color(110, 46, 143));

        gestionCalificacionesBtnTxt.setFont(new java.awt.Font("Roboto Black", 1, 22)); // NOI18N
        gestionCalificacionesBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        gestionCalificacionesBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gestionCalificacionesBtnTxt.setText("CALIFICACIONES");
        gestionCalificacionesBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gestionCalificacionesBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gestionCalificacionesBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gestionCalificacionesBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gestionCalificacionesBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout gestionCalificacionesBtnLayout = new javax.swing.GroupLayout(gestionCalificacionesBtn);
        gestionCalificacionesBtn.setLayout(gestionCalificacionesBtnLayout);
        gestionCalificacionesBtnLayout.setHorizontalGroup(
            gestionCalificacionesBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gestionCalificacionesBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(gestionCalificacionesBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        gestionCalificacionesBtnLayout.setVerticalGroup(
            gestionCalificacionesBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gestionCalificacionesBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(gestionCalificacionesBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(gestionCalificacionesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 470, 60));

        fondoLog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoPrincipal.jpg"))); // NOI18N
        bg.add(fondoLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 500));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));

        exitLabel.setBackground(new java.awt.Color(255, 255, 255));
        exitLabel.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        exitLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitLabel.setText("X");
        exitLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitLabel.setPreferredSize(new java.awt.Dimension(40, 40));
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(758, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 798, 40));

        alumnosBtn.setBackground(new java.awt.Color(110, 46, 143));

        alumnosBtnTxt.setFont(new java.awt.Font("Roboto Black", 1, 22)); // NOI18N
        alumnosBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        alumnosBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alumnosBtnTxt.setText("MATRICULA");
        alumnosBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        alumnosBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alumnosBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                alumnosBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                alumnosBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout alumnosBtnLayout = new javax.swing.GroupLayout(alumnosBtn);
        alumnosBtn.setLayout(alumnosBtnLayout);
        alumnosBtnLayout.setHorizontalGroup(
            alumnosBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, alumnosBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(alumnosBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addContainerGap())
        );
        alumnosBtnLayout.setVerticalGroup(
            alumnosBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(alumnosBtnTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        bg.add(alumnosBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseClicked
        int valor = JOptionPane.showConfirmDialog(null, "¿Desea cerrar la aplicación?",
                "ADVERTENCIA", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

        if (valor == JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_exitLabelMouseClicked

    private void exitLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseEntered
        exitBtn.setBackground(Color.red);
        exitLabel.setForeground(Color.white);
    }//GEN-LAST:event_exitLabelMouseEntered

    private void exitLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseExited
        exitBtn.setBackground(Color.white);
        exitLabel.setForeground(Color.black);
    }//GEN-LAST:event_exitLabelMouseExited

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void gestionCalificacionesBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionCalificacionesBtnTxtMouseClicked

    }//GEN-LAST:event_gestionCalificacionesBtnTxtMouseClicked

    private void gestionCalificacionesBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionCalificacionesBtnTxtMouseEntered
        gestionCalificacionesBtn.setBackground(new Color(124, 52, 163));
    }//GEN-LAST:event_gestionCalificacionesBtnTxtMouseEntered

    private void gestionCalificacionesBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionCalificacionesBtnTxtMouseExited
        gestionCalificacionesBtn.setBackground(new Color(110, 46, 143));
    }//GEN-LAST:event_gestionCalificacionesBtnTxtMouseExited

    private void logoutBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnTxtMouseExited
        logoutBtn.setBackground(Color.WHITE);
    }//GEN-LAST:event_logoutBtnTxtMouseExited

    private void logoutBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnTxtMouseEntered
        logoutBtn.setBackground(new Color(230, 230, 230));
    }//GEN-LAST:event_logoutBtnTxtMouseEntered

    private void logoutBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnTxtMouseClicked
        Login login = new Login();

        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutBtnTxtMouseClicked

    private void alumnosBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alumnosBtnTxtMouseClicked
        Matricula matricula = new Matricula();

        matricula.setVisible(true);
        dispose();
    }//GEN-LAST:event_alumnosBtnTxtMouseClicked

    private void alumnosBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alumnosBtnTxtMouseEntered
        alumnosBtn.setBackground(new Color (124, 52, 163));
    }//GEN-LAST:event_alumnosBtnTxtMouseEntered

    private void alumnosBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alumnosBtnTxtMouseExited
        alumnosBtn.setBackground(new Color (110,46,143));
    }//GEN-LAST:event_alumnosBtnTxtMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Secundario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel alumnosBtn;
    private javax.swing.JLabel alumnosBtnTxt;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel bienvenido;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JLabel fondoLog;
    private javax.swing.JPanel gestionCalificacionesBtn;
    private javax.swing.JLabel gestionCalificacionesBtnTxt;
    private javax.swing.JPanel header;
    private javax.swing.JPanel logoutBtn;
    private javax.swing.JLabel logoutBtnTxt;
    private javax.swing.JLabel nombreTxt;
    private javax.swing.JLabel title;
    private javax.swing.JLabel userIcon;
    // End of variables declaration//GEN-END:variables
}
