package structural.facade;

import structural.facade.helpers.HelperFacade;
import structural.facade.helpers.MySqlHelper;
import structural.facade.helpers.OracleHelper;

import java.sql.Connection;

public class FacadePatternTest {

    public static void main(String[] args) {
        String tableName = "Employee";

        //generating MySql HTML report and Oracle PDF report without using Facade
        Connection con = new MySqlHelper().getDBConnection();
        MySqlHelper mySqlHelper = new MySqlHelper();
        mySqlHelper.generateHTMLReport(tableName, con);

        Connection con1 = new OracleHelper().getDBConnection();
        OracleHelper oracleHelper = new OracleHelper();
        oracleHelper.generatePDFReport(tableName, con1);

        //generating MySql HTML report and Oracle PDF report using Facade
        HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, tableName);
        HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDF, tableName);
    }
}