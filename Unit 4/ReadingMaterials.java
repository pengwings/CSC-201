//Created by Brian Yu on 10/22/2017
public class ReadingMaterials {
    public static void main(String[] args) {
        Book mobyDick = new Book("Moby Dick", 378, "Herman Melville");
        mobyDick.printBook();
        Magazine time = new Magazine("Time", "week");
        time.printMagazine();
    }
}

class TypeOfReadingMaterial {
    public String typeOfMaterial;
}

class Book extends TypeOfReadingMaterial {
    public String title;
    public String author;
    public int numberOfPages;

    public Book() {
        this.typeOfMaterial = "Book";
    }

    public Book(String title, int numberOfPages, String author) {
        this.typeOfMaterial = "Book";
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.author = author;
    }

    public void printBook(){
        System.out.println("This reading material is a " + this.typeOfMaterial + " with title " + this.title + " written by " + this.author + " and has " + this.numberOfPages + " pages.");
    }
}

class Magazine extends TypeOfReadingMaterial {
    public String magazineTitle;
    public String printTimeline;

    public Magazine() {
        this.typeOfMaterial = "Magazine";
    }

    public Magazine(String magazineTitle, String printTimeline) {
        this.typeOfMaterial = "Magazine";
        this.magazineTitle = magazineTitle;
        this.printTimeline = printTimeline;
    }

    public void printMagazine() {
        System.out.println("This reading material is a " + this.typeOfMaterial + " called " + this.magazineTitle + " that prints every " + this.printTimeline + ".");
    }
}


