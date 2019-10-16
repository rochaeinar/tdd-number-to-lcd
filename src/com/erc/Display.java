package com.erc;

import java.util.ArrayList;

public class Display {
    private ArrayList<LcdNumber> lcdNumbers;

    public Display() {
        this.lcdNumbers = new ArrayList<>();
    }

    public void addLcdNumber(LcdNumber lcdNumber) {
        this.lcdNumbers.add(lcdNumber);
    }

    public ArrayList<LcdNumber> getLcdNumbers() {
        return lcdNumbers;
    }

    public String getStringRepresentation() {

        StringBuffer[] lines = getBuffersLines();

        for (LcdNumber lcdNumber : lcdNumbers) {
            int currentLine = 0;
            for (String[] line : lcdNumber.getLcdRepresentation()) {
                for (String led : line) {
                    lines[currentLine].append(led);
                }
                lines[currentLine].append("   ");
                currentLine++;
            }
        }

        return joinBufferLines(lines);
    }

    private String joinBufferLines(StringBuffer[] lines) {
        StringBuilder stringRepresentation = new StringBuilder();
        for (StringBuffer line : lines) {
            stringRepresentation.append(line.toString());
            stringRepresentation.append("\n");
        }
        return stringRepresentation.toString();
    }

    private StringBuffer[] getBuffersLines() {

        int totalHeight = 0;
        if (this.lcdNumbers.size() > 0) {
            totalHeight = this.lcdNumbers.get(0).getTotalHeight();
        }
        StringBuffer[] lines = new StringBuffer[totalHeight];

        for (int i = 0; i < totalHeight; i++) {
            lines[i] = new StringBuffer();
        }
        return lines;
    }
}
