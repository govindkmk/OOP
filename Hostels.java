package Abstraction;

abstract class Hostels {
    abstract void with_mezz_Rent();
    abstract void without_mezz_Rent();
    abstract void hs_Name();
    static void Display(){
        System.out.println("\nThese are the Some Hostels With Monthly Rent.\n");
    }
    public static void main(String[] args) {
        Hostels.Display();
        
        Al_Rehman_Hostel alh = new Al_Rehman_Hostel();
        alh.hs_Name();
        alh.with_mezz_Rent();
        alh.without_mezz_Rent();

        Chandio_Hostel cdh = new Chandio_Hostel();
        cdh.hs_Name();
        cdh.with_mezz_Rent();
        cdh.without_mezz_Rent();

        Crown_Hostel crh = new Crown_Hostel();
        crh.hs_Name();
        crh.with_mezz_Rent();
        crh.without_mezz_Rent();
    }
}

class Al_Rehman_Hostel extends Hostels{
    void hs_Name(){
        System.out.println("Al_Rehman Boys Hostel, Jamshoro");
    }
    void with_mezz_Rent(){
        System.out.println("With Mezz 9000 per Month.");
    }
    void without_mezz_Rent(){
        System.out.println("Without Mezz 5000 per Month.");
    }
}

class Chandio_Hostel extends Hostels{
    void hs_Name(){
        System.out.println("\n\nChandio Boys Hostel, Jamshoro");
    }
    void with_mezz_Rent(){
        System.out.println("With Mezz 10000 per Month.");
    }
    void without_mezz_Rent(){
        System.out.println("Without Mezz 6000 per Month.");
    }
}

class Crown_Hostel extends Hostels{
    void hs_Name(){
        System.out.println("\n\nCrown Boys Hostel, Jamshoro");
    }
    void with_mezz_Rent(){
        System.out.println("With Mezz 9500 per Month.");
    }
    void without_mezz_Rent(){
        System.out.println("Without Mezz 5500 per Month.");
    }
}