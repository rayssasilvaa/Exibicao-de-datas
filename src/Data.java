import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        data();
    }

    public static void data() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Escreva seu pais para ver a data de hoje: ");
            String pais = input.nextLine();

            Locale br = new Locale("pt", "BR");
            Locale eua = new Locale("en", "US");
            Locale chl = new Locale("es", "CL");
            Locale ita = new Locale("it", "IT");

            Calendar calendario = Calendar.getInstance();

            DateFormat pt = DateFormat.getDateInstance(DateFormat.FULL, br);
            DateFormat us = DateFormat.getDateInstance(DateFormat.FULL, eua);
            DateFormat cl = DateFormat.getDateInstance(DateFormat.FULL, chl);
            DateFormat it = DateFormat.getDateInstance(DateFormat.FULL, ita);

            switch (pais.toLowerCase()) {
                case "brasil":
                    System.out.println("Data no formato BR: " + pt.format(calendario.getTime()));
                    break;
                case "estados unidos":
                    System.out.println("Data no formato US: " + us.format(calendario.getTime()));
                    break;
                case "chile":
                    System.out.println("Data no formato CHL: " + cl.format(calendario.getTime()));
                    break;
                case "italia":
                    System.out.println("Data no formato ITA: " + it.format(calendario.getTime()));
                    break;

                default:
                    System.out.println("ERRO: País inválido!");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}