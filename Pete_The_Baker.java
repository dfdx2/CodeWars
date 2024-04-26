/* 5KYU CodeWars Pete, The Baker

Pete likes to bake some cakes. He has some recipes and ingredients. 
Unfortunately he is not good in maths. Can you help him to find out, 
how many cakes he could bake considering his recipes?

Write a function cakes(), which takes the recipe (object) and the 
available ingredients (also an object) and returns the maximum number 
of cakes Pete can bake (integer). For simplicity there are no units 
for the amounts (e.g. 1 lb of flour or 200 g of sugar are simply 1 or 200). 
Ingredients that are not present in the objects, can be considered as 0.

Examples:

// must return 2
cakes({flour: 500, sugar: 200, eggs: 1}, {flour: 1200, sugar: 1200, eggs: 5, milk: 200}); 

// must return 0
cakes({apples: 3, flour: 300, sugar: 150, milk: 100, oil: 100}, {sugar: 500, flour: 2000, milk: 2000}); 

*/

import java.util.Map;
public class PeteBaker {
  public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
    return recipe.entrySet().stream().mapToInt(e -> available.getOrDefault(e.getKey(), 0) / e.getValue()).min().orElse(0);
  }
}
/*--------------------------------------------------------------------------------
import java.util.Map;

public class PeteBaker {
  public static int cakes(Map<String, Integer> requirements, Map<String, Integer> availableResources) {
      int maxSets = Integer.MAX_VALUE;
      for (String key: requirements.keySet()) {
          if (!availableResources.containsKey(key)) return 0;

          maxSets = Integer.min(maxSets, availableResources.get(key) / requirements.get(key));
      }

      return maxSets;
  }
}
----------------------------------------------------------------------------------
import java.util.Map;

interface PeteBaker {
  static int cakes(Map<String, Integer> recipe, Map<String, Integer> ings) {
    return recipe.entrySet().stream().mapToInt(e -> ings.getOrDefault(e.getKey(), 0) / e.getValue()).min().orElse(0);
  }
}
----------------------------------------------------------------------------------
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;



public class PeteBaker {
  public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
    List<Integer> possibleCakesPerProduct = new ArrayList(recipe.size());
    
    for (Map.Entry<String, Integer> recipeProduct : recipe.entrySet()) {
      if (!available.containsKey(recipeProduct.getKey())) {
        return 0;
      }
      
      if (recipeProduct.getValue() > available.get(recipeProduct.getKey())) {
        return 0;
      } else {
        int cakesPerIngredient = available.get(recipeProduct.getKey()) / recipeProduct.getValue();
        possibleCakesPerProduct.add(cakesPerIngredient);        
      }
    }
    
    return Collections.min(possibleCakesPerProduct);
  }
}
----------------------------------------------------------------------------------
import java.util.Map;

public class PeteBaker {
  
    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
        Integer result = null;
        for (Map.Entry<String, Integer> ingredient : recipe.entrySet()) {
            String name = ingredient.getKey();
            Integer expAmount = ingredient.getValue();
            Integer actAmount = available.get(name);
            if (actAmount != null) {
                int number = actAmount / expAmount;
                if (result == null || number < result) {
                    result = number;
                }
            } else {
                return 0;
            }
        }
        return result;
    }
  
}
-----------------------------------------------------------------------------------
import java.util.*;

public class PeteBaker {
  public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
        try {
            return recipe.keySet().stream()
                    .mapToInt(ingredient -> available.get(ingredient) / recipe.get(ingredient))
                    .min()
                    .getAsInt();
        } catch (Exception e) {
            return 0;
        }
  }
}
------------------------------------------------------------------------------------
import java.util.*;

public class PeteBaker {
public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {

    return recipe.entrySet().stream().map(x -> available.getOrDefault(x.getKey(), 0) / x.getValue()).mapToInt(x -> x).summaryStatistics().getMin();
}
}
-----------------------------------------------------------------------------------
import java.util.Map;

public class PeteBaker {
    private static final int DEFAULT = 0;

    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
        return recipe.entrySet()
                .stream()
                .mapToInt(entry -> available.getOrDefault(entry.getKey(), DEFAULT) / entry.getValue())
                .min()
                .orElse(0);
    }
}
------------------------------------------------------------------------------
import java.util.Map;

public class PeteBaker {
  public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
        int maxCakes = Integer.MAX_VALUE;
        for (String ingredient : recipe.keySet()) {
            if (!available.containsKey(ingredient)) {
                return 0; // Missing ingredient, cannot bake any cakes
            }
            int recipeAmount = recipe.get(ingredient);
            int availableAmount = available.get(ingredient);
            int cakesFromIngredient = availableAmount / recipeAmount;
            maxCakes = Math.min(maxCakes, cakesFromIngredient);
        }
        return maxCakes;
  }
}
*/