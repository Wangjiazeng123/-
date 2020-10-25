package Run;

import Information.Course;
import Information.Student;
import Information.Teacher;
import java.util.Scanner;
public abstract class Test2 {
	
	static Student stu0 = new Student(1,"小红","女","G2019310",0);
	
	
	static Teacher tea0 = new Teacher(1,"世博","男","T1001","Java ");
	static Teacher tea1 = new Teacher(2,"微微","女","T3201","离散数学 ");
	static Teacher tea2 = new Teacher(3,"明明","女","T1301","马克思原理 ");
	static Course cou0 = new Course(1,"Java","教300",15);
	static Course cou1 = new Course(2,"离散数学","教250",20);
	static Course cou2 = new Course(3,"马克思原理","教300",20);
	static int courseNo;
	static int stuNo;
	public static void main(String[] args) 
	{
	b:	for(;;) 
		{
			printStudentAll();
			Scanner reader = new Scanner(System.in);//录入语法
			System.out.println("请输入学生编号：");
			int x =reader.nextInt();//获取学生编号
			stuNo=x;//记录学生编号
			judgeStu(x);//选择学生
			
			System.out.println("退出学生选课系统请按1");
			System.out.println("继续学生选课系统请按2");
			int m =reader.nextInt();
			if(m==1)
				break b;
		}
	printAll();
		
	}
	public static void judgeStu(int No) {//选择学生 判断是否退课
		Scanner reader = new Scanner(System.in);
		System.out.println("1.选课\n2.退课");
		int y =reader.nextInt();
		if(No==1)
			judgeChoose(y);
	
		
		else System.out.println("没有该同学信息，请输入1");
	}
	public static void judgeChoose(int No) {//确认退课选课，选择课程编号
		Scanner reader = new Scanner(System.in);
		printCourseAll();
		System.out.println("请输入选择课程编号：");
		int z =reader.nextInt();
				courseNo=z;//记录课程编号
		if(No==1){//选课
			courseChoose(z);
		    addWork(stuNo,courseNo);
		    }
		 if(No==2){//退课
			courseChoose(z);
		    reduceWork(stuNo,courseNo);
		    } 
	
	}
	public static void courseChoose(int No) {//选择课程并打印老师
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
		System.out.println("<学生选课系统>");
		printTeacherAll();
		printStudentAll();
		printCourseAll();
		}
		
	public static void printTeacher(int x) {//打印单条教师信息
		
		System.out.println("<教师信息>");
		System.out.println("编号   姓名  性别  职工号   授课");
		if (x==1){
			System.out.println("  "+tea0.getNo()+"      "+tea0.getTeacherName()+"    "+tea0.getSex()+"     "+tea0.getTeacherId()+" "+tea0.getTeaCourse());}
		if (x==2){
			System.out.println("  "+tea1.getNo()+"      "+tea1.getTeacherName()+"    "+tea1.getSex()+"     "+tea1.getTeacherId()+" "+tea1.getTeaCourse());}
		if (x==3){
			System.out.println("  "+tea2.getNo()+"      "+tea2.getTeacherName()+"    "+tea2.getSex()+"     "+tea2.getTeacherId()+" "+tea2.getTeaCourse());
				      
		}
		}
	    
	
	
    public static void printTeacherAll() {//打印所有教师信息
		
		System.out.println("<教师信息>");
		System.out.println("编号   姓名  性别  职工号   授课");
		System.out.println("  "+tea0.getNo()+"      "+tea0.getTeacherName()+"    "+tea0.getSex()+"     "+tea0.getTeacherId()+" "+tea0.getTeaCourse());
		System.out.println("  "+tea1.getNo()+"      "+tea1.getTeacherName()+"    "+tea1.getSex()+"     "+tea1.getTeacherId()+" "+tea1.getTeaCourse());
		System.out.println("  "+tea2.getNo()+"      "+tea2.getTeacherName()+"    "+tea2.getSex()+"     "+tea2.getTeacherId()+" "+tea2.getTeaCourse());
		
	}
    public static void printStudent(int x) {
    	System.out.println("<学生信息>");
		System.out.println("编号   姓名  性别  学号   课数");
		if (x==1)
			System.out.println("  "+stu0.getNo()+"       "+stu0.getStudentName()+"   "+stu0.getSex()+"    "+stu0.getStudentId()+"   "+stu0.getCourses());
		
    }
    public static void printStudentAll() {
    	System.out.println("<学生信息>");
		System.out.println("编号   姓名 性别  学号   课数");
		System.out.println("  "+stu0.getNo()+"       "+stu0.getStudentName()+"   "+stu0.getSex()+"    "+stu0.getStudentId()+"   "+stu0.getCourses());
		
    }
    public static void printCourse(int x) {
    	System.out.println("<课程信息>");
		System.out.println("编号   课程名称   教学地点   选课人数");
		if(x==1)
		System.out.println("  "+cou0.getNo()+"      "+cou0.getName()+"     "+cou0.getAdd()+"           "+cou0.getStuNo());
    }
    public static void printCourseAll() {
    	System.out.println("<课程信息>");
		System.out.println("编号   课程名称   教学地点   选课人数");
		System.out.println(""+cou0.getNo()+"    "+cou0.getName()+"       "+cou0.getAdd()+"           "+cou0.getStuNo());
		System.out.println(""+cou1.getNo()+"    "+cou1.getName()+"    "+cou1.getAdd()+"           "+cou1.getStuNo());
		System.out.println(""+cou2.getNo()+"   "+cou2.getName()+"   "+cou2.getAdd()+"           "+cou2.getStuNo());
		
    }
}
