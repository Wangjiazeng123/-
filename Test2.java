package Run;

import Information.Course;
import Information.Student;
import Information.Teacher;
import java.util.Scanner;
public abstract class Test2 {
	
	static Student stu0 = new Student(1,"С��","Ů","G2019310",0);
	
	
	static Teacher tea0 = new Teacher(1,"����","��","T1001","Java ");
	static Teacher tea1 = new Teacher(2,"΢΢","Ů","T3201","��ɢ��ѧ ");
	static Teacher tea2 = new Teacher(3,"����","Ů","T1301","���˼ԭ�� ");
	static Course cou0 = new Course(1,"Java","��300",15);
	static Course cou1 = new Course(2,"��ɢ��ѧ","��250",20);
	static Course cou2 = new Course(3,"���˼ԭ��","��300",20);
	static int courseNo;
	static int stuNo;
	public static void main(String[] args) 
	{
	b:	for(;;) 
		{
			printStudentAll();
			Scanner reader = new Scanner(System.in);//¼���﷨
			System.out.println("������ѧ����ţ�");
			int x =reader.nextInt();//��ȡѧ�����
			stuNo=x;//��¼ѧ�����
			judgeStu(x);//ѡ��ѧ��
			
			System.out.println("�˳�ѧ��ѡ��ϵͳ�밴1");
			System.out.println("����ѧ��ѡ��ϵͳ�밴2");
			int m =reader.nextInt();
			if(m==1)
				break b;
		}
	printAll();
		
	}
	public static void judgeStu(int No) {//ѡ��ѧ�� �ж��Ƿ��˿�
		Scanner reader = new Scanner(System.in);
		System.out.println("1.ѡ��\n2.�˿�");
		int y =reader.nextInt();
		if(No==1)
			judgeChoose(y);
	
		
		else System.out.println("û�и�ͬѧ��Ϣ��������1");
	}
	public static void judgeChoose(int No) {//ȷ���˿�ѡ�Σ�ѡ��γ̱��
		Scanner reader = new Scanner(System.in);
		printCourseAll();
		System.out.println("������ѡ��γ̱�ţ�");
		int z =reader.nextInt();
				courseNo=z;//��¼�γ̱��
		if(No==1){//ѡ��
			courseChoose(z);
		    addWork(stuNo,courseNo);
		    }
		 if(No==2){//�˿�
			courseChoose(z);
		    reduceWork(stuNo,courseNo);
		    } 
	
	}
	public static void courseChoose(int No) {//ѡ��γ̲���ӡ��ʦ
		Scanner reader = new Scanner(System.in);
		if(No==1) {
			printTeacher(1);        
		}
		if(No==2) {
			printTeacher(2);	
		}
		if(No==3) {
			printTeacher(3);
		}
		
		
	}	
	public static void addWork(int stuNo,int courseNo) {
		if (stuNo==1 && courseNo==1) {
		cou0.addStuNo(cou0.getStuNo());
		stu0.addCourses(stu0.getCourses());
		}
		else if (courseNo==2 && stuNo==1) {
			cou1.addStuNo(cou1.getStuNo());
			stu0.addCourses(stu0.getCourses());
			}
		else if (stuNo==1 && courseNo==3) {
			cou2.addStuNo(cou2.getStuNo());
			stu0.addCourses(stu0.getCourses());
			}
	
	}
	public static void reduceWork(int stuNo,int courseNo) {
		if (stuNo==1 && courseNo==1) {
		cou0.reduceStuNo(cou0.getStuNo());
		stu0.reduceCourses(stu0.getCourses());
		}
		if (stuNo==1 && courseNo==2) {
			cou1.reduceStuNo(cou1.getStuNo());
			stu0.reduceCourses(stu0.getCourses());
			}
		if (stuNo==1 && courseNo==3) {
			cou2.reduceStuNo(cou2.getStuNo());
			stu0.reduceCourses(stu0.getCourses());
			}
	}
	public static void printAll() {
		System.out.println("<ѧ��ѡ��ϵͳ>");
		printTeacherAll();
		printStudentAll();
		printCourseAll();
		}
		
	public static void printTeacher(int x) {//��ӡ������ʦ��Ϣ
		
		System.out.println("<��ʦ��Ϣ>");
		System.out.println("���   ����  �Ա�  ְ����   �ڿ�");
		if (x==1){
			System.out.println("  "+tea0.getNo()+"      "+tea0.getTeacherName()+"    "+tea0.getSex()+"     "+tea0.getTeacherId()+" "+tea0.getTeaCourse());}
		if (x==2){
			System.out.println("  "+tea1.getNo()+"      "+tea1.getTeacherName()+"    "+tea1.getSex()+"     "+tea1.getTeacherId()+" "+tea1.getTeaCourse());}
		if (x==3){
			System.out.println("  "+tea2.getNo()+"      "+tea2.getTeacherName()+"    "+tea2.getSex()+"     "+tea2.getTeacherId()+" "+tea2.getTeaCourse());
				      
		}
		}
	    
	
	
    public static void printTeacherAll() {//��ӡ���н�ʦ��Ϣ
		
		System.out.println("<��ʦ��Ϣ>");
		System.out.println("���   ����  �Ա�  ְ����   �ڿ�");
		System.out.println("  "+tea0.getNo()+"      "+tea0.getTeacherName()+"    "+tea0.getSex()+"     "+tea0.getTeacherId()+" "+tea0.getTeaCourse());
		System.out.println("  "+tea1.getNo()+"      "+tea1.getTeacherName()+"    "+tea1.getSex()+"     "+tea1.getTeacherId()+" "+tea1.getTeaCourse());
		System.out.println("  "+tea2.getNo()+"      "+tea2.getTeacherName()+"    "+tea2.getSex()+"     "+tea2.getTeacherId()+" "+tea2.getTeaCourse());
		
	}
    public static void printStudent(int x) {
    	System.out.println("<ѧ����Ϣ>");
		System.out.println("���   ����  �Ա�  ѧ��   ����");
		if (x==1)
			System.out.println("  "+stu0.getNo()+"       "+stu0.getStudentName()+"   "+stu0.getSex()+"    "+stu0.getStudentId()+"   "+stu0.getCourses());
		
    }
    public static void printStudentAll() {
    	System.out.println("<ѧ����Ϣ>");
		System.out.println("���   ���� �Ա�  ѧ��   ����");
		System.out.println("  "+stu0.getNo()+"       "+stu0.getStudentName()+"   "+stu0.getSex()+"    "+stu0.getStudentId()+"   "+stu0.getCourses());
		
    }
    public static void printCourse(int x) {
    	System.out.println("<�γ���Ϣ>");
		System.out.println("���   �γ�����   ��ѧ�ص�   ѡ������");
		if(x==1)
		System.out.println("  "+cou0.getNo()+"      "+cou0.getName()+"     "+cou0.getAdd()+"           "+cou0.getStuNo());
    }
    public static void printCourseAll() {
    	System.out.println("<�γ���Ϣ>");
		System.out.println("���   �γ�����   ��ѧ�ص�   ѡ������");
		System.out.println(""+cou0.getNo()+"    "+cou0.getName()+"       "+cou0.getAdd()+"           "+cou0.getStuNo());
		System.out.println(""+cou1.getNo()+"    "+cou1.getName()+"    "+cou1.getAdd()+"           "+cou1.getStuNo());
		System.out.println(""+cou2.getNo()+"   "+cou2.getName()+"   "+cou2.getAdd()+"           "+cou2.getStuNo());
		
    }
}
