package prog2.finalgroup;

import java.io.*;
import java.util.*;
import java.util.stream.*;

/**
 * Contains the code that will convert the input file (data.csv) into a
 * list of Citizen objects and processes the list to come up with useful information
 */
public class MyProgramUtility {
    // Source for regex used:
    // https://stackoverflow.com/questions/1757065/java-splitting-a-comma-separated-string-but-ignoring-commas-in-quotes
    private static BufferedReader br;
    protected static ArrayList<Citizen> parseCSV(String fileName) {
        ArrayList<Citizen> citizenArrayList = new ArrayList<>();
        String line;
        try {
            br = new BufferedReader(new FileReader(fileName));
            br.readLine();
            while ((line = br.readLine()) != null) {
                // Split on comma
                String[] citizenCSV = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
                // Create course object to store values
                Citizen citizenTemp = new Citizen();
                // add values from csv to Course object
                citizenTemp.setFullName(citizenCSV[1] + " " + citizenCSV[0]);
                citizenTemp.setEmail(citizenCSV[2]);
                // EDITED: address field should not contain double quotes (as per letter c in the specification)
                citizenTemp.setAddress(citizenCSV[3].replace("\"", ""));
                citizenTemp.setAge(Integer.parseInt(citizenCSV[4]));
                citizenTemp.setIsResident(citizenCSV[5].equalsIgnoreCase("Resident"));
                citizenTemp.setDistrict(Integer.parseInt(citizenCSV[6]));
                citizenTemp.setGender(citizenCSV[7].charAt(0));
                citizenArrayList.add(citizenTemp);
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File not found.");
        } catch (IOException ioException) {
            System.out.println("I/O error: " + ioException);
        }
        return citizenArrayList;
    }

    // SORT OPERATIONS (GLOBALLY)
    /** 1. TODO Enrico  */
    protected static ArrayList<Citizen> sortAccordingToAgeGlobal(Stream<Citizen> CitizenList) {
        return CitizenList.collect(Collectors.toCollection(ArrayList::new));
        /*.stream();
        .sorted(
               (citizen1, citizen2) ->
                       Double.compare(citizen2.getAge()asd, citizen1.getAge())
                )*/
    }

    /** 2. TODO Kurt  */
    protected static ArrayList<Citizen> sortAccordingToLastNameGlobal(Stream<Citizen> CitizenList) {
        return CitizenList.collect(Collectors.toCollection(ArrayList::new));
    }

    /** 3. TODO Andre  */
    protected static ArrayList<Citizen> sortAccordingToGenderGlobal(Stream<Citizen> CitizenList) {
        return CitizenList.collect(Collectors.toCollection(ArrayList::new));
    }

    /**
     * This method sorts a stream according to district
     *
     * @param CitizenList stream of citizen list
     */
    protected static ArrayList<Citizen> sortAccordingToDistrictGlobal(Stream<Citizen> CitizenList) {
        //.forEach(System.out::println);
        return CitizenList
                .sorted((c1, c2) -> c1.getDistrict() - c2.getDistrict())
                .collect(Collectors.toCollection(ArrayList::new));
    }

    // SORT OPERATIONS (PER DISTRICT)
    /** 1. TODO EJ - use maps */
    protected static ArrayList<Citizen> sortAccordingToAgePerDistrict(Stream<Citizen> CitizenList, int district) {
        return CitizenList.collect(Collectors.toCollection(ArrayList::new));
    }

    /** 2. TODO Jerome - use maps */
    protected static ArrayList<Citizen> sortAccordingToLastNamePerDistrict(Stream<Citizen> CitizenList, int district) {
        return CitizenList.collect(Collectors.toCollection(ArrayList::new));
    }

    /** 3. TODO Jomari - use maps */
    protected static ArrayList<Citizen> sortAccordingToGenderPerDistrict(Stream<Citizen> CitizenList, int district) {
        return CitizenList.collect(Collectors.toCollection(ArrayList::new));
    }

    // SHOW OPERATIONS (GLOBALLY)
    /** 1. TODO Enrico - iterate manually through loops */
    protected static ArrayList<Citizen> showResidentsGlobal(Stream<Citizen> CitizenList) {
        return CitizenList.collect(Collectors.toCollection(ArrayList::new));
    }

    /** 2. TODO Jomari - iterate manually through loops */
    protected static ArrayList<Citizen> showNonResidentsGlobal(Stream<Citizen> CitizenList) {
        return CitizenList.collect(Collectors.toCollection(ArrayList::new));
    }

    /** 3. TODO Kurt - iterate manually through loops */
    protected static ArrayList<Citizen> showMalesGlobal(Stream<Citizen> CitizenList) {
        return CitizenList.collect(Collectors.toCollection(ArrayList::new));
    }

    /** 4. TODO Jerome - iterate manually through loops */
    protected static ArrayList<Citizen> showFemalesGlobal(Stream<Citizen> CitizenList) {
        return CitizenList.collect(Collectors.toCollection(ArrayList::new));
    }

    /** 5. TODO EJ - iterate manually through loops */
    protected static ArrayList<Citizen> showAgesWithinRangeGlobal(Stream<Citizen> CitizenList) {
        return CitizenList.collect(Collectors.toCollection(ArrayList::new));
    }

    // SHOW OPERATIONS (PER DISTRICT)
    /** 1. TODO Adi - Generate a stream from a Citizen ArrayList then use Stream.filter, then display outputs directly */
    protected static ArrayList<Citizen> showResidentsPerDistrict(Stream<Citizen> CitizenList, int district) {
        //forEach(System.out::println);

        return CitizenList
                .filter(c -> c.getDistrict() == district && c.isResident())
                .collect(Collectors.toCollection(ArrayList::new));
    }

    /** 2. TODO Andre - Generate a stream from a Citizen ArrayList then use Stream.filter, then display outputs directly */
    protected static ArrayList<Citizen> showNonResidentsPerDistrict(Stream<Citizen> CitizenList, int district) {
        return CitizenList.collect(Collectors.toCollection(ArrayList::new));
    }

    /** 3. TODO EJ - Generate a stream from a Citizen ArrayList then use Stream.filter, then display outputs directly */
    protected static ArrayList<Citizen> showMalesPerDistrict(Stream<Citizen> CitizenList, int district) {
        return CitizenList.collect(Collectors.toCollection(ArrayList::new));
    }

    /** 4. TODO Adi - Generate a stream from a Citizen ArrayList then use Stream.filter, then display outputs directly */
    protected static ArrayList<Citizen> showFemalesPerDistrict(Stream<Citizen> CitizenList, int district) {
        //.forEach(System.out::println);

        return CitizenList
                .filter(c -> c.getGender() == 'F' && c.getDistrict() == district)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    /** 5. TODO Jomari - Generate a stream from a Citizen ArrayList then use Stream.filter, then display outputs directly */
    protected static ArrayList<Citizen> showAgesWithinRangePerDistrict(Stream<Citizen> CitizenList, int district) {
        return CitizenList.collect(Collectors.toCollection(ArrayList::new));
    }

    // COUNT OPERATIONS (GLOBALLY)
    /** 1. TODO Jerome - Use streams; Iterate manually through loops or use a comparator */
    protected static ArrayList<Citizen> countPeopleWithinRange(Stream<Citizen> CitizenList) {
        return CitizenList.collect(Collectors.toCollection(ArrayList::new));
    }

    /** 2. TODO Enrico - Use streams */
    protected static ArrayList<Citizen> countMales(Stream<Citizen> CitizenList) {
        return CitizenList.collect(Collectors.toCollection(ArrayList::new));
       /* CitizenList.stream()
            .filter(p -> p.getGender().equals(Gender.MALE))
            .count();*/
    }

    /** 3. TODO Kurt - Use the result returned by item number 3, then subtract from the total number of Citizen objects */
    protected static ArrayList<Citizen> countFemales(Stream<Citizen> CitizenList) {
        return CitizenList.collect(Collectors.toCollection(ArrayList::new));
    }
}
