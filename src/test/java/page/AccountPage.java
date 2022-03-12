package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class AccountPage {
    private SelenideElement transferButton1 = $("#root > div > ul > li:nth-child(1) > div > button");
    private SelenideElement transferButton2=$("#root > div > ul > li:nth-child(2) > div > button > span > span");

    public AccountPage (){transferButton1.shouldBe(Condition.visible); transferButton2.shouldBe(Condition.visible);};

    public TransferMoneyPage transferMoneyFrom01to02(){
        transferButton1.click();
        return new TransferMoneyPage();
    }
    public  TransferMoneyPage transferMoneyFrom02to01(){
        transferButton2.click();
        return new TransferMoneyPage();
    }
}
