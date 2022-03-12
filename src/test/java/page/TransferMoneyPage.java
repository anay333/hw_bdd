package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class TransferMoneyPage {
private SelenideElement amountfield = $("[data-test-id='amount']");
private SelenideElement fromfield=$("[data-test-id='from']");
private SelenideElement tofield=$("[data-test-id='to']");

public TransferMoneyPage() {
    amountfield.shouldBe(Condition.visible);
    fromfield.shouldBe(Condition.visible);
    tofield.shouldBe(Condition.visible);
}

public TransferResultPage transferMoney(){
    //логика для введения данных для полей сумма откуда и куда


}

}
