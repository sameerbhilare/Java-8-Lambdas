package io.javabrains.unit1;

import io.javabrains.common.Person;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionJava7Sameer {

  public static void main(String[] args) {
    List<Person> people = Arrays.asList(
        new Person("Charles", "Dickens", 60),
        new Person("Lewis", "Carroll", 42),
        new Person("Thomas", "Carlyle", 51),
        new Person("Charlotte", "Bronte", 45),
        new Person("Matthew", "Arnold", 39)
    );

    // Step 1: Sort list by last name
    Collections.sort(people, new Comparator<Person>() {
      @Override
      public int compare(Person o1, Person o2) {
        return (o1.getLastName().compareTo(o2.getLastName()));
      }
    });

    // Step 2: Create a method that prints all elements in the list
    System.out.println("All people");
    printAll(people);

    // Step 3: Create a method that prints all people that have last name beginning with C
    System.out.println("All people that have last name starting with C");
    printConditionally(people, new MyCondition() {
      @Override
      public boolean test(Person p) {
        return p.getLastName().startsWith("C");
      }
    });

    // Step 4: Create a method that prints all people that have first name beginning with C
    System.out.println("All people that have first name starting with C");
    printConditionally(people, new MyCondition() {
      @Override
      public boolean test(Person p) {
        return p.getFirstName().startsWith("C");
      }
    });

  }

  private static void printAll(List<Person> people) {
    for (Person p : people) {
      System.out.println(p);
    }
  }

  private static void printConditionally(List<Person> people, MyCondition condition) {
    for (Person p : people) {
      if(condition.test(p)) {
        System.out.println(p);
      }
    }
  }

}

interface MyCondition {
  boolean test(Person p);
}
