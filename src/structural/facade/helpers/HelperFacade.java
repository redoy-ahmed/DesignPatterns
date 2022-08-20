package structural.facade.helpers;

import java.sql.Connection;

public class HelperFacade {

    public enum DBTypes {
        MYSQL, ORACLE
    }

    public enum ReportTypes {
        HTML, PDF
    }

    public static void generateReport(DBTypes dbType, ReportTypes reportType, String tableName) {
        Connection con;
        switch (dbType) {
            case MYSQL:
                con = new MySqlHelper().getDBConnection();
                MySqlHelper mySqlHelper = new MySqlHelper();
                switch (reportType) {
                    case HTML:
                        mySqlHelper.generateHTMLReport(tableName, con);
                        break;
                    case PDF:
                        mySqlHelper.generatePDFReport(tableName, con);
                        break;
                }
                break;
            case ORACLE:
                con = new OracleHelper().getDBConnection();
                OracleHelper oracleHelper = new OracleHelper();
                switch (reportType) {
                    case HTML:
                        oracleHelper.generateHTMLReport(tableName, con);
                        break;
                    case PDF:
                        oracleHelper.generatePDFReport(tableName, con);
                        break;
                }
                break;
        }
    }
}