package OOP.InterfacesAndAbstraction.Telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {
        StringBuilder sb = new StringBuilder();

        for (String url : urls) {

            boolean isValidUrl = validateURL(url);

            if (!isValidUrl) {
                sb.append("Invalid URL!");

            } else {
                sb.append("Browsing: ")
                        .append(url)
                        .append("!");
            }
            sb.append(System.lineSeparator());
        }

        return sb.toString().trim();
    }

    private boolean validateURL(String url) {
        for (char c : url.toCharArray()){
            if (Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }

    @Override
    public String call() {
        StringBuilder sb = new StringBuilder();

        for (String number : numbers) {
            boolean IsValid = validatePhoneNumber(number);

            if (!IsValid) {
                sb.append("Invalid number!")
                        .append(System.lineSeparator());
            } else {
                sb.append("Calling... ")
                        .append(number)
                        .append(System.lineSeparator());
            }
        }

        return sb.toString().trim();
    }

    private boolean validatePhoneNumber(String number) {
        for (char c : number.toCharArray()) {
            if (!Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }
}
