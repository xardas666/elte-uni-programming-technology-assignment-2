package gottfried;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;

public class GamePanel extends JPanel {

    private JLabel jLabel1;
    private JButton sayHelloBtn;
    private ClockPanel clock;

    private void sayHelloBtnActionPerformed(ActionEvent evt) {
        System.out.println("Hello!");
    }


    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new JLabel();
        sayHelloBtn = new JButton();
        clock = new ClockPanel();

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 0, 48)); // NOI18N
        jLabel1.setText("Hello Wrold!");

        sayHelloBtn.setText("Say Hello!");
        sayHelloBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                sayHelloBtnActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getRootPane().getContentPane());
        getRootPane().getContentPane().setLayout(layout);

        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addGap(54, 54, 54))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(clock, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addGap(54, 54, 54))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(sayHelloBtn)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(38, 38, 38)
                                .addComponent(clock, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(38, 38, 38)
                                .addComponent(sayHelloBtn)
                                .addGap(68, 68, 68))
        );

    }
}
