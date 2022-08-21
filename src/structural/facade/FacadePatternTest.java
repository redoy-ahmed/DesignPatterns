package structural.facade;

import structural.facade.helpers.HelperFacade;
import structural.facade.helpers.MySqlHelper;
import structural.facade.helpers.OracleHelper;

import java.sql.Connection;

public class FacadePatternTest {

    /*
        Simply put, a facade encapsulates a complex subsystem behind a simple interface. It hides much of the complexity and makes the subsystem easy to use.
        Also, if we need to use the complex subsystem directly, we still can do that; we aren't forced to use the facade all the time.

        1. Facade design pattern is more like a helper for client applications, it does not hide subsystem interfaces from the client. Whether to use Facade or not is completely dependent on client code.
        2. Facade design pattern can be applied at any point of development, usually when the number of interfaces grow and system gets complex.
        3. Subsystem interfaces are not aware of Facade, and they shouldn’t have any reference of the Facade interface.
        4. Facade design pattern should be applied for similar kind of interfaces, its purpose is to provide a single interface rather than multiple interfaces that does the similar kind of jobs.
        5. We can use Factory pattern with Facade to provide better interface to client systems.
    */

    public static void main(String[] args) {
        String tableName = "Employee";

        //generating MySql HTML report and Oracle PDF report without using Facade
        Connection con = MySqlHelper.getDBConnection();
        MySqlHelper mySqlHelper = new MySqlHelper();
        mySqlHelper.generateHTMLReport(tableName, con);

        Connection con1 = OracleHelper.getDBConnection();
        OracleHelper oracleHelper = new OracleHelper();
        oracleHelper.generatePDFReport(tableName, con1);

        //generating MySql HTML report and Oracle PDF report using Facade
        HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, tableName);
        HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDF, tableName);
    }
}