public class AusdrückenInJava {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = 6;
        double x = 1.5;
        double y = 2.3;
        int int_ergebnis;
        double double_ergebnis;

int_ergebnis = c - a * 3;
System.out.println(int_ergebnis);
int_ergebnis = c / a;
System.out.println(int_ergebnis);
int_ergebnis = c / b; //ein Double wäre besser geeignet gewesen, weil es nur eine ganze Zahl ausgibt.
System.out.println(int_ergebnis);
int_ergebnis = a + b / c; //ein Double wäre besser geeignet gewesen,weil es nur eine ganze Zahl ausgibt.
System.out.println(int_ergebnis);
int_ergebnis = a++;
System.out.println(int_ergebnis);
int_ergebnis = ++a;
System.out.println(int_ergebnis);
int_ergebnis = b + a--;
System.out.println(int_ergebnis);
int_ergebnis = b + --a;
System.out.println(int_ergebnis);
//int_ergebnis = a**; 
int_ergebnis = (int) Math.pow(a, 2);
System.out.println(int_ergebnis);
double_ergebnis = c / b;
System.out.println(double_ergebnis);//die Division zwischen den ganzen Zahlen c und b wird durchgeführt, und das Ergebnis ist ebenfalls eine ganze Zahl, bevor es der Variablen double_ergebnis zugewiesen wird
double_ergebnis = x + y * b;
System.out.println(double_ergebnis);
double_ergebnis = (x + y) * b;
System.out.println(double_ergebnis);
double_ergebnis = c + a / b; // Die Addition wird zwischen den ganzen Zahlen a und b durchgeführt
System.out.println(double_ergebnis);
double_ergebnis = (x * c - a);
System.out.println(double_ergebnis);

    }
}
