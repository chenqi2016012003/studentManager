package mystudentManage;
 
import java.util.ArrayList;
import java.util.Scanner;
 
public class StudentManage {
	public static void app(String[] args) {
		ArrayList<Student> arry = new ArrayList<>();
		while(true) {
			//���ǳɼ�����ϵͳ��������
			System.out.println("------ѧ������ϵͳ------");
			System.out.println(" 1.����");
			System.out.println(" 2.����");
			System.out.println(" 3.ɾ��");
			System.out.println(" 4.�޸�");
			System.out.println(" 5.���");
			System.out.println(" 6.�˳�");
			Scanner sc =new Scanner(System.in);
			System.out.println("���������ѡ����Ӧ�Ĺ��ܣ�");
			String stufunction = sc.nextLine();
			switch (stufunction) {
			case "1":
				//����ѧ��
				addstudent(arry);
				break;
			case "2":
				//����ѧ��
				findstudent(arry);
				break;
			case "3":
				//ɾ��ѧ��
				deletestudent(arry);
				break;
			case "4":
				//�޸�ѧ��
				changestudent(arry);
				break;
			case "5":
				//�������ѧ��
				printstudent(arry);
				break;
			case "6":
				//�˳�
			default:
				System.out.println("лл���ʹ��.");
				System.exit(0);//�˳�JVM
				break;
			}
		}
	}
	//����ѧ����
	public static void findstudent(ArrayList<Student> arry) {
		
	}
	//���������
	public static void printstudent(ArrayList<Student> arry) {
		
	}
	//�����
	public static void addstudent(ArrayList<Student> arry) {
		//¼�����
		Scanner sc= new Scanner(System.in);
		int stuId;
		while(true) {
			System.out.println("������ѧ�ţ�");
			stuId = sc.nextInt();
			boolean flag = false;
			for(int i=0;i<arry.size();i++) {
				Student s = arry.get(i);
				if(s.getID()==stuId) {		
					flag = true;			
					break;
				}
			}
			if(flag) {
				System.out.println("��������˺ű�ռ�ã�����");
			}else {
				break;
			}
		}
		System.out.println("������������");
		String name1 = sc.nextLine();
		String name = sc.nextLine();
		System.out.println("������������ڣ�");
		String birDate = sc.nextLine();
		System.out.println("�������Ա�false����Ů��true�����У�");
		boolean gender = sc.nextBoolean();
		//����ѧ������
		Student s = new Student();
		s.setID(stuId);
		s.setName(name);
		s.setBirDate(birDate);
		s.setGender(gender);
		//��ѧ��������ӵ�����
		arry.add(s);
		System.out.println("���ѧ���ɹ���");
		
	}
	//ɾ����
	public static void deletestudent(ArrayList<Student> arry) {
		
	}
	//�޸���
	public static void changestudent(ArrayList<Student> arry) {
		Scanner sc= new Scanner(System.in);
		System.out.print("������Ҫ�ı��ѧ�ţ�");
		int changeId = sc.nextInt();
		int index = -1;
		for(int i=0;i<arry.size();i++) {
			Student s = arry.get(i);
			if(s.getID()==changeId) {		
				index = i;				
			}
		}
		if (index == -1) {
			System.out.println("��Ҫ�ı��ѧ�������ڣ������²�����");
		} else {
			System.out.println("��������������");
			String name1 = sc.nextLine();
			String name = sc.nextLine();
			System.out.println("�������³������ڣ�");
			String birDate = sc.nextLine();
			System.out.println("���������Ա�false����Ů��true�����У�");
			boolean gender = sc.nextBoolean();
			//����ѧ������
			Student s = new Student();
			s.setID(changeId);
			s.setName(name);
			s.setBirDate(birDate);
			s.setGender(gender);
			//�޸�ѧ������
			arry.set(index,s);
			System.out.println("�޸�ѧ���ɹ�������");
		}
	}
}