public abstract class Problem2 {

      /*We have to calculate the average of marks obtained in three subjects by student A and by student B. Create class
    'Marks' with an abstract method 'getPercentage' that will be returning the average percentage of marks. Provide
implementation of abstract method in classes 'A' and 'B'. The constructor of student A takes the marks in three subjects
as its parameters and the marks in four subjects as its parameters for student B. Test your code*/

    int math;
    int reading;
    int English;
    Problem2(int math, int reading, int English){
        this.math=math;
        this.reading=reading;
        this.English=English;
    }

    abstract void getPercentage();
}
class A extends Problem2 {
    A(int math,int reading,int English){
        super(math,reading,English);
    }
    void getPercentage(){
        System.out.println("Everage score of class A is "+(math+reading+English)/3);
    }
}
class B extends Problem2 {
    int Spanish;
    B(int math,int reading,int English, int Spanish){
        super(math,reading,English);
        this.Spanish=Spanish;
    }
    void getPercentage(){
        System.out.println("Everage score of class A is "+(math+reading+English+Spanish)/4);
    }
}
class tester32{
    public static void main(String[] args) {
        new A(50,45,34).getPercentage();
        new B(55,50,35,45).getPercentage();
    }
}

