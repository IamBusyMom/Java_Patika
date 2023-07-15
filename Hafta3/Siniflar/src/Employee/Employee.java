package Employee;

public class Employee {
    String name ;
    int salary;
    int haftalikWork;
    int hireyear;

    Employee(String name,int salary,int haftalikWork,int hireyear){
        this.name=name;
        this.salary=salary;
        this.haftalikWork=haftalikWork;
        this.hireyear=hireyear;
    }

     int tax (){
        if (this.salary<=1000){
            this.salary = this.salary;
            System.out.println("verigisi "+ this.salary);
            return this.salary;
        }
        else {
            this.salary = this.salary * 3/100;
            System.out.println("verigisi " + this.salary);
            return this.salary;
        }
    }

    int bonus(){
        if (haftalikWork >40){
            int a = 30 *(haftalikWork -40) ;
            System.out.println("bonusu "+ a);
            return a;
        }
        return 0;
    }

     int raiseSalary(){
        if (2021 - this.hireyear < 10){
            this.salary = this.salary * 105 / 100;
            return this.salary;
        }
        if (2021 - this.hireyear < 20 &&2021 - this.hireyear>10 ){
            this.salary = this.salary * 110 / 100;
            return this.salary;
        }if (2021 - this.hireyear < 19){
            this.salary = this.salary * 120 / 100;
            return this.salary;
        }
        return 0;
    }

     int newwMaas(){
        this.salary = this.salary + this.bonus() - this.tax() + this.raiseSalary();
        return this.salary;
    }

    void  print(){
        System.out.println("adı " + this.name);
        System.out.println("maası" + this.salary);
        System.out.println("calısma saati " + this.haftalikWork);
        System.out.println("baslangıc yılı" + this.hireyear);

        System.out.println("verigisi " + this.tax());
        System.out.println("bonusu " +this.bonus() );
        System.out.println("maas artısı " + this.raiseSalary());
        System.out.println("vergi ve maaş artısı ile maaş " + this.salary);

    }


}
