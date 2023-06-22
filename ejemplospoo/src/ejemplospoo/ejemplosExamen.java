
package ejemplospoo;

//import java.awt.Color;

public class ejemplosExamen extends javax.swing.JFrame {
   CalculadoraEspecial ce = new CalculadoraEspecial("Casio", 123.321);
   public ejemplosExamen() {
      initComponents();
   }

   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      bg = new javax.swing.JPanel();
      header = new javax.swing.JPanel();
      respuesta = new javax.swing.JTextField();
      body = new javax.swing.JPanel();
      palabra1txt = new javax.swing.JTextField();
      palabra2txt = new javax.swing.JTextField();
      palabra3txt = new javax.swing.JTextField();
      cebtn = new javax.swing.JButton();
      concatenarbtn = new javax.swing.JButton();
      num1txt = new javax.swing.JTextField();
      num2txt = new javax.swing.JTextField();
      num3txt = new javax.swing.JTextField();
      concatenarNumbtn = new javax.swing.JButton();
      todobtn = new javax.swing.JButton();
      sumabtn = new javax.swing.JButton();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

      bg.setBackground(new java.awt.Color(255, 255, 255));
      bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

      header.setBackground(new java.awt.Color(255, 204, 204));
      header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

      respuesta.setEditable(false);
      respuesta.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
      respuesta.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
      header.add(respuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 480, 90));

      bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 150));

      body.setBackground(new java.awt.Color(255, 204, 255));
      body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

      palabra1txt.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
      palabra1txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
      body.add(palabra1txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 130, 70));

      palabra2txt.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
      palabra2txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
      body.add(palabra2txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 130, 70));

      palabra3txt.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
      palabra3txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
      body.add(palabra3txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 130, 70));

      cebtn.setBackground(new java.awt.Color(255, 0, 0));
      cebtn.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
      cebtn.setText("CE");
      cebtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      cebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      cebtn.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            cebtnActionPerformed(evt);
         }
      });
      body.add(cebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 60, 50));

      concatenarbtn.setBackground(new java.awt.Color(204, 204, 255));
      concatenarbtn.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
      concatenarbtn.setText("Concatenar Texto");
      concatenarbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      concatenarbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      concatenarbtn.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            concatenarbtnActionPerformed(evt);
         }
      });
      body.add(concatenarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 180, 50));

      num1txt.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
      num1txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
      body.add(num1txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 130, 70));

      num2txt.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
      num2txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
      body.add(num2txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 130, 70));

      num3txt.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
      num3txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
      body.add(num3txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 130, 70));

      concatenarNumbtn.setBackground(new java.awt.Color(204, 204, 255));
      concatenarNumbtn.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
      concatenarNumbtn.setText("Concatenar Numeros");
      concatenarNumbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      concatenarNumbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      concatenarNumbtn.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            concatenarNumbtnActionPerformed(evt);
         }
      });
      body.add(concatenarNumbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 180, 50));

      todobtn.setBackground(new java.awt.Color(204, 204, 255));
      todobtn.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
      todobtn.setText("Todo");
      todobtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      todobtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      todobtn.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            todobtnActionPerformed(evt);
         }
      });
      body.add(todobtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 70, 50));

      sumabtn.setBackground(new java.awt.Color(153, 255, 204));
      sumabtn.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
      sumabtn.setText("+");
      sumabtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      sumabtn.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sumabtnActionPerformed(evt);
         }
      });
      body.add(sumabtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 60, 50));

      bg.add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 500, 250));

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void cebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cebtnActionPerformed
      respuesta.setText("");
      palabra1txt.setText("");
      palabra2txt.setText("");
      palabra3txt.setText("");
      num1txt.setText("");
      num2txt.setText("");
      num3txt.setText("");
   }//GEN-LAST:event_cebtnActionPerformed

   private void concatenarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_concatenarbtnActionPerformed
      String num1 = palabra1txt.getText();
      String num2 = palabra2txt.getText();
      String num3 = palabra3txt.getText();
      
      String concatenar = num1+", " +num2+", "+ num3;
      
      respuesta.setText(concatenar);
   }//GEN-LAST:event_concatenarbtnActionPerformed

   private void concatenarNumbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_concatenarNumbtnActionPerformed
      double num1 = Double.parseDouble(num1txt.getText()); //Double.parseDouble(); concierte el texto a numeros 
      double num2 = Double.parseDouble(num2txt.getText());
      double num3 = Double.parseDouble(num3txt.getText());
      
      String concatenarNumero = String.valueOf(num1)+", "+String.valueOf(num2)+", "+String.valueOf(num3); //String.valueOf(); convierte los numeros a texto
      
      respuesta.setText(concatenarNumero);
   }//GEN-LAST:event_concatenarNumbtnActionPerformed

   private void todobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todobtnActionPerformed
      String num1 = palabra1txt.getText();
      String num2 = palabra2txt.getText();
      String num3 = palabra3txt.getText();
      double num4 = Double.parseDouble(num1txt.getText());  
      double num5 = Double.parseDouble(num2txt.getText());
      double num6 = Double.parseDouble(num3txt.getText()); 
      
      String todo = num1+", "+num2+", "+num3+", "+String.valueOf(num4)+", "+String.valueOf(num5)+", "+String.valueOf(num6);
      
      respuesta.setText(todo);
   }//GEN-LAST:event_todobtnActionPerformed

   private void sumabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumabtnActionPerformed
      double num1 = Double.parseDouble(num1txt.getText()); 
      double num2 = Double.parseDouble(num2txt.getText());
      double num3 = Double.parseDouble(num3txt.getText());
      
      double resultados=ce.sumar(num1, num2, num3);
      
      respuesta.setText(String.valueOf(resultados));
   }//GEN-LAST:event_sumabtnActionPerformed

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JPanel bg;
   private javax.swing.JPanel body;
   private javax.swing.JButton cebtn;
   private javax.swing.JButton concatenarNumbtn;
   private javax.swing.JButton concatenarbtn;
   private javax.swing.JPanel header;
   private javax.swing.JTextField num1txt;
   private javax.swing.JTextField num2txt;
   private javax.swing.JTextField num3txt;
   private javax.swing.JTextField palabra1txt;
   private javax.swing.JTextField palabra2txt;
   private javax.swing.JTextField palabra3txt;
   private javax.swing.JTextField respuesta;
   private javax.swing.JButton sumabtn;
   private javax.swing.JButton todobtn;
   // End of variables declaration//GEN-END:variables
}
