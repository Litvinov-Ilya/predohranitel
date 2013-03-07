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
