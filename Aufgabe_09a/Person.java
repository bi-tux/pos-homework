public class Person {

    private String name;

    public Person(String name) {
        setName(name);
    }

    public void setName(String name) {
        if(!(name.equals("null")) && name.length() >= 3) {
            this.name = name;
        }
    }

    public String getName() {
        return this.name;
    }
}
