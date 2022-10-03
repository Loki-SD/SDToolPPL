package ph.newtoolppl.toolppl;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ToolPplApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("Hello World");

        int n, i, j, space = 0;
       /* System.out.print("Enter the number of rows: ");*/
        n = 5;
        space = n - 1;
        for (j = 1; j <= n; j++) {

            for (i = 1; i <= space; i++) {

                System.out.print(" ");
            }

            space--;

            for (i = 1; i <= 2 * j - 1; i++) {

                System.out.print("*");

            }

            System.out.println("");
        }

        space = 1;

        for (j = 1; j <= n - 1; j++) {

            for (i = 1; i <= space; i++) {

                System.out.print(" ");

            }

            space++;

            for (i = 1; i <= 2 * (n - j) - 1; i++) {

                System.out.print("*");

            }

            System.out.println("");
        }
    }

}
