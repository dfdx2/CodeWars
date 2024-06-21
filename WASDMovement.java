/* 7KYU CodeWars WASD Movement

Complete the method public float[] getVector(boolean[] wasd) to calculate 
the players movement vector resulting from user input to the WASD keys.

The method accepts an array of 4 boolean values representing the pressed 
state of the W, A, S and D keys where true indicates the key is pressed. 
Any number of keys may be pressed at a time.

The method should return a float array of size 2 representing the x any 
y components of the resulting movement vector where W and S map to positive 
and negative y respectively and A and D map to negative and positive x 
respectively.

The players should always move at speed 1.

*/

public class GameInput {
  public float[] getVector(boolean[] wasd) {
    float[] result = new float[2];
    result[0] = wasd[3] && !wasd[1] ? 1 : !wasd[3] && wasd[1] ? -1 : 0;
    result[1] = wasd[0] && !wasd[2] ? 1 : !wasd[0] && wasd[2] ? -1 : 0;
    if (result[0] != 0 && result[1] != 0) {
      result[0] = result[0] * .70710677f;
      result[1] = result[1] * .70710677f;
    }
    return result;
  }
}
/*-------------------------------------------------------------------------
public class GameInput {
  public static float[] getVector(boolean[] wasd) {
    final float
      x = (wasd[3] ? 1 : 0) - (wasd[1] ? 1 : 0),
      y = (wasd[0] ? 1 : 0) - (wasd[2] ? 1 : 0),
      m = x == 0 || y == 0 ? 1 : (float)(Math.sqrt(2) / 2);
    return new float[]{x * m, y * m};
  }
}
---------------------------------------------------------------------------
public class GameInput 
{
    private float oneOverSqrt2 = (float)(1/Math.sqrt(2));

    public float[] getVector(boolean[] wasd)
    {
        float x = 0;
        float y = 0;
        if (wasd[0]) y += 1f;
        if (wasd[1]) x -= 1f;
        if (wasd[2]) y -= 1f;
        if (wasd[3]) x += 1f;
        if (x != 0 && y != 0) {
          x *= oneOverSqrt2;
          y *= oneOverSqrt2;
        }
        return new float[] { x, y };
    }
}
---------------------------------------------------------------------------
public class GameInput 
{

   public float[] getVector(boolean[] b  ){ 
       float res [] = new float[2];    
       for (int i=0;i<4; i++){  
            if(b[i]) res[1-(i%2)]+=(i==1||i==2?-1:1);
       } 
      if(res[0]*res[1]==0)return res; 
      return new float []{0.70710677f*res[0], 0.70710677f*res[1]};
     }
}
---------------------------------------------------------------------------
public class GameInput {
        public float[] getVector(boolean[] wasd) {
            int x = (wasd[1] ? -1 : 0) + (wasd[3] ? 1 : 0);
            int y = (wasd[0] ? 1 : 0) + (wasd[2] ? -1 : 0);
            float r = (float) (1 / Math.sqrt(2));
            switch ("" + x + " " + y) {
                case "0 1": return new float[]{0, 1f};
                case "1 0": return new float[]{1f, 0};
                case "1 1": return new float[]{r, r};
                case "-1 -1": return new float[]{-r, -r};
                case "-1 0": return new float[]{-1f, 0};
                case "0 -1": return new float[]{0, -1f};
                case "-1 1": return new float[]{-r, r};
                case "1 -1": return new float[]{r, -r};
                default: return new float[]{0, 0};
            }
        }
}
---------------------------------------------------------------------------
public class GameInput {

    final float coef = (float) Math.sqrt(1.0 / 2);
    
    public float[] getVector(boolean[] wasd) {
        float x = 0;
        float y = 0;
        x = (wasd[3] ? 1 : 0) - (wasd[1] ? 1 : 0);
        y = (wasd[0] ? 1 : 0) - (wasd[2] ? 1 : 0);

        if (x == 0 || y == 0)
            return new float[]{x, y};

        return new float[]{x * coef, y * coef};
    }
}
---------------------------------------------------------------------------
class GameInput {
  float[] getVector(boolean[] wasd) {
    int x = wasd[3] && !wasd[1] ? 1 : !wasd[3] && wasd[1] ? -1 : 0;
    int y = wasd[0] && !wasd[2] ? 1 : !wasd[0] && wasd[2] ? -1 : 0;
    return x != 0 && y != 0 ? new float[] {x * .70710677f, y * .70710677f} : new float[] {x, y};
  }
}
---------------------------------------------------------------------------
public class GameInput 
{

   public float[] getVector(boolean[] wasd) {
      
      float[] vectors = new float[2];
      
      //if W pressed, increase X by 1
      if (wasd[0]) {
        vectors[1] += 1f;
      } 
       //if A pressed, decrease Y by 1
      if (wasd[1]) {
        vectors[0] -= 1f;
      }  
       //if S pressed, decrease X by 1
      if (wasd[2]) {
        vectors[1] -= 1f;
      }
       //if D pressed, increase Y by 1
      if (wasd[3]) {
        vectors[0] += 1f;
      }
      
      //if moving on both axes, divide by square root of 2
      if (vectors[0] != 0f && vectors[1] != 0f) {
        vectors[0] /= Math.sqrt(2);
        vectors[1] /= Math.sqrt(2);
      }
      
      return vectors; 
    
   }
}
---------------------------------------------------------------------------
public class GameInput 
{

   public float[] getVector(boolean[] wasd)
   {
     StringBuilder direction = new StringBuilder();
     if(wasd[0] == true && wasd[2] == false) direction.append('W');
     if(wasd[1] == true && wasd[3] == false) direction.append('A');
     if(wasd[2] == true && wasd[0] == false) direction.append('S');
     if(wasd[3] == true && wasd[1] == false) direction.append('D');
     
     float oneOverSqrt2 = (float)(1/Math.sqrt(2));
     switch(direction.toString()){
       case "W": return new float[]{0, 1};
       case "A": return new float[]{-1, 0};
       case "S": return new float[]{0, -1};
       case "D": return new float[]{1, 0};
       case "WA": return new float[]{-oneOverSqrt2, oneOverSqrt2};
       case "AS": return new float[]{-oneOverSqrt2, -oneOverSqrt2};
       case "SD": return new float[]{oneOverSqrt2, -oneOverSqrt2};
       case "WD": return new float[]{oneOverSqrt2, oneOverSqrt2};
       default: return new float[]{0, 0};
     }
   }
}

*/