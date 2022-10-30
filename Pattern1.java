import java.util.Scanner;
public class Pattern1
{
public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);
System.out.println("Enter number of rows to print--> ");
int rows = scanner.nextInt();
System.out.println("\nThe star pattern is--> ");
for (int m = 1; m <= rows; m++)
{
for (int n = 1; n <= m; n++)
{
System.out.print("*");
}
System.out.println();
}
}
}
