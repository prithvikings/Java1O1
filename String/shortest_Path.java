/*
Problem: Calculate the shortest path from the origin to a given point after a series of directions.
Directions:
- 'N' (North) increases the y-coordinate by 1.
- 'S' (South) decreases the y-coordinate by 1.
- 'E' (East) increases the x-coordinate by 1.
- 'W' (West) decreases the x-coordinate by 1.

The shortest path is the direct straight-line distance from the origin (0, 0) to the final point (x, y).
Formula: 
    Distance = sqrt(x^2 + y^2)
Where:
    - x = final x-coordinate after following all directions
    - y = final y-coordinate after following all directions
    - sqrt() is the square root function
*/

public class shortest_Path {

    // Method to calculate the shortest path using the given directions string
    public static float getshortestpath(String dir) {
        // Initialize the starting point (0, 0)
        int x = 0, y = 0;

        // Loop through each character in the direction string
        for (int i = 0; i < dir.length(); i++) {
            // North increases the y-coordinate by 1
            if (dir.charAt(i) == 'N') {
                y++;
            }
            // South decreases the y-coordinate by 1
            else if (dir.charAt(i) == 'S') {
                y--;
            }
            // East increases the x-coordinate by 1
            else if (dir.charAt(i) == 'E') {
                x++;
            }
            // West decreases the x-coordinate by 1
            else {
                x--;
            }
        }

        // Calculate the square of the x and y coordinates (Euclidean distance squared)
        int x2 = x * x;
        int y2 = y * y;

        // Use the Pythagorean theorem to calculate the straight-line distance (hypotenuse of the right triangle)
        // The formula for the shortest distance: sqrt(x^2 + y^2)
        float distance = (float) Math.sqrt(x2 + y2);
        
        // Return the shortest distance as a floating-point value
        return distance;
    }

    public static void main(String[] args) {
        // Sample direction string: "WNEENESENNN"
        String direction = "WNEENESENNN";
        
        // Print the shortest path result
        System.out.println("Shortest path is " + getshortestpath(direction));
    }
}
