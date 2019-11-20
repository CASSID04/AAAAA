package data;

import java.util.ArrayList;

public class DataRequest extends javax.swing.JFrame {
    

    public DataRequest() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        activeTickets = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataDisplay = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        secondaryDisplay = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        activeTickets.setText("ACTIVE TICKETS");
        activeTickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activeTicketsActionPerformed(evt);
            }
        });

        dataDisplay.setColumns(20);
        dataDisplay.setRows(5);
        jScrollPane1.setViewportView(dataDisplay);

        secondaryDisplay.setColumns(20);
        secondaryDisplay.setRows(5);
        jScrollPane2.setViewportView(secondaryDisplay);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(activeTickets)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(activeTickets)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void activeTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activeTicketsActionPerformed
        String mainData = "";
        ArrayList<String>secondaryData = new ArrayList<String>();
        String displaySecondaryData = "";
        
        for(int i=0;i<Data.activeTickets.size();i++) {
            mainData += Data.activeTickets.get(i).mealPeriod + "\n" + Data.activeTickets.get(i).name + "\n" 
                          + Data.activeTickets.get(i).beverage + "\n\n";
            secondaryData.add(Data.activeTickets.get(i).name);
            dataDisplay.setText(mainData);
        }
        
        for(int i=0;i<secondaryData.size();i++) {
            String[] getBio = Patient.patientBio.get(secondaryData.get(i));
            for(int j=0;j<getBio.length;j++) {
                displaySecondaryData += getBio[j] + "\n";
            }
            displaySecondaryData += "\n";
            secondaryDisplay.setText(displaySecondaryData);
        }
        
    }//GEN-LAST:event_activeTicketsActionPerformed

    
    
    public static void hold() {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataRequest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton activeTickets;
    private javax.swing.JTextArea dataDisplay;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea secondaryDisplay;
    // End of variables declaration//GEN-END:variables
}
