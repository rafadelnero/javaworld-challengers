package com.javaworld.javachallengers.stringcomparison.challenge;

public class ComparisonStringChallenge {

    public static void main(String... doYourBest) {
        String result = "";
        result += " powerfulCode ".trim() == "powerfulCode"
                ? "0" : "1";

        result += "flexibleCode" == "flexibleCode" ? "2" : "3";

        result += new String("doYourBest")
                == new String("doYourBest") ? "4" : "5";

        result += new String("noBugsProject")
                .equals("noBugsProject") ? "6" : "7";

        result += new String("breakYourLimits").intern()
                == new String("breakYourLimits").intern() ? "8" : "9";

        System.out.println(result);
    }

}
