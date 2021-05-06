package prog2.finalgroup;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class will contain the main method and also the code
 * that generates the GUI (Graphical User Interface).
 */
public class MyProgram extends JFrame {
    /** TODO Kurt & Adi - hard-coded GUI, IJ's tools not to be utilized */

    private JPanel buttonPaneGlobal;
    private JPanel buttonPaneGlobalSortOperations;
    private JPanel buttonPaneGlobalShowOperations;
    private JPanel buttonPaneDistrict;
    private JPanel buttonPaneDistrictSortOperations;
    private JPanel buttonPaneDistrictShowOperations;

    private JPanel citizenPane;

    private JTable citizenTable;
    private JTabbedPane globalOrDistrictSelector;

    public MyProgram() {
        buttonPaneGlobal = new JPanel();
        buttonPaneGlobalSortOperations = new JPanel();
        buttonPaneGlobalShowOperations = new JPanel();
        buttonPaneDistrict = new JPanel();
        buttonPaneDistrictSortOperations = new JPanel();
        buttonPaneDistrictShowOperations = new JPanel();
        globalOrDistrictSelector = new JTabbedPane();
        citizenPane = new JPanel();
        citizenTable = new JTable();

        // Global Buttons and associated actions
        var sortAccordingToAgeGloballyButton = new JButton("Age");
        sortAccordingToAgeGloballyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // code utilizing JTable here
            }
        });
        buttonPaneGlobalSortOperations.add(sortAccordingToAgeGloballyButton);

        var sortAccordingToNameGloballyButton = new JButton("Name");
        sortAccordingToNameGloballyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // code utilizing JTable here
            }
        });
        buttonPaneGlobalSortOperations.add(sortAccordingToNameGloballyButton);

        var sortAccordingToGenderGloballyButton = new JButton("Gender");
        sortAccordingToGenderGloballyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // code utilizing JTable here
            }
        });
        buttonPaneGlobalSortOperations.add(sortAccordingToGenderGloballyButton);

        var sortAccordingToDistrictGloballyButton = new JButton("District");
        sortAccordingToDistrictGloballyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // code utilizing JTable here
            }
        });
        buttonPaneGlobalSortOperations.add(sortAccordingToDistrictGloballyButton);
        buttonPaneGlobalSortOperations.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Sort Operations"));

        var showResidentsGloballyButton = new JButton("Residents");
        showResidentsGloballyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // code utilizing JTable here
            }
        });
        buttonPaneGlobalShowOperations.add(showResidentsGloballyButton);

        var showNonResidentsGloballyButton = new JButton("Non-residents");
        showNonResidentsGloballyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // code utilizing JTable here
            }
        });
        buttonPaneGlobalShowOperations.add(showNonResidentsGloballyButton);

        var showMalesGloballyButton = new JButton("Males");
        showMalesGloballyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // code utilizing JTable here
            }
        });
        buttonPaneGlobalShowOperations.add(showMalesGloballyButton);

        var showFemalesGloballyButton = new JButton("Females");
        showFemalesGloballyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // code utilizing JTable here
            }
        });
        buttonPaneGlobalShowOperations.add(showFemalesGloballyButton);

        var showAgesWithinAGivenRangeGlobally = new JButton("Age Range");
        showAgesWithinAGivenRangeGlobally.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // utilize a popup window for accepting user input
                // code utilizing JTable here
            }
        });
        buttonPaneGlobalShowOperations.add(showAgesWithinAGivenRangeGlobally);
        buttonPaneGlobalShowOperations.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Show Operations"));

        // DISTRICT
        // DISTRICT
        // DISTRICT
        // DISTRICT

        var sortAccordingToAgePerDistrictBtn = new JButton("Age");
        sortAccordingToAgePerDistrictBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code here
            }
        });
        buttonPaneDistrictSortOperations.add(sortAccordingToAgePerDistrictBtn);

        var sortAccordingToNamePerDistrictBtn = new JButton("Name");
        sortAccordingToNamePerDistrictBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // code here
            }
        });
        buttonPaneDistrictSortOperations.add(sortAccordingToNamePerDistrictBtn);

        var sortAccordingToGenderPerDistrictBtn = new JButton("Gender");
        sortAccordingToGenderPerDistrictBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // code here
            }
        });
        buttonPaneDistrictSortOperations.add(sortAccordingToGenderPerDistrictBtn);
        buttonPaneDistrictSortOperations.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Sort Operations"));

        var showResidentsPerDistrictBtn = new JButton("Residents");
        showResidentsPerDistrictBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // code here
            }
        });
        buttonPaneDistrictShowOperations.add(showResidentsPerDistrictBtn);

        var showNonResidentsPerDistrictBtn = new JButton("Non-Residents");
        showNonResidentsPerDistrictBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // code here
            }
        });
        buttonPaneDistrictShowOperations.add(showNonResidentsPerDistrictBtn);

        var showMalesPerDistrictBtn = new JButton("Males");
        showMalesPerDistrictBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // code here
            }
        });
        buttonPaneDistrictShowOperations.add(showMalesPerDistrictBtn);

        var showFemalesPerDistrictBtn = new JButton("Females");
        showFemalesPerDistrictBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // code here
            }
        });
        buttonPaneDistrictShowOperations.add(showFemalesPerDistrictBtn);

        var showAgesPerDistrictBtn = new JButton("Age Range");
        showAgesPerDistrictBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // code here
            }
        });
        buttonPaneDistrictShowOperations.add(showAgesPerDistrictBtn);
        buttonPaneDistrictShowOperations.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Show Operations"));

        /* Configure the layouts of each panel
        buttonPaneGlobal.setLayout(new BoxLayout(buttonPaneGlobal, BoxLayout.PAGE_AXIS));
        buttonPaneGlobalSortOperations.setLayout(new BoxLayout(buttonPaneGlobalSortOperations, BoxLayout.PAGE_AXIS));
        buttonPaneGlobalShowOperations.setLayout(new BoxLayout(buttonPaneGlobalShowOperations, BoxLayout.PAGE_AXIS));
        buttonPaneDistrict.setLayout(new BoxLayout(buttonPaneDistrict, BoxLayout.PAGE_AXIS));
        buttonPaneDistrictSortOperations.setLayout(new BoxLayout(buttonPaneDistrictSortOperations, BoxLayout.PAGE_AXIS));
        buttonPaneDistrictShowOperations.setLayout(new BoxLayout(buttonPaneDistrictShowOperations, BoxLayout.PAGE_AXIS));

         */
        // Nest the JPanels
        buttonPaneGlobal.add(buttonPaneGlobalSortOperations);
        buttonPaneGlobal.add(buttonPaneGlobalShowOperations);
        buttonPaneDistrict.add(buttonPaneDistrictSortOperations);
        buttonPaneDistrict.add(buttonPaneDistrictShowOperations);


        // Configure the contents of JTab
        globalOrDistrictSelector.addTab("Global", buttonPaneGlobal);
        globalOrDistrictSelector.addTab("District", buttonPaneDistrict);

        add(citizenPane, BorderLayout.NORTH);
        add(globalOrDistrictSelector, BorderLayout.SOUTH);

        // Window options
        setTitle("Test");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new MyProgram());
    }

}
