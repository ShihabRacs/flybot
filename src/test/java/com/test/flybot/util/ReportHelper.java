package com.test.flybot.util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class ReportHelper {

    public static void main(String[] args){

        String reportFileLocation = System.getProperty("user.dir")+"\\End-to-end-test-report.csv";
        String htmlFileLocation = System.getProperty("user.dir")+"\\build\\reports\\tests\\classes\\com.test.flyBot.specClass.html";

        FileWriter reportFileWriter = null;
        Document doc;

        try {
            reportFileWriter = new FileWriter(reportFileLocation);

//            File reportHtmlDir = new File(htmlFileLocation);
            File reportHtml = new File(htmlFileLocation);

            doc = Jsoup.parse(reportHtml, "UTF-8");

            Elements reportTable;
            if(doc.select("div.percent").get(0).text().equals("100%"))
                reportTable = doc.select("div#tab0");
            else
                reportTable = doc.select("div#tab1");

            Elements reportTableRows = reportTable.select("tr");
            Elements reportTableColumns = reportTable.select("th");

            String reportTableColumnsStr = "";
            for (Element col: reportTableColumns) {
                reportTableColumnsStr += col.text() + ",";
            }
            reportFileWriter.append(reportTableColumnsStr.toString());

            for (Element row: reportTableRows) {
                Elements reportTableData = row.select("td");
                int first = 0;
                for (Element data: reportTableData) {
                    if(first==0)
                        reportFileWriter.append(data.text());
                    else
                        reportFileWriter.append("," + data.text());
                    first++;
                }
                reportFileWriter.append("\n");
            }
            reportFileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

