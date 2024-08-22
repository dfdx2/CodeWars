public class HumanYearsCatYearsDogYears {

  public static int[] humanYearsCatYearsDogYears(final int humanYears) {
    int dog = 0;
    int cat = 0;

    if(humanYears >= 1){
      dog += 15;
      cat += 15;
    }
    if(humanYears >= 2){
      dog += 9;
      cat += 9;
    }
    if(humanYears >= 3){
      int remainingYears = humanYears - 2;
      dog += 5 * (remainingYears);
      cat += 4 * (remainingYears);
    }
    
    return new int[]{humanYears,cat,dog};
  }

}