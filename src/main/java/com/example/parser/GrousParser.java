//package com.example.parser;
//
//import com.example.model.Group;
//import com.example.model.Speciality;
//import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
//import org.apache.poi.ss.usermodel.*;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//
//public class GrousParser {
//    public static void parse() {
//        List<Group> groups = new ArrayList<>();
//        List<Speciality> specialities = new ArrayList<>();
//        Long groupId = 0L;
//        Long specialityId = 0L;
//        Workbook workbook = null;
//        try {
//            workbook = WorkbookFactory.create(new File("C:/projects/eptaPlaner/src/main/resources/Группы.xlsx"));
//        } catch (IOException | InvalidFormatException e) {
//            e.printStackTrace();
//        }
//
//        Sheet sheet = workbook.getSheetAt(0);
//
//        Iterator<Row> it = sheet.iterator();
//        //проходим по всему листу
//        it.next();
//        while (it.hasNext()) {
//            Row row = it.next();
//            Iterator<Cell> cells = row.iterator();
//            System.out.println(row.getLastCellNum());
//            Speciality speciality = null;
//            String specialityCode = "";
//            String specialityName = "";
//            String group = "";
//            Long studAmount = 0L;
//            while (cells.hasNext()) {
//                Cell cell = cells.next();
//                int cellType = cell.getCellType();
//                String string = "";
//                Long numeric = 0L;
//                switch (cellType) {
//                    case Cell.CELL_TYPE_STRING:
//                        string = cell.getStringCellValue();
//                        break;
//                    case Cell.CELL_TYPE_NUMERIC:
//                        numeric = Math.round(cell.getNumericCellValue());
//                        break;
//                }
//                switch (cell.getColumnIndex()) {
//                    case 0:
//                        specialityCode = string;
//                        break;
//                    case 1:
//                        specialityName = string;
//                        break;
//                    case 2:
//                        group = string;
//                    case 3:
//                        studAmount = numeric;
//                        break;
//                    default:
//                        break;
//                }
//            }
//            speciality = new Speciality(specialityId++, specialityCode, specialityName);
//            specialities.add(speciality);
//            Group group1 = new Group(group, speciality, Math.toIntExact(studAmount));
//            groups.add(group1);
//        }
//        System.out.println(specialities);
//        System.out.println(groups);
//    }
//
//    public static void main(String[] args) {
//        parse();
//    }
//}
