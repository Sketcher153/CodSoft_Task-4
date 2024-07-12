/*
    Task4 :- 
    Currency Converter. 
*/

import java.util.Scanner;

public class Task4 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's Welcome to the Currency Converter... "); 
        System.out.println("1. Convert Indian Rupee to US Dollar");
        System.out.println("2. Convert US Dollar to Indian Rupee");
        System.out.println("3. Convert Indian Rupee to EURO");
        System.out.println("4. Convert EURO to Indian Rupee");
        System.out.println("5. Convert Indian Rupee to Japanese Yen");
        System.out.println("6. Convert Japanese Yen to Indian Rupee");
        System.out.println("7. Convert Indian Rupee to Singapore Dollar");
        System.out.println("8. Convert Singapore Dollar to Indian Rupee");
        System.out.println("9. Convert Indian Rupee to Kuwaiti Dinar");
        System.out.println("10. Convert Kuwaiti Dinar to Indian Rupee"); 

        // Getting the choice for Conversion of Currency. 

        System.out.println("Enter your choice : ");
        int choice = sc.nextInt();
        switch (choice) 
        {
            case 1:
                System.out.println("Enter your Curreny in Indian Rupee : ");
                double indian_rupee = sc.nextDouble();
                double us_dollar = indianToUsd(indian_rupee);
                System.out.println("Indian Rupee : " + indian_rupee + " - US Dollar : " + us_dollar);
                break;
            case 2:
                System.out.println("Enter your Curreny in US Dollar : ");
                double usd = sc.nextDouble();
                double rupee = usdToIndian(usd);
                System.out.println("US Dollar : " + usd + " - Indian Rupee : " + rupee);
                break;        
            case 3:
                System.out.println("Enter your Curreny in Indian Rupee : ");
                double ind_rupee = sc.nextDouble();
                double euro = indianToEuro(ind_rupee);
                System.out.println("Indian Rupee : " + ind_rupee + " - EURO : " + euro);
                break;
            case 4:
                System.out.println("Enter your Curreny in EURO : ");
                double EURO = sc.nextDouble();
                double indianRupee = euroToIndian(EURO);
                System.out.println("EURO : " + EURO + " - Indian Rupee : " + indianRupee);
                break;
            case 5:
                System.out.println("Enter your Curreny in Indian Rupee : ");
                double indRupee = sc.nextDouble();
                double yen = indianToJapanese(indRupee);
                System.out.println("Indian Rupee : " + indRupee + " - Japanese Yen : " + yen);
                break;
            case 6:
                System.out.println("Enter your Curreny in Chinese Yen : ");
                double YEN = sc.nextDouble();
                double IndianRupee = japaneseToIndian(YEN);
                System.out.println("Japanese YEN : " + YEN + " - Indian Rupee : " + IndianRupee);
                break;
            case 7:
                System.out.println("Enter your Curreny in Indian Rupee : ");
                double IndRup = sc.nextDouble();
                double singaporeDollar = indianToSingapore(IndRup);
                System.out.println("Indian Rupee : " + IndRup + " - Singapore Dollar : " + singaporeDollar);
                break;
            case 8:
                System.out.println("Enter your Curreny in Singapore Dollar : ");
                double SingaporeDollar = sc.nextDouble();
                double indian_Rupee = singaporeToIndian(SingaporeDollar);
                System.out.println("Singapore Dollar : " + SingaporeDollar + " - Indian Rupee : " + indian_Rupee);
                break;   
            case 9:
                System.out.println("Enter your Curreny in Indian Rupee : ");
                double _ind_rupee_ = sc.nextDouble();
                double dinar = indianToKuwaiti(_ind_rupee_);
                System.out.println("Indian Rupee : " + _ind_rupee_ + " - Kuwaiti Dinar : " + dinar);
                break;
            case 10:
                System.out.println("Enter your Curreny in Kuwaiti Dinar : ");
                double DINAR = sc.nextDouble();
                double indRup = kuwaitiToIndian(DINAR);
                System.out.println("Kuwaiti Dinar : " + DINAR + " - Indian Rupee : " + indRup);
                break;  
            default:
                System.out.println("Enter the valid choice from 1 to 10!...");
            sc.close();
        }
    }

    // Conversion of Indian Rupee to United States Dollar. 

    public static double indianToUsd(double IndianRupee)
    {
        return (IndianRupee * 0.012);
    }

    // Conversion of United States Dollar to Indian Rupee.

    public static double usdToIndian(double USD)
    {
        return (USD * 83.51);
    }

    // Conversion of Indian Rupee to EURO. 

    public static double indianToEuro(double IndianRupee)
    {
        return (IndianRupee * 0.011);
    }

    // Conversion of EURO to Indian Rupee. 

    public static double euroToIndian(double Euro)
    {
        return (Euro * 90.49);
    }

    // Conversion of Indian Rupee to Japanese Yen. 

    public static double indianToJapanese(double IndianRupee)
    {
        return (IndianRupee * 1.94);
    }

    // Conversion of Japanese Yen to Indian Rupee. 

    public static double japaneseToIndian(double JapaneseYen)
    {
        return (JapaneseYen * 0.52);
    }

    // Conversion of Indian Rupee to Singapore Dollar. 

    public static double indianToSingapore(double IndianRupee)
    {
        return (IndianRupee * 0.016);
    }

    // Conversion of Singapore Dollar to Indian Rupee. 

    public static double singaporeToIndian(double SingaporeDollar)
    {
        return (SingaporeDollar * 61.95);
    }

    // Conversion of Indian Rupee to Kuwaiti Dinar. 

    public static double indianToKuwaiti(double IndianRupee)
    {
        return (IndianRupee * 0.0037);
    }

    // Conversion of Kuwaiti Dinar to Indian Rupee. 

    public static double kuwaitiToIndian(double KuwaitiDinar)
    {
        return (KuwaitiDinar * 272.88);
    }
}
