public class Semicolon{

    public static String getSemicolon(){
        return ";";
    }

    public static boolean isSemicolon(String s){
        return (getSemicolon().equals(s));
    }

    public static boolean getValidation(String s, int threshold){
        int semicolonCount = s.length() - s.replace(";", "").length();
        return (s.length() < threshold * semicolonCount);
    }

    public static String getKorean(){
        return "세미콜론";
    }

    public static String getGreek(){
        return ";";
    }

    public static boolean isHideyBoy(String s){
        return (getGreek().equals(s));
    }

    public static int getLength(){
        return 1;
    }

}