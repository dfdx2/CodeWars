public class FakeBinary {
    public static String fakeBin(String numberString) {
     
        return numberString.replaceAll("[1-4]","0").replaceAll("[5-9]","1");
    }
}