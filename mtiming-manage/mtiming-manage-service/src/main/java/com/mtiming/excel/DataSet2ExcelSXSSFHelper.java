package com.mtiming.excel;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.Lists;

/**
 * 导出到excel工具类
 * 采用SXSSF方式，固定ROW数量写入硬盘
 *
 * Created by cuigq on 2018/9/7
 */
public class DataSet2ExcelSXSSFHelper {
    private static Logger logger = LoggerFactory.getLogger(DataSet2ExcelSXSSFHelper.class);

    /**
     * 查询结果导出到Excel
     *
     * @param workbook
     * @param sheetName
     * @param beanPropertyColumnMap：BeanExcel表头和属性对应Map
     * @param mapValueAdapter:
     * @param dataset:查询结果
     */
    public void export(SXSSFWorkbook workbook, String sheetName, Map<String, String> beanPropertyColumnMap, Map<String, IValueFormatter> mapValueAdapter, List<Map<String,Object>> dataset) {

        //属性
        List<String> properties = Lists.newArrayList();
        //表头
        List<String> columnTitles = Lists.newArrayList();

        properties.addAll(beanPropertyColumnMap.values());
        columnTitles.addAll(beanPropertyColumnMap.keySet());

        String[] arrayColumn = new String[columnTitles.size()];
        columnTitles.toArray(arrayColumn);

        SXSSFSheet sheet = createWorkbookTitle(workbook, arrayColumn, sheetName);

        Iterator it = dataset.iterator();
        int index = 1;
        while (it.hasNext()) {
            // 创建一行
            Row columnValueRow = sheet.createRow(index);
            Map<String,Object> t = (Map<String, Object>) it.next();
            // 利用反射，根据javabean属性的先后顺序，动态调用getXxx()方法得到属性值
            for (int i = 0; i < columnTitles.size(); i++) {
                // 创建相应的单元格
                Cell  cell = columnValueRow.createCell(i);
                String property = beanPropertyColumnMap.get(columnTitles.get(i));
                try {
                    Object value = t.get(property);
                    // 判断值的类型后进行强制类型转换
                    String textValue = "";
                    if (value != null) {
                        if (mapValueAdapter.get(columnTitles.get(i)) != null) {
                            textValue = mapValueAdapter.get(columnTitles.get(i)).format(value);
                        } else {
                            textValue = String.valueOf(value);
                        }
                    }
                    cell.setCellValue(textValue);
                } catch (Exception e) {
                    logger.error("导出到Excel失败！" + e.getMessage(),e);
                    throw new IllegalArgumentException(e);
                }
            }
            index++;
        }
    }

    private SXSSFSheet createWorkbookTitle(SXSSFWorkbook workbook, String[] titles, String sheetName) {
        // 生成一个表格
        SXSSFSheet sheet = workbook.createSheet(sheetName);
        Row row = sheet.createRow(0);
        for (int celLength = 0; celLength < titles.length; celLength++) {
            // 创建相应的单元格
            Cell cell = row.createCell(celLength);
            cell.setCellValue(titles[celLength]);
        }

        return sheet;
    }
}