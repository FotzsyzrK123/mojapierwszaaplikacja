int wielkosc = 27;
String imie = ”Korcia”;
Pies mojPies = new Pies(imie, wielkosc);
x = wielkosc - 5;
if (x < 14) mojPies.szczekaj(8);
while (x > 5) {
mojPies.zabawa();
}
int[] listaNum = {2, 4, 6, 8};
System.out.print(”Witamy”);
System.out.print(”Pies: ” + imie);
String liczba = ”8”;
int z = Integer.parseInt(liczba);
try {
czytajPlik(”mojPlik.txt”);
}
catch (FileNotFoundException ex) {
System.out.print(”Nie znaleziono pliku.”);
}