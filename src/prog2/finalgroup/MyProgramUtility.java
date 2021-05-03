package prog2.finalgroup;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;

/**
 * Contains the code that will convert the input file (data.csv) into a
 * list of Citizen objects and processes the list to come up with useful information
 */
public class MyProgramUtility {

    // SORT OPERATIONS (GLOBALLY)
    /** 1. TODO Enrico - use comparator */
    protected static ArrayList<Citizen> sortAccordingToAgeGlobal(ArrayList<Citizen> CitizenList) {
        return CitizenList;
    }

    /** 2. TODO Kurt - use comparator */
    protected static ArrayList<Citizen> sortAccordingToLastNameGlobal(ArrayList<Citizen> CitizenList) {
        return CitizenList;
    }

    /** 3. TODO Andre - use comparator */
    protected static ArrayList<Citizen> sortAccordingToGenderGlobal(ArrayList<Citizen> CitizenList) {
        return CitizenList;
    }

    /** 4. TODO Adi - use comparator */
    protected static ArrayList<Citizen> sortAccordingToDistrictGlobal(ArrayList<Citizen> CitizenList) {
        /*ArrayList<Citizen> clone = (ArrayList<Citizen>) CitizenList.clone();
        Collections.sort(clone, Comparator.comparingInt(Citizen::getDistrict));*/
        return CitizenList;
    }

    // SORT OPERATIONS (PER DISTRICT)
    /** 1. TODO EJ - use maps */
    protected static Stream<Citizen> sortAccordingToAgePerDistrict(Stream<Citizen> CitizenList, int district) {
        return CitizenList;
    }

    /** 2. TODO Jerome - use maps */
    protected static Stream<Citizen> sortAccordingToLastNamePerDistrict(Stream<Citizen> CitizenList, int district) {
        return CitizenList;
    }

    /** 3. TODO Jomari - use maps */
    protected static Stream<Citizen> sortAccordingToGenderPerDistrict(Stream<Citizen> CitizenList, int district) {
        return CitizenList;
    }

    // SHOW OPERATIONS (GLOBALLY)
    /** 1. TODO Enrico - iterate manually through loops */
    protected static ArrayList<Citizen> showResidentsGlobal(ArrayList<Citizen> CitizenList) {
        return CitizenList;
    }

    /** 2. TODO Jomari - iterate manually through loops */
    protected static ArrayList<Citizen> showNonResidentsGlobal(ArrayList<Citizen> CitizenList) {
        return CitizenList;
    }

    /** 3. TODO Kurt - iterate manually through loops */
    protected static ArrayList<Citizen> showMalesGlobal(ArrayList<Citizen> CitizenList) {
        return CitizenList;
    }

    /** 4. TODO Jerome - iterate manually through loops */
    protected static ArrayList<Citizen> showFemalesGlobal(ArrayList<Citizen> CitizenList) {
        return CitizenList;
    }

    /** 5. TODO EJ - iterate manually through loops */
    protected static ArrayList<Citizen> showAgesWithinRangeGlobal(ArrayList<Citizen> CitizenList) {
        return CitizenList;
    }

    // SHOW OPERATIONS (PER DISTRICT)
    /** 1. TODO Adi - Generate a stream from a Citizen ArrayList then use Stream.filter, then display outputs directly */
    protected static Stream<Citizen> showResidentsPerDistrict(Stream<Citizen> CitizenList, int district) {
        return CitizenList;
    }

    /** 2. TODO Andre - Generate a stream from a Citizen ArrayList then use Stream.filter, then display outputs directly */
    protected static Stream<Citizen> showNonResidentsPerDistrict(Stream<Citizen> CitizenList, int district) {
        return CitizenList;
    }

    /** 3. TODO EJ - Generate a stream from a Citizen ArrayList then use Stream.filter, then display outputs directly */
    protected static Stream<Citizen> showMalesPerDistrict(Stream<Citizen> CitizenList, int district) {
        return CitizenList;
    }

    /** 4. TODO Adi - Generate a stream from a Citizen ArrayList then use Stream.filter, then display outputs directly */
    protected static Stream<Citizen> showFemalesPerDistrict(Stream<Citizen> CitizenList, int district) {
        return CitizenList;
    }

    /** 5. TODO Jomari - Generate a stream from a Citizen ArrayList then use Stream.filter, then display outputs directly */
    protected static Stream<Citizen> showAgesWithinRangePerDistrict(Stream<Citizen> CitizenList, int district) {
        return CitizenList;
    }

    // COUNT OPERATIONS (GLOBALLY)
    /** 1. TODO Jerome - Use streams; Iterate manually through loops or use a comparator */
    protected static Stream<Citizen> countPeopleWithinRange(Stream<Citizen> CitizenList) {
        return CitizenList;
    }

    /** 2. TODO Enrico - Use streams */
    protected static Stream<Citizen> countMales(Stream<Citizen> CitizenList) {
        return CitizenList;
    }

    /** 3. TODO Kurt - Use the result returned by item number 3, then subtract from the total number of Citizen objects */
    protected static Stream<Citizen> countFemales(Stream<Citizen> CitizenList) {
        return CitizenList;
    }
}
