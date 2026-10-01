import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author espin
 */
public class flights_gui extends JFrame implements ActionListener {

    private JLabel flights, from, to, date;
    private JTextField txtfrom, txtto, txtdate;
    private JButton btnsearch, btnbook, btnback;
    private JPanel flightPanel;
    
    flights_gui(){
        setTitle ("Travel Boooking System");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450,450);
        
        flights = new JLabel("Flights");
        flights.setBounds(100, 30, 100, 40);
        flights.setFont(flights.getFont().deriveFont(25.0f));
        add(flights);
        
        from = new JLabel("From:");
        from.setBounds(30, 90, 50, 30);
        add(from);
        
        to = new JLabel("To:");
        from.setBounds(220, 900, 40, 30);
        add(to);
        
        date = new JLabel("Date:");
        date.setBounds(30, 140, 50, 30);
        add(date);
        
        txtfrom = new JTextField();
        txtfrom.setBounds(80, 90, 120, 30);
        add(txtfrom);
        
        txtto = new JTextField();
        txtto.setBounds(255, 90, 120, 30);
        add(txtto);
        
        txtdate = new JTextField();
        txtdate.setBounds(80, 140, 50, 30);
        add(txtdate);
        
        btnsearch = new JButton();
        btnsearch.setBounds(220, 140, 100, 30);
        add(btnsearch);
        
        btnbook = new JButton();
        btnbook.setBounds(295, 355, 80, 30);
        add(btnbook);
        
        btnback = new JButton();
        btnback.setBounds(20, 20, 70, 30);
        add(btnback);
        
        flightPanel = new JPanel();
        flightPanel.setBounds(30, 190, 345, 150);
        flightPanel.setBorder(BorderFactory.createTitledBorder("Available Flights"));
        add(flightPanel);
       
      
        
    }
           
        
        
    @Override
    public void actionPerformed(ActionEvent e) {
       
    }
    
}
