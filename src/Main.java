public class Main {
    public static void main(String[] args) {

        WordHistogram wh = new WordHistogram();
        String toAnalyse = "olá, meu nome é raquel Raquel";

        wh.analyseString(toAnalyse);
        System.out.println(wh.get("raquel"));
    }
}