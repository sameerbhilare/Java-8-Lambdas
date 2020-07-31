package io.javabrains.unit1;

import io.javabrains.common.Person;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Unit1ExerciseSolutionJava8Sameer {

  public static void main(String[] args) {
    List<Person> people = Arrays.asList(
        new Person("Charles", "Dickens", 60),
        new Person("Lewis", "Carroll", 42),
        new Person("Thomas", "Carlyle", 51),
        new Person("Charlotte", "Bronte", 45),
        new Person("Matthew", "Arnold", 39)
    );

    // Step 1: Sort list by last name
    Collections.sort(people, (person1, person2) -> person1.getLastName().compareTo(person2.getLastName()));

    // Step 2: Create a method that prints all elements in the list
    System.out.println("\nAll people");
    printConditionally(people, p -> true);

    // Step 3: Create a method that prints all people that have last name beginning with C
    System.out.println("\nAll people that have last name starting with C");
    printConditionally(people, p -> p.getLastName().startsWith("C"));

    // Step 4: Create a method that prints all people that have first name beginning with C
    System.out.println("\nAll people that have first name starting with C");
    printConditionally(people, p -> p.getFirstName().startsWith("C"));

  }

  private static void printConditionally(List<Person> people, Predicate<Person> predicate) {
    for (Person p : people) {
      if(predicate.test(p)) {
        System.out.println(p);
      }
    }
  }

}

