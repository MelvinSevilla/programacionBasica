import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Modal extends JFrame {
    

    public Modal(JFrame GUI){
        setTitle("Modal ejemplo");
        setSize(400,200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(GUI);
        setLayout(null);

        JLabel lblTituloModal = new JLabel("Hola desde el modal", SwingConstants.CENTER);
        lblTituloModal.setBounds(0,20,400,20);
        add(lblTituloModal);
    }

}