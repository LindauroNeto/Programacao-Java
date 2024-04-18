public class Exercism {
    
    static Exercism lasagna = new Exercism();
        public int expectedMinutesInOven(){
            return 40;
        }

        public int remainingMinutesInOven(int actualMinutes){
            return expectedMinutesInOven() - actualMinutes;
        }

        public int preparationTimeInMinutes(int numOfLayers){
            return numOfLayers * 2;
        }

        public int totalTimeInMinutes(int actualMinutes, int numOfLayers){
            return preparationTimeInMinutes(actualMinutes) + remainingMinutesInOven(numOfLayers);
        }

        public static void main(String[] args) {
            System.out.println(lasagna.expectedMinutesInOven());
            System.out.println(lasagna.remainingMinutesInOven(30));
            System.out.println(lasagna.preparationTimeInMinutes(2));
            System.out.println(lasagna.totalTimeInMinutes(3, 20));
        }
    
    
    
}
