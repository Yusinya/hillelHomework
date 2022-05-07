package homework4;

public class Person {
    public static void main(String[] args) {
        personInfo("Will", "Smith", "New York", "2936729462846");
        personInfo("Jackie", "Chan", "Shanghai", "12312412412");
        personInfo("Sherlock", "Holmes", "London", "2936729462568");
    }

    public static String personInfo(String name, String lastName, String city, String phoneNumber) {
        String callPerson = "Зателефонувати громадянину " + name + " " + lastName + " із міста " + city + " можливо за номером " + phoneNumber;
        System.out.println(callPerson);
    return callPerson;
    }
}
