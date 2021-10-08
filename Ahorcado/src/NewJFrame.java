import java.util.Random;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class NewJFrame extends javax.swing.JFrame {

   public String palabras[]= {"casas","amigo","salas","amiga", "mesas","abran","abras","acres","aguda",
"agudo","alojo","andas","apodo","arcos","arios","arpas","asees","balas","bares","bayas","bebes","besos",
"betas","bonos","botas","botes","callo","canas","canes","capas","caros","casas","cazas","cerdo","chefs",
"Chile","China","ciega","clubs","cojos","colas","conos","coral","Corea","corra","coses","crees","croar",
"cruje","cubas","cuida","cuide","culos","cunas","dedos","diles","donas","dotes","Dubai","dunas","ellos",
"emoji","enojo","entes","erizo","errar","estas"};
    
    
    public int chances = 0;
    
    public NewJFrame() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/ultimo.png")));
        aleatorio();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 36)); // NOI18N
        jLabel1.setText("Ahorcado");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Verificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Oportunidades= 5");

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Reiniciar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Ingrese carácter (minusculas)");

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("Ver Respuesta");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(16, 16, 16))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addGap(0, 11, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        verificar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        aleatorio();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        letras(posiciones);
    }//GEN-LAST:event_jButton4ActionPerformed
    
    public boolean encontrado;
    private void verificar(){
        
        if((jTextField1.getText().length())>1||jTextField1.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Ingrese un caracter");
            return;
        }else{
            char c []= palabras[posiciones].toCharArray();
            String text= jTextField1.getText();
            char letra = text.charAt(0);
            boolean encontrado= false;
            encontrado=false;
            if(letra==c[0]){
                jTextField2.setText(""+c[0]); 
                encontrado=true;    
            }         
            if(letra==c[1]){
                jTextField3.setText(""+c[1]); 
                encontrado=true; 
            }        
            if(letra==c[2]){
                jTextField4.setText(""+c[2]); 
                encontrado=true;  
            }     
            if(letra==c[3]){
                 jTextField5.setText(""+c[3]); 
                 encontrado=true;  
            }      
            if(letra==c[4]){
               jTextField6.setText(""+c[4]); 
               encontrado=true;  

            }
            comprobar2();      
            if(encontrado){
                return;
                
            }else{
              numeros();
              chances++;
            }
            
        } 
    }
    private void comprobar2 (){
        String text1= jTextField2.getText();
        String text2= jTextField3.getText();
        String text3= jTextField4.getText();
        String text4= jTextField5.getText();
        String text5= jTextField6.getText();
        char letra1 = text1.charAt(0);
        char letra2 = text2.charAt(0);
        char letra3 = text3.charAt(0);
        char letra4 = text4.charAt(0);
        char letra5 = text5.charAt(0);
        if(letra1!='*'&&letra2!='*'&&letra3!='*'&&
           letra4!='*'&&letra5!='*'&&chances<=5){
            JOptionPane.showMessageDialog(null, "Usted ha ganado");
            int input = JOptionPane.showConfirmDialog(null, 
                "Quiere jugar de nuevo", "Jugar otra vez", 
                JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if(input==0){
            aleatorio();
        }else{
            System.exit(0); 
        }
        }
        
    }
    private void letras(int n){
        char c []= palabras[n].toCharArray();
        jTextField2.setText(""+c[0]);
        jTextField3.setText(""+c[1]);
        jTextField4.setText(""+c[2]);
        jTextField5.setText(""+c[3]);
        jTextField6.setText(""+c[4]);
    }
    
    
    private void numeros(){
        if(chances==0){
            jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cabeza.png")));
            jLabel2.setText("Oportunidades=5");
        }
        if(chances==1){
            jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brazo.png")));
            jLabel2.setText("Oportunidades=4");
        }
        if(chances==2){
            jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brazo2.png")));
            jLabel2.setText("Oportunidades=3");
        }
        if(chances==3){
            jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pierna.png")));
            jLabel2.setText("Oportunidades=2");
        }
        if(chances==4){
            jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/piernas.png")));
            jLabel2.setText("Oportunidades=1");
        }
         if(chances==5){
            jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ultimo.png")));
            letras(posiciones);
            int input = JOptionPane.showConfirmDialog(null, 
                "Quiere jugar de nuevo", "Usted perdió", 
                JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if(input==0){
            aleatorio();
            chances=0;
        }else{
            System.exit(0); 
        }
        }
        
    }
    public int posiciones;
    private void aleatorio(){
        chances=0;
        Random numero = new Random();
        int num = numero.nextInt(61);
        //letras(num);
        jTextField2.setText("*");
        jTextField3.setText("*");
        jTextField4.setText("*");
        jTextField5.setText("*");
        jTextField6.setText("*");
        posiciones=num;
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        jLabel2.setText("Oportunidades=5");
    }
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
