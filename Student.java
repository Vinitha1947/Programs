public class Student {
    private String name;
    private int rollNo;
    private double marks;
    private String subject;
    public Student(String name, int rollNo, double marks, String subject){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
        this.subject = subject;
    }
    public String getName(){
        return name;
    }
    public int getRollNo(){
        return rollNo;
    }
    public String getSubject(){
        return subject;
    }
    public void setName(String name) {
        this.name = name;
    }
        public void setRollNo(int rollNo){
            this.rollNo = rollNo;
        }
        public void setMarks(double marks){
            this.marks = marks;
        }
        public void setSubject(String subject){
            this.subject = subject;
        }
        public void display(){
            System.out.println("Name: " + name);
            System.out.println("Roll No: " + rollNo);
            System.out.println("Marks: " + marks);
            System.out.println("Subject: " + subject);
        }
        public static void main(String[] args){
            Student student1 = new Student("Bhavi",174, 100, "Biology");
            Student student2 = new Student("Dhari", 176, 100, "Maths");
            student1.display();
            student2.display();
        }
    }
