/*
 * NetProbeFrame.java
 *
 * Created on March 20, 2008, 11:00 PM
 */

package javanetprobe;

/**
 *
 * @author  hguan5
 */
public class NetProbeFrame extends javax.swing.JFrame {
    public NetProbe m_probe;
    
    /** Creates new form NetProbeFrame */
    public NetProbeFrame(NetProbe probe) {
        initComponents();
        m_probe = probe;
        protocolGroup.add(tcpRadio);
        protocolGroup.add(udpRadio);
        tcpRadio.setSelected(true);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        protocolGroup = new javax.swing.ButtonGroup();
        statPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lossLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        numLabel = new javax.swing.JLabel();
        rateLabel = new javax.swing.JLabel();
        numLossLabel = new javax.swing.JLabel();
        paraPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        refreshText = new javax.swing.JTextField();
        rateText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        numText = new javax.swing.JTextField();
        sizeText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        hostnameText = new javax.swing.JTextField();
        portText = new javax.swing.JTextField();
        udpRadio = new javax.swing.JRadioButton();
        tcpRadio = new javax.swing.JRadioButton();
        exitButton = new javax.swing.JButton();
        startButton = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IEG4180 JavaNetProbe");

        statPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Statistics Display Panel"));

        jLabel6.setText("Packet Loss (%):");

        jLabel7.setText("Time Elaped (s):");

        jLabel8.setText("No of packet received:");

        jLabel9.setText("Transferring Rate (Bps):");

        jLabel10.setText("No of packet loss:");

        javax.swing.GroupLayout statPanelLayout = new javax.swing.GroupLayout(statPanel);
        statPanel.setLayout(statPanelLayout);
        statPanelLayout.setHorizontalGroup(
            statPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(statPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(statPanelLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lossLabel))
                    .addGroup(statPanelLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(timeLabel))
                    .addGroup(statPanelLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numLabel))
                    .addGroup(statPanelLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rateLabel))
                    .addGroup(statPanelLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numLossLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        statPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lossLabel, numLabel, numLossLabel, rateLabel, timeLabel});

        statPanelLayout.setVerticalGroup(
            statPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statPanelLayout.createSequentialGroup()
                .addGroup(statPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lossLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(statPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(timeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(statPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(numLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(statPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(rateLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(statPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(numLossLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        statPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lossLabel, numLabel, numLossLabel, rateLabel, timeLabel});

        paraPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("System Parameters Panel"));

        jLabel1.setText("Server:");

        jLabel2.setText("Refresh Interval (ms):");

        jLabel3.setText("Sending Rate (Bps):");

        refreshText.setText("100");

        rateText.setText("102400");

        jLabel4.setText("# of packets to send:");

        numText.setText("0");

        sizeText.setText("1024");

        jLabel5.setText("Packet Size (Bytes):");

        hostnameText.setText("localhost");

        portText.setText("12345");

        udpRadio.setText("UDP");

        tcpRadio.setText("TCP");

        javax.swing.GroupLayout paraPanelLayout = new javax.swing.GroupLayout(paraPanel);
        paraPanel.setLayout(paraPanelLayout);
        paraPanelLayout.setHorizontalGroup(
            paraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paraPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(paraPanelLayout.createSequentialGroup()
                        .addComponent(tcpRadio)
                        .addGap(18, 18, 18)
                        .addComponent(udpRadio))
                    .addGroup(paraPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hostnameText, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(portText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paraPanelLayout.createSequentialGroup()
                        .addGroup(paraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(paraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(sizeText)
                            .addComponent(numText)
                            .addComponent(rateText, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                            .addComponent(refreshText, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))))
                .addContainerGap())
        );
        paraPanelLayout.setVerticalGroup(
            paraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paraPanelLayout.createSequentialGroup()
                .addGroup(paraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(portText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hostnameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sizeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(udpRadio)
                    .addComponent(tcpRadio)))
        );

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(startButton)
                        .addGap(18, 18, 18)
                        .addComponent(exitButton))
                    .addComponent(paraPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(paraPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitButton)
                    .addComponent(startButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        if(startButton.isSelected()){
            m_probe.connect();
            startButton.setText("Stop");
        }else{
            m_probe.stop();
            startButton.setText("Start");
        }
    }//GEN-LAST:event_startButtonActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitButton;
    private javax.swing.JTextField hostnameText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lossLabel;
    private javax.swing.JLabel numLabel;
    private javax.swing.JLabel numLossLabel;
    private javax.swing.JTextField numText;
    private javax.swing.JPanel paraPanel;
    private javax.swing.JTextField portText;
    private javax.swing.ButtonGroup protocolGroup;
    private javax.swing.JLabel rateLabel;
    private javax.swing.JTextField rateText;
    private javax.swing.JTextField refreshText;
    private javax.swing.JTextField sizeText;
    private javax.swing.JToggleButton startButton;
    private javax.swing.JPanel statPanel;
    private javax.swing.JRadioButton tcpRadio;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JRadioButton udpRadio;
    // End of variables declaration//GEN-END:variables
    
    public String getHostname(){
        return hostnameText.getText();
    }
    
    public int getPort(){
        return Integer.parseInt(portText.getText());
    }
    
    public boolean getProtocol(){
        return tcpRadio.isSelected();
    }
    
    public int getPacketSize(){
        return Integer.parseInt(sizeText.getText());
    }
    
    public int getSendingRate(){
        return Integer.parseInt(rateText.getText());
    }
        
    public int getNumPackets(){
        return Integer.parseInt(numText.getText());
    }
    
    public void setPacketsTransferred(int num){
        numLabel.setText(String.valueOf(num));
    }
    
    public void setPacketLoss(double p){
        lossLabel.setText(String.valueOf(p));
    }
    
    public void setNumPacketLoss(int n){
        numLossLabel.setText(String.valueOf(n));
    }
    
    public void setTransferringRate(double p){
        p = Math.round(p * 100) / 100.0;
        rateLabel.setText(String.valueOf(p));
    }
    
    public void setTimeElapsed(double t){
        timeLabel.setText(String.valueOf(t));
    }
    
    public void resetButton(){
        startButton.setSelected(false);
        startButton.setText("Start");
    }
    
}
