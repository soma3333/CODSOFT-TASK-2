import java.util.Scanner;
public class Student_Grade {
    double total(double sub1,double sub2,double sub3,double sub4,double sub5){
        return (sub1+sub2+sub3+sub4+sub5);
    }
    double percentage(double tot){
        return (tot/500)*100;
    }
    char grade(double per){
        if(per>=90.00){
            return 'A';}
        else if (per>80.00){
            return 'B';}
        else {
            return 'C';}
    }

    void display(double tot,double per ,char gra){
        System.out.println();
        System.out.println("RESULT :");
        System.out.println("User's total marks : "+tot);
        System.out.println("User's average percentage is : "+per+"%");
        System.out.println("User's grade  is : "+gra);
    }
        
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the marks for 5 subjects out of 100");
        System.out.println("sub1 : ");
        double sub1=input.nextDouble();
        System.out.println("sub2 : ");
        double sub2=input.nextDouble();
        System.out.println("sub3 : ");
        double sub3=input.nextDouble();
        System.out.println("sub4 : ");
        double sub4=input.nextDouble();
        System.out.println("sub5 : ");
        double sub5=input.nextDouble();

        Student_Grade obj1=new Student_Grade();
        double tot=obj1.total(sub1,sub2,sub3,sub4,sub5);
        double per=obj1.percentage(tot);
        char gra=obj1.grade(per);
        obj1.display(tot,per,gra);
    }
}
