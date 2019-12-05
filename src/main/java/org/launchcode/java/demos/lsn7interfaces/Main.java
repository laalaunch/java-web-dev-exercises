package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        /* in Main, we declare allItems that contains everything in
        the Case as well as specific flavors and cones collections.

        Note that Main does NOT have to implement the Comparator interface.
        This only needs to happen in the class that actually uses the
        compare method.
         */
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        Comparator comparator = new FlavorComparator();
        Comparator coneComparator = new ConeComparator();

        /* Iterating through the flavors list before the sort
        shows before results of just the name fields.
         */
        System.out.println("Flavors before Sort: \n");
        for (Flavor i : flavors) {
            System.out.println(i.getName());
        }

        System.out.println("---------");
        System.out.println("Cones Before Sort: \n");
        for (Cone c : cones) {
            System.out.println(c.getName() +": "+ c.getCost());
        }

        /* call the sort method on flavors and pass the comparator
        object as the argument.
       */
        flavors.sort(comparator);
        cones.sort(coneComparator);

        /* Tip
        Instead of declaring and initializing the comparator object,
        Comparator comparator = new FlavorComparator(); and
        flavors.sort(comparator); by using a single statement:
        flavors.sort(new FlavorComparator());
         */

        /* Iterating through the flavors list after the sort
        shows after results of just the name fields (getName).
         */

        System.out.println("Flavors After Sort: \n");
        for (Flavor j : flavors) {
            System.out.println(j.getName());
        }

        System.out.println(" \n" + "---------");
        System.out.println("Cones After Sort: \n");
        for (Cone c : cones) {
            System.out.println(c.getName() +": "+ c.getCost());
        }

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}
