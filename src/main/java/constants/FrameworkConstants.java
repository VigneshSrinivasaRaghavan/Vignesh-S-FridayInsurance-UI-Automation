package constants;

public class FrameworkConstants {

    private FrameworkConstants(){}

    private static final String RESOURCESPATH = System.getProperty("user.dir")+"/src/test/resources";
    private static final String CONFIGFILEPATH = RESOURCESPATH+"/config/config.properties";
    private static final int WAITTIMEINSECONDS = 15;
    private static final String EXCELDATA = RESOURCESPATH+"/excel/TestData.xlsx";
    private static final String EXTENTREPORTFOLDERPATH=System.getProperty("user.dir")+"/extent-test-output/";
    private static String extentReportFilePath="";

    public static String getConfigfilepath() {
        return CONFIGFILEPATH;
    }

    public static String getExcelData() {
        return EXCELDATA;
    }

    public static int getWaitTimeInSeconds() {
        return WAITTIMEINSECONDS;
    }

    public static String getExtentReportFilePath() {
        if(extentReportFilePath.isEmpty()){
            extentReportFilePath=EXTENTREPORTFOLDERPATH+"index.html";
        }
        return extentReportFilePath;
    }
}