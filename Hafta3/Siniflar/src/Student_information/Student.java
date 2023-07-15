public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage ;
    boolean isPass;

    Student (String name , String stuNo , String classes , Course c1 , Course c2 , Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2=c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }
    void addBulkSozluTHR (int sozlu , int yuzdekac , String prefix){
        if (c1.prefix.equals(prefix)){
            c1.sozlu =sozlu;
            c1.yuzdekac = yuzdekac;
        }
    }
    void addBulkSozluFZK (int sozlu , int yuzdekac,String prefix){
        if (c2.prefix.equals(prefix)){
            c2.sozlu =sozlu;
            c2.yuzdekac = yuzdekac;
        }
    }
    void addBulkSozluKMY (int sozlu , int yuzdekac,String prefix){
        if (c3.prefix.equals(prefix)){
            c3.sozlu =sozlu;
            c3.yuzdekac = yuzdekac;
        }

    }

    void addBulkExamNote (int note1 ,int note2 , int note3){
        if (note1>= 0 && note1<=100){
            this.c1.not = note1 * (100- c1.yuzdekac)/100;
        }
        if (note2>= 0 && note2<=100){
            this.c2.not= note2 * (100- c2.yuzdekac)/100;
        }
        if (note3>= 0 && note3<=100){
            this.c3.not= note3 * (100- c3.yuzdekac)/100;
        }
    }



    void isPass(){
        this.avarage = (this.c1.not + this.c2.not + this.c3.not) /3.0;
        if (55 < this.avarage){
            System.out.println("dersi geçti" + this.avarage);
        }else System.out.println("dersi geçemedi");
    }
    void printNote (){
        System.out.println(c1.not + " Notu " +c1.name);
        System.out.println(c2.not + " Notu " +c2.name);
        System.out.println(c3.not + " Notu " +c3.name);
        System.out.println("ortamanız " +this.avarage);
    }

}
