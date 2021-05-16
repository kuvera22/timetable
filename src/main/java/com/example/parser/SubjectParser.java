//package com.example.parser;
//
//
//import com.example.domain.SpecialityPlan;
//import com.example.domain.SubjectQuality;
//import com.example.domain.SubjectType;
//import com.example.repository.DepartmentRepository;
//import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
//import org.apache.poi.ss.usermodel.*;
//import org.springframework.stereotype.Service;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Objects;
//
//@Service
//public class SubjectParser {
//    private final DepartmentRepository departmentRepository;
//
//    public SubjectParser(DepartmentRepository departmentRepository) {
//        this.departmentRepository = departmentRepository;
//    }
//
//    public List<SpecialityPlan> parse(int numberOfStartString) {
//        List<SubjectQuality> subjectQualityListTerm1 = new ArrayList<>();
//        List<SubjectQuality> subjectQualityListTerm2 = new ArrayList<>();
//        List<SubjectQuality> subjectQualityListTerm3 = new ArrayList<>();
//        List<SubjectQuality> subjectQualityListTerm4 = new ArrayList<>();
//        List<SubjectQuality> subjectQualityListTerm5 = new ArrayList<>();
//        List<SubjectQuality> subjectQualityListTerm6 = new ArrayList<>();
//        List<SubjectQuality> subjectQualityListTerm7 = new ArrayList<>();
//        List<SubjectQuality> subjectQualityListTerm8 = new ArrayList<>();
//
//        numberOfStartString = 5;
//
//        Workbook workbook = null;
//        try {
//            workbook = WorkbookFactory.create(new File("C:/projects/timetable/src/main/resources/asdf.xlsx"));
//        } catch (IOException | InvalidFormatException e) {
//            e.printStackTrace();
//        }
//
//        Sheet sheet = workbook.getSheetAt(0);
//
//        Iterator<Row> it = sheet.iterator();
//        //проходим по всему листу
//        while (numberOfStartString > 1) {
//            it.next();
//            numberOfStartString--;
//        }
//        while (it.hasNext()) {
//            Row row = it.next();
//            Iterator<Cell> cells = row.iterator();
//            cells.next();
//            String name = "";
//            String department = "";
//            String string = "";
//            int numeric = 0;
//            while (cells.hasNext()) {
//                Cell cell = cells.next();
//                int cellType = cell.getCellType();
//                switch (cellType) {
//                    case Cell.CELL_TYPE_STRING:
//                        string = cell.getStringCellValue();
//                        break;
//                    case Cell.CELL_TYPE_NUMERIC:
//                        numeric = (int) cell.getNumericCellValue();
//                        break;
//                }
//                switch (cell.getColumnIndex()) {
//                    case 1:
//                        name = string;
//                        break;
//                    case 2:
//                        department = string;
//                        break;
//                    case 11:
//                        subjectQualityListTerm1.add(new SubjectQuality(name, numeric, /*Objects.requireNonNull(departmentRepository.findByName(department).orElse(null)).getId()*/  null, SubjectType.LECTION));
//                        break;
//                    case 12:
//                        subjectQualityListTerm1.add(new SubjectQuality(name, numeric, /*Objects.requireNonNull(departmentRepository.findByName(department).orElse(null)).getId()*/  null, SubjectType.PRACTICE));
//                        break;
//                    case 16:
//                        subjectQualityListTerm2.add(new SubjectQuality(name, numeric, /*Objects.requireNonNull(departmentRepository.findByName(department).orElse(null)).getId()*/  null, SubjectType.LECTION));
//                        break;
//                    case 17:
//                        subjectQualityListTerm2.add(new SubjectQuality(name, numeric, /*Objects.requireNonNull(departmentRepository.findByName(department).orElse(null)).getId()*/  null, SubjectType.PRACTICE));
//                        break;
//                    case 21:
//                        subjectQualityListTerm3.add(new SubjectQuality(name, numeric, /*Objects.requireNonNull(departmentRepository.findByName(department).orElse(null)).getId()*/  null, SubjectType.LECTION));
//                        break;
//                    case 22:
//                        subjectQualityListTerm3.add(new SubjectQuality(name, numeric, /*Objects.requireNonNull(departmentRepository.findByName(department).orElse(null)).getId()*/  null, SubjectType.PRACTICE));
//                        break;
//                    case 26:
//                        subjectQualityListTerm4.add(new SubjectQuality(name, numeric, /*Objects.requireNonNull(departmentRepository.findByName(department).orElse(null)).getId()*/  null, SubjectType.LECTION));
//                        break;
//                    case 27:
//                        subjectQualityListTerm4.add(new SubjectQuality(name, numeric, /*Objects.requireNonNull(departmentRepository.findByName(department).orElse(null)).getId()*/  null, SubjectType.PRACTICE));
//                        break;
//                    case 31:
//                        subjectQualityListTerm5.add(new SubjectQuality(name, numeric, /*Objects.requireNonNull(departmentRepository.findByName(department).orElse(null)).getId()*/  null, SubjectType.LECTION));
//                        break;
//                    case 32:
//                        subjectQualityListTerm5.add(new SubjectQuality(name, numeric, /*Objects.requireNonNull(departmentRepository.findByName(department).orElse(null)).getId()*/  null, SubjectType.PRACTICE));
//                        break;
//                    case 36:
//                        subjectQualityListTerm6.add(new SubjectQuality(name, numeric, /*Objects.requireNonNull(departmentRepository.findByName(department).orElse(null)).getId()*/  null, SubjectType.LECTION));
//                        break;
//                    case 37:
//                        subjectQualityListTerm6.add(new SubjectQuality(name, numeric, /*Objects.requireNonNull(departmentRepository.findByName(department).orElse(null)).getId()*/  null, SubjectType.PRACTICE));
//                        break;
//                    case 41:
//                        subjectQualityListTerm7.add(new SubjectQuality(name, numeric, /*Objects.requireNonNull(departmentRepository.findByName(department).orElse(null)).getId()*/  null, SubjectType.LECTION));
//                        break;
//                    case 42:
//                        subjectQualityListTerm7.add(new SubjectQuality(name, numeric, /*Objects.requireNonNull(departmentRepository.findByName(department).orElse(null)).getId()*/  null, SubjectType.PRACTICE));
//                        break;
//                    case 46:
//                        subjectQualityListTerm8.add(new SubjectQuality(name, numeric, /*Objects.requireNonNull(departmentRepository.findByName(department).orElse(null)).getId()*/  null, SubjectType.LECTION));
//                        break;
//                    case 47:
//                        subjectQualityListTerm8.add(new SubjectQuality(name, numeric, /*Objects.requireNonNull(departmentRepository.findByName(department).orElse(null)).getId()*/  null, SubjectType.PRACTICE));
//                        break;
//                    default:
//                        break;
//                }
//            }
//        }
//        List<SpecialityPlan> specialityPlans = new ArrayList<>();
//        specialityPlans.add(new SpecialityPlan(subjectQualityListTerm1, 1));
//        specialityPlans.add(new SpecialityPlan(subjectQualityListTerm2, 2));
//        specialityPlans.add(new SpecialityPlan(subjectQualityListTerm3, 3));
//        specialityPlans.add(new SpecialityPlan(subjectQualityListTerm4, 4));
//        specialityPlans.add(new SpecialityPlan(subjectQualityListTerm5, 5));
//        specialityPlans.add(new SpecialityPlan(subjectQualityListTerm6, 6));
//        specialityPlans.add(new SpecialityPlan(subjectQualityListTerm7, 7));
//        specialityPlans.add(new SpecialityPlan(subjectQualityListTerm8, 8));
//        return specialityPlans;
//    }
//
//}
