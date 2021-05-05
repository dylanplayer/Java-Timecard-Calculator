import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class GUI implements ActionListener{

    public JFrame window;
    public JPanel mainPanel;
    public JScrollPane scrollPane;
    public Font dayFont = new Font("Courier", Font.BOLD, 20);
    public Font inOutFont = new Font("Courier", Font.PLAIN, 20);

    public GUI(){

        window = new JFrame("Timecard Calculator");

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(450,700);
    
        
        mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setPreferredSize(new Dimension(1000,1000));

        JLabel sundayMainLabel = new JLabel("Sunday");
        JLabel saturdayMainLabel = new JLabel("Saturday");
        JLabel fridayMainLabel = new JLabel("Friday");
        JLabel thursdayMainLabel = new JLabel("Thursday");
        JLabel wednesdayMainLabel = new JLabel("Wednesday");
        JLabel tuesdayMainLabel = new JLabel("Tuesday");
        JLabel mondayMainLabel = new JLabel("Monday");

        sundayMainLabel.setBounds(10,150,200,25);
        sundayMainLabel.setFont(dayFont);
        mainPanel.add(sundayMainLabel);

        saturdayMainLabel.setBounds(10,250,200,25);
        saturdayMainLabel.setFont(dayFont);
        mainPanel.add(saturdayMainLabel);

        fridayMainLabel.setBounds(10,350,200,25);
        fridayMainLabel.setFont(dayFont);
        mainPanel.add(fridayMainLabel);

        thursdayMainLabel.setBounds(10,450,200,25);
        thursdayMainLabel.setFont(dayFont);
        mainPanel.add(thursdayMainLabel);

        wednesdayMainLabel.setBounds(10,550,200,25);
        wednesdayMainLabel.setFont(dayFont);
        mainPanel.add(wednesdayMainLabel);

        tuesdayMainLabel.setBounds(10,650,200,25);
        tuesdayMainLabel.setFont(dayFont);
        mainPanel.add(tuesdayMainLabel);

        mondayMainLabel.setBounds(10,750,200,25);
        mondayMainLabel.setFont(dayFont);
        mainPanel.add(mondayMainLabel);


        JLabel sundayFinalOutLabel = new JLabel("out");
        JLabel sundayFinalInLabel = new JLabel("in");
        JLabel sundayFirstOutLabel = new JLabel("out");
        JLabel sundayFirstInLabel = new JLabel("in");

        sundayFinalOutLabel.setBounds(125,110,100,25);
        sundayFinalInLabel.setBounds(125,135,100,25);
        sundayFirstOutLabel.setBounds(125,160,100,25);
        sundayFirstInLabel.setBounds(125,185,100,25);

        sundayFinalOutLabel.setFont(inOutFont);
        sundayFinalInLabel.setFont(inOutFont);
        sundayFirstOutLabel.setFont(inOutFont);
        sundayFirstInLabel.setFont(inOutFont);

        mainPanel.add(sundayFinalOutLabel);
        mainPanel.add(sundayFinalInLabel);
        mainPanel.add(sundayFirstOutLabel);
        mainPanel.add(sundayFirstInLabel);

        JLabel saturdayFinalOutLabel = new JLabel("out");
        JLabel saturdayFinalInLabel = new JLabel("in");
        JLabel saturdayFirstOutLabel = new JLabel("out");
        JLabel saturdayFirstInLabel = new JLabel("in");

        saturdayFinalOutLabel.setBounds(125,210,100,25);
        saturdayFinalInLabel.setBounds(125,235,100,25);
        saturdayFirstOutLabel.setBounds(125,260,100,25);
        saturdayFirstInLabel.setBounds(125,285,100,25);

        saturdayFinalOutLabel.setFont(inOutFont);
        saturdayFinalInLabel.setFont(inOutFont);
        saturdayFirstOutLabel.setFont(inOutFont);
        saturdayFirstInLabel.setFont(inOutFont);

        mainPanel.add(saturdayFinalOutLabel);
        mainPanel.add(saturdayFinalInLabel);
        mainPanel.add(saturdayFirstOutLabel);
        mainPanel.add(saturdayFirstInLabel);

        JLabel fridayFinalOutLabel = new JLabel("out");
        JLabel fridayFinalInLabel = new JLabel("in");
        JLabel fridayFirstOutLabel = new JLabel("out");
        JLabel fridayFirstInLabel = new JLabel("in");

        fridayFinalOutLabel.setBounds(125,310,100,25);
        fridayFinalInLabel.setBounds(125,335,100,25);
        fridayFirstOutLabel.setBounds(125,360,100,25);
        fridayFirstInLabel.setBounds(125,385,100,25);

        fridayFinalOutLabel.setFont(inOutFont);
        fridayFinalInLabel.setFont(inOutFont);
        fridayFirstOutLabel.setFont(inOutFont);
        fridayFirstInLabel.setFont(inOutFont);

        mainPanel.add(fridayFinalOutLabel);
        mainPanel.add(fridayFinalInLabel);
        mainPanel.add(fridayFirstOutLabel);
        mainPanel.add(fridayFirstInLabel);

        JLabel thursdayFinalOutLabel = new JLabel("out");
        JLabel thursdayFinalInLabel = new JLabel("in");
        JLabel thursdayFirstOutLabel = new JLabel("out");
        JLabel thursdayFirstInLabel = new JLabel("in");

        thursdayFinalOutLabel.setBounds(125,410,100,25);
        thursdayFinalInLabel.setBounds(125,435,100,25);
        thursdayFirstOutLabel.setBounds(125,460,100,25);
        thursdayFirstInLabel.setBounds(125,485,100,25);

        thursdayFinalOutLabel.setFont(inOutFont);
        thursdayFinalInLabel.setFont(inOutFont);
        thursdayFirstOutLabel.setFont(inOutFont);
        thursdayFirstInLabel.setFont(inOutFont);

        mainPanel.add(thursdayFinalOutLabel);
        mainPanel.add(thursdayFinalInLabel);
        mainPanel.add(thursdayFirstOutLabel);
        mainPanel.add(thursdayFirstInLabel);

        JLabel wednesdayFinalOutLabel = new JLabel("out");
        JLabel wednesdayFinalInLabel = new JLabel("in");
        JLabel wednesdayFirstOutLabel = new JLabel("out");
        JLabel wednesdayFirstInLabel = new JLabel("in");

        wednesdayFinalOutLabel.setBounds(125,510,100,25);
        wednesdayFinalInLabel.setBounds(125,535,100,25);
        wednesdayFirstOutLabel.setBounds(125,560,100,25);
        wednesdayFirstInLabel.setBounds(125,585,100,25);

        wednesdayFinalOutLabel.setFont(inOutFont);
        wednesdayFinalInLabel.setFont(inOutFont);
        wednesdayFirstOutLabel.setFont(inOutFont);
        wednesdayFirstInLabel.setFont(inOutFont);

        mainPanel.add(wednesdayFinalOutLabel);
        mainPanel.add(wednesdayFinalInLabel);
        mainPanel.add(wednesdayFirstOutLabel);
        mainPanel.add(wednesdayFirstInLabel);

        JLabel tuesdayFinalOutLabel = new JLabel("out");
        JLabel tuesdayFinalInLabel = new JLabel("in");
        JLabel tuesdayFirstOutLabel = new JLabel("out");
        JLabel tuesdayFirstInLabel = new JLabel("in");

        tuesdayFinalOutLabel.setBounds(125,610,100,25);
        tuesdayFinalInLabel.setBounds(125,635,100,25);
        tuesdayFirstOutLabel.setBounds(125,660,100,25);
        tuesdayFirstInLabel.setBounds(125,685,100,25);

        tuesdayFinalOutLabel.setFont(inOutFont);
        tuesdayFinalInLabel.setFont(inOutFont);
        tuesdayFirstOutLabel.setFont(inOutFont);
        tuesdayFirstInLabel.setFont(inOutFont);

        mainPanel.add(tuesdayFinalOutLabel);
        mainPanel.add(tuesdayFinalInLabel);
        mainPanel.add(tuesdayFirstOutLabel);
        mainPanel.add(tuesdayFirstInLabel);

        JLabel mondayFinalOutLabel = new JLabel("out");
        JLabel mondayFinalInLabel = new JLabel("in");
        JLabel mondayFirstOutLabel = new JLabel("out");
        JLabel mondayFirstInLabel = new JLabel("in");

        mondayFinalOutLabel.setBounds(125,710,100,25);
        mondayFinalInLabel.setBounds(125,735,100,25);
        mondayFirstOutLabel.setBounds(125,760,100,25);
        mondayFirstInLabel.setBounds(125,785,100,25);

        mondayFinalOutLabel.setFont(inOutFont);
        mondayFinalInLabel.setFont(inOutFont);
        mondayFirstOutLabel.setFont(inOutFont);
        mondayFirstInLabel.setFont(inOutFont);

        mainPanel.add(mondayFinalOutLabel);
        mainPanel.add(mondayFinalInLabel);
        mainPanel.add(mondayFirstOutLabel);
        mainPanel.add(mondayFirstInLabel);

        String[] AMPMChoices = {"AM", "PM"};


        sundayFinalOutHourField = new JTextField();
        JLabel sundayFinalOutColonLabel = new JLabel(":");
        sundayFinalOutMinuteField = new JTextField();
        sundayFinalOutAmPMDropdown = new JComboBox<String>(AMPMChoices);

        sundayFinalOutHourField.setBounds(175, 110, 30, 25);
        sundayFinalOutColonLabel.setBounds(203, 110, 25, 25);
        sundayFinalOutMinuteField.setBounds(205, 110, 30, 25);
        sundayFinalOutAmPMDropdown.setBounds(235, 110, 70, 25);

        mainPanel.add(sundayFinalOutHourField);
        mainPanel.add(sundayFinalOutColonLabel);
        mainPanel.add(sundayFinalOutMinuteField);
        mainPanel.add(sundayFinalOutAmPMDropdown);

        sundayFinalInHourField = new JTextField();
        JLabel sundayFinalInColonLabel = new JLabel(":");
        sundayFinalInMinuteField = new JTextField();
        sundayFinalInAmPMDropdown = new JComboBox<String>(AMPMChoices);

        sundayFinalInHourField.setBounds(175, 135, 30, 25);
        sundayFinalInColonLabel.setBounds(203, 135, 25, 25);
        sundayFinalInMinuteField.setBounds(205, 135, 30, 25);
        sundayFinalInAmPMDropdown.setBounds(235, 135, 70, 25);

        mainPanel.add(sundayFinalInHourField);
        mainPanel.add(sundayFinalInColonLabel);
        mainPanel.add(sundayFinalInMinuteField);
        mainPanel.add(sundayFinalInAmPMDropdown);



        sundayFirstOutHourField = new JTextField();
        JLabel sundayFirstOutColonLabel = new JLabel(":");
        sundayFirstOutMinuteField = new JTextField();
        sundayFirstOutAmPMDropdown = new JComboBox<String>(AMPMChoices);

        sundayFirstOutHourField.setBounds(175, 160, 30, 25);
        sundayFirstOutColonLabel.setBounds(203, 160, 25, 25);
        sundayFirstOutMinuteField.setBounds(205, 160, 30, 25);
        sundayFirstOutAmPMDropdown.setBounds(235, 160, 70, 25);

        mainPanel.add(sundayFirstOutHourField);
        mainPanel.add(sundayFirstOutColonLabel);
        mainPanel.add(sundayFirstOutMinuteField);
        mainPanel.add(sundayFirstOutAmPMDropdown);

        sundayFirstInHourField = new JTextField();
        JLabel sundayFirstInColonLabel = new JLabel(":");
        sundayFirstInMinuteField = new JTextField();
        sundayFirstInAmPMDropdown = new JComboBox<String>(AMPMChoices);

        sundayFirstInHourField.setBounds(175, 185, 30, 25);
        sundayFirstInColonLabel.setBounds(203, 185, 25, 25);
        sundayFirstInMinuteField.setBounds(205, 185, 30, 25);
        sundayFirstInAmPMDropdown.setBounds(235, 185, 70, 25);

        mainPanel.add(sundayFirstInHourField);
        mainPanel.add(sundayFirstInColonLabel);
        mainPanel.add(sundayFirstInMinuteField);
        mainPanel.add(sundayFirstInAmPMDropdown);




        saturdayFinalOutHourField = new JTextField();
        JLabel saturdayFinalOutColonLabel = new JLabel(":");
        saturdayFinalOutMinuteField = new JTextField();
        saturdayFinalOutAmPMDropdown = new JComboBox<String>(AMPMChoices);

        saturdayFinalOutHourField.setBounds(175, 210, 30, 25);
        saturdayFinalOutColonLabel.setBounds(203, 210, 25, 25);
        saturdayFinalOutMinuteField.setBounds(205, 210, 30, 25);
        saturdayFinalOutAmPMDropdown.setBounds(235, 210, 70, 25);

        mainPanel.add(saturdayFinalOutHourField);
        mainPanel.add(saturdayFinalOutColonLabel);
        mainPanel.add(saturdayFinalOutMinuteField);
        mainPanel.add(saturdayFinalOutAmPMDropdown);

        saturdayFinalInHourField = new JTextField();
        JLabel saturdayFinalInColonLabel = new JLabel(":");
        saturdayFinalInMinuteField = new JTextField();
        saturdayFinalInAmPMDropdown = new JComboBox<String>(AMPMChoices);

        saturdayFinalInHourField.setBounds(175, 235, 30, 25);
        saturdayFinalInColonLabel.setBounds(203, 235, 25, 25);
        saturdayFinalInMinuteField.setBounds(205, 235, 30, 25);
        saturdayFinalInAmPMDropdown.setBounds(235, 235, 70, 25);

        mainPanel.add(saturdayFinalInHourField);
        mainPanel.add(saturdayFinalInColonLabel);
        mainPanel.add(saturdayFinalInMinuteField);
        mainPanel.add(saturdayFinalInAmPMDropdown);



        saturdayFirstOutHourField = new JTextField();
        JLabel saturdayFirstOutColonLabel = new JLabel(":");
        saturdayFirstOutMinuteField = new JTextField();
        saturdayFirstOutAmPMDropdown = new JComboBox<String>(AMPMChoices);

        saturdayFirstOutHourField.setBounds(175, 260, 30, 25);
        saturdayFirstOutColonLabel.setBounds(203, 260, 25, 25);
        saturdayFirstOutMinuteField.setBounds(205, 260, 30, 25);
        saturdayFirstOutAmPMDropdown.setBounds(235, 260, 70, 25);

        mainPanel.add(saturdayFirstOutHourField);
        mainPanel.add(saturdayFirstOutColonLabel);
        mainPanel.add(saturdayFirstOutMinuteField);
        mainPanel.add(saturdayFirstOutAmPMDropdown);

        saturdayFirstInHourField = new JTextField();
        JLabel saturdayFirstInColonLabel = new JLabel(":");
        saturdayFirstInMinuteField = new JTextField();
        saturdayFirstInAmPMDropdown = new JComboBox<String>(AMPMChoices);

        saturdayFirstInHourField.setBounds(175, 285, 30, 25);
        saturdayFirstInColonLabel.setBounds(203, 285, 25, 25);
        saturdayFirstInMinuteField.setBounds(205, 285, 30, 25);
        saturdayFirstInAmPMDropdown.setBounds(235, 285, 70, 25);

        mainPanel.add(saturdayFirstInHourField);
        mainPanel.add(saturdayFirstInColonLabel);
        mainPanel.add(saturdayFirstInMinuteField);
        mainPanel.add(saturdayFirstInAmPMDropdown);




        fridayFinalOutHourField = new JTextField();
        JLabel fridayFinalOutColonLabel = new JLabel(":");
        fridayFinalOutMinuteField = new JTextField();
        fridayFinalOutAmPMDropdown = new JComboBox<String>(AMPMChoices);

        fridayFinalOutHourField.setBounds(175, 310, 30, 25);
        fridayFinalOutColonLabel.setBounds(203, 310, 25, 25);
        fridayFinalOutMinuteField.setBounds(205, 310, 30, 25);
        fridayFinalOutAmPMDropdown.setBounds(235, 310, 70, 25);

        mainPanel.add(fridayFinalOutHourField);
        mainPanel.add(fridayFinalOutColonLabel);
        mainPanel.add(fridayFinalOutMinuteField);
        mainPanel.add(fridayFinalOutAmPMDropdown);

        fridayFinalInHourField = new JTextField();
        JLabel fridayFinalInColonLabel = new JLabel(":");
        fridayFinalInMinuteField = new JTextField();
        fridayFinalInAmPMDropdown = new JComboBox<String>(AMPMChoices);

        fridayFinalInHourField.setBounds(175, 335, 30, 25);
        fridayFinalInColonLabel.setBounds(203, 335, 25, 25);
        fridayFinalInMinuteField.setBounds(205, 335, 30, 25);
        fridayFinalInAmPMDropdown.setBounds(235, 335, 70, 25);

        mainPanel.add(fridayFinalInHourField);
        mainPanel.add(fridayFinalInColonLabel);
        mainPanel.add(fridayFinalInMinuteField);
        mainPanel.add(fridayFinalInAmPMDropdown);



        fridayFirstOutHourField = new JTextField();
        JLabel fridayFirstOutColonLabel = new JLabel(":");
        fridayFirstOutMinuteField = new JTextField();
        fridayFirstOutAmPMDropdown = new JComboBox<String>(AMPMChoices);

        fridayFirstOutHourField.setBounds(175, 360, 30, 25);
        fridayFirstOutColonLabel.setBounds(203, 360, 25, 25);
        fridayFirstOutMinuteField.setBounds(205, 360, 30, 25);
        fridayFirstOutAmPMDropdown.setBounds(235, 360, 70, 25);

        mainPanel.add(fridayFirstOutHourField);
        mainPanel.add(fridayFirstOutColonLabel);
        mainPanel.add(fridayFirstOutMinuteField);
        mainPanel.add(fridayFirstOutAmPMDropdown);

        fridayFirstInHourField = new JTextField();
        JLabel fridayFirstInColonLabel = new JLabel(":");
        fridayFirstInMinuteField = new JTextField();
        fridayFirstInAmPMDropdown = new JComboBox<String>(AMPMChoices);

        fridayFirstInHourField.setBounds(175, 385, 30, 25);
        fridayFirstInColonLabel.setBounds(203, 385, 25, 25);
        fridayFirstInMinuteField.setBounds(205, 385, 30, 25);
        fridayFirstInAmPMDropdown.setBounds(235, 385, 70, 25);

        mainPanel.add(fridayFirstInHourField);
        mainPanel.add(fridayFirstInColonLabel);
        mainPanel.add(fridayFirstInMinuteField);
        mainPanel.add(fridayFirstInAmPMDropdown);




        thursdayFinalOutHourField = new JTextField();
        JLabel thursdayFinalOutColonLabel = new JLabel(":");
        thursdayFinalOutMinuteField = new JTextField();
        thursdayFinalOutAmPMDropdown = new JComboBox<String>(AMPMChoices);

        thursdayFinalOutHourField.setBounds(175, 410, 30, 25);
        thursdayFinalOutColonLabel.setBounds(203, 410, 25, 25);
        thursdayFinalOutMinuteField.setBounds(205, 410, 30, 25);
        thursdayFinalOutAmPMDropdown.setBounds(235, 410, 70, 25);

        mainPanel.add(thursdayFinalOutHourField);
        mainPanel.add(thursdayFinalOutColonLabel);
        mainPanel.add(thursdayFinalOutMinuteField);
        mainPanel.add(thursdayFinalOutAmPMDropdown);

        thursdayFinalInHourField = new JTextField();
        JLabel thursdayFinalInColonLabel = new JLabel(":");
        thursdayFinalInMinuteField = new JTextField();
        thursdayFinalInAmPMDropdown = new JComboBox<String>(AMPMChoices);

        thursdayFinalInHourField.setBounds(175, 435, 30, 25);
        thursdayFinalInColonLabel.setBounds(203, 435, 25, 25);
        thursdayFinalInMinuteField.setBounds(205, 435, 30, 25);
        thursdayFinalInAmPMDropdown.setBounds(235, 435, 70, 25);

        mainPanel.add(thursdayFinalInHourField);
        mainPanel.add(thursdayFinalInColonLabel);
        mainPanel.add(thursdayFinalInMinuteField);
        mainPanel.add(thursdayFinalInAmPMDropdown);



        thursdayFirstOutHourField = new JTextField();
        JLabel thursdayFirstOutColonLabel = new JLabel(":");
        thursdayFirstOutMinuteField = new JTextField();
        thursdayFirstOutAmPMDropdown = new JComboBox<String>(AMPMChoices);

        thursdayFirstOutHourField.setBounds(175, 460, 30, 25);
        thursdayFirstOutColonLabel.setBounds(203, 460, 25, 25);
        thursdayFirstOutMinuteField.setBounds(205, 460, 30, 25);
        thursdayFirstOutAmPMDropdown.setBounds(235, 460, 70, 25);

        mainPanel.add(thursdayFirstOutHourField);
        mainPanel.add(thursdayFirstOutColonLabel);
        mainPanel.add(thursdayFirstOutMinuteField);
        mainPanel.add(thursdayFirstOutAmPMDropdown);

        thursdayFirstInHourField = new JTextField();
        JLabel thursdayFirstInColonLabel = new JLabel(":");
        thursdayFirstInMinuteField = new JTextField();
        thursdayFirstInAmPMDropdown = new JComboBox<String>(AMPMChoices);

        thursdayFirstInHourField.setBounds(175, 485, 30, 25);
        thursdayFirstInColonLabel.setBounds(203, 485, 25, 25);
        thursdayFirstInMinuteField.setBounds(205, 485, 30, 25);
        thursdayFirstInAmPMDropdown.setBounds(235, 485, 70, 25);

        mainPanel.add(thursdayFirstInHourField);
        mainPanel.add(thursdayFirstInColonLabel);
        mainPanel.add(thursdayFirstInMinuteField);
        mainPanel.add(thursdayFirstInAmPMDropdown);





        wednesdayFinalOutHourField = new JTextField();
        JLabel wednesdayFinalOutColonLabel = new JLabel(":");
        wednesdayFinalOutMinuteField = new JTextField();
        wednesdayFinalOutAmPMDropdown = new JComboBox<String>(AMPMChoices);

        wednesdayFinalOutHourField.setBounds(175, 510, 30, 25);
        wednesdayFinalOutColonLabel.setBounds(203, 510, 25, 25);
        wednesdayFinalOutMinuteField.setBounds(205, 510, 30, 25);
        wednesdayFinalOutAmPMDropdown.setBounds(235, 510, 70, 25);

        mainPanel.add(wednesdayFinalOutHourField);
        mainPanel.add(wednesdayFinalOutColonLabel);
        mainPanel.add(wednesdayFinalOutMinuteField);
        mainPanel.add(wednesdayFinalOutAmPMDropdown);

        wednesdayFinalInHourField = new JTextField();
        JLabel wednesdayFinalInColonLabel = new JLabel(":");
        wednesdayFinalInMinuteField = new JTextField();
        wednesdayFinalInAmPMDropdown = new JComboBox<String>(AMPMChoices);

        wednesdayFinalInHourField.setBounds(175, 535, 30, 25);
        wednesdayFinalInColonLabel.setBounds(203, 535, 25, 25);
        wednesdayFinalInMinuteField.setBounds(205, 535, 30, 25);
        wednesdayFinalInAmPMDropdown.setBounds(235, 535, 70, 25);

        mainPanel.add(wednesdayFinalInHourField);
        mainPanel.add(wednesdayFinalInColonLabel);
        mainPanel.add(wednesdayFinalInMinuteField);
        mainPanel.add(wednesdayFinalInAmPMDropdown);



        wednesdayFirstOutHourField = new JTextField();
        JLabel wednesdayFirstOutColonLabel = new JLabel(":");
        wednesdayFirstOutMinuteField = new JTextField();
        wednesdayFirstOutAmPMDropdown = new JComboBox<String>(AMPMChoices);

        wednesdayFirstOutHourField.setBounds(175, 560, 30, 25);
        wednesdayFirstOutColonLabel.setBounds(203, 560, 25, 25);
        wednesdayFirstOutMinuteField.setBounds(205, 560, 30, 25);
        wednesdayFirstOutAmPMDropdown.setBounds(235, 560, 70, 25);

        mainPanel.add(wednesdayFirstOutHourField);
        mainPanel.add(wednesdayFirstOutColonLabel);
        mainPanel.add(wednesdayFirstOutMinuteField);
        mainPanel.add(wednesdayFirstOutAmPMDropdown);

        wednesdayFirstInHourField = new JTextField();
        JLabel wednesdayFirstInColonLabel = new JLabel(":");
        wednesdayFirstInMinuteField = new JTextField();
        wednesdayFirstInAmPMDropdown = new JComboBox<String>(AMPMChoices);

        wednesdayFirstInHourField.setBounds(175, 585, 30, 25);
        wednesdayFirstInColonLabel.setBounds(203, 585, 25, 25);
        wednesdayFirstInMinuteField.setBounds(205, 585, 30, 25);
        wednesdayFirstInAmPMDropdown.setBounds(235, 585, 70, 25);

        mainPanel.add(wednesdayFirstInHourField);
        mainPanel.add(wednesdayFirstInColonLabel);
        mainPanel.add(wednesdayFirstInMinuteField);
        mainPanel.add(wednesdayFirstInAmPMDropdown);





        tuesdayFinalOutHourField = new JTextField();
        JLabel tuesdayFinalOutColonLabel = new JLabel(":");
        tuesdayFinalOutMinuteField = new JTextField();
        tuesdayFinalOutAmPMDropdown = new JComboBox<String>(AMPMChoices);

        tuesdayFinalOutHourField.setBounds(175, 610, 30, 25);
        tuesdayFinalOutColonLabel.setBounds(203, 610, 25, 25);
        tuesdayFinalOutMinuteField.setBounds(205, 610, 30, 25);
        tuesdayFinalOutAmPMDropdown.setBounds(235, 610, 70, 25);

        mainPanel.add(tuesdayFinalOutHourField);
        mainPanel.add(tuesdayFinalOutColonLabel);
        mainPanel.add(tuesdayFinalOutMinuteField);
        mainPanel.add(tuesdayFinalOutAmPMDropdown);

        tuesdayFinalInHourField = new JTextField();
        JLabel tuesdayFinalInColonLabel = new JLabel(":");
        tuesdayFinalInMinuteField = new JTextField();
        tuesdayFinalInAmPMDropdown = new JComboBox<String>(AMPMChoices);

        tuesdayFinalInHourField.setBounds(175, 635, 30, 25);
        tuesdayFinalInColonLabel.setBounds(203, 635, 25, 25);
        tuesdayFinalInMinuteField.setBounds(205, 635, 30, 25);
        tuesdayFinalInAmPMDropdown.setBounds(235, 635, 70, 25);

        mainPanel.add(tuesdayFinalInHourField);
        mainPanel.add(tuesdayFinalInColonLabel);
        mainPanel.add(tuesdayFinalInMinuteField);
        mainPanel.add(tuesdayFinalInAmPMDropdown);



        tuesdayFirstOutHourField = new JTextField();
        JLabel tuesdayFirstOutColonLabel = new JLabel(":");
        tuesdayFirstOutMinuteField = new JTextField();
        tuesdayFirstOutAmPMDropdown = new JComboBox<String>(AMPMChoices);

        tuesdayFirstOutHourField.setBounds(175, 660, 30, 25);
        tuesdayFirstOutColonLabel.setBounds(203, 660, 25, 25);
        tuesdayFirstOutMinuteField.setBounds(205, 660, 30, 25);
        tuesdayFirstOutAmPMDropdown.setBounds(235, 660, 70, 25);

        mainPanel.add(tuesdayFirstOutHourField);
        mainPanel.add(tuesdayFirstOutColonLabel);
        mainPanel.add(tuesdayFirstOutMinuteField);
        mainPanel.add(tuesdayFirstOutAmPMDropdown);

        tuesdayFirstInHourField = new JTextField();
        JLabel tuesdayFirstInColonLabel = new JLabel(":");
        tuesdayFirstInMinuteField = new JTextField();
        tuesdayFirstInAmPMDropdown = new JComboBox<String>(AMPMChoices);

        tuesdayFirstInHourField.setBounds(175, 685, 30, 25);
        tuesdayFirstInColonLabel.setBounds(203, 685, 25, 25);
        tuesdayFirstInMinuteField.setBounds(205, 685, 30, 25);
        tuesdayFirstInAmPMDropdown.setBounds(235, 685, 70, 25);

        mainPanel.add(tuesdayFirstInHourField);
        mainPanel.add(tuesdayFirstInColonLabel);
        mainPanel.add(tuesdayFirstInMinuteField);
        mainPanel.add(tuesdayFirstInAmPMDropdown);





        mondayFinalOutHourField = new JTextField();
        JLabel mondayFinalOutColonLabel = new JLabel(":");
        mondayFinalOutMinuteField = new JTextField();
        mondayFinalOutAmPMDropdown = new JComboBox<String>(AMPMChoices);

        mondayFinalOutHourField.setBounds(175, 710, 30, 25);
        mondayFinalOutColonLabel.setBounds(203, 710, 25, 25);
        mondayFinalOutMinuteField.setBounds(205, 710, 30, 25);
        mondayFinalOutAmPMDropdown.setBounds(235, 710, 70, 25);

        mainPanel.add(mondayFinalOutHourField);
        mainPanel.add(mondayFinalOutColonLabel);
        mainPanel.add(mondayFinalOutMinuteField);
        mainPanel.add(mondayFinalOutAmPMDropdown);

        mondayFinalInHourField = new JTextField();
        JLabel mondayFinalInColonLabel = new JLabel(":");
        mondayFinalInMinuteField = new JTextField();
        mondayFinalInAmPMDropdown = new JComboBox<String>(AMPMChoices);

        mondayFinalInHourField.setBounds(175, 735, 30, 25);
        mondayFinalInColonLabel.setBounds(203, 735, 25, 25);
        mondayFinalInMinuteField.setBounds(205, 735, 30, 25);
        mondayFinalInAmPMDropdown.setBounds(235, 735, 70, 25);

        mainPanel.add(mondayFinalInHourField);
        mainPanel.add(mondayFinalInColonLabel);
        mainPanel.add(mondayFinalInMinuteField);
        mainPanel.add(mondayFinalInAmPMDropdown);



        mondayFirstOutHourField = new JTextField();
        JLabel mondayFirstOutColonLabel = new JLabel(":");
        mondayFirstOutMinuteField = new JTextField();
        mondayFirstOutAmPMDropdown = new JComboBox<String>(AMPMChoices);

        mondayFirstOutHourField.setBounds(175, 760, 30, 25);
        mondayFirstOutColonLabel.setBounds(203, 760, 25, 25);
        mondayFirstOutMinuteField.setBounds(205, 760, 30, 25);
        mondayFirstOutAmPMDropdown.setBounds(235, 760, 70, 25);

        mainPanel.add(mondayFirstOutHourField);
        mainPanel.add(mondayFirstOutColonLabel);
        mainPanel.add(mondayFirstOutMinuteField);
        mainPanel.add(mondayFirstOutAmPMDropdown);

        mondayFirstInHourField = new JTextField();
        JLabel mondayFirstInColonLabel = new JLabel(":");
        mondayFirstInMinuteField = new JTextField();
        mondayFirstInAmPMDropdown = new JComboBox<String>(AMPMChoices);

        mondayFirstInHourField.setBounds(175, 785, 30, 25);
        mondayFirstInColonLabel.setBounds(203, 785, 25, 25);
        mondayFirstInMinuteField.setBounds(205, 785, 30, 25);
        mondayFirstInAmPMDropdown.setBounds(235, 785, 70, 25);

        mainPanel.add(mondayFirstInHourField);
        mainPanel.add(mondayFirstInColonLabel);
        mainPanel.add(mondayFirstInMinuteField);
        mainPanel.add(mondayFirstInAmPMDropdown);


        JLabel breakLine = new JLabel("________________________________");
        breakLine.setBounds(10,95,320,15);
        mainPanel.add(breakLine);

        JLabel breakLine1 = new JLabel("________________________________");
        breakLine1.setBounds(10,195,320,15);
        mainPanel.add(breakLine1);

        JLabel breakLine2 = new JLabel("________________________________");
        breakLine2.setBounds(10,295,320,15);
        mainPanel.add(breakLine2);

        JLabel breakLine3 = new JLabel("________________________________");
        breakLine3.setBounds(10,395,320,15);
        mainPanel.add(breakLine3);

        JLabel breakLine4 = new JLabel("________________________________");
        breakLine4.setBounds(10,495,320,15);
        mainPanel.add(breakLine4);

        JLabel breakLine5 = new JLabel("________________________________");
        breakLine5.setBounds(10,595,320,15);
        mainPanel.add(breakLine5);

        JLabel breakLine6 = new JLabel("________________________________");
        breakLine6.setBounds(10,695,320,15);
        mainPanel.add(breakLine6);

        JLabel breakLine7 = new JLabel("________________________________");
        breakLine7.setBounds(10,795,320,15);
        mainPanel.add(breakLine7);


        Font breakLineFont = new Font("Courier", Font.BOLD, 15);
        breakLine.setFont(breakLineFont);
        breakLine1.setFont(breakLineFont);
        breakLine2.setFont(breakLineFont);
        breakLine3.setFont(breakLineFont);
        breakLine4.setFont(breakLineFont);
        breakLine5.setFont(breakLineFont);
        breakLine6.setFont(breakLineFont);
        breakLine7.setFont(breakLineFont);



        submitButton = new JButton("Submit");
        submitButton.setBounds(200,810,100,30);
        submitButton.setFont(new Font("Courier", Font.BOLD, 20));
        submitButton.addActionListener(this);
        mainPanel.add(submitButton);


        hoursLabel = new JLabel("Minutes: ");
        hoursLabel.setBounds(10, 10, 300, 60);
        hoursLabel.setFont(new Font("Courier", Font.BOLD, 40));
        mainPanel.add(hoursLabel);

        
        scrollPane = new JScrollPane(mainPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        
        

        window.add(scrollPane);
        window.setVisible(true);


    }

    public JButton submitButton;


    public JTextField sundayFinalOutHourField;
    public JTextField sundayFinalOutMinuteField;
    public JComboBox<String> sundayFinalOutAmPMDropdown;
    public JTextField sundayFinalInHourField;
    public JTextField sundayFinalInMinuteField;
    public JComboBox<String> sundayFinalInAmPMDropdown;
    public JTextField sundayFirstOutHourField;
    public JTextField sundayFirstOutMinuteField;
    public JComboBox<String> sundayFirstOutAmPMDropdown;
    public JTextField sundayFirstInHourField;
    public JTextField sundayFirstInMinuteField;
    public JComboBox<String> sundayFirstInAmPMDropdown;

    public JTextField saturdayFinalOutHourField;
    public JTextField saturdayFinalOutMinuteField;
    public JComboBox<String> saturdayFinalOutAmPMDropdown;
    public JTextField saturdayFinalInHourField;
    public JTextField saturdayFinalInMinuteField;
    public JComboBox<String> saturdayFinalInAmPMDropdown;
    public JTextField saturdayFirstOutHourField;
    public JTextField saturdayFirstOutMinuteField;
    public JComboBox<String> saturdayFirstOutAmPMDropdown;
    public JTextField saturdayFirstInHourField;
    public JTextField saturdayFirstInMinuteField;
    public JComboBox<String> saturdayFirstInAmPMDropdown;

    public JTextField fridayFinalOutHourField;
    public JTextField fridayFinalOutMinuteField;
    public JComboBox<String> fridayFinalOutAmPMDropdown;
    public JTextField fridayFinalInHourField;
    public JTextField fridayFinalInMinuteField;
    public JComboBox<String> fridayFinalInAmPMDropdown;
    public JTextField fridayFirstOutHourField;
    public JTextField fridayFirstOutMinuteField;
    public JComboBox<String> fridayFirstOutAmPMDropdown;
    public JTextField fridayFirstInHourField;
    public JTextField fridayFirstInMinuteField;
    public JComboBox<String> fridayFirstInAmPMDropdown;

    public JTextField thursdayFinalOutHourField;
    public JTextField thursdayFinalOutMinuteField;
    public JComboBox<String> thursdayFinalOutAmPMDropdown;
    public JTextField thursdayFinalInHourField;
    public JTextField thursdayFinalInMinuteField;
    public JComboBox<String> thursdayFinalInAmPMDropdown;
    public JTextField thursdayFirstOutHourField;
    public JTextField thursdayFirstOutMinuteField;
    public JComboBox<String> thursdayFirstOutAmPMDropdown;
    public JTextField thursdayFirstInHourField;
    public JTextField thursdayFirstInMinuteField;
    public JComboBox<String> thursdayFirstInAmPMDropdown;

    public JTextField wednesdayFinalOutHourField;
    public JTextField wednesdayFinalOutMinuteField;
    public JComboBox<String> wednesdayFinalOutAmPMDropdown;
    public JTextField wednesdayFinalInHourField;
    public JTextField wednesdayFinalInMinuteField;
    public JComboBox<String> wednesdayFinalInAmPMDropdown;
    public JTextField wednesdayFirstOutHourField;
    public JTextField wednesdayFirstOutMinuteField;
    public JComboBox<String> wednesdayFirstOutAmPMDropdown;
    public JTextField wednesdayFirstInHourField;
    public JTextField wednesdayFirstInMinuteField;
    public JComboBox<String> wednesdayFirstInAmPMDropdown;

    public JTextField tuesdayFinalOutHourField;
    public JTextField tuesdayFinalOutMinuteField;
    public JComboBox<String> tuesdayFinalOutAmPMDropdown;
    public JTextField tuesdayFinalInHourField;
    public JTextField tuesdayFinalInMinuteField;
    public JComboBox<String> tuesdayFinalInAmPMDropdown;
    public JTextField tuesdayFirstOutHourField;
    public JTextField tuesdayFirstOutMinuteField;
    public JComboBox<String> tuesdayFirstOutAmPMDropdown;
    public JTextField tuesdayFirstInHourField;
    public JTextField tuesdayFirstInMinuteField;
    public JComboBox<String> tuesdayFirstInAmPMDropdown;

    public JTextField mondayFinalOutHourField;
    public JTextField mondayFinalOutMinuteField;
    public JComboBox<String> mondayFinalOutAmPMDropdown;
    public JTextField mondayFinalInHourField;
    public JTextField mondayFinalInMinuteField;
    public JComboBox<String> mondayFinalInAmPMDropdown;
    public JTextField mondayFirstOutHourField;
    public JTextField mondayFirstOutMinuteField;
    public JComboBox<String> mondayFirstOutAmPMDropdown;
    public JTextField mondayFirstInHourField;
    public JTextField mondayFirstInMinuteField;
    public JComboBox<String> mondayFirstInAmPMDropdown;

    public JLabel hoursLabel;
    public String hours;



    

    public void refresh(){

        window.setVisible(false);
        window.setVisible(true);
    }

    public int getMinutesFrom(JTextField outHourField, JTextField outMinuteField, String outModifier, JTextField inHourField, JTextField inMinuteField, String inModifier){

        return getMinutesFrom(outHourField, outMinuteField, outModifier) - getMinutesFrom(inHourField, inMinuteField, inModifier);

    }

    public int getMinutesFrom(JTextField outHourField, JTextField outMinuteField, String outModifier){

        int totalMinutes = 0;

        if(outHourField.getText() != null && outMinuteField.getText() != null){

            
            if(outHourField.getText() != null && outHourField.getText().length() > 0){

                
                if(Character.isDigit(outHourField.getText().charAt(0)) || Character.isDigit(outHourField.getText().charAt(1))){

                    
                    if(outModifier.equals("PM") && Integer.parseInt(outHourField.getText().substring(0, 2)) < 12){
                        
                        totalMinutes += (Integer.parseInt(outHourField.getText().substring(0, 2)) + 12) * 60;
                        //System.out.println("Hours: " + Integer.parseInt(outHourField.getText().substring(0, 2)));
                        
                        
                    }else if(outModifier.equals("AM") && Integer.parseInt(outHourField.getText().substring(0, 2)) == 12){
                        
                        totalMinutes += (Integer.parseInt(outHourField.getText().substring(0, 2)) - 12) * 60;
                        //System.out.println("Hours: " + Integer.parseInt(outHourField.getText().substring(0, 2)));

                        
                    }else{
                        
                        totalMinutes += Integer.parseInt(outHourField.getText().substring(0, 2)) * 60;
                        //System.out.println("Hours: " + Integer.parseInt(outHourField.getText().substring(0, 2)));

                    }

                }

            }

            if(outMinuteField.getText() != null && outMinuteField.getText().length() > 0){

                if(Character.isDigit(outMinuteField.getText().charAt(0)) || Character.isDigit(outMinuteField.getText().charAt(1))){

                    totalMinutes += Integer.parseInt(outMinuteField.getText().substring(0, 2));

                    //System.out.println("Minutes: " + Integer.parseInt(outMinuteField.getText().substring(0, 2)));

                }

            }


        }

        return totalMinutes;

    }



    @Override
    public void actionPerformed(ActionEvent event) {
       
        if(event.getSource() == submitButton){

            int totalMinutes = 0;
            
            totalMinutes += getMinutesFrom(sundayFinalOutHourField, sundayFinalOutMinuteField, sundayFinalOutAmPMDropdown.getSelectedItem().toString(), sundayFinalInHourField, sundayFinalInMinuteField, sundayFinalInAmPMDropdown.getSelectedItem().toString());
            totalMinutes += getMinutesFrom(sundayFirstOutHourField, sundayFirstOutMinuteField, sundayFirstOutAmPMDropdown.getSelectedItem().toString(), sundayFirstInHourField, sundayFirstInMinuteField, sundayFirstInAmPMDropdown.getSelectedItem().toString());

            totalMinutes += getMinutesFrom(saturdayFinalOutHourField, saturdayFinalOutMinuteField, saturdayFinalOutAmPMDropdown.getSelectedItem().toString(), saturdayFinalInHourField, saturdayFinalInMinuteField, saturdayFinalInAmPMDropdown.getSelectedItem().toString());
            totalMinutes += getMinutesFrom(saturdayFirstOutHourField, saturdayFirstOutMinuteField, saturdayFirstOutAmPMDropdown.getSelectedItem().toString(), saturdayFirstInHourField, saturdayFirstInMinuteField, saturdayFirstInAmPMDropdown.getSelectedItem().toString());

            totalMinutes += getMinutesFrom(fridayFinalOutHourField, fridayFinalOutMinuteField, fridayFinalOutAmPMDropdown.getSelectedItem().toString(), fridayFinalInHourField, fridayFinalInMinuteField, fridayFinalInAmPMDropdown.getSelectedItem().toString());
            totalMinutes += getMinutesFrom(fridayFirstOutHourField, fridayFirstOutMinuteField, fridayFirstOutAmPMDropdown.getSelectedItem().toString(), fridayFirstInHourField, fridayFirstInMinuteField, fridayFirstInAmPMDropdown.getSelectedItem().toString());

            totalMinutes += getMinutesFrom(thursdayFinalOutHourField, thursdayFinalOutMinuteField, thursdayFinalOutAmPMDropdown.getSelectedItem().toString(), thursdayFinalInHourField, thursdayFinalInMinuteField, thursdayFinalInAmPMDropdown.getSelectedItem().toString());
            totalMinutes += getMinutesFrom(thursdayFirstOutHourField, thursdayFirstOutMinuteField, thursdayFirstOutAmPMDropdown.getSelectedItem().toString(), thursdayFirstInHourField, thursdayFirstInMinuteField, thursdayFirstInAmPMDropdown.getSelectedItem().toString());

            totalMinutes += getMinutesFrom(wednesdayFinalOutHourField, wednesdayFinalOutMinuteField, wednesdayFinalOutAmPMDropdown.getSelectedItem().toString(), wednesdayFinalInHourField, wednesdayFinalInMinuteField, wednesdayFinalInAmPMDropdown.getSelectedItem().toString());
            totalMinutes += getMinutesFrom(wednesdayFirstOutHourField, wednesdayFirstOutMinuteField, wednesdayFirstOutAmPMDropdown.getSelectedItem().toString(), wednesdayFirstInHourField, wednesdayFirstInMinuteField, wednesdayFirstInAmPMDropdown.getSelectedItem().toString());

            totalMinutes += getMinutesFrom(tuesdayFinalOutHourField, tuesdayFinalOutMinuteField, tuesdayFinalOutAmPMDropdown.getSelectedItem().toString(), tuesdayFinalInHourField, tuesdayFinalInMinuteField, tuesdayFinalInAmPMDropdown.getSelectedItem().toString());
            totalMinutes += getMinutesFrom(tuesdayFirstOutHourField, tuesdayFirstOutMinuteField, tuesdayFirstOutAmPMDropdown.getSelectedItem().toString(), tuesdayFirstInHourField, tuesdayFirstInMinuteField, tuesdayFirstInAmPMDropdown.getSelectedItem().toString());

            totalMinutes += getMinutesFrom(mondayFinalOutHourField, mondayFinalOutMinuteField, mondayFinalOutAmPMDropdown.getSelectedItem().toString(), mondayFinalInHourField, mondayFinalInMinuteField, mondayFinalInAmPMDropdown.getSelectedItem().toString());
            totalMinutes += getMinutesFrom(mondayFirstOutHourField, mondayFirstOutMinuteField, mondayFirstOutAmPMDropdown.getSelectedItem().toString(), mondayFirstInHourField, mondayFirstInMinuteField, mondayFirstInAmPMDropdown.getSelectedItem().toString());


            hoursLabel.setText(String.format("Minutes: %d", totalMinutes));
            

        }

        
    }





    


    
}