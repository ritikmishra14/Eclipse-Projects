package studentManagementApp;

public class Student {
	private int studentId;
	private String studentName;
	private String phoneNumber;
	private int rollNo;
	
	public Student(int studentId,String studentName,int rollNo, String phoneNumber) {
		this.studentId=studentId;
		this.studentName=studentName;
		this.rollNo=rollNo;
		this.phoneNumber=phoneNumber;
	}
	public Student(String studentName,int rollNo, String phoneNumber) {
		
		this.studentName=studentName;
		this.rollNo=rollNo;
		this.phoneNumber=phoneNumber;
	}
public Student(String studentName,int studentId) {
		
		this.studentName=studentName;
		this.studentId=studentId;
		
	}
	
	public Student() {
		
	}
	public void setId(int studentId) {
		this.studentId=studentId;
	}
	public int getId() {
		return this.studentId;
	}
	public void setName(String studentName) {
		this.studentName=studentName;
	}
	public String getName() {
		return this.studentName;
	}
	
	

	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentId=" + studentId + ", phoneNumber=" + phoneNumber
				+ ", rollNo=" + rollNo + "]";
	}
	

}
