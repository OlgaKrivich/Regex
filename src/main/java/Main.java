import static utils.StringUtils.getValueByRegEx;

public class Main {

    public static Boolean checkStringMatchPattern(String text, String regex) {
        return text.matches(regex);
    }

    public static void main(String[] args) {
        System.out.println("Task1");
        String emailPattern = "[a-zA-Z0-9_+-]{3,20}+@[a-zA-Z]{3,10}+\\.[a-zA-Z]{3,5}";
        String email1 = "ahZ1a+@asd.com";
        System.out.println(checkStringMatchPattern(email1, emailPattern));
        System.out.println();

        System.out.println("Task2");
        String ip = "12.345.23.234";
        String ipPattern = "\\d{1,3}.\\d{1,3}.\\d{1,3}.\\d{1,3}";
        System.out.println(checkStringMatchPattern(ip, ipPattern));
        System.out.println();

        System.out.println("Task3");
        String bankCard1 = "4441 1111 1111 1111";
        String bankCard2 = "4441111111111111";
        String bankCard3 = "4441 111111111111";
        String bankCard4 = "44411111 11111111";
        String bankCardPattern = "([0-9]{4}\\s[0-9]{4}\\s[0-9]{4}\\s[0-9]{4})|([0-9]{4}\\d[0-9]{3}\\d[0-9]{3}\\d[0-9]{3})";
        System.out.println(checkStringMatchPattern(bankCard1, bankCardPattern));
        System.out.println(checkStringMatchPattern(bankCard2, bankCardPattern));
        System.out.println(checkStringMatchPattern(bankCard3, bankCardPattern));
        System.out.println(checkStringMatchPattern(bankCard4, bankCardPattern));
        System.out.println();

        String a = "41 University Drive • Suite 202,\n"
                + "Newtown, PA 18940 • USA";
        String[] arr = a.split("•\\s+");
        for (String item : arr) {
            System.out.println(item);
        }

        System.out.println();
        String country = getValueByRegEx(arr[2], "\\w+");
        String postalCode = getValueByRegEx(arr[1], "[A-Z]{2}\\s[0-9]{5,}\\s");
        String city = getValueByRegEx(arr[1], "[a-zA-Z]{6,}");
        String office = getValueByRegEx(arr[1], "[0-9]{1,}");
        String streetName = getValueByRegEx(arr[0], "[a-zA-z]+\\s?[a-zA-z]+");
        String streetNumber = getValueByRegEx(arr[0], "\\d+");
        System.out.println(country);
        System.out.println(postalCode);
        System.out.println(city);
        System.out.println(office);
        System.out.println(streetName);
        System.out.println(streetNumber);

    }

}
