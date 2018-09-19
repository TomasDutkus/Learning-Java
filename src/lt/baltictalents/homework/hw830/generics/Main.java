package lt.baltictalents.homework.hw830.generics;

import java.util.Comparator;

/**
 * Parašykite parametrizuotą (generic) klasę, kuri realizuoja E tipo objektų
 * saugyklą. Taip pat padarykite kad juos galima iteruoti nurodant su lambda
 * išraiška, palyginančia du elementus, kokia tvarka bus iteruojame.
 * Pvz. jūsų klasė-konteineris vadinasi Container ir mes į jį dedame Employee
 * tipo objektus. Tada maždaug toks kodas turėtų veikti:
 * Container<Employee> box = new Container<>();
 * box.add(new Employee(…));
 * box.add(new Employee(…));
 * …
 * for (Employee emp : box.order((e1, e2) -> { … })) {
 * System.out.println(emp);
 * }
 **/

public class Main {
    public static void main(String[] args) {
        Container<Employee> box = new Container<>();
        box.add(new Employee("Java Developer"));
        box.add(new Employee("PHP Developer"));
        //pagal pavadinima (Z-A)
        for (Employee emp : box.order(Comparator.comparing(Employee::getName, Comparator.reverseOrder()))) {
            System.out.println(emp);

        }
        System.out.println("-----------------------------");
        //pagal raidziu skaiciu naudojant foreach (min-max)
        box.order(Comparator.comparing(e -> e.getName().length()))
                .forEach(System.out::println);
    }
}
