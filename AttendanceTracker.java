// AttendanceTracker.java
// A simple Java Swing application for attendance tracking
// Requirements: JFrame window, labeled fields, system date/time, programmatic E-Signature

import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;
import java.util.UUID;

public class AttendanceTracker {
    public static void main(String[] args) {
        // Create the main JFrame window
        JFrame frame = new JFrame("Attendance Tracker");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Use JPanel with GridLayout for neat alignment
        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));

        // Attendance Name
        JLabel nameLabel = new JLabel("Attendance Name:");
        JTextField nameField = new JTextField();

        // Course/Year
        JLabel courseLabel = new JLabel("Course/Year:");
        JTextField courseField = new JTextField();

        // Time In (auto-filled with system date/time)
        JLabel timeInLabel = new JLabel("Time In:");
        JTextField timeInField = new JTextField();
        timeInField.setEditable(false); // Prevent manual editing
        String timeIn = LocalDateTime.now().toString();
        timeInField.setText(timeIn);

        // E-Signature (auto-generated UUID)
        JLabel signatureLabel = new JLabel("E-Signature:");
        JTextField signatureField = new JTextField();
        signatureField.setEditable(false);
        String eSignature = UUID.randomUUID().toString();
        signatureField.setText(eSignature);

        // Add components to panel
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(courseLabel);
        panel.add(courseField);
        panel.add(timeInLabel);
        panel.add(timeInField);
        panel.add(signatureLabel);
        panel.add(signatureField);

        // Add panel to frame
        frame.add(panel);

        // Make window visible
        frame.setVisible(true);
    }
}