public class Main {
    public static void main(String[] args) {
        // Simulated input (first value is count, rest are group sizes)
        int[] input = {3, 2, 4, 3}; // 3 groups: 2, 4, 3 people

        int n = input[0]; // Number of groups
        int totalPeople = 0;

        // Validate length
        if (input.length - 1 != n) {
            System.out.println("Input must be equal with count of family");
            return;
        }

        // Sum the group sizes
        for (int i = 1; i <= n; i++) {
            totalPeople += input[i];
        }

        // Calculate minimum number of buses (4 people per bus)
        int buses = (int) Math.ceil(totalPeople / 4.0);
        System.out.println("Minimum bus required is : " + buses);
    }
}
