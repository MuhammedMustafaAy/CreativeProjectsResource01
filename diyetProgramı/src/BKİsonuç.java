
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class BKİsonuç extends JFrame {

    public BKİsonuç() {
        try{
        initComponents();
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(null,"Hata bulundu,Tekrar giriş yapınız");
        }
       }
    
   int op;
     public BKİsonuç(String gelenV,int sın) {
        initComponents();
        try{
         BKİreturn.setText(gelenV);
         op=sın;
        }
        catch(Exception e){
         JOptionPane.showMessageDialog(null,"Hata bulundu,Tekrar giriş yapınız");
        }
       }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        BKİreturn = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        devamButon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BKİreturn.setColumns(20);
        BKİreturn.setForeground(new java.awt.Color(0, 255, 255));
        BKİreturn.setRows(5);
        BKİreturn.setEnabled(false);
        jScrollPane1.setViewportView(BKİreturn);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 69, 225, 105));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {" <<18", "ZAYIF"},
                {"18-25", "SAĞLIKLI"},
                {"25-30", "FAZLA KİLOLU"},
                {">>30", "OBEZ"}
            },
            new String [] {
                "BKİ", "SONUÇ"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 69, 201, 105));

        jLabel1.setText("Beden kitle indeksi sonuçlarınız:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 35, 217, -1));

        devamButon.setBackground(new java.awt.Color(0, 255, 255));
        devamButon.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        devamButon.setText("devam");
        devamButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devamButonActionPerformed(evt);
            }
        });
        getContentPane().add(devamButon, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 242, -1, -1));

        getAccessibleContext().setAccessibleParent(BKİreturn);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void devamButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devamButonActionPerformed
       try{
           new yemekListesi(op).setVisible(true);
       }
    
    catch(Exception e){
         JOptionPane.showMessageDialog(null,"Hata bulundu,Tekrar giriş yapınız");
    }
    }//GEN-LAST:event_devamButonActionPerformed

    public static void main(String args[]) {
     
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try{
                new BKİsonuç().setVisible(true);
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null,"Hata bulundu,Tekrar giriş yapınız");
                }
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea BKİreturn;
    private javax.swing.JButton devamButon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
