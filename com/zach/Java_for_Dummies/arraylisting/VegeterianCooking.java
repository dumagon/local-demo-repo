import java.util.List;
import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.OptionalDouble;

public class VegeterianCooking{

    public static void main(String[] args){

        List<String> ingredientsForPizza = new ArrayList<>();
        ingredientsForPizza.add("dough");
        ingredientsForPizza.add("meat");
        ingredientsForPizza.add("tomatoes");

        List<String> ingredientsForJollof =new ArrayList<>();
        ingredientsForJollof.add("spaggetti");
        ingredientsForJollof.add("tomatoes");
        ingredientsForJollof.add("chili pepper");

        List<String> ingredientsForFalafel = new ArrayList<>();
        ingredientsForFalafel.add("nut");
        ingredientsForFalafel.add("oil");
        ingredientsForFalafel.add("lentil");

        List<String> ingredientsForSeaWeedSoup =new ArrayList<>();
        ingredientsForSeaWeedSoup.add("seaweed");
        ingredientsForSeaWeedSoup.add("water");

        List<Recipe> recipes = new ArrayList<>();

        Recipe pizza = new Recipe("pizza",ingredientsForPizza,30);
        Recipe jollof = new Recipe("jollof",ingredientsForJollof,45);
        Recipe falafel = new Recipe("falafel",ingredientsForFalafel,15);
        Recipe seaWeedSoup = new Recipe("seaweed soup",ingredientsForSeaWeedSoup,35);

        recipes.add(pizza);
        recipes.add(jollof);
        recipes.add(falafel);
        recipes.add(seaWeedSoup);


                // long count=recipes.stream()
               //                  .filter((recipe)->recipe.isVegeterian())
              //                  .count();
                         
            // int averageCookingTime =recipes.stream()
           //                                .filter((recipe)->recipe.isVegeterian())
          //                                .map((recipe)-> recipe.getCookingTimeInMin())
         //                                .reduce(0,(mins1,mins2)->(mins1+mins2));

        // System.out.println(averageCookingTime/count);  




        //    OptionalDouble avg=  recipes.stream().filter((recipe)->recipe.isVegeterian())
       //                     .flatMapToInt((recipe)-> IntStream.of(recipe.cookingTimeInMin))   // a more elegant way to find the average time imo 
      //                     .average();  


     
     
      OptionalDouble avg=  recipes.stream().filter((recipe)->recipe.isVegeterian())
                        .mapToInt((recipe)->recipe.cookingTimeInMin)                     // a shorter way to find the average time 
                         .average();


      System.out.println(Double.valueOf(avg.getAsDouble()).intValue());   


    }

}

    class Recipe {
     
     List<String> ingredients;
     String name;
     //private int cookingTimeInMin;
     int cookingTimeInMin;

     public Recipe(String name,List<String> ingredients,int min){
         this.name=name;
         this.ingredients=ingredients;
         this.cookingTimeInMin=min;
     }

     public boolean isVegeterian(){
        
        boolean isVeg =true;

        for(String ingredient : ingredients){
            if(ingredient.equals("meat")) isVeg=false;
        }
              
              return isVeg;

     }

     public int getCookingTimeInMin(){
         return this.cookingTimeInMin;
     }

    }
