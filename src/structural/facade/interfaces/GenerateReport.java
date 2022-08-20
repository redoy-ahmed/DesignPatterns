package structural.facade.interfaces;

import java.sql.Connection;

public interface GenerateReport {
    void generatePDFReport(String tableName, Connection con);
    void generateHTMLReport(String tableName, Connection con);
}
