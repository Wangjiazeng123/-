package Information;

import java.util.Scanner;


public class Teacher extends People {
	private String teacherName;
	private String teacherId;
	
	  ;
public Teacher(int number,String name,String sex,String id,String course){
	setNo(number);
	setTeacherName(name);
	setSex(sex);
	setTeacherId(id);
	setTeaCourse(course);
}
public int getNo(){
	return num;	
}
void setNo(int number) {
	this.num=number;	
}
public String getTeacherName(){
	return teacherName;	
}
void setTeacherName(String teacherName) {
	this.teacherName = teacherName;	
}
public String getSex(){
	return sex;	
}
void setSex(String sex) {
	this.sex=sex;	
}
public String getTeacherId(){
	return teacherId;	
}
void setTeacherId(String teacherId) {
	this.teacherId = teacherId;	
}
public void setTeaCourse(String course) {
	super.course=course;
	}
public String getTeaCourse() {
	return super.course;
	}

}