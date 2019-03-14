package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class Ex18_MemberRegister_Swing extends JFrame implements ActionListener {
   
    JPanel p;
    JTextField tfId, tfName, tfAddr, tfEmail;
    JTextField tfTel1, tfTel2, tfTel3; //��ȭ
    JComboBox cbJob; //����
    JPasswordField pfPwd; //��й�ȣ   
    JTextField tfYear, tfMonth, tfDate; //�������
    JRadioButton rbMan, rbWoman; //��, ��
    JTextArea taIntro;
    JButton btnInsert, btnCancel; //����, ��� ��ư
    GridBagLayout gb;
    GridBagConstraints gbc;
   
    public Ex18_MemberRegister_Swing(){
        super("ȸ������");
        gb = new GridBagLayout();
        setLayout(gb);
        gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
       
       
        //���̵�
        JLabel bId = new JLabel("���̵� : ");
        tfId = new JTextField(20);     
        //�׸���鿡 ���̱�
        gbAdd(bId, 0, 0, 1, 1);
        gbAdd(tfId, 1, 0, 3, 1);
       
        //��й�ȣ
        JLabel bPwd = new JLabel("��й�ȣ : ");
        pfPwd = new JPasswordField(20);
        gbAdd(bPwd, 0, 1, 1, 1);
        gbAdd(pfPwd, 1, 1, 3, 1);
       
        //�̸�
        JLabel bName = new JLabel("�̸� :");
        tfName = new JTextField(20);
        gbAdd(bName,0,2,1,1);
        gbAdd(tfName,1,2,3,1);
       
        //��ȭ
        JLabel bTel = new JLabel("��ȭ :");
        JPanel pTel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        tfTel1 = new JTextField(6);    
        tfTel2 = new JTextField(6);    
        tfTel3 = new JTextField(6);
        
        
        
        pTel.add(tfTel1);
        pTel.add(new JLabel(" - "));
        pTel.add(tfTel2);
        pTel.add(new JLabel(" - "));
        pTel.add(tfTel3);
        gbAdd(bTel, 0, 3, 1,1);
        gbAdd(pTel, 1, 3, 3,1);
       
        //�ּ�
        JLabel bAddr = new JLabel("�ּ�: ");
        tfAddr = new JTextField(20);
        gbAdd(bAddr, 0,4,1,1);
        gbAdd(tfAddr, 1, 4, 3,1);
       
        //����
        JLabel bBirth= new JLabel("����: ");
        tfYear = new JTextField(6);
        tfMonth = new JTextField(6);
        tfDate = new JTextField(6);
        JPanel pBirth = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pBirth.add(tfYear);
        pBirth.add(new JLabel("/"));
        pBirth.add(tfMonth);
        pBirth.add(new JLabel("/"));
        pBirth.add(tfDate);
        gbAdd(bBirth, 0,5,1,1);
        gbAdd(pBirth, 1, 5, 3,1);
       
        //����       
        JLabel bJob = new JLabel("���� : ");
        String[] arrJob = {"---", "�л�", "������", "�ֺ�"};
        cbJob = new JComboBox(arrJob);
        JPanel pJob = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pJob.add(cbJob);       
        gbAdd(bJob, 0,6,1,1);
        gbAdd(pJob,1,6,3,1);
       
        //����
        JLabel bGender = new JLabel("���� : ");
        JPanel pGender = new JPanel(new FlowLayout(FlowLayout.LEFT));
        rbMan = new JRadioButton("��",true);
        rbWoman = new JRadioButton("��",true);
        ButtonGroup group = new ButtonGroup();
        group.add(rbMan);
        group.add(rbWoman);
        pGender.add(rbMan);
        pGender.add(rbWoman);      
        gbAdd(bGender, 0,7,1,1);
        gbAdd(pGender,1,7,3,1);
       
        //�̸���
        JLabel bEmail = new JLabel("�̸��� : ");
        tfEmail = new JTextField(20);
        gbAdd(bEmail, 0,8,1,1);
        gbAdd(tfEmail,1,8,3,1);
       
        //�ڱ�Ұ�
        JLabel bIntro = new JLabel("�ڱ� �Ұ�: ");
        taIntro = new JTextArea(5, 20); //�� : ��
        JScrollPane pane = new JScrollPane(taIntro);
        gbAdd(bIntro,0,9,1,1);
        gbAdd(pane,1,9,3,1);
       
        //��ư
        JPanel pButton = new JPanel();
        btnInsert = new JButton("����");
        btnCancel = new JButton("���");     
        pButton.add(btnInsert);
        pButton.add(btnCancel);    
        gbAdd(pButton, 0, 10, 4, 1);
       
       
        setSize(350,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
       
       
    }//������
   
    //�׸���鷹�̾ƿ��� ���̴� �޼ҵ�
    private void gbAdd(JComponent c, int x, int y, int w, int h){
        gbc.gridx = x;
        gbc.gridy = y;
        gbc.gridwidth = w;
        gbc.gridheight = h;
        //gb.setConstraints(c, gbc);
        gbc.insets = new Insets(2, 2, 2, 2);
        add(c, gbc);
    }//gbAdd
   
    public static void main(String[] args) {
       
        new Ex18_MemberRegister_Swing();
    }
 
    @Override
    public void actionPerformed(ActionEvent ae) {
       
       
    }//actionPerformed 
}//end
