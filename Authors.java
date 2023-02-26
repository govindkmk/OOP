package Abstraction;

abstract class Authors {
    abstract void author_Name();
    abstract void no_books();
    abstract void famous_Book();
    
    static void About(){
        System.out.println("\nThese are the some Auhtors, their number of books & Famous One Book.\n");
    }
    public static void main(String[] args) {
        Authors.About();

        Author_1 a_1 = new Author_1();
        a_1.author_Name();
        a_1.no_books();
        a_1.famous_Book();

        Author_2 a_2 = new Author_2();
        a_2.author_Name();
        a_2.no_books();
        a_2.famous_Book();

        Author_3 a_3 = new Author_3();
        a_3.author_Name();
        a_3.no_books();
        a_3.famous_Book();
    }
}

class Author_1 extends Authors{
    void author_Name(){
        System.out.println("Alex Xu");
    }
    void no_books(){
        System.out.println("He published 12 books about technology.");
    }
    void famous_Book(){
        System.out.println("His famous book is SYSTEM DESIGN INTERVIEW.\n");
    }
}
class Author_2 extends Authors{
    void author_Name(){
        System.out.println("John Elia");
    }
    void no_books(){
        System.out.println("He published 7 books about Love.");
    }
    void famous_Book(){
        System.out.println("His famous book is MOHABBAT.\n");
    }
}
class Author_3 extends Authors{
    void author_Name(){
        System.out.println("Laura Victoria");
    }
    void no_books(){
        System.out.println("She published 4 books about Humans Psychology.");
    }
    void famous_Book(){
        System.out.println("Her famous book is LEARN WITH SILENCE.\n");
    }
}