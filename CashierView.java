import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class CashierView {

    private JFrame jf;
    private JPanel jphead, jphtext, jphback, jpcombo, jptable, jpbadd, jpleft, jpright, jpbill, jppay, jpbutton, jpgroup, jptable1, jpcenter, jporder, jpdelete;
    private JComboBox jcbmenu;
    private JTextArea jtabill;
    private JLabel jlhtext, jlpay, jlorder;
    private JTextField jtfpay;
    private JTable jtmenu, jtorder;
    private JButton jbmenu, jbback, jbadd, jbbill, jbclear, jbprint, jbdelete;

    public CashierView() {
        jf = new JFrame("Cashier page");

        jphead = new JPanel();
        jphtext = new JPanel();
        jphback = new JPanel();
        jpcombo = new JPanel();
        jptable = new JPanel();
        jpbadd = new JPanel();
        jpleft = new JPanel();
        jpright = new JPanel();
        jpbill = new JPanel();
        jppay = new JPanel();
        jpbutton = new JPanel();
        jpgroup = new JPanel();
        jptable1 = new JPanel();
//        jgrouptable = new JPanel();
        jpcenter = new JPanel();
        jporder = new JPanel();
        jpdelete = new JPanel();

        jcbmenu = new JComboBox();

        jtabill = new JTextArea(20, 24);
        JScrollPane jspbill = new JScrollPane(jtabill, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        jlhtext = new JLabel("HOM-KLIN-NGERN");
        jlpay = new JLabel("PAY");
        jlorder = new JLabel("ORDER");
        jtfpay = new JTextField(10);

        jbback = new JButton("BACK");
        jbadd = new JButton("ADD");
        jbbill = new JButton("BILL");
        jbclear = new JButton("CLEAR");
        jbprint = new JButton("PRINT BILL");
        jbdelete = new JButton("DELETE");
        jbmenu = new JButton("GET MENU");
        // tablemenu
        jptable.setLayout(new BoxLayout(jptable, BoxLayout.Y_AXIS));
        String[] columnNames = {"Menu", "Price"};
        Object[][] data = {};
        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            } // คำสั่งที่ทำให้แก้ไขตารางไม่ได้
        };
        jtmenu = new JTable(tableModel);
        
        jptable.add(jtmenu.getTableHeader(), BorderLayout.PAGE_START);
        jptable.add(jtmenu);

        jptable1.setLayout(new BoxLayout(jptable1, BoxLayout.Y_AXIS));
        String[] columnNames2 = {"Menu", "Price", "Qty"};
        Object[][] data2 = {};
        DefaultTableModel tableModel2 = new DefaultTableModel(data2, columnNames2) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            } // คำสั่งที่ทำให้แก้ไขตารางไม่ได้
        };
        jtorder = new JTable(tableModel2);

        jptable1.add(jtorder.getTableHeader(), BorderLayout.PAGE_START);
        jptable1.add(jtorder);

        // head
        jphead.setLayout(new BorderLayout());
        jphtext.add(jlhtext);
        jphback.add(jbback);
        jphead.add(jphtext, BorderLayout.WEST);
        jphead.add(jphback, BorderLayout.EAST);

        // option left
//        jgrouptable.setLayout(new GridLayout());
//        jgrouptable.add(jptable);
//        jgrouptable.add(jptable1);

        jpleft.setLayout(new BorderLayout());
        jpcombo.add(jcbmenu);
        jpcombo.add(jbmenu);
        jptable.add(jtmenu);
        jpbadd.setLayout(new FlowLayout());
        jpbadd.add(jbadd);
        jpbadd.add(jbdelete);
        jpleft.add(jpcombo, BorderLayout.NORTH);
        jpleft.add(jptable, BorderLayout.CENTER);
        jpleft.add(jpbadd, BorderLayout.SOUTH);

        //option right
        jppay.setLayout(new FlowLayout());
        jppay.add(jlpay);
        jppay.add(jtfpay);
        jppay.add(jbbill);

        jpbutton.setLayout(new FlowLayout());
        jpbutton.add(jbclear);
        jpbutton.add(jbprint);

        jpright.setLayout(new BorderLayout());
        jpbill.add(jspbill);
        jpright.add(jpbill, BorderLayout.NORTH);
        jpright.add(jppay, BorderLayout.CENTER);
        jpright.add(jpbutton, BorderLayout.SOUTH);
        
        //option ตรงกลาง
        jpcenter.setLayout(new BorderLayout());
        jporder.setLayout(new FlowLayout());
        jpdelete.setLayout(new FlowLayout());
        jpdelete.add(jbdelete);
        jporder.add(jlorder);
        jpcenter.add(jporder, BorderLayout.NORTH);
        jpcenter.add(jptable1);
        jpcenter.add(jpdelete, BorderLayout.SOUTH);

        // left + right
        jpgroup.setLayout(new GridLayout(1, 3));
        jpgroup.add(jpleft);
        jpgroup.add(jpcenter);
        jpgroup.add(jpright);

        // setBackground
        jphead.setBackground(new Color(28, 64, 121));
        jphtext.setBackground(new Color(28, 64, 121));
        jphback.setBackground(new Color(28, 64, 121));
        jbback.setBackground(Color.WHITE);

        jcbmenu.setBackground(new Color(255, 204, 0));
        jtmenu.setBackground(new Color(28, 64, 121));
        jtmenu.getTableHeader().setBackground(new Color(28, 64, 121));
        jbadd.setBackground(new Color(255, 204, 0));
        jbdelete.setBackground(new Color(28, 64, 121));
        jptable.setBackground(new Color(28, 64, 121));
        jptable1.setBackground(new Color(255, 204, 0));
        jtorder.setBackground(new Color(255, 204, 0));
        jtorder.getTableHeader().setBackground(new Color(255, 204, 0));

        jtabill.setBackground(Color.WHITE);
        jbbill.setBackground(new Color(28, 64, 121));
        jbclear.setBackground(new Color(28, 64, 121));
        jbprint.setBackground(new Color(28, 64, 121));
        jbmenu.setBackground(new Color(255, 204, 0));

        jpcombo.setBackground(Color.WHITE);
        jpbadd.setBackground(Color.WHITE);
        jppay.setBackground(Color.WHITE);
        jpbutton.setBackground(Color.WHITE);
        jpbill.setBackground(Color.WHITE);
        
        jporder.setBackground(Color.WHITE);
        jpdelete.setBackground(Color.WHITE);

        // set Font
        jlhtext.setFont(new Font("browallia new", Font.BOLD, 30));
        jbback.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
        jbmenu.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));

        jcbmenu.setFont(new Font("browallia new", Font.BOLD, 18));
        jtmenu.setFont(new Font("browallia new", Font.BOLD, 18));
        jtmenu.getTableHeader().setFont(new Font("browallia new", Font.BOLD, 18));
        jbadd.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
        jbdelete.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
        jtorder.setFont(new Font("browallia new", Font.BOLD, 18));
        jtorder.getTableHeader().setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
         jtmenu.getTableHeader().setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));

        jtabill.setFont(new Font("browallia new", Font.BOLD, 15));
        jbbill.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
        jbclear.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
        jbprint.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
        jlpay.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
        jlorder.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 24));

        // set ColorFont
        jlhtext.setForeground(new Color(255, 204, 0));
        jtabill.setForeground(Color.BLACK);
        jbbill.setForeground(Color.WHITE);
        jbclear.setForeground(Color.WHITE);
        jbprint.setForeground(Color.WHITE);
        jtmenu.setForeground(Color.WHITE);
        jtmenu.getTableHeader().setForeground(Color.WHITE);
        jbdelete.setForeground(Color.WHITE);

        // set table grid
        jtmenu.setShowGrid(false);
        jtmenu.setRowHeight(25);
        jtorder.setShowGrid(false);
        jtorder.setRowHeight(25);

        jf.add(jphead, BorderLayout.NORTH);
        jf.add(jpgroup);
        jf.setVisible(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setResizable(false);
        jf.setBounds(680,150, 820, 550);

        //Receipt bill
//        jtabill.setText("-----------------------------------------------------------------------\n"
//               + "\t" + "HOM  - GIN - GRUEN \n"
//               + "\t" + "   " + "1234 Main Street\n" 
//               + "\t" + "         " + "Suite 567\n" 
//               + "\t" + "City Name, State 64321\n" 
//               + "\t" + "       " + "023-334-2345\n"
//               + "-----------------------------------------------------------------------\n");
    }

    public JFrame getJf() {
        return jf;
    }

    public JComboBox getJcbmenu() {
        return jcbmenu;
    }

    public JTextArea getJtabill() {
        return jtabill;
    }

    public JLabel getJlhtext() {
        return jlhtext;
    }

    public JTextField getJtfpay() {
        return jtfpay;
    }

    public JTable getJtmenu() {
        return jtmenu;
    }

    public JTable getJtorder() {
        return jtorder;
    }

    public JButton getJbmenu() {
        return jbmenu;
    }

    public JButton getJbback() {
        return jbback;
    }

    public JButton getJbadd() {
        return jbadd;
    }

    public JButton getJbbill() {
        return jbbill;
    }

    public JButton getJbclear() {
        return jbclear;
    }

    public JButton getJbprint() {
        return jbprint;
    }

    public JButton getJbdelete() {
        return jbdelete;
    }

    

}
