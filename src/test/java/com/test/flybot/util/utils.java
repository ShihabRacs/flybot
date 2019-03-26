package com.test.flybot.util;

import org.iban4j.CountryCode;
import org.iban4j.Iban;

public class utils {

    public static String generateBankAccountNumber(String Country){

            Iban iban = null;

        if (Country.equals("Austria")){
             iban = Iban.random(CountryCode.AT);


        }
        else if (Country.equals("Germany")){
             iban = Iban.random(CountryCode.DE);
//
        }

        else if (Country.equals("Switzerland")){
             iban = Iban.random(CountryCode.CH);

        }
        else if (Country.equals("Finland")){
             iban = Iban.random(CountryCode.FI);

        }
        else if (Country.equals("Sweden")){
             iban = Iban.random(CountryCode.SE);

        }
        else if (Country.equals("Norway")){
             iban = Iban.random(CountryCode.NO);
        }
        else if (Country.equals("Denmark")){
             iban = Iban.random(CountryCode.DK);

        }
        else iban = Iban.random();
        return iban.toString();
    }


    public static void main (String []args){

        System.out.println(generateBankAccountNumber("Austria"));
        System.out.println(generateBankAccountNumber("Germany"));
        System.out.println(generateBankAccountNumber("Switzerland"));
        System.out.println(generateBankAccountNumber("Finland"));
        System.out.println(generateBankAccountNumber("Sweden"));
        System.out.println(generateBankAccountNumber("Norway"));
        System.out.println(generateBankAccountNumber("Denmark"));

    }


}
