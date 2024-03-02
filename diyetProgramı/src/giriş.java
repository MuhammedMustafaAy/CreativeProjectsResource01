
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author MUHAMMED MUSTAFA AY
 */
public class giriş extends javax.swing.JFrame {

    
    public giriş() {
    try{
        initComponents();
    }
    catch(Exception e){
         JOptionPane.showMessageDialog(null,"Hata bulundu,Tekrar giriş yapınız");
    }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        adAlan = new javax.swing.JTextField();
        soyadAlan = new javax.swing.JTextField();
        boyAlan = new javax.swing.JTextField();
        kütleAlan = new javax.swing.JTextField();
        devamButon = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DİYET PROGRAMI'NA HOŞGELDİNİZ!");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 255));
        jLabel1.setText("Lütfen kullanıcı bilgilerini giriniz.");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 50, 190, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("Adınız :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(63, 84, 87, 28);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("Soyadınız :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(63, 118, 87, 28);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 255));
        jLabel4.setText("Boyunuz(cm) :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(63, 152, 87, 25);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 255));
        jLabel5.setText("Kilonuz(kg) :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(63, 183, 87, 28);

        adAlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adAlanActionPerformed(evt);
            }
        });
        getContentPane().add(adAlan);
        adAlan.setBounds(162, 84, 159, 28);
        getContentPane().add(soyadAlan);
        soyadAlan.setBounds(162, 118, 159, 28);

        boyAlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boyAlanActionPerformed(evt);
            }
        });
        getContentPane().add(boyAlan);
        boyAlan.setBounds(162, 152, 159, 25);

        kütleAlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kütleAlanActionPerformed(evt);
            }
        });
        getContentPane().add(kütleAlan);
        kütleAlan.setBounds(162, 183, 159, 28);

        devamButon.setBackground(new java.awt.Color(0, 255, 255));
        devamButon.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        devamButon.setText("Devam Et");
        devamButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devamButonActionPerformed(evt);
            }
        });
        getContentPane().add(devamButon);
        devamButon.setBounds(231, 217, 90, 21);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yemek_resim/resim14.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, -20, 400, 350);

        setSize(new java.awt.Dimension(400, 357));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void adAlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adAlanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adAlanActionPerformed

    private void kütleAlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kütleAlanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kütleAlanActionPerformed

    private void boyAlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boyAlanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boyAlanActionPerformed
     int scal = 0;
    private void devamButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devamButonActionPerformed
      try{
        String ad = adAlan.getText();
        String soyad = soyadAlan.getText();
        double boy = Double.parseDouble(boyAlan.getText());
        double kütle = Double.parseDouble(kütleAlan.getText());
       
        double bki = (kütle/((boy*boy)/10000));
        String s = null;
        if(bki <18)
    {
        scal=800;
       s = "ZAYIF"+"\n"+"Size özel diyet programı ile"+"\n"+" "
               + "sağlıklı şekilde kilo alın.";
    }   
    else if(bki >= 18 && bki<25)
    {
        scal=600;
     s = "NORMAL"+"\n"+"Size özel diyet programı ile"+"\n"
             +"formda kalmaya devam edin. ";
    }
    else if(bki >= 25 && bki <30)
    {
        scal=500;
     s=   "FAZLA KİLOLU"+"\n"+"Size özel diyet programı ile"+"\n"
             +" sağlıklı şekilde kilo verin";        
    }
    else if(bki >= 30)
    {
        scal=400;
     s= "OBEZ"+"\n"+"Size özel diyet programı ile"+"\n"
             +" sağlıklı şekilde kilo verin";
    }
        String yorum="Sayın "+ad+" "+soyad+"\n"+
                "Beden kitle indeksiniz: "+String.valueOf(bki)+"\n"
                +"Durumunuz: "+s;
             
        
        new BKİsonuç(yorum,scal).setVisible(true);
        
      } 
        catch(NumberFormatException e){
             JOptionPane.showMessageDialog(null,"Hatalı giriş !!!");
    
}
    }//GEN-LAST:event_devamButonActionPerformed
 
  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try{
                new giriş().setVisible(true);
            }
                catch(Exception e){
              JOptionPane.showMessageDialog(null,"Hatalı giriş !!!");   
                    
                }
            }
            
        });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adAlan;
    private javax.swing.JTextField boyAlan;
    private javax.swing.JButton devamButon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField kütleAlan;
    private javax.swing.JTextField soyadAlan;
    // End of variables declaration//GEN-END:variables
}
