package structural.facade.interfaces;

import java.sql.Connection;

public interface GenerateReport {

    Connection getDBConnection();

    void generatePDFReport(String tableName, Connection con);

    void generateHTMLReport(String tableName, Connection con);
}
