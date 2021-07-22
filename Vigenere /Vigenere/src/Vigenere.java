
import java.awt.Frame;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Set;
import static java.util.stream.DoubleStream.builder;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gum
 */
public class Vigenere extends javax.swing.JFrame {
JFileChooser c = new JFileChooser();
String key;
 ButtonGroup G = new ButtonGroup();
 
   JButton jbnt =new JButton("click");    
       
    public Vigenere() {
        initComponents(); 
        G.add(radiobtnkey);
        G.add(radiobtnautokey);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtvanban = new javax.swing.JTextArea();
        txtkhoa = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtmahoa = new javax.swing.JTextArea();
        btnghifilemahoa = new javax.swing.JButton();
        btnMofile = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnghifilevanban = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        radiobtnkey = new javax.swing.JRadioButton();
        radiobtnautokey = new javax.swing.JRadioButton();
        btnMahoa = new javax.swing.JButton();
        btnGiaima = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        setFont(new java.awt.Font("Adobe Arabic", 1, 12)); // NOI18N
        setForeground(new java.awt.Color(0, 255, 255));
        setPreferredSize(new java.awt.Dimension(1125, 575));

        jLabel1.setBackground(new java.awt.Color(204, 0, 0));
        jLabel1.setFont(new java.awt.Font("Minion Pro Med", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Vigenere Cipher");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel2.setText("Plain Text:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nhập vào khóa");

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel4.setText("Cipher Text:");

        txtvanban.setBackground(new java.awt.Color(204, 255, 255));
        txtvanban.setColumns(20);
        txtvanban.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtvanban.setRows(5);
        jScrollPane1.setViewportView(txtvanban);

        txtkhoa.setBackground(new java.awt.Color(204, 204, 255));
        txtkhoa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtkhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkhoaActionPerformed(evt);
            }
        });

        txtmahoa.setBackground(new java.awt.Color(204, 255, 255));
        txtmahoa.setColumns(20);
        txtmahoa.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtmahoa.setRows(5);
        jScrollPane2.setViewportView(txtmahoa);

        btnghifilemahoa.setBackground(new java.awt.Color(255, 0, 0));
        btnghifilemahoa.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnghifilemahoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-edit-file-24.png"))); // NOI18N
        btnghifilemahoa.setText("Ghi file");
        btnghifilemahoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnghifilemahoaActionPerformed(evt);
            }
        });

        btnMofile.setBackground(new java.awt.Color(255, 0, 0));
        btnMofile.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnMofile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-read-online-24.png"))); // NOI18N
        btnMofile.setText("Mở file");
        btnMofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMofileActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.gif"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        btnghifilevanban.setBackground(new java.awt.Color(255, 0, 0));
        btnghifilevanban.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnghifilevanban.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-edit-file-24.png"))); // NOI18N
        btnghifilevanban.setText("Ghi file");
        btnghifilevanban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnghifilevanbanActionPerformed(evt);
            }
        });

        jButton1.setText("Thoát");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        radiobtnkey.setText("KHÓA LẶP");
        radiobtnkey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobtnkeyActionPerformed(evt);
            }
        });

        radiobtnautokey.setText("KHÓA TỰ ĐỘNG");
        radiobtnautokey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobtnautokeyActionPerformed(evt);
            }
        });

        btnMahoa.setBackground(new java.awt.Color(0, 0, 0));
        btnMahoa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMahoa.setForeground(new java.awt.Color(255, 255, 255));
        btnMahoa.setText("v Mã Hóa");
        btnMahoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMahoaActionPerformed(evt);
            }
        });

        btnGiaima.setBackground(new java.awt.Color(0, 0, 0));
        btnGiaima.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGiaima.setForeground(new java.awt.Color(255, 255, 255));
        btnGiaima.setText("^ Giải Mã");
        btnGiaima.setFocusable(false);
        btnGiaima.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGiaima.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGiaima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiaimaActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.gif"))); // NOI18N

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-read-online-24.png"))); // NOI18N
        jButton3.setText("Mở File");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(71, 71, 71)
                                .addComponent(txtkhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radiobtnautokey))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnMofile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnghifilevanban, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnghifilemahoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(66, 66, 66)
                                        .addComponent(jButton1)
                                        .addGap(77, 77, 77)
                                        .addComponent(jButton2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnMahoa, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(133, 133, 133)
                                        .addComponent(btnGiaima)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(radiobtnkey)
                        .addGap(326, 326, 326))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(210, 210, 210)))
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 816, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(radiobtnkey)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtkhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radiobtnautokey))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnghifilevanban, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnMofile, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMahoa, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGiaima, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnghifilemahoa, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE))
        );

        btnghifilemahoa.getAccessibleContext().setAccessibleDescription("Ghi");

        pack();
    }// </editor-fold>//GEN-END:initComponents

//a.	Hàm xữ lý sự kiện Mã hóa dữ liệu
    private void btnMahoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMahoaActionPerformed
       int tableRowSize = 26;
       int tableColumnSize = 26;
       int vignereTable[][] = new int[26][26];
       
       for(int rows =0; rows < tableRowSize; rows++){
           for(int columns = 0; columns<tableColumnSize; columns++){
               // da bang
               vignereTable[rows][columns]= (rows + columns)%26;
           }
       }
         JButton jbnt =new JButton("click");    
        G.add(radiobtnkey);
        G.add(radiobtnautokey);
    ActionListener actionListener = null;
  
        
radiobtnkey.addActionListener(actionListener);
radiobtnautokey.addActionListener(actionListener);
 add(radiobtnkey);add(radiobtnautokey);add(jbnt);  
   
         if (radiobtnkey.isSelected()) {
    key = txtkhoa.getText();
    key = key.toUpperCase();
     if(txtkhoa.getText().equals("")){
       JOptionPane.showMessageDialog(this,"Nhập vào khóa!");
       txtkhoa.requestFocus();
       return ;
   }
 
                }

         else if (radiobtnautokey.isSelected())
         {
    key = txtkhoa.getText()+txtvanban.getText();
    key = key.toUpperCase();
   
       }
        if(txtvanban.getText().equals("")){
       JOptionPane.showMessageDialog(this,"Nhập vào văn bản cần mã hóa!!");
       txtvanban.requestFocus();
       return;
   }
       
        
       
       // nhap văn bản cần mã hóa
    System.out.println("Enter the plaintext");
    String plainText= txtvanban.getText();
    // chuyển đổi sang hoa
    plainText = plainText.toUpperCase();
    // NHAP KHOA K
//    System.out.println("Enter the key");
//    String key = txtkhoa.getText();
//    key = key.toUpperCase();
//   if(txtkhoa.getText().equals("")){
//       JOptionPane.showMessageDialog(this,"Nhập vào khóa!");
//       txtkhoa.requestFocus();
//       return;
//   }
   
    String cipherText = "";
    int keyIndex =0;
    for ( int ptextIndex =0; ptextIndex < plainText.length(); ptextIndex++){
        
            char pChar = plainText.charAt(ptextIndex);
            int ascciVal = (int) pChar;
            if(pChar == ' '){
        cipherText += pChar;
        continue;
              
    }
            if(ascciVal < 65 || ascciVal >90){
                cipherText += pChar;
                continue;
                
            }
        int basicPlainTextValue = ((int) pChar)-65;
        char kChar = key.charAt(keyIndex);
        int basicKeyValue = ((int) kChar)-65;
        int tableEntry = vignereTable[basicPlainTextValue][basicKeyValue];
        char cChar = (char) (tableEntry + 65);
        cipherText += cChar;
        keyIndex++;
        if (keyIndex == key.length())
            keyIndex = 0;
        
    }
        System.out.println("cipher text is "+cipherText);
        txtmahoa.setText(cipherText.toString().toUpperCase());
    }//GEN-LAST:event_btnMahoaActionPerformed

    //b.	Hàm xữ lý sự kiện Dencypt
    private void btnGiaimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiaimaActionPerformed
            
         int i, j = 0;
        
        String plain = "";
        String key = txtkhoa.getText().toUpperCase();
        String cipher = txtmahoa.getText().toUpperCase();
        JButton jbnt =new JButton("click");    
        G.add(radiobtnkey);
        G.add(radiobtnautokey);
    ActionListener actionListener = null;
    
radiobtnkey.addActionListener(actionListener);
radiobtnautokey.addActionListener(actionListener);
 add(radiobtnkey);add(radiobtnautokey);add(jbnt);  
   
         if (radiobtnkey.isSelected()) {
             if(txtkhoa.getText().equals("")){
       JOptionPane.showMessageDialog(this,"Nhập vào khóa!");
       txtkhoa.requestFocus();
       return;
   }
    key = txtkhoa.getText();
    key = key.toUpperCase();
  
                }
  
         else if (radiobtnautokey.isSelected())
         {
    key = txtkhoa.getText()+txtvanban.getText();
    key = key.toUpperCase();
   
       }
        int max = key.length();
        
   
    if(txtmahoa.getText().equals("")){
       JOptionPane.showMessageDialog(this,"Nhập vào văn bản cần giải mã!!");
       txtmahoa.requestFocus();
       return;
   }
        for(i = 0; i < cipher.length(); i++) {
            
            char x = cipher.charAt(i);
            
            if(j >= max) {
                j = 0;
            }
            if(x == ' '){
        plain += x ;
        continue;
              
    }
            if(x < 65 || x >90){
                plain += x;
               continue;
               
            }
            if(x > 'A' || x < 'Z') {
                plain += (char)((x - key.charAt(j) + 26) % 26 + 'A');
            }
            
            j++;
        }
        
        txtvanban.setText(plain);
        

    }//GEN-LAST:event_btnGiaimaActionPerformed
    //ghi file
    private void btnghifilemahoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnghifilemahoaActionPerformed
       try {
            int rVal = c .showSaveDialog(null);
            BufferedWriter bw = null;
            //Noi luu du lieu
            if (rVal == JFileChooser.APPROVE_OPTION) {
             String filename = c.getSelectedFile().getName();
             String dir = c.getCurrentDirectory().toString();
 
             // luu van ban 
            String s = txtmahoa.getText();
        
            String filePath = dir+"\\"+filename;
            // ghi du lieu s vào tệp fileName
            bw = new BufferedWriter(new FileWriter(filePath));
            bw.write(s);
            bw.close();
            JOptionPane.showMessageDialog(null," Lưu File thành công!!!");}
             if ( rVal == JFileChooser.CANCEL_OPTION){
                  JOptionPane.showMessageDialog(null,"Chưa lưu file","Báo",JOptionPane.QUESTION_MESSAGE,null);
             }
        } catch (IOException ee) {
            System.err.println("LOI!!"+ee);
            //Logger.getLogger(Vigenere.class.getName().log(Level.ALL,null,e));
        }
                                             
    }//GEN-LAST:event_btnghifilemahoaActionPerformed

    
    // doc file
    private void btnMofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMofileActionPerformed
         try {
            int rVal = c.showOpenDialog(null);
            BufferedReader br = null;     
            // nhan du lieu
            StringBuffer sb = new StringBuffer();
            if (rVal == JFileChooser.APPROVE_OPTION) {
     String filename = c.getSelectedFile().getName();
     String dir = c.getCurrentDirectory().toString();
      JOptionPane.showMessageDialog(null," Mở file thành công!!!");
           String filePath = dir+"\\"+filename;
            br = new BufferedReader ( new FileReader(filePath));
            // Doc moi lan toi da 5 ky tu
            char[] ca = new char[5];
            while ( br.ready()){
                int len = br.read(ca);
                sb.append(ca,0,len);

            }
            br.close();
            //xuat chuoi
            System.out.println("Du lieu la : "+" " + sb);
            String chuoi = sb.toString();
            // Hien thi ra form
             txtvanban.setText(chuoi);
            }
             if ( rVal == JFileChooser.CANCEL_OPTION){
                  JOptionPane.showMessageDialog(this," File chưa được mở!!!");
             }

        }catch (IOException ex){
            // Logger.getLogger(Vigenere.class.getName()).log(Level.ALL,null,ex);
            System.err.println("LOI!!"+ex);
        }
        
        
        
    }//GEN-LAST:event_btnMofileActionPerformed

    private void btnghifilevanbanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnghifilevanbanActionPerformed
        try {
            int rVal = c .showSaveDialog(null);
            BufferedWriter bw = null;
            //Noi luu du lieu
            if (rVal == JFileChooser.APPROVE_OPTION) {
             String filename = c.getSelectedFile().getName();
             String dir = c.getCurrentDirectory().toString();
 
             // luu van ban 
            String s = txtvanban.getText();
        
            String filePath = dir+"\\"+filename;
            // ghi du lieu s vào tệp fileName
            bw = new BufferedWriter(new FileWriter(filePath));
            bw.write(s);
            bw.close();
            JOptionPane.showMessageDialog(null," Lưu file thành công!!!");}
             if ( rVal == JFileChooser.CANCEL_OPTION){
                  JOptionPane.showMessageDialog(null,"Chưa lưu file","Báo",JOptionPane.QUESTION_MESSAGE,null);
             }
        } catch (IOException ee) {
            System.err.println("LOI!!"+ee);
            //Logger.getLogger(Vigenere.class.getName().log(Level.ALL,null,e));
        }
    }//GEN-LAST:event_btnghifilevanbanActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         JFrame Frame = new JFrame("Exit");

    if (JOptionPane.showConfirmDialog( Frame,"Bạn có muốn thoát!!!","EXIT VIGENERE",
            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtkhoa.setText("");
        txtvanban.setText("");
        txtmahoa.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void radiobtnkeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtnkeyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radiobtnkeyActionPerformed

    private void txtkhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkhoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkhoaActionPerformed

    private void radiobtnautokeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtnautokeyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radiobtnautokeyActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
            int rVal = c.showOpenDialog(null);
            BufferedReader br = null;     
            // nhan du lieu
            StringBuffer sb = new StringBuffer();
            if (rVal == JFileChooser.APPROVE_OPTION) {
     String filename = c.getSelectedFile().getName();
     String dir = c.getCurrentDirectory().toString();
      JOptionPane.showMessageDialog(null," Mở File thành công!!!");
           String filePath = dir+"\\"+filename;
            br = new BufferedReader ( new FileReader(filePath));
            // Doc moi lan toi da 5 ky tu
            char[] ca = new char[5];
            while ( br.ready()){
                int len = br.read(ca);
                sb.append(ca,0,len);

            }
            br.close();
            //xuat chuoi
            System.out.println("Du lieu la : "+" " + sb);
            String chuoi = sb.toString();
            // Hien thi ra form
             
            txtmahoa.setText(chuoi);}
             if ( rVal == JFileChooser.CANCEL_OPTION){
                  JOptionPane.showMessageDialog(this," File chưa được mở!!!");
             }

        }catch (IOException ex){
            // Logger.getLogger(Vigenere.class.getName()).log(Level.ALL,null,ex);
            System.err.println("LOI!!"+ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Vigenere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vigenere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vigenere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vigenere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Vigenere frm = new Vigenere();
                frm.setLocationRelativeTo(null);
               frm.setVisible(true);
            
            
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGiaima;
    private javax.swing.JButton btnMahoa;
    private javax.swing.JButton btnMofile;
    private javax.swing.JButton btnghifilemahoa;
    private javax.swing.JButton btnghifilevanban;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton radiobtnautokey;
    private javax.swing.JRadioButton radiobtnkey;
    private javax.swing.JTextField txtkhoa;
    private javax.swing.JTextArea txtmahoa;
    private javax.swing.JTextArea txtvanban;
    // End of variables declaration//GEN-END:variables
}
