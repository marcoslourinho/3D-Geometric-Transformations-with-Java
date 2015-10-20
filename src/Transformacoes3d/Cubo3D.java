
package Transformacoes3d;

/**
 * @author Marcos Pereira - 10/2015
 * facebook.com/marcospereira22
 * instagram: @marcospereira_7
 * github.com/marcospereira7
 */

import com.sun.j3d.utils.geometry.ColorCube;
import com.sun.j3d.utils.universe.SimpleUniverse;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.vecmath.Vector3f;


public class Cubo3D extends javax.swing.JFrame implements Runnable {
    
    double escala = 0.3;
    
    SimpleUniverse universo = new SimpleUniverse();
    BranchGroup grupo = new BranchGroup();
    ColorCube cubo = new ColorCube(escala);
    TransformGroup GT = new TransformGroup();
    Transform3D transf = new Transform3D();
    
    double X=0;
    double Y=0;
    double Z=0;
    
    float xPos = 0;
    float yPos = 0;
    float zPos = 0;

    Vector3f vetor = new Vector3f(0,0,0);
   
    public Cubo3D() {
        GT.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);

        GT.setTransform(transf);  
        GT.addChild(cubo);
        grupo.addChild(GT);
        universo.getViewingPlatform().setNominalViewingTransform();
        universo.addBranchGraph(grupo);
        transf.setTranslation(vetor);
        initComponents();
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_rotX = new javax.swing.JButton();
        btn_rotY = new javax.swing.JButton();
        btn_Transx = new javax.swing.JButton();
        btn_Transy = new javax.swing.JButton();
        btn_TransZ = new javax.swing.JButton();
        btn_rotZ = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_rotX.setText("Rotacionar em X");
        btn_rotX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rotXActionPerformed(evt);
            }
        });

        btn_rotY.setText("Rotacionar em Y");
        btn_rotY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rotYActionPerformed(evt);
            }
        });

        btn_Transx.setText("Transladar em X");
        btn_Transx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TransxActionPerformed(evt);
            }
        });

        btn_Transy.setText("Transladar em Y");
        btn_Transy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TransyActionPerformed(evt);
            }
        });

        btn_TransZ.setText("Transladar em Z");
        btn_TransZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TransZActionPerformed(evt);
            }
        });

        btn_rotZ.setText("Rotacionar em Z");
        btn_rotZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rotZActionPerformed(evt);
            }
        });

        jLabel1.setText("PAINEL DE CONTROLE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_Transy, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(btn_Transx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_TransZ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_rotY, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_rotZ, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_rotX, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Transx)
                    .addComponent(btn_rotX))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Transy)
                    .addComponent(btn_rotY))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_TransZ)
                    .addComponent(btn_rotZ))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_rotXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rotXActionPerformed
        
        X=X+0.1;
        transf.rotX(X);
        GT.setTransform(transf);
           
    }//GEN-LAST:event_btn_rotXActionPerformed

    private void btn_rotYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rotYActionPerformed
         Y=Y+0.1;
         transf.rotY(Y);
         GT.setTransform(transf);
    }//GEN-LAST:event_btn_rotYActionPerformed

    private void btn_TransxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TransxActionPerformed
        
        xPos+=0.1;
        vetor.setX(xPos);
        transf.setTranslation(vetor);
        GT.setTransform(transf);
        
    }//GEN-LAST:event_btn_TransxActionPerformed

    private void btn_TransyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TransyActionPerformed
           
        yPos+=0.1;
        vetor.setY(yPos);
        transf.setTranslation(vetor);
        GT.setTransform(transf);
        
    }//GEN-LAST:event_btn_TransyActionPerformed

    private void btn_TransZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TransZActionPerformed
       
        zPos+=0.1;
        vetor.setZ(zPos);
        transf.setTranslation(vetor);
        GT.setTransform(transf);

    }//GEN-LAST:event_btn_TransZActionPerformed

    private void btn_rotZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rotZActionPerformed
         
         Z=Z+0.1;
         transf.rotZ(Z);
         GT.setTransform(transf);
    }//GEN-LAST:event_btn_rotZActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
         new Cubo3D().setVisible(true);
     }

   @Override
    public void run() {
       
            }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_TransZ;
    private javax.swing.JButton btn_Transx;
    private javax.swing.JButton btn_Transy;
    private javax.swing.JButton btn_rotX;
    private javax.swing.JButton btn_rotY;
    private javax.swing.JButton btn_rotZ;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
