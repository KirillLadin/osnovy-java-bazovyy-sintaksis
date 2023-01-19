public class MyFirstClass {
    //Метод main, точка входа в программу
    public static void main(String[] args) {
       print(getStudentName());
    }

    //Метод, без входных параметров, возвращающий строку
    public static String getStudentName(){
        //Переменная
        String studentName = "Ladin Kirill";
        return studentName;
    }

    //Метод, с входным параметром someString, но ничего не возвращающий
    public static void print(String someString){
        String summaryString = "Tinkoff Fintech " + someString;
        System.out.println(summaryString);
    }
}
