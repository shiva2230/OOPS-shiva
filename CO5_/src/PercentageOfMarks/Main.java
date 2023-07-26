package PercentageOfMarks;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends Applet implements ActionListener {
    private TextField[] subjectFields;
    private Button calculateButton;
    private double percentage;
    public void init() {
        setLayout(new FlowLayout());
        subjectFields = new TextField[5];
        for (int i = 0; i < 5; i++) {
            subjectFields[i] = new TextField(5);
            add(new Label("Subject " + (i + 1) + ":"));
            add(subjectFields[i]);
        }
        calculateButton = new Button("Calculate Percentage");
        calculateButton.addActionListener(this);
        add(calculateButton);
    }
    @Override

    public void actionPerformed(ActionEvent e) {
        int totalMarks = 0;
        for (int i = 0; i < 5; i++) {
            totalMarks += Integer.parseInt(subjectFields[i].getText());
        }
        percentage = (totalMarks / 5.0);
        repaint();
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("Percentage: " + percentage + "%", 20, 120);
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        int faceSize = 100;
        int x = centerX - faceSize / 2;
        int y = centerY - faceSize / 2;
        if (percentage > 50) {
            drawHappyFace(g, x, y, faceSize);
        } else {
            drawSadFace(g, x, y, faceSize);
        }
    }
    private void drawHappyFace(Graphics g, int x, int y, int size) {
        g.setColor(Color.YELLOW);
        g.fillOval(x, y, size, size);
        g.setColor(Color.BLACK);
        g.fillOval(x + size / 4, y + size / 2, size / 10, size / 10);
        g.fillOval(x + 3 * size / 4 - size / 10, y + size / 2, size / 10, size / 10);
        g.drawArc(x + size / 4, y + 3 * size / 5, size / 2, size / 4, 0, -180);
    }
    private void drawSadFace(Graphics g, int x, int y, int size) {
        g.setColor(Color.YELLOW);
        g.fillOval(x, y, size, size);
        g.setColor(Color.BLACK);
        g.fillOval(x + size / 4, y + size / 2, size / 10, size / 10);
        g.fillOval(x + 3 * size / 4 - size / 10, y + size / 2, size / 10, size / 10);
        g.drawArc(x + size / 4, y + 2 * size / 5, size / 2, size / 4, 0, 180);
    }
}