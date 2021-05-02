//package com.example.parser;
//
//import com.example.model.Group;
//import com.example.model.Speciality;
//import com.example.model.Subject;
//import com.example.model.Teacher;
//import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
//import org.apache.poi.ss.usermodel.*;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//
//public class TeacherParser {
//    public static void parse() {
//        List<Teacher> teachers = new ArrayList<>();
//        Long teacherId = 1L;
//        Workbook workbook = null;
//        try {
//            workbook = WorkbookFactory.create(new File("C:/projects/eptaPlaner/src/main/resources/Группы.xlsx"));
//        } catch (IOException | InvalidFormatException e) {
//            e.printStackTrace();
//        }
//
//        Sheet sheet = workbook.getSheetAt(2);
//
//        Iterator<Row> it = sheet.iterator();
//        //проходим по всему листу
//        it.next();
//        while (it.hasNext()) {
//            Row row = it.next();
//            Iterator<Cell> cells = row.iterator();
//            System.out.println(row.getLastCellNum());
//            Teacher teacher = null;
//            String firstName = "";
//            String lastName = "";
//            String patronymic = "";
//            String subjectName = "";
//            List<Subject> subjects = new ArrayList<>();
//            while (cells.hasNext()) {
//                Cell cell = cells.next();
//                int cellType = cell.getCellType();
//                String string = "";
//                switch (cell.getColumnIndex()) {
//                    case 0:
//                        firstName = cell.getStringCellValue();
//                        break;
//                    case 1:
//                        lastName = cell.getStringCellValue();
//                        break;
//                    case 2:
//                        patronymic = cell.getStringCellValue();;
//                    default:
//                        subjects.add(new Subject());
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
