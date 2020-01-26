public class Completion {
    public static void main(String[] args) {
        System.out.println("  Uzupełnianka \n" + "\n" + "- Klasa to zbiór cech opisujący dany przedmiot np. kolor, " +
                "producent.");
        System.out.println("- Obiekt to konkretna informacja dotycząca cech w klasie np. kolor czarny, producent - Dell.");
        System.out.println("- Zmienna to elementy, które pozwalają na przechowywanie danych w pamięci komputera." +
                "\n- Każda zmienna musi mieć określony typ, np. int, albo String.\n- Jeżeli deklarację zmiennej " +
                "poprzedzimy słowem final, to nie dopuścimy do modyfikacji danych.\n- W klasie mogą się znajdować " +
                "konstruktory, metody i obiekty.\n- Konstruktory są są wywoływane przez operator new i służą do " +
                "tworzenia nowych obiektów.\n- Jeśli w klasie zdefiniowano chociaż jeden konstruktor własny to " +
                "kompilator nie wygeneruje dla nas konstruktora domyślnego.\n- Zakładając, że istnieje klasa Car," +
                " to przy zapisie: \n  Car car1 = new Car(„BMW”, „M5”, 2007, 2.6)  \n" +
                "  Car car2 = car1 \n  car1 i car2 to dwie referencje wskazujące na ten sam obiekt. ");
    }
}
