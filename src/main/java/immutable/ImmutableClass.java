package immutable;

public class ImmutableClass {

    private String color;
    private String category;

    public ImmutableClass(String color, String category)
    {
        this.color = color;
        this.category = category;
    }

    public ImmutableClass setColor(String color)
    {
        ImmutableClass immutableClass = new ImmutableClass(color, this.category);
        return immutableClass;
    }

    public ImmutableClass setCategory(String category)
    {
        ImmutableClass immutableClass = new ImmutableClass(this.color, category);
        return immutableClass;
    }
}

class ChooseCar{

    public static void main(String[] args) {
        ImmutableClass car = new ImmutableClass("Black", "Sedan");
    }
}
