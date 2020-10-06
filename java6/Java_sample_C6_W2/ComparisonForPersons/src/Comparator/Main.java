package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();

		persons.add(new Person("abbe", "bioll"));
		persons.add(new Person("maria", "bob"));
		persons.add(new Person("adem", "pelle"));
		persons.add(new Person("mara", "tom"));

		for (Person person : persons) {
			System.out.print(person.getFname());
			System.out.print(" ");
			System.out.println(person.getLname());

		}
		System.out.println();

		Collections.sort(persons);

		for (Person person : persons) {
			System.out.print(person.getFname());
			System.out.print(" ");
			System.out.println(person.getLname());

		}
		System.out.println();
		Collections.sort(persons, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {

				return o1.getFname().compareTo(o2.getFname());
			}
		});

		for (Person person : persons) {
			System.out.print(person.getFname());
			System.out.print(" ");
			System.out.println(person.getLname());

		}

		System.out.println();
		Collections.sort(persons, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {

				return o1.getLname().compareTo(o2.getLname());
			}
		});

		for (Person person : persons) {
			System.out.print(person.getFname());
			System.out.print(" ");
			System.out.println(person.getLname());

		}

	}
}