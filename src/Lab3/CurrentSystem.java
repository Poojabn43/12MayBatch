package Lab3;

import java.time.LocalDate;
import java.time.Period;

public class CurrentSystem {
	public static void main(String[] args) {
		LocalDate pdate = LocalDate.of(2012, 05, 23);
		LocalDate now = LocalDate.now();

		Period diff = Period.between(pdate, now);
		System.out.printf("\n difference is %d years,%d months and %d days old\n\n", diff.getYears(), diff.getMonths(),
				diff.getDays());

	}
}
