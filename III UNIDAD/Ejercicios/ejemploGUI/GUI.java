import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame{

    // declaracion de componentes
    private JLabel lbltitulo1,lblProdDisponibles,lblfiltrarCategoria,lblCarrito,lblmetPago,lblDetalle;
    private JComboBox<String> comboCategoria;
    private JList<String> listaOrigen, listaDestino;
    private JButton btnAgregar;
    private DefaultListModel<String> modeloCarrito;
    private JScrollPane scrollOrigen,scrollDestino;
    JCheckBox chkCupon;
    JRadioButton rdbTarjeta,rdbEfectivo;
    ButtonGroup grupoPago;
    private JTextField txtNotas;    

    Vector<String> productosDisponibles = new Vector<>(List.of(
        "Leche L. 1.50", 
        "Pan L. 2.00", 
        "Café L. 7.80", 
        "Arroz L. 13.10", 
        "Consome L. 3.10", 
        "Pollo L. 35.20", 
        "Azucar L. 17.30", 
        "Pasta L. 14.40", 
        "Manteca L. 25.50", 
        "Aceite L. 26.60", 
        "Canela L. 1.70", 
        "Jugos L. 9.80", 
        "Harina L. 13.90", 
        "Pescado L. 60.10", 
        "Sardinas L. 30.20", 
        "Atun L. 40.50"
    ));

    public GUI(){
        setTitle("Venta de Abarrotes");
        setSize(700,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        // setLayout(new java.awt.FlowLayout());
        // setLayout(new java.awt.GridLayout(2,2));

        // inicializar / configurar
        // BLOQUE 1
        lbltitulo1 = new JLabel("--- MINI SUPERMARKET ---",SwingConstants.CENTER);
        lbltitulo1.setBounds(0,20,700,20);
        add(lbltitulo1);

        lblProdDisponibles = new JLabel("Productos Disponibles");
        lblProdDisponibles.setBounds(20,60,206,20);
        add(lblProdDisponibles);

        lblfiltrarCategoria = new JLabel("Filtrar Categorias");
        lblfiltrarCategoria.setBounds(20,100,206,20);
        add(lblfiltrarCategoria);

        Vector<String> categorias = new Vector<>(List.of("Todas","Refrescos","Lacteos","Churros","Pan"));
        comboCategoria = new JComboBox<String>(categorias);
        comboCategoria.setBounds(20,130,206,20);
        add(comboCategoria);

        chkCupon = new JCheckBox("Tiene Cupon de descuento?");
        chkCupon.setBounds(20,170,206,20);
        add(chkCupon);

        lblmetPago = new JLabel("Metodo de pago");
        lblmetPago.setBounds(20,210,206,20);
        add(lblmetPago);

        
        rdbEfectivo = new JRadioButton("Efectivo",true);
        rdbEfectivo.setBounds(20,240,100,20);
        add(rdbEfectivo);

         rdbTarjeta = new JRadioButton("Tarjeta");
        rdbTarjeta.setBounds(126,240,100,20);
        add(rdbTarjeta);

        grupoPago = new ButtonGroup();
        grupoPago.add(rdbEfectivo);
        grupoPago.add(rdbTarjeta);

                // Notas
        lblDetalle = new JLabel("Notas adicionales para el pedido:");
        lblDetalle.setBounds(20, 280, 206, 20);
        add(lblDetalle);
        txtNotas = new JTextField("Sin Notas");
        txtNotas.setBounds(20, 310, 206, 20);
        add(txtNotas);


        // --- BLOQUE 2

        listaOrigen = new JList<>(productosDisponibles);
        scrollOrigen = new JScrollPane(listaOrigen);
        scrollOrigen.setBounds(280, 90, 160, 200); // x, y, ancho, alto
        add(scrollOrigen);
     
        btnAgregar = new JButton("Agregar al Carrito >>");
        btnAgregar.setBounds(280, 310, 160, 35);
        add(btnAgregar);
 

    

        // --- BLOQUE 3

        lblCarrito = new JLabel("Productos Añadidos:");
        lblCarrito.setBounds(480, 60, 150, 20);
        add(lblCarrito);

        modeloCarrito = new DefaultListModel<>();
        listaDestino = new JList<>(modeloCarrito);
         scrollDestino = new JScrollPane(listaDestino);
        scrollDestino.setBounds(480, 90, 160, 200);
        add(scrollDestino);


         // --- BLOQUE 4: EVENTOS

        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String productoSeleccionado = listaOrigen.getSelectedValue();

                if (productoSeleccionado != null) {

                    modeloCarrito.addElement(productoSeleccionado);

                    String categoria = (String) comboCategoria.getSelectedItem();
                    
                    String mensajeDescuento = "No";
                    if (chkCupon.isSelected()) {
                        mensajeDescuento = "Sí (10%)";
                    }
                    
                    String metodoPago = "";
                    if (rdbEfectivo.isSelected()) {
                        metodoPago = "Efectivo";
                    } else if (rdbTarjeta.isSelected()) {
                        metodoPago = "Tarjeta";
                    }

                    String nota = txtNotas.getText();
                    
                    // Resumen por consola o ventana flotante para que el alumno entienda el flujo de datos
                    System.out.println("--- Accion del Evento ---");
                    System.out.println("Producto aniadido: " + productoSeleccionado);
                    System.out.println("Categoria activa en combo: " + categoria);
                    System.out.println("Metodo de pago seleccionado: " + metodoPago);
                    System.out.println("Aplica descuento?: " + mensajeDescuento);
                    System.out.println("Nota ingresada: " + (nota.isEmpty() ? "Ninguna" : nota));
                    System.out.println("\n\n");

                } else {
                    // Validación simple por si no seleccionan nada
                    JOptionPane.showMessageDialog(null, 
                    "Por favor, selecciona un producto de la lista izquierda.", 
                    "Aviso", 
                    JOptionPane.WARNING_MESSAGE);
                }
            }
        });


    }

    public static void main(String[] args) {
        GUI ventana = new GUI();
        ventana.setVisible(true);
    }
}