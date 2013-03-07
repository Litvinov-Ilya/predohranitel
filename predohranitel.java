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
 double a=sila.SilaToka();
  System.out.println("sila toka "+a);
  if (a>0 && a<0.1)
  System.out.println("Trebuetsya predohranitel s nominalom 0,1A");
  else if (a>=0.1 && a<0.25)
	System.out.println("Trebuetsya predohranitel s nominalom 0,25A");
  else if (a>=0.25 && a<0.5)
	System.out.println("Trebuetsya predohranitel s nominalom 0,5A");
  else if (a>=0.5 && a<1)
	System.out.println("Trebuetsya predohranitel s nominalom 1A");
  else if (a>=1 && a<2)
	System.out.println("Trebuetsya predohranitel s nominalom 2A");
  else if (a>=2 && a<3)
	System.out.println("Trebuetsya predohranitel s nominalom 3A");
  else if (a>=3 && a<4)
	System.out.println("Trebuetsya predohranitel s nominalom 4A");
  else if (a>=4 && a<5)
  	System.out.println("Trebuetsya predohranitel s nominalom 5A");
  else if (a>=5 && a<6)
	System.out.println("Trebuetsya predohranitel s nominalom 6A");
  else if (a>=6 && a<8)
	System.out.println("Trebuetsya predohranitel s nominalom 8A");
  else if (a>=8 && a<10)
	System.out.println("Trebuetsya predohranitel s nominalom 10A");
  else if (a>=10 && a<12)
	System.out.println("Trebuetsya predohranitel s nominalom 12A");
  else if (a>=12 && a<15)
	System.out.println("Trebuetsya predohranitel s nominalom 15A");
  else if (a>=15 && a<20)
	System.out.println("Trebuetsya predohranitel s nominalom 20A");
  else if (a>=20 && a<30)
	System.out.println("Trebuetsya predohranitel s nominalom 30A");
  else if (a>=30 && a<40)
	System.out.println("Trebuetsya predohranitel s nominalom 40A");
  else if (a>=40 && a<50)
	System.out.println("Trebuetsya predohranitel s nominalom 50A");
}
}
