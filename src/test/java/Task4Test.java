import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import ua.opnu.java.inheritance.bill.Employee;
import ua.opnu.java.inheritance.bill.Item;
import ua.opnu.java.inheritance.bill.DiscountBill2;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task4Test {

    @Nested
    @DisplayName("Tests for the fourth task")
    class Test {
        @org.junit.jupiter.api.Test
        @DisplayName("Test clerk for constructor 1")
        void test1() {
            DiscountBill2 bill = new DiscountBill2(new Employee("clerk-1"), true);
            String expected = "clerk-1";
            assertEquals(expected, bill.getClerk().getName());
        }

        @org.junit.jupiter.api.Test
        @DisplayName("Test clerk for constructor 2")
        void test2() {
            DiscountBill2 bill = new DiscountBill2(new Employee("clerk-2"), false);
            String expected = "clerk-2";
            assertEquals(expected, bill.getClerk().getName());
        }

        @org.junit.jupiter.api.Test
        @DisplayName("Test getTotal() 1")
        void test3() {
            boolean preferred = false;
            DiscountBill2 bill = new DiscountBill2(new Employee("clerk-1"), preferred);
            bill.add(new Item("candy bar", 1.35));

            double expected = 1.35;
            assertEquals(expected, bill.getTotal());
        }

        @org.junit.jupiter.api.Test
        @DisplayName("Test getTotal() 2")
        void test4() {
            boolean preferred = true;
            DiscountBill2 bill = new DiscountBill2(new Employee("clerk-1"), preferred);
            bill.add(new Item("candy bar", 1.35));

            double expected = 1.10;
            assertEquals(expected, bill.getTotal());
        }

        @org.junit.jupiter.api.Test
        @DisplayName("Test getTotal() 3")
        void test5() {
            boolean preferred = false;
            DiscountBill2 bill = new DiscountBill2(new Employee("clerk-1"), preferred);
            bill.add(new Item("newspaper", 0.99));

            double expected = 0.99;
            assertEquals(expected, bill.getTotal());
        }

        @org.junit.jupiter.api.Test
        @DisplayName("Test getTotal() 4")
        void test6() {
            boolean preferred = true;
            DiscountBill2 bill = new DiscountBill2(new Employee("clerk-1"), preferred);
            bill.add(new Item("newspaper", 0.99));

            double expected = 0.99;
            assertEquals(expected, bill.getTotal());
        }

    
        @org.junit.jupiter.api.Test
        @DisplayName("Test getTotal() 4")
        void test7() {
            boolean preferred = false;
            DiscountBill2 bill = new DiscountBill2(new Employee("clerk-1"), preferred);
            bill.add(new Item("candy bar", 1.35));
            bill.add(new Item("toy car", 3.25));
            bill.add(new Item("apple", 0.30));
            bill.add(new Item("orange", 0.30));
            bill.add(new Item("newspaper", 0.99));

            double expected = 6.19;
            assertEquals(expected, bill.getTotal());
        }

  
        @org.junit.jupiter.api.Test
        @DisplayName("Test getTotal() 5")
        void test8() {
            boolean preferred = true;
            DiscountBill2 bill = new DiscountBill2(new Employee("clerk-1"), preferred);
            bill.add(new Item("candy bar", 1.35));
            bill.add(new Item("toy car", 3.25));
            bill.add(new Item("apple", 0.30));
            bill.add(new Item("orange", 0.30));
            bill.add(new Item("newspaper", 0.99));

            double expected = 5.34;
            assertEquals(expected, bill.getTotal());
        }

        @org.junit.jupiter.api.Test
        @DisplayName("Test getDiscountCount() 1")
        void test9() {
            boolean preferred = false;
            DiscountBill2 bill = new DiscountBill2(new Employee("clerk-1"), preferred);
            bill.add(new Item("antique table", 125.00));

            int expected = 0;
            assertEquals(expected, bill.getDiscountCount());
        }

        @org.junit.jupiter.api.Test
        @DisplayName("Test getDiscountCount() 2")
        void test10() {
            boolean preferred = true;
            DiscountBill2 bill = new DiscountBill2(new Employee("clerk-1"), preferred);
            bill.add(new Item("antique table", 125.00));

            int expected = 1;
            assertEquals(expected, bill.getDiscountCount());
        }

        @org.junit.jupiter.api.Test
        @DisplayName("Test getDiscountCount() 3")
        void test11() {
            boolean preferred = false;
            DiscountBill2 bill = new DiscountBill2(new Employee("clerk-1"), preferred);
            bill.add(new Item("gift card", 75.00));

            int expected = 0;
            assertEquals(expected, bill.getDiscountCount());
        }

        @org.junit.jupiter.api.Test
        @DisplayName("Test getDiscountCount() 4")
        void test12() {
            boolean preferred = true;
            DiscountBill2 bill = new DiscountBill2(new Employee("clerk-1"), preferred);
            bill.add(new Item("gift card", 75.00)); // <-- no discount!

            int expected = 0;
            assertEquals(expected, bill.getDiscountCount());
        }

        @org.junit.jupiter.api.Test
        @DisplayName("Test getDiscountCount() 5")
        void test13() {
            boolean preferred = false;
            DiscountBill2 bill = new DiscountBill2(new Employee("clerk-1"), preferred);
            bill.add(new Item("notebook", 3.00));
            bill.add(new Item("lemonade", 1.50));
            bill.add(new Item("bread", 2.25));
            bill.add(new Item("gift card", 75.00));
            bill.add(new Item("bagels", 1.30));
            bill.add(new Item("antique table", 125.00));

            int expected = 0;
            assertEquals(expected, bill.getDiscountCount());
        }

        @org.junit.jupiter.api.Test
        @DisplayName("Test getDiscountCount() 6")
        void test14() {
            boolean preferred = true;
            DiscountBill2 bill = new DiscountBill2(new Employee("clerk-1"), preferred);
            bill.add(new Item("notebook", 3.00));
            bill.add(new Item("lemonade", 1.50)); // <-- no discount!
            bill.add(new Item("bread", 2.25));
            bill.add(new Item("gift card", 75.00)); // <-- no discount!
            bill.add(new Item("bagels", 1.30));
            bill.add(new Item("antique table", 125.00));

            int expected = 4;
            assertEquals(expected, bill.getDiscountCount());
        }

        @org.junit.jupiter.api.Test
        @DisplayName("Test getDiscountAmount() 1")
        void test15() {
            boolean preferred = false;
            DiscountBill2 bill = new DiscountBill2(new Employee("clerk-1"), preferred);
            bill.add(new Item("popcorn", 1.02));

            double expected = 0.0;
            assertEquals(expected, bill.getDiscountAmount());
        }

        @org.junit.jupiter.api.Test
        @DisplayName("Test getDiscountAmount() 2")
        void test16() {
            boolean preferred = true;
            DiscountBill2 bill = new DiscountBill2(new Employee("clerk-1"), preferred);
            bill.add(new Item("popcorn", 1.02));

            double expected = 0.12;
            assertEquals(expected, bill.getDiscountAmount());
        }

        @org.junit.jupiter.api.Test
        @DisplayName("Test getDiscountAmount() 3")
        void test17() {
            boolean preferred = false;
            DiscountBill2 bill = new DiscountBill2(new Employee("clerk-1"), preferred);
            bill.add(new Item("juice", 1.50));

            double expected = 0.0;
            assertEquals(expected, bill.getDiscountAmount());
        }

        @org.junit.jupiter.api.Test
        @DisplayName("Test getDiscountAmount() 4")
        void test18() {
            boolean preferred = true;
            DiscountBill2 bill = new DiscountBill2(new Employee("clerk-1"), preferred);
            bill.add(new Item("juice", 1.50));

            double expected = 0.0;
            assertEquals(expected, bill.getDiscountAmount());
        }

        @org.junit.jupiter.api.Test
        @DisplayName("Test getDiscountAmount() 5")
        void test19() {
            boolean preferred = false;
            DiscountBill2 bill = new DiscountBill2(new Employee("clerk-1"), preferred);
            bill.add(new Item("popcorn", 1.02));
            bill.add(new Item("marmalade", 3.25));
            bill.add(new Item("wristwatch", 67.90));
            bill.add(new Item("juice", 1.50));

            double expected = 0.0;
            assertEquals(expected, bill.getDiscountAmount());
        }

        @org.junit.jupiter.api.Test
        @DisplayName("Test getDiscountAmount() 6")
        void test20() {
            boolean preferred = true;
            DiscountBill2 bill = new DiscountBill2(new Employee("clerk-1"), preferred);
            bill.add(new Item("popcorn", 1.02));
            bill.add(new Item("marmalade", 3.25));
            bill.add(new Item("wristwatch", 67.90));
            bill.add(new Item("juice", 1.50));

            double expected = 18.47;
            assertEquals(expected, bill.getDiscountAmount());
        }

        @org.junit.jupiter.api.Test
        @DisplayName("Test getDiscountPercent() 1")
        void test21() {
            boolean preferred = false;
            DiscountBill2 bill = new DiscountBill2(new Employee("clerk-1"), preferred);
            bill.add(new Item("rice", 3.00));

            double expected = 0.0;
            assertEquals(expected, bill.getDiscountPercent());
        }

        @org.junit.jupiter.api.Test
        @DisplayName("Test getDiscountPercent() 2")
        void test22() {
            boolean preferred = true;
            DiscountBill2 bill = new DiscountBill2(new Employee("clerk-1"), preferred);
            bill.add(new Item("rice", 3.00));

            double expected = 25.0;
            assertEquals(expected, bill.getDiscountPercent());
        }

        @org.junit.jupiter.api.Test
        @DisplayName("Test getDiscountPercent() 3")
        void test23() {
            boolean preferred = false;
            DiscountBill2 bill = new DiscountBill2(new Employee("clerk-1"), preferred);
            bill.add(new Item("vinegar", 4.18));

            double expected = 0.0;
            assertEquals(expected, bill.getDiscountPercent());
        }

        @org.junit.jupiter.api.Test
        @DisplayName("Test getDiscountPercent() 4")
        void test24() {
            boolean preferred = true;
            DiscountBill2 bill = new DiscountBill2(new Employee("clerk-1"), preferred);
            bill.add(new Item("vinegar", 4.18));

            double expected = 0.0;
            assertEquals(expected, bill.getDiscountPercent());
        }

        @org.junit.jupiter.api.Test
        @DisplayName("Test getDiscountPercent() 5")
        void test25() {
            boolean preferred = false;
            DiscountBill2 bill = new DiscountBill2(new Employee("clerk-1"), preferred);
            bill.add(new Item("vinegar", 4.18));
            bill.add(new Item("soup", 2.50));
            bill.add(new Item("rice", 3.0));
            bill.add(new Item("coffee", 4.25));
            bill.add(new Item("flour", 6.50));

            double expected = 0.0;
            assertEquals(expected, bill.getDiscountPercent());
        }

        @org.junit.jupiter.api.Test
        @DisplayName("Test getDiscountPercent() 6")
        void test26() {
            boolean preferred = true;
            DiscountBill2 bill = new DiscountBill2(new Employee("clerk-1"), preferred);
            bill.add(new Item("vinegar", 4.18));
            bill.add(new Item("soup", 2.50));
            bill.add(new Item("rice", 3.0));
            bill.add(new Item("coffee", 4.25));
            bill.add(new Item("flour", 6.50));

            double expected = 16.6421928536466;
            assertEquals(expected, bill.getDiscountPercent());
        }
    }
}
