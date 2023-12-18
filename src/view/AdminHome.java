package view;

import Controller.Main;
import function.ButtonRenderer;
import model.Book;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import static model.BookDaoImp.data;

// view.AdminHome нь JFrame -ийн үндсэн хуудас болох
public class AdminHome extends JFrame {
    private JPanel homePanel;
    private JButton searchButton;
    private JButton addButton;
    private JLabel logo;
    private TextField search;
    private static JTable table;
    static TableModel Model;
    static DefaultTableModel homeModel;
    public static int editFlag = 0;
    public static Book B = new Book();

    // JTable-ийн өгөгдлийг шинэчлэх
    public static void updateTableData() {
        homeModel = (DefaultTableModel) createTable();
        table.setModel(homeModel);
        TableColumnModel columnModel = table.getColumnModel();
        table.setRowHeight(170);
        columnModel.getColumn(0).setPreferredWidth(1);
        columnModel.getColumn(3).setPreferredWidth(30);
        columnModel.getColumn(5).setPreferredWidth(30);
        columnModel.getColumn(6).setPreferredWidth(1);
        columnModel.getColumn(7).setPreferredWidth(200);
        columnModel.getColumn(1).setPreferredWidth(70);
        columnModel.getColumn(8).setCellEditor(new AdminHome.ButtonEditor());
    }

    // Шинэчилсэн JTable-г үүсгэх
    public static TableModel createTable() {
        return Model = new DefaultTableModel(data, Main.columns) {
            @Override
            public Class<?> getColumnClass(int column) {
                return column == 1 ? ImageIcon.class : Object.class;
            }
        };
    }

    // Админ home-ийн конструктор
    public AdminHome() {
        homePanel = new JPanel(new BorderLayout());

        ImageIcon imageIcon = new ImageIcon("src/img/logo.png");
        Image image = imageIcon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        logo = new JLabel(new ImageIcon(image));
        search = new TextField();
        searchButton = new JButton("Хайх");
        addButton = new JButton("Ном нэмэх");
        homePanel.add(logo, BorderLayout.NORTH);
        homePanel.add(search, BorderLayout.CENTER);
        homePanel.add(searchButton, BorderLayout.EAST);
        homePanel.add(addButton, BorderLayout.SOUTH);

        homeModel = (DefaultTableModel) createTable();
        table = new JTable(homeModel) {
            public TableCellRenderer getCellRenderer(int row, int column) {
                if (column == 8)
                    return new ButtonRenderer();
                return super.getCellRenderer(row, column);
            }
        };
        updateTableData();

        JScrollPane scrollPane = new JScrollPane(table);

        getContentPane().add(scrollPane, BorderLayout.CENTER);
        getContentPane().add(homePanel, BorderLayout.NORTH);

        setTitle("view.Home");
        setContentPane(getContentPane());
        setVisible(true);
        setSize(1024, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Хайлт хийх товчлуур дэлгэцэнд тодорхойлж өгөх
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // ... үүнийг оруулна уу ...
            }
        });

        // "Ном нэмэх" товч дэлгэцэнд тодорхойлж өгөх
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // ... үүнийг оруулна уу ...
            }
        });

        // Лого дэлгэц дээр дарсны үед
        logo.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // ... үүнийг оруулна уу ...
            }

            // Үсэг дарсны үед
            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        });
    }

    // Дэфаут бутон цэс
    static class ButtonEditor extends DefaultCellEditor {
        private JButton button;

        // Конструктор
        public ButtonEditor() {
            super(new JTextField());
            button = new JButton();
            button.setOpaque(true);
            button.addActionListener(e -> {
                // ... үүнийг оруулна уу ...
            });
        }

        public Component getTableCellEditorComponent(JTable table, Object value,
                                                     boolean isSelected, int row, int column) {
            button.setText((value == null) ? "" : value.toString());
            return button;
        }

        public Object getCellEditorValue() {
            return button.getText();
        }
    }
}
