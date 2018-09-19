package lt.baltictalents.homework.hw830.invoice;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summarizingDouble;

/** Sukurkite sąskatas-faktūras aprašančią klasę, kurioje būtų
 sąskaitos datos laukas (LocalDate), kliento laukas (klasė arba
 tik String tipo) ir sumos laukas (BigDecimal).
 Sukurkite sąrašą tokių įrašų su skirtingomis datomis ir
 sumomis.
 Parašykite metodą kuris iš sąrašo suformuoja kitą sąrašą -
 ataskaitą parodančią kokios yra pajamos pagal ketvirčius. **/

public class InvoiceMain {
    private static final Map<Month, Integer> QUARTERS;
    static {
        QUARTERS = new HashMap<>();
        QUARTERS.put(Month.JANUARY, 1);
        QUARTERS.put(Month.FEBRUARY, 1);
        QUARTERS.put(Month.MARCH, 1);
        QUARTERS.put(Month.APRIL, 2);
        QUARTERS.put(Month.MAY, 2);
        QUARTERS.put(Month.JUNE, 2);
        QUARTERS.put(Month.JULY, 3);
        QUARTERS.put(Month.AUGUST, 3);
        QUARTERS.put(Month.SEPTEMBER, 3);
        QUARTERS.put(Month.OCTOBER, 4);
        QUARTERS.put(Month.NOVEMBER, 4);
        QUARTERS.put(Month.DECEMBER, 4);
    }
    public static void main(String[] args) {
        List<Invoice> invoices = Arrays.asList(
                new Invoice(LocalDate.now(), "c1", BigDecimal.valueOf(20)),
                new Invoice(LocalDate.now().minusMonths(5), "c1", BigDecimal.valueOf(20)),
                new Invoice(LocalDate.now().plusDays(10), "c1", BigDecimal.valueOf(100)),
                new Invoice(LocalDate.now().plusDays(15), "c1", BigDecimal.valueOf(2)),
                new Invoice(LocalDate.now().minusMonths(3), "c1", BigDecimal.valueOf(120))
        );

        invoices.stream()
                .collect(groupingBy(i->QUARTERS.get(i.getDate().getMonth()),
        summarizingDouble(i->i.getAmount().doubleValue())))
                .forEach((k, v) -> System.out.println(k + " - " + v));
    }
}
