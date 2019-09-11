/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tms;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author bharat
 */
public class TransportManagementSystem extends javax.swing.JFrame {
    
    
    
    
    
    public void allot_busses(){
        
        Connection con = null;
    ResultSet rs,rs1,rs2,rs3,rs4,rs5 = null;
    PreparedStatement pst,pst1,pst2,pst3,pst4,pst5 = null;
    
    
    
    ArrayList<String> r1 = new ArrayList<String>();
    r1.clear();
    ArrayList<String> r2 = new ArrayList<String>();
    r2.clear();
    ArrayList<String> r3 = new ArrayList<String>();
    r3.clear();
    ArrayList<String> r4 = new ArrayList<String>();
    r4.clear();
    ArrayList<String> r5 = new ArrayList<String>();
    r5.clear();
    ArrayList<String> r6 = new ArrayList<String>();
    r6.clear();
   
    
    int clg_to_rjpm = 0;
    int clg_to_srivi = 0;
    int clg_to_pulyankudi = 0;
    int clg_to_sivakasi = 0;
    int clg_to_virudhnagar = 0;
    int clg_to_sankarnkovil = 0;
    
    int no_of_bus_rjpm = 0;
    int no_of_bus_srivi = 0;
    int no_of_bus_pulyankudi = 0;
    int no_of_bus_sivakasi = 0;
    int no_of_bus_virudhnagar = 0;
    int no_of_bus_sankarnkovil = 0;
        
            
            
            String s1 = rjpm.getText();
            int rjpm1 = 0;
            rjpm1 = Integer.parseInt(s1);
            clg_to_rjpm += rjpm1;
            
            String s2 = srivi.getText();
            int srivi1 = 0;
            srivi1 = Integer.parseInt(s2);
            clg_to_srivi += srivi1;
            
            String s3 = snkl.getText();
            int snkl1 = 0;
            snkl1 = Integer.parseInt(s3);
            clg_to_sankarnkovil += snkl1;
            
            String s4 = svg.getText();
            int svg1 = 0;
            svg1 = Integer.parseInt(s4);
            clg_to_pulyankudi += svg1;
            
            String s5 = pyki.getText();
            int pyki1 = 0;
            pyki1 = Integer.parseInt(s5);
            clg_to_pulyankudi += pyki1;
            
            String s6 = vdn.getText();
            int vdn1 = 0;
            vdn1 = Integer.parseInt(s6);
            clg_to_virudhnagar += vdn1;
            
            String s7 = rkp.getText();
            int rkp1 = 0;
            rkp1 = Integer.parseInt(s7);
            clg_to_srivi += rkp1;
            
            String s8 = kp.getText();
            int kp1 = 0;
            kp1 = Integer.parseInt(s8);
            clg_to_srivi += kp1;
            
            String s9 = mli.getText();
            int mli1 = 0;
            mli1 = Integer.parseInt(s9);
            clg_to_virudhnagar += mli1;
            
            String s10 = svk_bs.getText();
            int svk_bs1 = 0;
            svk_bs1 = Integer.parseInt(s10);
            clg_to_sivakasi += svk_bs1;
            
            String s11 = ttg.getText();
            int ttg1 = 0;
            ttg1 = Integer.parseInt(s11);
            clg_to_virudhnagar += ttg1;
                
            String s12 = wtp.getText();
            int wtp1 = 0;
            wtp1 = Integer.parseInt(s12);
            clg_to_srivi += wtp1;
            
            String s13 = mlbu.getText();
            int mlbu1 = 0;
            mlbu1 = Integer.parseInt(s13);
            clg_to_sankarnkovil += mlbu1;
            
            String s14 = tnr.getText();
            int tnr1 = 0;
            tnr1 = Integer.parseInt(s14);
            clg_to_rjpm += tnr1;
            
            String s15 = old_bs.getText();
            int old_bs1 = 0;
            old_bs1 = Integer.parseInt(s15);
            clg_to_rjpm += old_bs1;
            
            String s16 = new_bs.getText();
            int new_bs1 = 0;
            new_bs1 = Integer.parseInt(s16);
            clg_to_rjpm += new_bs1;
            
            String s17 = jm.getText();
            int jm1 = 0;
            jm1 = Integer.parseInt(s17);
            clg_to_rjpm += jm1;

            String s18 = chpti.getText();
            int chpti1 = 0;
            chpti1 = Integer.parseInt(s18);
            clg_to_sivakasi += chpti1;
            
            String s19 = rl.getText();
            int rl1 = 0;
            rl1 = Integer.parseInt(s19);
            clg_to_sivakasi += rl1;
            
            String s20 = srivi_bs.getText();
            int srivi_bs1 = 0;
            srivi_bs1 = Integer.parseInt(s20);
            clg_to_srivi += srivi_bs1;
            
            String s21 = kv.getText();
            int kv1 = 0;
            kv1 = Integer.parseInt(s21);
            clg_to_sankarnkovil += kv1;
            
            String s22 = max_seats.getText();
            int max = 0;
            max = Integer.parseInt(s22);
            
            System.out.println(clg_to_rjpm);
            System.out.println(clg_to_srivi);
            System.out.println(clg_to_pulyankudi);
            System.out.println(clg_to_sivakasi);
            System.out.println(clg_to_virudhnagar);
            System.out.println(clg_to_sankarnkovil);
            
            float p;
            if(clg_to_rjpm == 0)
                no_of_bus_rjpm = 0;
            else{
                    if((clg_to_rjpm%max == 0)||(clg_to_rjpm%max < 60))
                        no_of_bus_rjpm = 1;
                    else
                        no_of_bus_rjpm = 2;
                
                
            }
            
            if(clg_to_srivi == 0)
                no_of_bus_srivi = 0;
            else{
                 if((clg_to_srivi%max == 0)||(clg_to_srivi%max < 60))
                        no_of_bus_srivi = 1;
                    else
                        no_of_bus_srivi = 2;
                
                
                
            }
            
            if(clg_to_pulyankudi == 0)
                no_of_bus_pulyankudi = 0;
            else{
                 if((clg_to_pulyankudi%max == 0)||(clg_to_pulyankudi%max < 60))
                        no_of_bus_pulyankudi = 1;
                    else
                        no_of_bus_pulyankudi = 2;
                
                
                
            }
            
            if(clg_to_sivakasi == 0)
                no_of_bus_sivakasi = 0;
            else{
                if((clg_to_sivakasi%max == 0)||(clg_to_sivakasi%max < 60))
                        no_of_bus_sivakasi = 1;
                    else
                        no_of_bus_sivakasi = 2;
                
                
                
            }
            
            if(clg_to_virudhnagar == 0)
                no_of_bus_virudhnagar = 0;
            else{
               // no_of_bus_virudhnagar = max/clg_to_virudhnagar + 1;
                //int n5 = max%clg_to_virudhnagar;
                //no_of_bus_virudhnagar += n5;
                
                if((clg_to_virudhnagar%max == 0)||(clg_to_virudhnagar%max < 60))
                        no_of_bus_virudhnagar = 1;
                    else
                        no_of_bus_virudhnagar = 2;
                
                
                
                
            }
            
            if(clg_to_sankarnkovil == 0)
                no_of_bus_sankarnkovil = 0;
            else{
                no_of_bus_sankarnkovil = max/clg_to_sankarnkovil + 1;
                //int n6 = max%clg_to_sankarnkovil;
                //no_of_bus_sankarnkovil += n6;
                
                if((clg_to_sankarnkovil%max == 0)||(clg_to_sankarnkovil%max < 60))
                        no_of_bus_sankarnkovil = 1;
                    else
                        no_of_bus_sankarnkovil = 2;
                
                
            }
            
            try{
                // Write your connection statements
                con = DriverManager.getConnection("jdbc:sqlserver://BHARAT:1433;databaseName=transport;user=sa;password=bharat02101998");
       
                
                String sql = "Select clg_to_rjpm from route where clg_to_rjpm is not null"; 
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();
                while(rs.next()){
                r1.add(rs.getString("clg_to_rjpm"));
                }
            
                String sql2 = "Select clg_to_srivi from route where clg_to_srivi is not null"; 
                pst1 = con.prepareStatement(sql2);
                rs1 = pst1.executeQuery();
                while(rs1.next()){
                r2.add(rs1.getString("clg_to_srivi"));
                }
                
                String sql3 = "Select clg_to_pulyankudi from route where clg_to_pulyankudi is not null"; 
                pst2 = con.prepareStatement(sql3);
                rs2 = pst2.executeQuery();
                while(rs2.next()){
                r3.add(rs2.getString("clg_to_pulyankudi"));
                }
                
                String sql4 = "Select clg_to_sivakasi from route where clg_to_sivakasi is not null"; 
                pst3 = con.prepareStatement(sql4);
                rs3 = pst3.executeQuery();
                while(rs3.next()){
                r4.add(rs3.getString("clg_to_sivakasi"));
                }
                
                String sql5 = "Select clg_to_virudhnagar from route where clg_to_virudhnagar is not null "; 
                pst4 = con.prepareStatement(sql5);
                rs4 = pst4.executeQuery();
                while(rs4.next()){
                r5.add(rs4.getString("clg_to_virudhnagar"));
                }
                
                String sql6 = "Select clg_to_sankarankovil from route where clg_to_sankarankovil is not null"; 
                pst5 = con.prepareStatement(sql6);
                rs5 = pst5.executeQuery();
                while(rs5.next()){
                r6.add(rs5.getString("clg_to_sankarankovil"));
                }
                
                
            
            
            
            
            
            
            
            }
            
            catch(SQLException | HeadlessException ex ){
            System.out.println(ex);
                    }
            
            
            
            
            
            
            System.out.println(r1);
            System.out.println(r2);
            System.out.println(r3);
            System.out.println(r4);
            System.out.println(r5);
            System.out.println(r6);
            //System.out.println(r7);
            
            JOptionPane.showMessageDialog(new JFrame(),"Route 1 College to Rajapalayam: \n " + r1 +  "No of Buses needed: " + no_of_bus_rjpm + "\n" + "Route 2 College to Srivilliputur: \n" + r2 + "No of Busses needed: " + no_of_bus_srivi + "\n" + "Route 3 College to Pulyankudi: \n " + r3 + "No of Busses needed: " + no_of_bus_pulyankudi + "\n" + "Route 4 College to Sivakasi: \n " + r4 + "No of Busses needed: " + no_of_bus_sivakasi + "\n" + "Route 5 College to Virudhnagar: \n " + r5 + "No of Busses needed: " + no_of_bus_virudhnagar + "\n" + "Route 6 College to Sankarnkovil: \n " + r6 + "No of Busses needed: " + no_of_bus_sankarnkovil );
            
            
            
            
            
            
            
            
            
            
                
            
                
                
}
            
            
            
            
            
    
    /**
     * Creates new form TransportManagementSystem
     */
    public TransportManagementSystem() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        rjpm = new javax.swing.JTextField();
        srivi = new javax.swing.JTextField();
        snkl = new javax.swing.JTextField();
        svg = new javax.swing.JTextField();
        svk = new javax.swing.JTextField();
        pyki = new javax.swing.JTextField();
        vdn = new javax.swing.JTextField();
        rkp = new javax.swing.JTextField();
        kp = new javax.swing.JTextField();
        mli = new javax.swing.JTextField();
        svk_bs = new javax.swing.JTextField();
        ttg = new javax.swing.JTextField();
        wtp = new javax.swing.JTextField();
        mlbu = new javax.swing.JTextField();
        jm = new javax.swing.JTextField();
        new_bs = new javax.swing.JTextField();
        old_bs = new javax.swing.JTextField();
        rl = new javax.swing.JTextField();
        chpti = new javax.swing.JTextField();
        tnr = new javax.swing.JTextField();
        srivi_bs = new javax.swing.JTextField();
        kv = new javax.swing.JTextField();
        max_seats = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Please enter the number of students for each town/village");

        jLabel2.setText("Max seats in bus");

        jLabel3.setText("Rajapalayam");

        jLabel4.setText("Srivilliputtur");

        jLabel5.setText("Sankarankovil");

        jLabel6.setText("Sivagiri");

        jLabel7.setText("Sivakasi");

        jLabel8.setText("Pulyankudi");

        jLabel9.setText("Virudhnagar");

        jLabel10.setText("RamaKrishnapuram");

        jLabel11.setText("Krishnapuram");

        jLabel12.setText("Malli");

        jLabel13.setText("Sivakasi Busstand");

        jLabel14.setText("Thiruthangal");

        jLabel15.setText("Watrap");

        jLabel16.setText("Mulambu");

        jLabel17.setText("Thendral Nagar");

        jLabel18.setText("Old Bussatnd");

        jLabel19.setText("New Busstand");

        jLabel20.setText("Jawahar manthapam");

        jLabel21.setText("Chatrapatti");

        jLabel22.setText("Reservline");

        jLabel24.setText("Srivi Bus stand");

        jLabel25.setText("Karivalam Vanthanallur");

        rjpm.setText("0");

        srivi.setText("0");

        snkl.setText("0");

        svg.setText("0");

        svk.setText("0");

        pyki.setText("0");

        vdn.setText("0");

        rkp.setText("0");

        kp.setText("0");

        mli.setText("0");

        svk_bs.setText("0");

        ttg.setText("0");

        wtp.setText("0");

        mlbu.setText("0");
        mlbu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mlbuActionPerformed(evt);
            }
        });

        jm.setText("0");
        jm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmActionPerformed(evt);
            }
        });

        new_bs.setText("0");
        new_bs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_bsActionPerformed(evt);
            }
        });

        old_bs.setText("0");

        rl.setText("0");
        rl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rlActionPerformed(evt);
            }
        });

        chpti.setText("0");

        tnr.setText("0");
        tnr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnrActionPerformed(evt);
            }
        });

        srivi_bs.setText("0");

        kv.setText("0");

        max_seats.setText("0");

        jButton1.setText("Allot Buses");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(397, 397, 397)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(max_seats, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(snkl)
                                    .addComponent(svg)
                                    .addComponent(svk)
                                    .addComponent(pyki)
                                    .addComponent(vdn)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rjpm)
                                    .addComponent(srivi))))
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(mli, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                    .addComponent(svk_bs)
                                    .addComponent(ttg)
                                    .addComponent(wtp)
                                    .addComponent(mlbu)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rkp)
                                    .addComponent(kp))))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel22)
                                        .addComponent(jLabel21)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(old_bs, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tnr, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel24)
                                            .addComponent(jLabel25))
                                        .addGap(24, 24, 24)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(srivi_bs, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                                            .addComponent(kv)))
                                    .addComponent(rl, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chpti, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jm, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(new_bs, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jButton1)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(84, 84, 84))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(max_seats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel17)
                                    .addComponent(rjpm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rkp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(tnr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel11)
                            .addComponent(jLabel18)
                            .addComponent(jLabel25)
                            .addComponent(srivi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(old_bs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel12)
                            .addComponent(jLabel19)
                            .addComponent(snkl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(new_bs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel13)
                            .addComponent(jLabel20)
                            .addComponent(svg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(svk_bs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel14)
                            .addComponent(jLabel21)
                            .addComponent(svk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ttg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chpti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel24)
                        .addComponent(srivi_bs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel15)
                    .addComponent(jLabel22)
                    .addComponent(pyki, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wtp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel16)
                    .addComponent(vdn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mlbu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mlbuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mlbuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mlbuActionPerformed

    private void rlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rlActionPerformed

    private void tnrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnrActionPerformed

    private void jmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmActionPerformed

    private void new_bsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_bsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_new_bsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        allot_busses();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TransportManagementSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransportManagementSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransportManagementSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransportManagementSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransportManagementSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField chpti;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jm;
    private javax.swing.JTextField kp;
    private javax.swing.JTextField kv;
    private javax.swing.JTextField max_seats;
    private javax.swing.JTextField mlbu;
    private javax.swing.JTextField mli;
    private javax.swing.JTextField new_bs;
    private javax.swing.JTextField old_bs;
    private javax.swing.JTextField pyki;
    private javax.swing.JTextField rjpm;
    private javax.swing.JTextField rkp;
    private javax.swing.JTextField rl;
    private javax.swing.JTextField snkl;
    private javax.swing.JTextField srivi;
    private javax.swing.JTextField srivi_bs;
    private javax.swing.JTextField svg;
    private javax.swing.JTextField svk;
    private javax.swing.JTextField svk_bs;
    private javax.swing.JTextField tnr;
    private javax.swing.JTextField ttg;
    private javax.swing.JTextField vdn;
    private javax.swing.JTextField wtp;
    // End of variables declaration//GEN-END:variables
}
