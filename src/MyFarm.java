import java.util.ArrayList;

public class MyFarm {

    ArrayList<Plot> row;


    public static void main(String[] args) {
        MyFarm ToddsFarm = new MyFarm();
    }

    public MyFarm() {
        System.out.println("hello");
        row = new ArrayList<>();
        //fill my arraylist
        for (int i = 0; i < 10; i++) {
            row.add(new Plot());
        }
        // test our objects in the array by calling printPlotInfo
        for (int x = 0; x < row.size(); x++) {
            //row.get(x).printPlotInfo();
        }

        //HERE IS WHERE TO RUN PRACTICE PROBLEM METHODS
        //  totalPlants();
        //  printPlantNames();
        // printRowInfo();
        //  addLettuce();
        // addTulip();
        // tomatoLocations();
      // totalCarrots();
      //  averageNumberOfPlants();
        // numberOfCarrotPlots();
      //  numberOfEmptyPlots();
        everyOtherNeedsWater();
        greaterThan10();

    } //MyFarm() is the constructor method
    //PRACTICE PROBLEMS

    public void totalPlants() {
        // how many total plants are there in the row?
        System.out.println("******TOTAL PLANTS*****");
        int total = 0;
        for (int t = 0; t < row.size(); t++) {
            total = total + row.get(t).numberOfPlants;
        }
        System.out.println("Total plants: " + total);

    }


    public void printPlantNames() {
        System.out.println("****PLANT NAME****");
        // print the name of each plant in the row and its index
        for (int t = 0; t < row.size(); t++) {
            System.out.print(t + ": " + row.get(t).plantName + ", ");
        }
        System.out.println();


    }

    public void printRowInfo() {
        System.out.println("***PRINT ROW INFO****");
        for (int x = 0; x < row.size(); x++) {
            row.get(x).printPlotInfo();
        }
    }
    // use the printPlotInfo() method in Plot.java to print all information for each plot in the row


    public void addLettuce() {
        System.out.println("***ADD LETTUCE***");
        printPlantNames();
        row.add(new Plot());
        row.get(10).plantName = "lettuce";
        row.get(10).numberOfPlants = 42;
        row.get(10).needsWater = true;
        printPlantNames();
    }


    public void addTulip() {

        System.out.println("***ADD TULIP***");
        printPlantNames();
        row.add(new Plot());
        row.get(3).plantName = "tulip";
        row.get(3).numberOfPlants = 70;
        row.get(3).needsWater = false;
        printPlantNames();

        // at index 3, add a new tulip plot with 70 plants that do not need water

        // call printPlantNames() method before and after your addition to make sure it worked

    }


    public void tomatoLocations() {
        System.out.println("***TOMATO LOCATIONS***");
        printPlantNames();
        System.out.print("there are tomatoes in the following plot ");
        for (int i = 0; i < row.size(); i++) {
            if (row.get(i).plantName.equals("tomato")) {
                System.out.print(i + " , ");
            }

        }
    }

        public void totalCarrots () {
        System.out.println("***TOTAL NUMBER OF CARROTS****");
            int total=0;
            // how many total carrot plants are there?
            for (int i = 0; i < row.size(); i++) {
                if (row.get(i).plantName.equals("carrot")) {
                 total =total + row.get(i).numberOfPlants;
                }
            }

            System.out.println("The total number of carrots is " + total);
           
        }



        public void averageNumberOfPlants () {
            // what is the average number of plants across the whole row?
            System.out.println("****AVERAGE NUMBER OF PLANTS****");
            int total = 0;
            int avg = 0;
            for (int k = 0; k < row.size(); k++) {
                total = total + row.get(k).numberOfPlants;
            }
            avg = total/row.size();

            System.out.println("Average number of plants: " + avg);
        }


        public void numberOfCarrotPlots () {
            System.out.println("****TOTAL NUMBER OF CARROT PLOTS****");
            int total = 0;
            for (int i = 0; i < row.size(); i++) {
                if (row.get(i).plantName.equals("carrot")) {
                    total =total + 1;
                }
            }

            System.out.println("The number of carrot plots is " + total);

            // call printPlantNames() method to check
        }



        public void numberOfEmptyPlots () {
            // how many plots are empty
System.out.println("***NUMBER OF EMPTY PLOTS***");
            int total = 0;
            for (int i = 0; i < row.size(); i++) {
                if (row.get(i).plantName.equals("empty")) {
                    total =total + 1;
                }
            }

            System.out.println("The number of empty plots is " + total);

        }


        public void everyOtherNeedsWater () {
            // change the value of needsWater to be true for every other plot
System.out.println("****Every other needs water****");
for(int i = 0; i < row.size(); i=i+2){
row.get(i).needsWater = false;
}
        }


        public void greaterThan10 () {
            // how many plots have more than 10 plants in the plot?
            System.out.println("***Greater than 10 ***");

            int count =0;
            for (int i = 0; i < row.size(); i++) {
                if (row.get(i).numberOfPlants > 10) {
                    count++;
                }
            }

            System.out.println("The number of plots with more than 10 plants is " + count);

            // call printPlantNames() method to check
        }
        }


