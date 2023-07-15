public class Course {
    Teacher teacher;
    String name;
    String code;
    String  prefix;
    int sozlu;

    int yuzdekac;
    int not ;

    Course(String name  , String code , String prefix ,Teacher teacher){
        this.name=name;
        this.code = code;
        this.prefix = prefix;
        this.teacher=teacher;
        int sozlu = 1;
        int yuzdekac = 1;
        int not = 0;
    }


    void addTeacher(Teacher teacher){
        if (this.prefix.equals(teacher.branch)  ){
            this.teacher = teacher;
        }else{
            System.out.println("yanlış öğretmen");
        }
    }
    void printTeacherInfo (){
        this.teacher.print();
    }

}
