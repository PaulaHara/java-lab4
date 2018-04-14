package ca.ciccc.java.main;

import ca.ciccc.java.model.*;

import java.util.Collections;
import java.util.List;

/**
 * @author paula on 12/04/18.
 */
public class Main {
    public static void main(String[] args) {
        Employees employees = new Employees();
        List<HockeyPlayer> hockeyPlayers = employees.getHockeyPlayer();
        List<Professor> professors = employees.getProfessor();
        List<Parent> parents = employees.getParent();
        List<GasStationAttendant> gasStationAttendants = employees.getGasStationAttendant();

        //**************************Testing: Sort************************************
        System.out.println("Printing all Hockey Players before sort:");
        for(HockeyPlayer hockeyPlayer : hockeyPlayers){
            System.out.println(hockeyPlayer);
        }
        Collections.sort(hockeyPlayers);
        System.out.println("\nPrinting all Hockey Players after sort:");
        for(HockeyPlayer hockeyPlayer : hockeyPlayers){
            System.out.println(hockeyPlayer);
        }

        System.out.println("\n\nPrinting all Professors before sort:");
        for(Professor professor : professors){
            System.out.println(professor);
        }
        Collections.sort(professors);
        System.out.println("\nPrinting all Professors after sort:");
        for(Professor professor : professors){
            System.out.println(professor);
        }

        System.out.println("\n\nPrinting all Parents before sort:");
        for(Parent parent : parents){
            System.out.println(parent);
        }
        Collections.sort(parents);
        System.out.println("\nPrinting all Parents after sort:");
        for(Parent parent : parents){
            System.out.println(parent);
        }

        System.out.println("\n\nPrinting all Gas Station Attendants before sort:");
        for(GasStationAttendant gasStationAttendant : gasStationAttendants){
            System.out.println(gasStationAttendant);
        }
        Collections.sort(gasStationAttendants);
        System.out.println("\nPrinting all Gas Station Attendants after sort:");
        for(GasStationAttendant gasStationAttendant : gasStationAttendants){
            System.out.println(gasStationAttendant);
        }

        //**************************Testing: PrintEqualEmployee************************************
        System.out.println("\n\nEquals Hockey Players in the list: ");
        employees.printEqualEmployee(hockeyPlayers);

        System.out.println("\nEquals Professors in the list: ");
        employees.printEqualEmployee(professors);

        System.out.println("\nEquals Parents in the list: ");
        employees.printEqualEmployee(parents);

        System.out.println("\nEquals Gas Station Attendants in the list: ");
        employees.printEqualEmployee(gasStationAttendants);
    }
}
