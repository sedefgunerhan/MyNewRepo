public class mySecondClass {

    static int price2;
    static double minSalary;
    static float hourlySalary;
    static char single;
    static boolean isOld;

    public static void main(String[] args) {
        //If you create a variable inside a static method Java makes it static automatically
        int price1 = 100;
        double salary = 2.34;
        float weeklySalary = 1.234f;
        char initial = 'S';
        byte age = 53;
        short populationOfAVillage = 25000;
        boolean isNew = true;
        boolean isRetired = false;
        String name = "?Ali! 12345";

        System.out.println(price1);
        System.out.println(salary);
        System.out.println(price1 * salary);
        System.out.println(price2);
        System.out.println(minSalary);
        System.out.println(hourlySalary);
        System.out.println(weeklySalary);
        System.out.println(initial);
        System.out.println(single);
        System.out.println(age);
        System.out.println(populationOfAVillage);
        System.out.println(isOld);
        System.out.println(name);
    }

}
