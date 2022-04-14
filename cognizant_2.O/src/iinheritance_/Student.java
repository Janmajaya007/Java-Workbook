package iinheritance_;

public class Student {
    
    protected int studentId;
    protected String name;
    protected int departmentId;
    protected String gender;
    protected String phone;
    
    /* Getter setter for studentId */
    public int getStudentid(){
        return studentId;
    }
    public void setStudentid(int sid){
        this.studentId=sid;
    }
    
    /* Getter setter for name */
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    /* Getter setter for departmentId */
    public int getDepartmentid(){
        return departmentId;
    }
    public void setDepartmentid(int did){
        this.departmentId=did;
    }
    /* Getter setter for gender */
    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    /* Getter setter for phone */
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
}