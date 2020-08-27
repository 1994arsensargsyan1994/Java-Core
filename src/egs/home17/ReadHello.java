package egs.home17;

import org.apache.poi.ss.usermodel.*;


import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ReadHello {

    private static final String PATH_FILE = "resources/readFile";
    private static final String RESULT_FILE = "/home/arsen/Desktop/exel/poi-generated-file.xlsx";
    private static String[] columns = {"lineNumber", "countWord"};
    private Map<Integer, Integer> resultMap = new HashMap<>();

    public static void main(String[] args) {
        new ReadHello().go();
    }

    private void go() {
        try {
            resultMap = read("hello");
            write(resultMap);
        } catch (IOException e) {
            System.out.println("File read or write Error ");
            return;
        }
        System.out.println("File read and write done successfully");
    }

    private Map<Integer, Integer> read(final String word) throws IOException {
        String line;
        int numberLine = 0;
        int numberHello = 0;
        String[] lineToWords;
        try (BufferedReader bRed = new BufferedReader(new FileReader(PATH_FILE))) {
            while ((line = bRed.readLine()) != null) {
                numberLine++;
                lineToWords = line.split(" hello ");
                for (String s : lineToWords) {
                    if (s.equals(word)) {
                        numberHello++;
                    }
                }
                resultMap.put(numberLine, numberHello);
                numberHello = 0;

            }

        }
        return resultMap;
    }

    private void write(Map<Integer, Integer> map) throws IOException {
        //Blank workbook
//        Workbook workbook = new XSSFWorkbook();
//
//        //Create a blank sheet
//        CreationHelper createHelper = workbook.getCreationHelper();
//        Sheet sheet = workbook.createSheet("countWord");
//
//        Font headerFont = workbook.createFont();
//        headerFont.setBold(true);
//        headerFont.setFontHeightInPoints((short) 10);
//        headerFont.setColor(IndexedColors.BLUE.getIndex());
//
//
//        // Create a CellStyle with the font
//        CellStyle headerCellStyle = workbook.createCellStyle();
//        headerCellStyle.setFont(headerFont);
//
//
//        Row headerRow = sheet.createRow(0);
//
//
//            Cell lineNum1 = headerRow.createCell(0);
//            lineNum1.setCellValue("lineNumber");
//        lineNum1.setCellStyle(headerCellStyle);
//            Cell lineNum2 = headerRow.createCell(1);
//            lineNum2.setCellValue("countWord");
//        lineNum2.setCellStyle(headerCellStyle);
//        int rowNum = 1;
//        Set<Integer> set = map.keySet();
//        for (Integer integer : set) {
//            Row row = sheet.createRow(rowNum++);
//            row.createCell(0)
//                    .setCellValue(integer);
//
//            row.createCell(1)
//                    .setCellValue(map.get(integer));
//        }
//
//            sheet.autoSizeColumn(1);
//        FileOutputStream fileOut = new FileOutputStream(RESULT_FILE);
//           workbook.write(fileOut);
//           fileOut.close();
//           workbook.close();

//        try (BufferedWriter bWri = new BufferedWriter(new FileWriter(RESULT_FILE))) {
//            bWri.write(map.toString());
//        }
        }
    }

