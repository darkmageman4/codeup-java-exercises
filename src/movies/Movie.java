package movies;

public class Movie {
    //fields
    private String name;
    private String category;

    //constructor
    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }
// default constructor
    public Movie(){}

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
