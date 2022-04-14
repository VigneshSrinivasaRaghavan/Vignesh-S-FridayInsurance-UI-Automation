package zeroCell;

import com.creditdatamw.zerocell.annotation.Column;
import lombok.Data;

@Data
public class TestData {

    @Column(name = "Insurance Date", index = 0)
    private String insuranceDate;

    @Column(name = "Owner of Car", index = 1)
    private String carOwner;

    @Column(name = "Car Purchase", index = 2)
    private String carPurchaseMode;

    @Column(name = "Car Brand", index = 3)
    private String carBrand;

    @Column(name = "Car Model", index = 4)
    private String carModel;

    @Column(name = "Car Shape", index = 5)
    private String carShape;

    @Column(name = "Fuel", index = 6)
    private String fuelType;

    @Column(name = "Hp", index = 7)
    private String hpType;

    @Column(name = "Car Included", index = 8)
    private String carIncluded;

    @Column(name = "First Registration Date", index = 9)
    private String firstRegistrationDate;

    @Column(name = "Admission Date", index = 10)
    private String admissionDate;

    @Override
    public String  toString() {
        return "TestData{" +
                "insuranceDate='" + insuranceDate + '\'' +
                ", carOwner='" + carOwner + '\'' +
                ", carPurchaseMode='" + carPurchaseMode + '\'' +
                ", carBrand='" + carBrand + '\'' +
                ", carModel='" + carModel + '\'' +
                ", carShape='" + carShape + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", hpType='" + hpType + '\'' +
                ", carIncluded='" + carIncluded + '\'' +
                ", firstRegistrationDate='" + firstRegistrationDate + '\'' +
                ", admissionDate='" + admissionDate + '\'' +
                '}';
    }
}
