public class Main
{
    public static void main(String[] args)
    {
        final String name = "Alex";
        int age = 17; 
        double age_months = 3; 
        boolean is_adult = false;
        double total_age = age + (age_months/12); 
        System.out.println("name: " + name);
        System.out.println("Age: " + total_age);
        System.out.println("Is an Adult: " + is_adult); 
    }
}