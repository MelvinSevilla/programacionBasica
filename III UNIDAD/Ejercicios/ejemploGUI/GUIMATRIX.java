import java.util.Vector;

import javax.swing.*;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIMATRIX extends JFrame{

    public GUIMATRIX(){
        setTitle("Venta de Abarrotes");
        setSize(700,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        // inicializar / configurar
        // BLOQUE 1
        JLabel lbltitulo1 = new JLabel("--- MINI SUPERMARKET ---",SwingConstants.CENTER);
        lbltitulo1.setBounds(0,20,700,20);
        add(lbltitulo1);

        JLabel lblProdDisponibles = new JLabel("Productos Disponibles");
        lblProdDisponibles.setBounds(246,60,206,20);
        add(lblProdDisponibles);

        JLabel lblfiltrarCategoria = new JLabel("Filtrar Categorias");
        lblfiltrarCategoria.setBounds(20,100,206,20);
        add(lblfiltrarCategoria);

        Vector<String> categorias = new Vector<>(List.of("Todas","Refrescos","Lacteos","Churros","Pan"));
        JComboBox<String> comboCategoria = new JComboBox<String>(categorias);
        comboCategoria.setBounds(20,130,206,20);
        add(comboCategoria);

        JCheckBox chkCupon = new JCheckBox("Tiene Cupon de descuento?");
        chkCupon.setBounds(20,170,206,20);
        add(chkCupon);

        JLabel lblmetPago = new JLabel("Metodo de pago");
        lblmetPago.setBounds(20,210,206,20);
        add(lblmetPago);
        
        JRadioButton rdbEfectivo = new JRadioButton("Efectivo",true);
        rdbEfectivo.setBounds(20,240,100,20);
        add(rdbEfectivo);

        JRadioButton rdbTarjeta = new JRadioButton("Tarjeta");
        rdbTarjeta.setBounds(126,240,100,20);
        add(rdbTarjeta);

        ButtonGroup grupoPago = new ButtonGroup();
        grupoPago.add(rdbEfectivo);
        grupoPago.add(rdbTarjeta);

        JLabel lblDetalle = new JLabel("Notas adicionales para el pedido:");
        lblDetalle.setBounds(20, 280, 206, 20);
        add(lblDetalle);
        JTextField txtNotas = new JTextField("Sin Notas");
        txtNotas.setBounds(20, 310, 206, 20);
        add(txtNotas);

        // --- BLOQUE 2
        Vector<String> nombreColumnas = new Vector<>(List.of("Nombre del Producto", "Precio (L)"));

        Vector<Vector<Object>> productosDisponibles = new Vector<>(List.of(
            new Vector<>(List.of("Leche",1.50)), 
            new Vector<>(List.of("Pan",2.00)), 
            new Vector<>(List.of("Café",7.80)), 
            new Vector<>(List.of("Arroz",13.10)), 
            new Vector<>(List.of("Consome",3.10)), 
            new Vector<>(List.of("Pollo",35.20)), 
            new Vector<>(List.of("Azucar",17.30)), 
            new Vector<>(List.of("Pasta",14.40)), 
            new Vector<>(List.of("Manteca",25.50)), 
            new Vector<>(List.of("Aceite",26.60)), 
            new Vector<>(List.of("Canela",1.70)), 
            new Vector<>(List.of("Jugos",9.80)), 
            new Vector<>(List.of("Harina",13.90)), 
            new Vector<>(List.of("Pescado",60.10)), 
            new Vector<>(List.of("Sardinas",30.20)), 
            new Vector<>(List.of("Atun",40.50))
        ));

        JTable listaOrigen = new JTable(productosDisponibles,nombreColumnas);
        JScrollPane scrollOrigen = new JScrollPane(listaOrigen);
        scrollOrigen.setBounds(246, 90, 206, 200); // x, y, ancho, alto
        add(scrollOrigen);
     
        JButton btnAgregar = new JButton("Agregar");
        btnAgregar.setBounds(246, 310, 206, 20);
        add(btnAgregar);    

        // --- BLOQUE 3
        JLabel lblCarrito = new JLabel("Productos Añadidos:");
        lblCarrito.setBounds(472, 60, 206, 20);
        add(lblCarrito);

        Vector<Vector<Object>> matrizAgregados = new Vector<>();
        JTable tablaAgregados = new JTable(matrizAgregados,nombreColumnas);
        JScrollPane scrollDestino = new JScrollPane(tablaAgregados);
        scrollDestino.setBounds(472, 90, 206, 200);
        add(scrollDestino);

        JButton btnAbrirModal = new JButton("Abrir Modal");
        btnAbrirModal.setBounds(472, 310, 206, 20);
        add(btnAbrirModal);

        JLabel lblTotal = new JLabel("Total: L. 0.00");
        lblTotal.setBounds(472, 350, 206, 20);
        add(lblTotal);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(472, 370, 206, 20);
        add(btnCalcular);

         // --- BLOQUE 4: EVENTOS
        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int filaSeleccionada = listaOrigen.getSelectedRow();

                if (filaSeleccionada != -1) {

                    Vector<Object> productoSeleccionado = productosDisponibles.get(filaSeleccionada);    
                    matrizAgregados.add(productoSeleccionado);
                    ((javax.swing.table.DefaultTableModel) tablaAgregados.getModel()).fireTableDataChanged();
                    
                 } else {
                    // Validación simple, CON ALERTA
                    JOptionPane.showMessageDialog(null, 
                    "Por favor, selecciona un producto de la lista izquierda.", 
                    "Aviso", 
                    JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        btnAbrirModal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Modal modal = new Modal(GUIMATRIX.this);
                modal.setVisible(true);
            }
        });

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               double total = 0;
                for (Vector<Object> producto : matrizAgregados) {
                    double precio = ((double) producto.get(1));
                    total += precio;
                }
                if (chkCupon.isSelected()) {
                    total = total * 0.9; // Aplicar descuento del 10%
                }

                lblTotal.setText(String.format("Total: L. %.2f", total));
            }
        });
    }

    public static void main(String[] args) {
        GUIMATRIX ventana = new GUIMATRIX();
        ventana.setVisible(true);
    }
}