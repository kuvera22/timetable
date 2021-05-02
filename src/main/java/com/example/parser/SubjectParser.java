//package com.example.parser;
//
//import com.example.model.Speciality;
//import com.example.model.Subject;
//import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
//import org.apache.poi.ss.usermodel.*;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//
//public class SubjectParser {
//    public static void parse() {
//        List<Subject> subjects = new ArrayList<>();
//        Long subjectId = 1L;
//
//        Workbook workbook = null;
//        try {
//            workbook = WorkbookFactory.create(new File("C:/projects/eptaPlaner/src/main/resources/09.03.01.xlsx"));
//        } catch (IOException | InvalidFormatException e) {
//            e.printStackTrace();
//        }
//
//        Sheet sheet = workbook.getSheetAt(1);
//
//        Iterator<Row> it = sheet.iterator();
//        //проходим по всему листу
//        it.next();
//        while (it.hasNext()) {
//            Row row = it.next();
//            Iterator<Cell> cells = row.iterator();
//            System.out.println(row.getLastCellNum());
//            Subject subject = null;
//            String name = "";
//            int numberOfHours = 0;
//            while (cells.hasNext()) {
//                Cell cell = cells.next();
//                int cellType = cell.getCellType();
//                String string = "";
//                int numeric = 0;
//                switch (cellType) {
//                    case Cell.CELL_TYPE_STRING:
//                        string = cell.getStringCellValue();
//                        break;
//                    case Cell.CELL_TYPE_NUMERIC:
//                        numeric = (int) Math.round(cell.getNumericCellValue());
//                        break;
//                }
//                switch (cell.getColumnIndex()) {
//                    case 0:
//                        name = string;
//                        break;
//                    case 1:
//                        numberOfHours = numeric;
//                        break;
//                    default:
//                        break;
//                }
//            }
//            subject = new Subject(subjectId++, name, numberOfHours);
//            subjects.add(subject);
//        }
//        System.out.println(subjects);
//    }
//
//    public static void main(String[] args) {
//        parse();
//    }
//}
