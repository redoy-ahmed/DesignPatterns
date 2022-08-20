package structural.facade.helpers;

import structural.facade.interfaces.GenerateReport;

import java.sql.Connection;

public class MySqlHelper implements GenerateReport {

    public Connection getDBConnection() {
        return null;
    }

    public void generatePDFReport(String tableName, Connection con) {
        //get data from table and generate pdf report
    }

    public void generateHTMLReport(String tableName, Connection con) {
        //get data from table and generate pdf report
    }
}