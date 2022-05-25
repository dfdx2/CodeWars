class GrasshopperPersonalizedMessage {
    static String greet(String name, String owner) {
        // Add code here
      if (owner.equalsIgnoreCase(name)) {
        return ("Hello boss");
      }
      else {
        return ("Hello guest");
      }
    }
}