public class Teacher {
    private String name;
    private String subject;
    private int student;

   // public Teacher(String name, String subject, int student){
       // this.name= name;
        //this.subject=subject;
        //this.student=student;}
    public void setName(String name){
        this.name= name;

    }
    public String getName(){
        return name;

    }
    public void setSubject( String subject){
        this.subject =subject;
    }
    public String getSubject(){
        return subject;
    }
    public void setStudent (){
        this.student= (2);
    }
    public int getStudent() {
        return student;
    }
    public static void main(String[] args){
      //  Teacher myTeacher=new Teacher("Aashique","Java",4);
            Teacher student = new Teacher();
            Teacher subject= new Teacher();
            Teacher name= new Teacher();

            name.setName("Aashique");
            subject.setSubject("Java");
            student.setStudent();

            System.out.println(name.getName());
            System.out.println(subject.getSubject());
            System.out.println(student.getStudent());
        }
    }
