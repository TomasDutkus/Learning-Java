package lt.baltictalents.homework.hw830.salary;

import lt.baltictalents.homework.hw830.generics.Employee;

import java.util.ArrayList;
import java.util.List;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingDouble;

/**
 * Tarkime turime objektą Employee ir objektą Salary, kuriame yra
 * Employee tipo laukas ir Double tipo laukas reiškiantis išmokėtą
 * atlyginimą.
 * Sukurkite sąrašą darbuotojų ir jų atlyginimų (gali būti keli to pačio
 * darbuotojo įrašai) ir aprašykite tokius veiksmus naudojant duomenų
 * srautus/vamzdynus (stream/lambda):
 * 1. Išrinkite kiek ir kokiam darbuotojui yra išmokėta ir išveskite
 * mažėjimo tvarka pagal išmokėtą sumą: vardas - išmokėta suma
 * 2. Suskaičiuokite kiek išmokėjimų (ne suma bet kiek kartų buvo
 * išmokėta) yra kiekvienam darbuotojui ir atspausdinkite: vardas -
 * kiek kartų išmokėta.
 **/

public class SalaryMain {
    public static void main(String[] args) {
 /*       Employee maksas = new Employee("Maksas");
        Employee zivile = new Employee("Zivile");
        List<Salary> salaries = new ArrayList<>();
        salaries.add(zivile, new Salary(zivile, 20d)); // saldainiams
        salaries.add(maksas, new Salary(maksas, 200d)); // nes dirbantis
        salaries.add(zivile, new Salary(zivile, 100.0)); // nes nezinom, ar dirbanti
        salaries.add(maksas, new Salary(maksas, 50.0)); // uz gerus klausymus
        salaries.add(maksas, new Salary(maksas, 17 * 5.0)); // rukymui
    }

    private static void showTotalAmountByEmployee(List<Salary> salaries) {
        System.out.println("vardas");
        salaries.stream()
                .collect(groupingBy(s -> s.getEmployee().getName(),
                        summingDouble(Salary::getSalary)))
                .entrySet().stream()
                .sorted(comparingByValue())
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry)); */
    }
}
