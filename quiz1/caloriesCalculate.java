//name: Davina Tegar Putri Ervia
//NIM: 264107020083

package quiz1;

import java.util.Scanner;

public class caloriesCalculate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int runningDuration, swimmingDuration, cyclingDuration, bodyWeight, runningSpeed, swimmingSpeed, cyclingSpeed, allduration;
        double altitudeRunning, altitudeSwimming, altitudeCycling, totalCaloriesRunning, totalCaloriesSwim, totalCaloriesCycling, totalCaloriesAll, averageCaloriesPerMinute, precentageCalorieTarget;
        double runningCoefficients = 0.05;
        double swimmingCoefficients = 0.04;
        double cyclingCoefficient = 0.03;

//the calories burned for each activity
//running
        System.out.println("1.Counting Running Calories");

        System.out.print("input your duration (minutes)\t: ");
        runningDuration = input.nextInt();
        System.out.print("input your body weight (kg)\t: ");
        bodyWeight = input.nextInt();
        System.out.print("input your average speed (km/h)\t: ");
        runningSpeed = input.nextInt();
        System.out.print("input your altitude (m)\t\t: ");
        altitudeRunning = input.nextDouble();
//swimming
        System.out.println("2. Counting Swimming Calories");

        System.out.print("input duration (minutes)\t: ");
        swimmingDuration = input.nextInt();
        System.out.print("input avergae speed (km/h)\t: ");
        swimmingSpeed = input.nextInt();
        System.out.print("input altitude (m)\t\t: ");
        altitudeSwimming = input.nextDouble();
//cycling 
        System.out.println("3. Counting Cycling Calories");

        System.out.print("input duration (minutes)\t: ");
        cyclingDuration = input.nextInt();
        System.out.print("input avergae speed (km/h)\t: ");
        cyclingSpeed = input.nextInt();
        System.out.print("input altitude (m)\t\t: ");
        altitudeCycling = input.nextDouble();

        System.out.println("\n============ RESULT ============");

        totalCaloriesRunning = (runningDuration * runningCoefficients  * bodyWeight) + (runningSpeed * 0.5) + (altitudeRunning * 0.01);
        System.out.println("Total Burned Calories (Running)\t: " + totalCaloriesRunning);

        totalCaloriesSwim = (swimmingDuration * swimmingCoefficients * bodyWeight) + (swimmingCoefficients * 0.5) + (altitudeSwimming * 0.01);
        System.out.println("Total Burned Calories (Swimming): " + totalCaloriesSwim);

        totalCaloriesCycling = (cyclingDuration * cyclingCoefficient * bodyWeight) + (cyclingSpeed * 0.5) + (altitudeCycling * 0.1);
        System.out.println("Total Burned Calories (Cycling)\t: " + totalCaloriesCycling);
//the total calories burned from all activities
        totalCaloriesAll = totalCaloriesRunning + totalCaloriesSwim + totalCaloriesCycling;
        System.out.println("Total All Burned Calories\t: " + totalCaloriesAll);

//the average calories burned per minute
        averageCaloriesPerMinute = (totalCaloriesAll / 3);
        allduration = (runningDuration + swimmingDuration + cyclingDuration);
        System.out.println(String.format("\nAverage Calories %s / %s minutes ", averageCaloriesPerMinute, allduration ));

//the precentage of the athlete's daily calorie target achived
        precentageCalorieTarget = (totalCaloriesAll / 2500) * 100;
        System.out.println(String.format("\npercentage of athlet's daily calorie target achived %s percent", precentageCalorieTarget ));
        
    }
}
