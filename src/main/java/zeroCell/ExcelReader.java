package zeroCell;

import com.creditdatamw.zerocell.Reader;
import constants.FrameworkConstants;

import java.io.File;
import java.util.List;

public final class ExcelReader {

    private ExcelReader() {
    }

    public static List<TestData> readExcel(String sheetName) {
        return Reader.of(TestData.class)
                .from(new File(FrameworkConstants.getExcelData()))
                .sheet(sheetName)
                .skipHeaderRow(true)
                .list();
    }
}
