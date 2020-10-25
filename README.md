# 计192王家增2019310170
# 实验报告
# 阅读程序
## 实验目的
### 1.初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；
### 2.掌握面向对象的类设计方法（属性、方法）；
### 3.掌握类的继承用法，通过构造方法实例化对象；
### 4.学会使用super()，用于实例化子类；
### 5.掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。
## 思维导图
![1](https://github.com/Wangjiazeng123/-/blob/main/43a582fd0df92b7b15b9655c9aa729c.png)
## 核心方法
### 1.方法一
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
 ### 2.方法二 
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
  ### 3.方法三
  public static void printTeacher(int x) {//打印单条教师信息
		
		System.out.println("<教师信息>");
		System.out.println("编号   姓名    职工号   授课");
		if (x==1){
		System.out.println("  "+tea0.getNo()+"  "+tea0.getTeacherName()+" "+tea0.getTeacherId()+" "+tea0.getTeaCourse());}
		if (x==2){
		System.out.println("  "+tea1.getNo()+"  "+tea1.getTeacherName()+" "+tea1.getTeacherId()+" "+tea1.getTeaCourse());}
		if (x==3){
		System.out.println("  "+tea2.getNo()+"  "+tea2.getTeacherName()+" "+tea2.getTeacherId()+" "+tea2.getTeaCourse());
				      
		}System.out.println("请输入1打印课表");
		}
 ### 4.方法四
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
			printAll();
			System.out.println("退出学生选课系统请按1");
			System.out.println("继续学生选课系统请按2");
			int m =reader.nextInt();
			if(m==1)
				break b;
		}	
	}
  ### 5.方法五
  	public static void judgeStu(int No) {//选择学生 判断是否退课
		Scanner reader = new Scanner(System.in);
		System.out.println("1.选课\n2.退课");
		int y =reader.nextInt();
		if(No==1)
			judgeChoose(y);
	
		
		else System.out.println("没有该同学信息，请输入1");
	}
  ## 实验结果
  ![1](https://github.com/Wangjiazeng123/-/blob/main/52ad0895a869d0800e01eb8f60f07d3.png)
  ## 实验感想
掌握面向对象的类设计方法（属性、方法）掌握类的继承用法，通过构造方法实例化对象；
学会使用super()，用于实例化子类；掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。
体会到了java的灵活性。感受到了乐趣。
  
