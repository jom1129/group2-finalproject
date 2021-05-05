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
    private static final Scanner keyboard = new Scanner(System.in);
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
                citizenTemp.setAddress(citizenCSV[3]);
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
    protected static Stream<Citizen> sortAccordingToAgeGlobal(Stream<Citizen> CitizenList) {
        return CitizenList;
        .stream();
        .sorted(
               (citizen1, citizen2) ->
                       Double.compare(citizen2.getAge(), citizen1.getAge())
                )
    }

    /** 2. TODO Kurt  */
    protected static Stream<Citizen> sortAccordingToLastNameGlobal(Stream<Citizen> CitizenList) {
        return CitizenList;
    }

    /** 3. TODO Andre  */
    protected static Stream<Citizen> sortAccordingToGenderGlobal(Stream<Citizen> CitizenList) {
        return CitizenList;
    }

    /** 4. TODO Adi */
    protected static Stream<Citizen> sortAccordingToDistrictGlobal(Stream<Citizen> CitizenList) {
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
    protected static Stream<Citizen> showResidentsGlobal(Stream<Citizen> CitizenList) {
        return CitizenList;
    }

    /** 2. TODO Jomari - iterate manually through loops */
    protected static Stream<Citizen> showNonResidentsGlobal(Stream<Citizen> CitizenList) {
        return CitizenList;
    }

    /** 3. TODO Kurt - iterate manually through loops */
    protected static Stream<Citizen> showMalesGlobal(Stream<Citizen> CitizenList) {
        return CitizenList;
    }

    /** 4. TODO Jerome - iterate manually through loops */
    protected static Stream<Citizen> showFemalesGlobal(Stream<Citizen> CitizenList) {
        return CitizenList;
    }

    /** 5. TODO EJ - iterate manually through loops */
    protected static Stream<Citizen> showAgesWithinRangeGlobal(Stream<Citizen> CitizenList) {
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
        CitizenList.stream()
            .filter(p -> p.getGender().equals(Gender.MALE))
            .count();
    }

    /** 3. TODO Kurt - Use the result returned by item number 3, then subtract from the total number of Citizen objects */
    protected static Stream<Citizen> countFemales(Stream<Citizen> CitizenList) {
        return CitizenList;
    }
}
