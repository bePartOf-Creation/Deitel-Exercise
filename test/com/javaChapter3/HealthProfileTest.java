package com.javaChapter3;

import com.javaChapter1.BMI;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HealthProfileTest {
    HealthProfile healthProfile;
    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void healthProfile_CanBeConstructed(){
        HeartRate heartRate = new HeartRate("Ade","lastName", 2,2,1992);
        BMI bmi = new BMI(67.7, 170.4);
        Date dob = heartRate.getDateOfBirth();
        healthProfile = new HealthProfile(dob, bmi, "m", heartRate);
        assertEquals(bmi, healthProfile.getBMIValue());
        assertEquals("67.7", healthProfile.getBMIValue().getWeight());






    }

//    @Test
//    void testThatUserCanInputFirstName(){
//        HealthProfile userProfile = new HealthProfile("Ola", "Newton", "Male", 0, 2, 1997, 0.1, 2.5);
//        String firstName = userProfile.getFirstName();
//        assertEquals("Ola",firstName);
//    }
//
//    @Test
//    void testThatUserFirstNameCanBeUpdated(){
//        HealthProfile userProfile = new HealthProfile("Ola", "Newton", "Male", 0, 2, 1997, 0.1, 2.5);
//        userProfile.setFirstName("Kola");
//        assertEquals("Kola",userProfile.getFirstName());
//    }
//
//    @Test
//    void testThatUserCanInputLastname(){
//        HealthProfile userProfile = new HealthProfile("Kola","Newton", "Male", 0, 2, 1997, 0.1, 2.5);
//        String lastName = userProfile.getLastName();
//        assertEquals("Newton",lastName);
//    }
//    @Test
//    void testThatUserLastNameCanBeUpdated(){
//        HealthProfile userProfile = new HealthProfile("Kola","Newton", "Male", 0, 2, 1997, 0.1, 2.5);
//        userProfile.setLastName("Case");
//        assertEquals("Case",userProfile.getLastName());
//    }
//
//    @Test
//    void testThatUserInputGender(){
//        HealthProfile userProfile = new HealthProfile("Kola","Newton","Male", 0, 2, 1997, 0.1, 2.5);
//        String gender = userProfile.getGender();
//        assertEquals("Male",gender);
//    }
//    @Test
//    void testThatUserGenderIsFemale(){
//        HealthProfile userProfile = new HealthProfile("KOla","Newton","female", 0, 2, 1997, 0.1, 2.5);
//        userProfile.setGender("f");
//        userProfile.setGender("F");
//        userProfile.setGender("female");
//        userProfile.setGender("Female");
//        assertEquals("female",userProfile.getGender());
//    }
//    @Test
//    void testThatUserGenderIsMale(){
//        HealthProfile userProfile = new HealthProfile("KOla","Newton","male", 0, 2, 1997, 0.1, 2.5);
//        userProfile.setGender("m");
//        userProfile.setGender("M");
//        userProfile.setGender("male");
//        userProfile.setGender("Male");
//        assertEquals("male",userProfile.getGender());
//    }
//    @Test
//    void testThatUserGenderCannotInputUnknownGender(){
//        HealthProfile userProfile = new HealthProfile("KOla","Newton","male", 0, 2, 1997, 0.1, 2.5);
//        userProfile.setGender("malee");
//        userProfile.setGender("Male1");
//        userProfile.setGender("");
//        userProfile.setGender("femalee");
//        userProfile.setGender("FEMale1");
//        assertEquals("male",userProfile.getGender());
//
//        //For Females ONLY
//        userProfile = new HealthProfile("KOla","Newton","female", 0, 2, 1997, 0.1, 2.5);
//        userProfile.setGender("");
//        userProfile.setGender("femalee");
//        userProfile.setGender("FEMale1");
//        assertEquals("female",userProfile.getGender());
//    }
// @Test
//    void testThatUserCanInputMonthForDateOfBirth(){
//     HealthProfile userProfile = new HealthProfile("KOla","Newton","male",0, 2, 1997, 0.1, 2.5);
//     int month = userProfile.getMonth();
//     assertEquals(0, month);
// }
//
// @Test
//    void testThatUserMonthCanBeUpdatedForDateOfBirth(){
//        HealthProfile userProfile = new HealthProfile("KOla","Newton","male",0, 2, 1997, 0.1, 2.5);
//        userProfile.setMonth(12);
//        assertEquals(12, userProfile.getMonth());
//    }
// @Test
// void tesTThatUserCannotInputInvalidValueForMonth(){
//     HealthProfile userProfile = new HealthProfile("KOla","Newton","male",12, 2, 1997, 0.1, 2.5);
//     userProfile.setMonth(-12);
//     userProfile.setMonth(14);
//     assertEquals(12, userProfile.getMonth());
// }
// @Test
//    void testThatUserInputDayForDateOfBirth(){
//     HealthProfile userProfile = new HealthProfile("KOla","Newton","male",0,2, 1997, 0.1, 2.5);
//     int day = userProfile.getDay();
//     assertEquals(2, day);
// }
//    @Test
//    void testThatUserDayCanBeUpdatedForDateOfBirth(){
//        HealthProfile userProfile = new HealthProfile("KOla","Newton","male",0,2, 1997, 0.1, 2.5);
//        userProfile.setDay(31);
//        assertEquals(31,userProfile.getDay());
//    }
//    @Test
//    void testThatUserCannotInputInvalidDayForDateOfBirth(){
//        HealthProfile userProfile = new HealthProfile("KOla","Newton","male",0,2, 1997, 0.1, 2.5);
//        userProfile.setDay(32);
//        userProfile.setDay(-12);
//        assertEquals(2,userProfile.getDay());
//    }
//    @Test
//    void testThatUserInputYearForDateOfBirth(){
//        HealthProfile userProfile = new HealthProfile("KOla","Newton","male",0,2,1997, 0.1, 2.5);
//        int year = userProfile.getYear();
//        assertEquals(1997, year);
//    }
//    @Test
//    void testThatUserYearCanBeUpdatedForDateOfBirth(){
//        HealthProfile userProfile = new HealthProfile("KOla","Newton","male",0,2,1997, 0.1, 2.5);
//        userProfile.setYear(1991);
//        assertEquals(1991,userProfile.getYear());
//    }
//    @Test
//    void testThatUserCannotInputInvalidYearForDateOfBirth(){
//        HealthProfile userProfile = new HealthProfile("KOla","Newton","male",0,2,1997, 0.1, 2.5);
//        userProfile.setYear(-1991);
//        userProfile.setYear(300000);
//        assertEquals(1997,userProfile.getYear());
//    }
//    @Test
//    void testThatTheSystemCanGenerateAndDisplayDateOfBirth(){
//        HealthProfile userProfile = new HealthProfile("KOla","Newton","male",10,2,1997, 0.1, 2.5);
//        String display = userProfile.getDateOfBirth().displayDate();
//        assertEquals("10/2/1997",display);
//    }
//    @Test
//    void testThatTheSystemCanUpdateAndDisplayDateOfBirth(){
        //HealthProfile userProfile = new HealthProfile("KOla","Newton","male",10,2,1997, 0.1, 2.5);
//        userProfile.setMonth(12);
//        userProfile.setDay(4);
//        userProfile.setYear(2003);
//        String display = userProfile.setDateOfBirth().displayDate();
//        assertEquals("12/4/2003",display);
//            Date dob = userProfile.getDateOfBirth();
//        String display = dob.displayDate();
//        String display =userProfile.getHeartRate().getDateOfBirth().displayDate();
//        HeartRate heartRate = userProfile.getHeartRate();
//        Date date = heartRate.getDateOfBirth();
//        String display = date.displayDate();
        ;
//    }
//    @Test
//    void testThatUserCanInputHeight(){
//        HealthProfile userProfile = new HealthProfile("KOla","Newton","male",10,2,1997,0.1, 2.5);
//        double height = userProfile.getHeight();
//        assertEquals(2.5,height);
//    }
//    @Test
//    void testThatUserHeightCAnBeUpdated(){
//        HealthProfile userProfile = new HealthProfile("KOla","Newton","male",10,2,1997,0.1, 2.5);
//        userProfile.setHeight(2.4);
//        assertEquals(2.4,userProfile.getHeight());
//    }
//    @Test
//    void testThatUserCannotInputInvalidHeight(){
//        HealthProfile userProfile = new HealthProfile("KOla","Newton","male",10,2,1997,0.1, 2.5);
//        userProfile.setHeight(-2.4);
//        userProfile.setHeight(-6.0f);
//        assertEquals(2.5,userProfile.getHeight());
//    }
//    @Test
//    void testThatUserCanInputWeight(){
//        HealthProfile userProfile = new HealthProfile("KOla","Newton","male",10,2,1997,0.1,2.5);
//        double weight = userProfile.getWeight();
//        assertEquals(0.1,weight);
//    }
//    @Test
//    void testThatUserWeightCAnBeUpdated(){
//        HealthProfile userProfile = new HealthProfile("KOla","Newton","male",10,2,1997,0.1, 2.5);
//        userProfile.setWeight(12.4);
//        assertEquals(12.4,userProfile.getWeight());
//    }
//    @Test
//    void testThatUserCannotInputInvalidWeight(){
//        HealthProfile userProfile = new HealthProfile("KOla","Newton","male",10,2,1997,0.1, 2.5);
//        userProfile.setWeight(-2.4);
//        userProfile.setWeight(-6.0f);
//        assertEquals(2.5,userProfile.getWeight());
//    }
//    @Test
//    void testThatUserCanDisplayAge(){
//        HealthProfile userProfile = new HealthProfile("KOla","Newton","male",10,2,1997,0.1, 2.5);
//        int age = userProfile.getUserAge().displayAge();
//        assertEquals(23,age);
//    }
//    @Test
//    void testThatUserCanUpdateAge(){
//        HealthProfile userProfile = new HealthProfile("KOla","Newton","male",10,2,1997,0.1, 2.5);
//        userProfile.setYear(1991);
//        int age = userProfile.setUserAge().displayAge();
//        assertEquals(29,age);
//    }
//    @Test
//    void testThatSystemCanDisplayMaximumHeartRate(){
//        HealthProfile userProfile = new HealthProfile("KOla","Newton","male",10,2,1997,0.1, 2.5);
//        userProfile.setUserAge();
//        int maxHeartRate = userProfile.getMaxHeartRate().displayMaximumHeartRate();
//        assertEquals(197,maxHeartRate);
//    }
//    @Test
//    void testThatSystemCanUpdatedMaximumHeartRate(){
//        HealthProfile userProfile = new HealthProfile("KOla","Newton","male",10,2,1997,0.1, 2.5);
//        userProfile.setYear(2019);
//        int maxHeartRate = userProfile.setMaxHeartRate().displayMaximumHeartRate();
//        assertEquals(219,maxHeartRate);
//    }
//    @Test
//    void testThatSystemCanCalculateMinimumTargetHeartRate(){
//        HealthProfile userProfile = new HealthProfile("KOla","Newton","male",10,2,1997,0.1, 2.5);
//        userProfile.setMaxHeartRate();
//        int minValue = userProfile.getHeartRate().calculateMinimumHeartRate();
//        assertEquals(98.0,minValue);
//    }
//    @Test
//    void testThatSystemCanUpdatedMinimumTargetHeartRate(){
//        HealthProfile userProfile = new HealthProfile("KOla","Newton","male",10,2,1997,0.1, 2.5);
//        userProfile.setYear(2008);
//        userProfile.setMaxHeartRate();
//        int minValue = userProfile.setMinTargetHeartRate().calculateMinimumHeartRate();
//        assertEquals(104.0,minValue);
//    }
//    @Test
//    void testThatSystemCanCalculateMaximumTargetHeartRate(){
//        HealthProfile userProfile = new HealthProfile("KOla","Newton","male",10,2,1997,0.1, 2.5);
//        userProfile.setMaxHeartRate();
//        int maxValue = userProfile.getMaxTargetHeartRate().calculateMaximumHeartRate();
//        assertEquals(167.0,maxValue);
//    }
//    @Test
//    void testThatSystemCanUpdatedMaximumTargetHeartRate(){
//        HealthProfile userProfile = new HealthProfile("KOla","Newton","male",10,2,1997,0.1, 2.5);
//        userProfile.setYear(2003);
//        userProfile.setMaxHeartRate();
//        int maxValue = userProfile.setMaxTargetHeartRate().calculateMaximumHeartRate();
//        assertEquals(172.0,maxValue);
//    }
//    @Test
//    void testThatSystemCanGenerateBMIValueForAUserProfile(){
//        HealthProfile userProfile = new HealthProfile("KOla","Newton","male",10,2,1997,0.1, 2.5);
//        double bmiValue = userProfile.getBMIValue().displayBmiValue();
//        assertEquals(11.248,bmiValue);
//    }
//    @Test
//    void testThatSystemCanUpdateAUserBMIValue(){
//        HealthProfile userProfile = new HealthProfile("KOla","Newton","male",10,2,1997,0.1, 2.5);
//        userProfile.setWeight(1);
//        userProfile.setHeight(6);
//        double bmiValue = userProfile.setBMIValue().displayBmiValue();
//        assertEquals(19.52777777777778,bmiValue);
//    }
//    @Test
//    void testThatSystemCanGenerateBMIValueChart(){
//        HealthProfile userProfile = new HealthProfile("KOla","Newton","male",10,2,1997,0.1, 2.5);
//        userProfile.setWeight(1);
//        userProfile.setHeight(6);
//        double bmiValue = userProfile.setBMIValue().displayBmiValue();
//        userProfile.getBMIValue().
//        assertEquals(19.52777777777778,bmiValue);
//       // assertEquals("Your BMI Value is " + bmiValue + "\nUnderweight : less than " + 18.5,display);
//
//    }

}
