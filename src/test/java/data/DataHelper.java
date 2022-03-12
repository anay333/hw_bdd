package data;

import lombok.Value;

public class DataHelper {
    private DataHelper() {}

    @Value
    public static class AuthInfo {
        private String login;
        private String password;
    }

    public static AuthInfo getAuthInfo() {
        return new AuthInfo("vasya", "qwerty123");
    }

    public static AuthInfo getOtherAuthInfo(AuthInfo original) {
        return new AuthInfo("petya", "123qwerty");
    }

    @Value
    public static class VerificationCode {
        private String code;
    }

    public static VerificationCode getVerificationCodeFor(AuthInfo authInfo) {
        return new VerificationCode("12345");
    }

    @Value
    public static class CardNumber01 {private String cardNumber01;}

    public static CardNumber01 getCardNumber01 (CardNumber01 cardNumber01) {
        return new CardNumber01("5559 0000 0000 0001");
    }

    @Value
    public static class CardNumber02 {private String cardNumber02;}

    public static CardNumber02 getCardNumber02 (CardNumber02 cardNumber02) {
        return new CardNumber02("5559 0000 0000 0001");
    }


}