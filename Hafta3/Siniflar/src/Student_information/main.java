public class main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("mahmut hoca", "5305835561" , "TRH");
        Teacher t2 = new Teacher( "Aras Hoca", "530535561","FZK");
        Teacher t3 = new Teacher( "ALP Hoca", "530535561","KMY");

        Course tarih = new Course("Tarih","101","TRH",t1);
        Course fizik = new Course("fizik","101","FZK",t2);
        Course kimya = new Course("kimya","101","KMY",t1);

        tarih.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);



        Student s1 = new Student("inek saban", "123","4",tarih,fizik,kimya);
        s1.addBulkSozluTHR(100,20,"THR");
        s1.addBulkSozluFZK(100,20,"FZK");
        s1.addBulkSozluKMY(100,20,"KMY");
        s1.addBulkExamNote(50,20,50);

        s1.printNote();



    }
}
