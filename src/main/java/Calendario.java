import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Calendario extends JFrame implements ActionListener {
    private JPanel contentPane;
    private JDateChooser JDateChooser1;
    private JButton tiraFechaButton;
    private Date laFech;
    private SimpleDateFormat formateador=new SimpleDateFormat("dd/MM/yyyy");

    public Calendario() {
        setContentPane(contentPane);
        laFech=new Date();
        tiraFechaButton.addActionListener(this);
        formateador.setLenient(false);
       // System.out.println("La Fecha Insertada corresponde a: "+ formateador.format(laFech));
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        laFech=JDateChooser1.getDate();
        String fechaEnString;
        Object source = actionEvent.getSource();
        if (source == tiraFechaButton){
            if (laFech != null) {
           // System.out.println("La Fecha Insertada corresponde a: "+ formateador.format(laFech));
                //System.out.println("La Fecha Insertada corresponde a: "+ laFech);
            fechaEnString=formateador.format(laFech);
            System.out.println("La Fecha Insertada corresponde a: "+ fechaEnString);
            }else{
                System.out.println("Debe de insertar una fecha");
            }

        }
    }

    public static void main(String[] args) {
        Calendario dialog = new Calendario();
        dialog.pack();
        dialog.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        JDateChooser1=new JDateChooser();
    }

}
