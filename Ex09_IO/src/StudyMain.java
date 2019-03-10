

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.io.*;

public class StudyMain {
    static HashMap<Integer, StudyCheck> map = new HashMap<Integer, StudyCheck>();
    static int count = 1;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        StudyMain bc = new StudyMain();
        while (true) {
            System.out.println("�������� ���α׷�");
            System.out.print("<1>�߰� <2>���� <3>��� <4>���� <5>�ε� <6>���� : ");

            switch (sc.nextInt()) {
            case 1:
                bc.add();
                break;
            case 2:
                bc.delete();
                break;
            case 3:
                bc.print();
                break;
            case 4:
                bc.save();
                break;
            case 5:
                bc.load();
                break;
            case 6:
                bc.exit();
                break;

            }
        }
    }

    private void save() {
        File file = new File("Study.txt");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(map);

            oos.close();
            fos.close();
        } catch (Exception e) {
            System.out.println("�����߻�!!!");
            e.printStackTrace();
        }
        System.out.println("����Ǿ����ϴ�.");
    }

    private void exit() {
        System.out.println("�ý����� �����մϴ�.");
        System.exit(0);
        sc.close();
    }

    private void print() {
        Set<Integer> set = map.keySet();
        System.out.println("��ȣ\t\t����\t\t�ڹ�\t\t���̼�\t���\t\t���\n");
        for (Integer number : set) {
            double math = map.get(number).getMath();
            double java = map.get(number).getJava();
            double python = map.get(number).getPython();
            double average = map.get(number).getAvg();
            String you = map.get(number).getYou();

            System.out.printf("%s\t\t%.2f\t\t%.2f\t\t%.2f\t\t%f\t\t%s\n", number, math, java, python, average, you);
        }
    }

    private void delete() {
        System.out.print("�����Ͻ� �ѹ��� �Է��� �ּ��� : ");
        int num = sc.nextInt();
        if (map.containsKey(num)) {
            map.remove(num);
            System.out.println("�����Ǿ����ϴ�.");
        } else {
            System.out.println("�л��ѹ��� �߸��Է��ϼ̽��ϴ�. �ش� ������ �����ϴ�.");
        }
    }

    private void add() {
        StudyCheck std = new StudyCheck();
        map.put(count, std.input(std));
        count++;
    }

    private void load() {
        File file = new File("Study.txt");
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream oos = new ObjectInputStream(fis);

            map = (HashMap) oos.readObject();

            Set<Integer> set = map.keySet();
            System.out.println("��ȣ\t\t����\t\t�ڹ�\t\t���̼�\t\t���\t\t���\t\t����");
            for (Integer number : set) {
                double math = map.get(number).getMath();
                double java = map.get(number).getJava();
                double python = map.get(number).getPython();
                double average = map.get(number).getAvg();
                String you = map.get(number).getYou();
                System.out.printf("[%s]\t\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\t\t%s\n", number, math, java, python, average,
                        you);
            }
            oos.close();
            fis.close();

        } catch (Exception e) {
            System.out.println("�ҷ����µ� �����Ͽ����ϴ�.");
            e.printStackTrace();
        }
    }
}