public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name, String mnpo , String branch){
        this.name = name;
        this.branch= branch;
        this.mpno=mnpo;
    }
    void print(){
        System.out.println("Adi " + this.name);
        System.out.println("telefonu "+ this.mpno);
        System.out.println("Bölümü " + this.branch);
    }
}
