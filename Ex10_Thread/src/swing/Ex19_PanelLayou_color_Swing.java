package swing;

import java.awt.Color; 
import java.awt.Font; 
import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JPanel; 

public class Ex19_PanelLayou_color_Swing extends JFrame { 

    JButton btn1 = new JButton("WestButton"); 
    JButton btn2 = new JButton("CenterButton"); 

    JPanel jpn = new JPanel(); 
    JButton btn3 = new JButton("File"); 
    JButton btn4 = new JButton("Help"); 

    public Ex19_PanelLayou_color_Swing() { 
        super("PanelLayoutExam"); 
        // ���̾ƿ� ���� 

        // JPanel�� ������Ʈ �߰� 
        jpn.add(btn3); 
        jpn.add(btn4); 

        // JFrame�� ������Ʈ �߰� 
        add(jpn, "North"); 
        add(btn1, "West"); 
        add(btn2, "Center"); 

        // ũ�� 
        setSize(300, 200); 
        // super.pack(); 
        // ���̱� 
        setVisible(true); 

        // ������ ���� 
        jpn.setBackground(new Color(120, 200, 100)); 
        btn1.setBackground(new Color(233, 247, 222)); 
        btn2.setBackground(new Color(201, 231, 248)); 
        btn3.setBackground(Color.white); 
        btn4.setBackground(Color.white); 

        // �۲� ���� 
        btn2.setFont(new Font("����ü", Font.ITALIC, 20)); 
        // Font(String name, int style, int size) 
        btn1.setFont(new Font("�ü�ü", Font.BOLD, 15)); 

        // ���ڻ� ���� 
        btn1.setForeground(new Color(0, 200, 120)); 
        btn2.setForeground(new Color(228, 194, 78)); 
        btn3.setForeground(Color.red); 
        btn4.setForeground(Color.blue); 
        // x : ���� 
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    } 

    public static void main(String[] args) { 
        new Ex19_PanelLayou_color_Swing(); 
    } 
} 


