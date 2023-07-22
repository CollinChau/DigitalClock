import java.awt.FlowLayout;
import java.util.Calendar;
import javax.swing.JFrame;
import java.text.SimpleDateFormat;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class MyFrame extends JFrame {

    Calendar calendar;
    SimpleDateFormat timeFormat;
    JLabel timeLabel;
    String time;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Collin's Digital Clock");
        this.setLayout(new FlowLayout()); 
        this.setSize(350,200);
        this.setResizable(true);


        timeFormat = new SimpleDateFormat("hh:mm:ss a");

        timeLabel = new JLabel();
        timeLabel.setFont(new Font("DialogInput",Font.PLAIN,50));
        timeLabel.setForeground(new Color(0x00FF00));
        timeLabel.setBackground(Color.black);
        timeLabel.setOpaque(true);


        this.add(timeLabel);
        this.setVisible(true);

        setTime();
    }

    public void setTime() {
        while(true) {
        time = timeFormat.format(Calendar.getInstance().getTime());
        timeLabel.setText(time);
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
    }
}
