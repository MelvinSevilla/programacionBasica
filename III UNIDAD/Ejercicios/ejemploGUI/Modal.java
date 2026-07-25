import javax.swing.JFrame;

public class Modal extends JFrame {
    

    public Modal(JFrame GUI){
        setTitle("Modal ejemplo");
        setSize(400,200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(GUI);
    }

}