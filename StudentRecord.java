
package studentmanagement;

public class StudentRecord {

    private String name,grade;
    private int id;

    public StudentRecord(){
        this.name = this.grade = "";
        this.id = 0;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setGrade(String grade){
        this.grade = grade;
    }
    
    public String getGrade(){
        return this.grade;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return this.id;
    }
    
    @Override
    public String toString(){
        return "Student Records( id = " + getId() + ", name = " + getName() + ", Grade = " + getGrade() + ")";
    }
}
