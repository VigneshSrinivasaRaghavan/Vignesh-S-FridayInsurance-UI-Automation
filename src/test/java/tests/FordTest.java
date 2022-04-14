package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.PopUpPage;
import zeroCell.ExcelReader;
import zeroCell.TestData;

import java.util.List;

public class FordTest extends BaseTest {
    PopUpPage popUpPage = new PopUpPage();

    @Test(dataProvider = "getData")
    public void fordTestWithMultipleModel(TestData testData) {
        popUpPage.clickOnPopup()
                .clickCarIsAlreadyInsuredRadioButton()
                .enterInsuranceStartDate(testData.getInsuranceDate())
                .clickContinueButton()
                .selectOwnerOfCar(testData.getCarOwner())
                .selectCarPurchase(testData.getCarPurchaseMode())
                .clickContinueButton()
                .clickFindByMakeAndModelButton()
                .searchCarBrand(testData.getCarBrand())
                .selectFirstSearchResult()
                .searchModel(testData.getCarModel())
                .selectFirstSearchResult()
                .selectCarShape(testData.getCarShape())
                .selectFuel(testData.getFuelType())
                .selectHp(testData.getHpType())
                .selectCarIncluded(testData.getCarIncluded())
                .enterFirstRegistrationDate(testData.getFirstRegistrationDate())
                .enterAdmissionToYouDate(testData.getAdmissionDate());
    }


    @DataProvider(parallel = true)
    public static Object[] getData() {
        List<TestData> bmwTestDatas = ExcelReader.readExcel("Ford");
        return bmwTestDatas.toArray();
    }
}
