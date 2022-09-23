public class Main {
    public static void main(String[] args) {
        var weightOf1Boxer = 78.2;
        System.out.println(weightOf1Boxer);
        var weightOf2Boxer = 82.7;
        System.out.println(weightOf2Boxer);
        var boxersWeight = weightOf1Boxer + weightOf2Boxer;
        System.out.println("Общий вес двух бойцов " + boxersWeight);
        var weightDifference = weightOf2Boxer - weightOf1Boxer;
        System.out.println("Разница между весами бойцов " + weightDifference + " кг");
        var weightDifference2 = weightOf2Boxer % weightOf1Boxer;
        System.out.println("Разница между весами бойцов " + weightDifference2 + " кг");
        var workTime = 640;
        System.out.println(workTime);
        var EmployeeWorkTime = 8;
        System.out.println(EmployeeWorkTime);
        var employee = workTime / EmployeeWorkTime;
        System.out.println("Всего работников в компании – " + employee + " человек");
        employee = employee + 94;
        System.out.println(employee);
        var workTime2 = employee * 8;
        System.out.println("Если в компании работает " + employee + " человека, то всего " + workTime2 + " часов работы может быть поделено между сотрудниками");



    }
}