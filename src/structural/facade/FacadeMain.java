package structural.facade;

import java.sql.Connection;

public class FacadeCheck {
    public static void main(String[] args) {
        String tableName = "Employee";

        Connection connectionMySQL = MySqlHelper.getMySqlConnection();
        MySqlHelper mySqlHelper = new MySqlHelper();
        mySqlHelper.generatedMySqlHTMLReport(tableName, connectionMySQL);

        Connection connectionOracle = OracleHelper.getOracleConnection();
        OracleHelper oracleHelper = new OracleHelper();
        oracleHelper.generatedOracleHTMLReport(tableName, connectionOracle);

        HelperFacade.generatedReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, tableName);
        HelperFacade.generatedReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDF, tableName);
    }
}
