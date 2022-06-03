/*
    A local musician is putting on a concert to raise money for charity. 
    The concert will be held in the town hall, a spacious venue perfectly 
    suited for such an event. There are r rows of seats, each containing exactly s seats. 
    At most one person can sit on a single seat (that is, two people cannot share a seat).
    There is a problem - the concert may have been overbooked! This means that if everybody 
    who bought tickets comes to the concert, some of them might have to stand. Now the musician 
    has aproached you, not for advice, but for the answer to the following question: if everybody 
    who bought tickets arrives and tries to find a seat, how many people will end up sitting, 
    and how many people will be standing?

*/

import java.util.Scanner;

public class ticket {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int r, s, total_seats, ticket_booked;
        System.out.println("Enter r and s: ");
        r = in.nextInt();
        s = in.nextInt();
        System.out.println("Enter Tickets booked: ");
        ticket_booked = in.nextInt();
        in.close();

        total_seats = r * s;

        if (ticket_booked > total_seats) {
            System.out.println("No: of people sitting is " + total_seats + " ," + "No: of people standing is "
                    + (ticket_booked - total_seats));

        } else {
            System.out.println(ticket_booked + " " + "0");
        }

    }
}
