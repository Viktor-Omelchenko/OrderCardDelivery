package ru.netology;

import lombok.var;
import lombok.Data;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
//import ru.netology.delivery.data.DataGenerator;
import static com.codeborne.selenide.Selenide.open;


public class OrderCardDelivery {

    static class DeliveryTest {

        @BeforeEach
        void setup() {
            open("http://localhost:9999");
        }

        @Test
        @DisplayName("Should successful plan and replan meeting")
        void shouldSuccessfulPlanAndMeeting() {
            var DataGeneratorDataUserInfo = DataGenerator.Registration.generateUser("ru");
            var daysToAddForFirstMeeting = 4;
            var firstMeetingDate = DataGenerator.generateDate(daysToAddForFirstMeeting);
            var daysToAddForSecondMeeting = 7;
            var secondMeetingDate = DataGenerator.generateDate(daysToAddForSecondMeeting);
        }
    }
}