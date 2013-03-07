import java.io.*;
// Создание класса для вычисления силы тока
class nominal {
  double napryajenie;
  double moshnost;
  nominal(double U, double P) {
  napryajenie=U;
  moshnost=P;
}
// Создание функции вычисления силы тока, возвращающей её значение
  double SilaToka() {
      return napryajenie/moshnost;
}
}
// определение нового класса
/* Выполнение всех приложений Java начинается с вызова метода main ().
Ключевое слово p u b l i c — модификатор доступа, который позволяет управлять
видимостью членов класса. Ключевое слово static позволяет вызывать метод
main () без конкретизации экземпляра класса. Часть String args [ ] объявляет
параметр args, который представляет собой массив экземпляров класса String.*/
class predohranitel {
//Строка IOException необходима для обработки ошибок ввода
  public static void main(String args[]) throws IOException {
  double e,f;
  BufferedReader kb=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("vvedite raschetnuy moshnost potrebitelya");
  e=Double.parseDouble(kb.readLine());
  System.out.println("vvedite raschetnoe napryajenie ");
  f=Double.parseDouble(kb.readLine());
  nominal sila=new nominal(e,f);
