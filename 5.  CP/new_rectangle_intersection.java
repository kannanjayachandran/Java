import java.util.Scanner;

/*
    Imagine a universe far different to the one we know. One where where people can 
    walk through walls, where politicians don't lie, where the rules of physics itself 
    are bent on a daily basis. Imagine how strange it would be to land in that universe, 
    having to adjust to entirely new laws of reality, and having to integrate yourself 
    into sentient cultures far beyond human comprehension.
    Now, imagine that everything in this universe was suddenly destroyed in a cataclysmic 
    explosion, leaving nothing but two rectangles on an endless plane. These two rectangles 
    have their corners at integer co-ordinates (rational numbers having been destroyed). 
    Your task is to discover the total area of the plane which is covered by these rectangles.
    Beware! Some parts of the plane may be covered by both rectangles. If you merely add 
    the individual areas together, you are surely doomed to incorrect answers!
*/

public class new_rectangle_intersection {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int x1, x2, y1, y2;
        int x3, x4, y3, y4;

        x1 = in.nextInt();
        y1 = in.nextInt();
        x2 = in.nextInt();
        y2 = in.nextInt();
        x3 = in.nextInt();
        y3 = in.nextInt();
        x4 = in.nextInt();
        y4 = in.nextInt();

        in.close();

        int area1 = (x2 - x1) * (y2 - y1);
        int area2 = (x4 - x3) * (y4 - y3);

        int left = Math.max(x1, x3);
        int right = Math.min(x2, x4);

        int bottom = Math.max(y1, y3);
        int top = Math.min(y2, y4);

        int area_int = 0;
        if (left < right && bottom < top) {
            area_int = (right - left) * (top - bottom);
        }
        int ans = area1 + area2 - area_int;
        System.out.println(ans);
    }
}
