package com.example;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.printf("\n* * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
            System.out.printf("* !Welcome to Yash Anand's Carbon Footprint Calculator! *\n");
            System.out.printf("* * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
            System.out.println("Press 1 to continue");
            sc.nextInt();

            System.out.println("\nThis calculator was created as the pre-existing Carbon Footprint calculators appeared to have a limitation with their criteria in their calculations.");
            System.out.println("Additionally, none of these calculators were OpenSource, which means that they would not allow the user to add/remove specific activities to/from the calculator's criteria");
            System.out.println("This lack of freedom to modify the criteria as per user's needs, would make the results incomplete and inaccurate.");
            System.out.println("This is how the creation of this Carbon Footprint Calculator came into being where we welcome all to make positive modifications to help make it even better.");
            System.out.println("\nPress 1 to continue");
            sc.nextInt();

            System.out.println("\n* * * * * * * * * * * * * * * * * * * * *");
            System.out.println("* Round 1: Domestic Energy Consumption! *");
            System.out.println("* * * * * * * * * * * * * * * * * * * * *");
            System.out.println("\nPress enter to continue");
            sc.nextInt();
   
            System.out.println("\nQ01. How much AIR CONDITIONER do you use kWh/month?\n(As a general rule, an AC of 1 ton uses 1 kWh, 2 ton uses 2 kWh, 3 ton uses 3 kWh of electricity per hour.\n");
            float ac = sc.nextFloat();
            System.out.printf("The C02e Emmision of your consumption is %f Kg/Month\n", ac * 0.241);
            
            System.out.println("\nQ02. How much in kWh/month is your ELECTRICITY consumption?");
            float electricity = sc.nextFloat();
            System.out.printf("Your C02e Emmision of your consumption is %f Kg/Month\n", electricity * 0.72);
   
            System.out.println("\nQ03. How much TV do you use kWh/month?\n(Most TVs use 0.08 to 0.4 kWh/Hour");
            float TV = sc.nextFloat();
            System.out.printf("The C02e Emmision of your consumption is %f Kg/Month", TV * 0.088);
   
            System.out.println("\nQ04. How much solar energy do you consume from SOLAR PANELS in kWh/Month");
            float solarenergy = sc.nextFloat();
            System.out.printf("The C02e Emmision of your consumption is %f Kg/Month", solarenergy * 0.041);
   
            System.out.println("\n* * * * * * * * * * * * * * * * *");
            System.out.println("* Round 2: Resource Consumption *");
            System.out.println("* * * * * * * * * * * * * * * * *");
            System.out.println("Press enter to continue\n");
            sc.nextInt();
            
            System.out.println("\nQ05. How much CNG do you consume Kg/month?");
            float CNG = sc.nextFloat();
            System.out.printf("The C02e Emmision of your consumption is %f Kg/Month", CNG * 0.144);
   
            System.out.println("\nQ06. How much PETROL do you consume Litres/month?");
            float petrol = sc.nextFloat();
            System.out.printf("The C02e Emmision of your consumption is %f Kg/Month", petrol * 2.297);
   
            System.out.println("\nQ07. How much LPG do you consume Kg/month?");
            float LPG = sc.nextFloat();
            System.out.printf("The C02e Emmision of your consumption is %f Kg/Month", LPG * 3.0);
   
            System.out.println("\nQ08. How much DIESEL do you consume Litres/month?");
            float diesel = sc.nextFloat();
            System.out.printf("The C02e Emmision of your consumption is %f Kg/Month", diesel * 2.6);
   
            System.out.println("\nQ09. How much LPG for your vehicle do you consume kg/month?");
            float LPGVEHC = sc.nextFloat();  
            System.out.printf("The C02e Emmision of your consumption is %f Kg/Month", LPGVEHC * 3.06);
   
            System.out.println("\nQ10. How much COAL do you consume Kg/Month?");
            float coal = sc.nextFloat();
            System.out.printf("The C02e Emmision of your consumption is %f Kg/Month", coal * 2.42);
   
            System.out.println("\nQ11. How much WATER do you use as general usage litres/month?\n(This includes drinking water)");
            float water = sc.nextFloat();
            System.out.printf("The C02e Emmision of your consumption is %f Kg/Month", water * 0.000298);
            
            System.out.println("\n* * * * * * * * * * * * * * *");
            System.out.println("* Round 3: Food Consumption *");
            System.out.println("* * * * * * * * * * * * * * *");
            System.out.println("Press enter to continue");
            sc.nextInt();
   
            System.out.println("\nQ12. How much BEEF do you consume Kg/Month?");
            float beef = sc.nextFloat();
            System.out.printf("The C02e Emmision of your consumption is %f Kg/Month", beef * 27);
   
            System.out.println("\nQ13. How much CHICKEN do you consume Kg/Month?");
            float chicken = sc.nextFloat();
            System.out.printf("The C02e Emmision of your consumption is %f Kg/Month\n", chicken * 9.87);
   
            System.out.println("\nQ14. How many EGGS do you consume Kg/Month?\n(1 eggs = 0.055Kg)\n");
            float egg = sc.nextFloat();
            System.out.printf("The C02e Emmision of your consumption is %f Kg/Month", egg * 4.8);
   
            System.out.println("\nQ15. How much FISH do you consume Kg/Month?");
            float fish = sc.nextFloat();
            System.out.printf("The C02e Emmision of your consumption is %f Kg/Month", fish * 1.34);
   
            System.out.println("\nQ16. How much MUTTON do you consume Kg/Month?");
            float mutton = sc.nextFloat();
            System.out.printf("The C02e Emmision of your consumption is %f Kg/Month", mutton * 39.72);
   
            System.out.println("\nQ17. How much PORK do you consume Kg/month?");
            float pork = sc.nextFloat();
            System.out.printf("The C02e Emmision of your consumption is %f Kg/Month", pork * 12.1);
   
            System.out.println("\nQ18. How much VEGETABLES do you consume kg/Month?");
            float veg = sc.nextFloat();
            System.out.printf("The C02e Emmision of your consumption is %f Kg/Month", veg * 2.0);
   
            System.out.println("\nQ19. How much MILK do you consume Litres/Month?");
            float milk = sc.nextFloat();
            System.out.printf("The C02e Emmision of your consumption is %f Kg/Month", milk * 1.39);
   
            System.out.println("\nQ20. How much FOOD do you WASTE kg/Month?");
            float foodwastage = sc.nextFloat();
            System.out.printf("The C02e Emmision of your consumption is %f Kg/Month", foodwastage * 2.5);
   
            System.out.println("\nQ21. How much COCA-COLA do you consume Litres/Month");
            float cocacola = sc.nextFloat();
            System.out.printf("The C02e Emmision of your consumption is %f Kg/Month", cocacola * 0.51);
   
            System.out.println("\nQ22. How much COOKING OIL do you consume Litres/Month?");
            float cookingoil = sc.nextFloat();
            System.out.printf("The C02e Emmision of your consumption is %f Kg/Month", cookingoil * 3.81);
   
            System.out.println("\n* * * * * * * * * * * *");
            System.out.println("* Round 4: Traveling! *");
            System.out.println("* * * * * * * * * * * *");
            System.out.println("Press enter to continue");
            sc.nextInt();
   
            System.out.println("\nQ23. How much do you travel by MOTORCYCLE km/Month?");
            float motorcycle = sc.nextFloat();
            System.out.printf("The C02e Emmision of your consumption is %f Kg/Month", motorcycle * 0.113);
   
            System.out.println("\nQ24. How much do you travel by AEROPLANE Km/Month?");
            float aeroplane = sc.nextFloat();
            System.out.printf("The C02e Emmision of your consumption is %f Kg/Month", aeroplane * 0.146);
   
            System.out.println("\nQ25. How much do you travel by BUS Km/Month?");
            float bus = sc.nextFloat();
            System.out.printf("The C02e Emmision of your consumption is %f Kg/Month", bus * 0.103);
   
            System.out.println("\nQ26. How much do you travel by TRAIN Km/Month?");
            float train = sc.nextFloat();
            System.out.printf("The C02e Emmision of your consumption is %f Kg/Month", train * 0.37);
   
            System.out.println("\nQ27. How much do you travel by AUTORICKSHAW Km/Month?");
            float autorickshaw = sc.nextFloat();
            System.out.printf("The C02e Emmision of your consumption is %f Kg/Month", autorickshaw*0.05);
   
            System.out.println("\nQ28. How much do you travel by CAR Km/Month?");
            float car = sc.nextFloat();
            System.out.printf("The C02e Emmision of your consumption is %f Kg/Month", car * 0.111);
   
            System.out.println("\nQ29. How much distance do you travel by BICYCLE in Km/Month?");
            float bicycle = sc.nextFloat();
            System.out.printf("The C02e Emmision of your consumption is %f Kg/Month", bicycle * 0.021);    
            
            double CarbonFootprint = (electricity * 0.72) + (water*0.000298) + (ac * 0.241) + (TV * 0.088) + (LPG*3.0) + (cocacola * 0.51) + (solarenergy * 0.041) + (CNG * 0.144) + (petrol * 2.297) + (diesel * 2.6) + (LPGVEHC*3.06) + (coal*2.52) + (beef*27) + (chicken * 9.87) + (egg * 4.8) + (fish * 1.34) + (mutton*39.72) + (pork*12.1) + (veg*2) + (milk*1.39) + (foodwastage*2.5) + (cookingoil * 3.81) + (motorcycle*0.113) + (aeroplane*0.146) + (bus*0.103) + (train*0.37) + (autorickshaw*0.05) + (car*0.111) + (bicycle*0.021);
   
            System.out.printf("\nYour carbon footprint is %f Kg per Month.", CarbonFootprint);
            System.out.println("Press ENTER To Compare Your Result With India's Per Capita Carbon Footprint");
            sc.nextInt();
            System.out.printf("For comparison, India's per capita carbon footprint in 2021 was 1900 Kg per YEAR & your carbon footprint per year was %f\n", CarbonFootprint * 12);
   
            System.out.println("\n\nThank You For Using Yash Anand's Carbon Footprint Calculator!");
            System.out.println("Press 1 to exit");
            sc.nextInt();
        }
    }
}
