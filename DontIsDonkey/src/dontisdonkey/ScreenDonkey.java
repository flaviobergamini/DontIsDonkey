package dontisdonkey;

import java.awt.Color;
import static java.lang.Thread.sleep;
import java.util.Random;

/**
 * @author Flávio Henrique Madureira Bergamini 
 * Imagens criadas por: Felipe Pereira Silveira
 */
public class ScreenDonkey extends javax.swing.JFrame{

    public ScreenDonkey() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    static private int colorPanel = 0;
    static volatile boolean exit = true;
    RunCar1 RC1 = new RunCar1();
    RunCar2 RC2 = new RunCar2();
    RunCar3 RC3 = new RunCar3();
    RunCar4 RC4 = new RunCar4();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        street = new javax.swing.JPanel();
        car2 = new javax.swing.JLabel();
        car3 = new javax.swing.JLabel();
        car1 = new javax.swing.JLabel();
        car4 = new javax.swing.JLabel();
        d1 = new javax.swing.JPanel();
        d2 = new javax.swing.JPanel();
        d3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnStart = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jtCar1 = new javax.swing.JTextField();
        jtCar2 = new javax.swing.JTextField();
        jtCar3 = new javax.swing.JTextField();
        jtCar4 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        panelV = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        street.setBackground(new java.awt.Color(79, 79, 79));

        car2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carro_Amarelo.png"))); // NOI18N

        car3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carro_Verde.png"))); // NOI18N

        car1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carro_Vermelho.png"))); // NOI18N

        car4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carro_Azul.png"))); // NOI18N

        javax.swing.GroupLayout d1Layout = new javax.swing.GroupLayout(d1);
        d1.setLayout(d1Layout);
        d1Layout.setHorizontalGroup(
            d1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        d1Layout.setVerticalGroup(
            d1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout d2Layout = new javax.swing.GroupLayout(d2);
        d2.setLayout(d2Layout);
        d2Layout.setHorizontalGroup(
            d2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        d2Layout.setVerticalGroup(
            d2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout d3Layout = new javax.swing.GroupLayout(d3);
        d3.setLayout(d3Layout);
        d3Layout.setHorizontalGroup(
            d3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        d3Layout.setVerticalGroup(
            d3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout streetLayout = new javax.swing.GroupLayout(street);
        street.setLayout(streetLayout);
        streetLayout.setHorizontalGroup(
            streetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(streetLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(car1)
                .addGap(36, 36, 36)
                .addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(car2)
                .addGap(31, 31, 31)
                .addComponent(d2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(car3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(d3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(car4)
                .addGap(38, 38, 38))
        );
        streetLayout.setVerticalGroup(
            streetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(d1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(d3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(d2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, streetLayout.createSequentialGroup()
                .addContainerGap(744, Short.MAX_VALUE)
                .addGroup(streetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, streetLayout.createSequentialGroup()
                        .addComponent(car2)
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, streetLayout.createSequentialGroup()
                        .addComponent(car4)
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, streetLayout.createSequentialGroup()
                        .addComponent(car1)
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, streetLayout.createSequentialGroup()
                        .addComponent(car3)
                        .addGap(82, 82, 82))))
        );

        getContentPane().add(street, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 0, -1, 916));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Lateral_Pista_Esquerda.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Lateral_Pista_Direita.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1206, 0, -1, 916));

        jPanel1.setBackground(new java.awt.Color(54, 54, 54));

        btnStart.setBackground(new java.awt.Color(107, 142, 35));
        btnStart.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnStart.setForeground(new java.awt.Color(220, 220, 220));
        btnStart.setText("Start");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(54, 54, 54));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tempo de Execução em Segundos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(240, 240, 240))); // NOI18N
        jPanel3.setFocusCycleRoot(true);

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(0, 255, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        jtCar1.setBackground(new java.awt.Color(54, 54, 54));
        jtCar1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtCar1.setForeground(new java.awt.Color(240, 240, 240));
        jtCar1.setText("0.000");

        jtCar2.setBackground(new java.awt.Color(54, 54, 54));
        jtCar2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtCar2.setForeground(new java.awt.Color(240, 240, 240));
        jtCar2.setText("0.000");

        jtCar3.setBackground(new java.awt.Color(54, 54, 54));
        jtCar3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtCar3.setForeground(new java.awt.Color(240, 240, 240));
        jtCar3.setText("0.000");

        jtCar4.setBackground(new java.awt.Color(54, 54, 54));
        jtCar4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtCar4.setForeground(new java.awt.Color(240, 240, 240));
        jtCar4.setText("0.000");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtCar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtCar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtCar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtCar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtCar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtCar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtCar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtCar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(54, 54, 54));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vencedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(240, 240, 240))); // NOI18N

        panelV.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panelVLayout = new javax.swing.GroupLayout(panelV);
        panelV.setLayout(panelVLayout);
        panelVLayout.setHorizontalGroup(
            panelVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 378, Short.MAX_VALUE)
        );
        panelVLayout.setVerticalGroup(
            panelVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(panelV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Flávio Henrique Madureira Bergamini GEC");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Felipe Pereira Silveira - GEA");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("2021");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel5))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 923, 1753, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        /*
        System.out.println("Hora: " + System.currentTimeMillis());
        System.out.println("Car1: " + car1.getX()+" " + " " + car1.getY());
        System.out.println("Car2: " + car2.getX()+" " + " " + car2.getY());
        System.out.println("Car3: " + car3.getX()+" " + " " + car3.getY());
        System.out.println("Car4: " + car4.getX()+" " + " " + car4.getY()); */

        panelV.setBackground(Color.black);
        repaint();   
        if((RC1.isAlive() == false) && (RC2.isAlive() == false) && (RC3.isAlive() == false) && (RC3.isAlive() == false)){
            RC1.start();
            RC2.start();
            RC3.start();
            RC4.start();
            panelV.setBackground(Color.black);
        }
        else{
            panelV.setBackground(Color.black);
            colorPanel = 0; 
            jtCar1.setText("0.000");
            jtCar2.setText("0.000");
            jtCar3.setText("0.000");
            jtCar4.setText("0.000");        
            car1.setBounds(36, 746, 200, 200);
            car2.setBounds(199, 746, 200, 200);
            car3.setBounds(361, 746, 200, 200);
            car4.setBounds(542, 746, 200, 200);
        }
    }//GEN-LAST:event_btnStartActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScreenDonkey().setVisible(true);
            }
        });
    }

    public class RunCar1 extends Thread{
       public void run() {
           Random g1 = new Random();
           String timeString = "";
           while(exit){
               long time1 = System.currentTimeMillis();
               try{
                   sleep(g1.nextInt(50));
               }catch(Exception error){}
               if(car1.getY() > 0){
                   car1.setBounds(36, car1.getY()-1, 200, 200);
                   timeString = ""+(System.currentTimeMillis() - time1)/1000F;
                   jtCar1.setText(timeString);
               }
               else if(colorPanel == 0){
                   panelV.setBackground(Color.red);
                   colorPanel = 1;
               }       
           }
       } 
    }  
    
    public class RunCar2 extends Thread{
       public void run() {
           Random g2 = new Random();
           String timeString = "";
           while(exit){
               long time1 = System.currentTimeMillis();
               try{
                   sleep(g2.nextInt(50));
               }catch(Exception error){}
               if(car2.getY() > 0){
                   car2.setBounds(199, car2.getY()-1, 200, 200);
                   timeString = ""+(System.currentTimeMillis() - time1)/1000F;
                   jtCar2.setText(timeString);
               }
               else if(colorPanel == 0){
                   panelV.setBackground(Color.yellow);
                   colorPanel = 1;
               }
           }
       } 
    }
 
    public class RunCar3 extends Thread{
       public void run() {
           Random g3 = new Random();
           String timeString = "";
           while(exit){
               long time1 = System.currentTimeMillis();
               try{
                   sleep(g3.nextInt(50));
               }catch(Exception error){}
               if(car3.getY() > -3){
                   car3.setBounds(361, car3.getY()-1, 200, 200);
                   timeString = ""+(System.currentTimeMillis() - time1)/1000F;
                   jtCar3.setText(timeString);
                   //lcar3.setText(timeString);
               }
               else if(colorPanel == 0){
                   panelV.setBackground(Color.green);
                   colorPanel = 1;
               }
           }
       } 
    }
    
    public class RunCar4 extends Thread{
       public void run() {
           Random g4 = new Random();
           String timeString = "";
           while(exit){
               long time1 = System.currentTimeMillis();
               try{
                   sleep(g4.nextInt(50));
               }catch(Exception error){}
               if(car4.getY() > -3){
                   car4.setBounds(542, car4.getY()-1, 200, 200);
                   timeString = ""+(System.currentTimeMillis() - time1)/1000F;
                   jtCar4.setText(timeString);
               }
               else if(colorPanel == 0){
                   panelV.setBackground(Color.blue);
                   colorPanel = 1;
               }
           }
       } 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel car1;
    private javax.swing.JLabel car2;
    private javax.swing.JLabel car3;
    private javax.swing.JLabel car4;
    private javax.swing.JPanel d1;
    private javax.swing.JPanel d2;
    private javax.swing.JPanel d3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField jtCar1;
    private javax.swing.JTextField jtCar2;
    private javax.swing.JTextField jtCar3;
    private javax.swing.JTextField jtCar4;
    private javax.swing.JPanel panelV;
    private javax.swing.JPanel street;
    // End of variables declaration//GEN-END:variables
}
