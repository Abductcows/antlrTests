public class User {
    
    private final String name;
    private final String surname;
    private final int age;
    private final String phone;
    
    private User(Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.age = builder.age;
        this.phone = builder.phone;
    }
    
    public String getName() { return name; }
    public String getSurname() { return surname; }
    public int getAge() { return age; }
    public String getPhone() { return phone; }
    
    public static class Builder {
        private final String name;
        private final String surname;
        private int age;
        private String phone;
        
        public Builder(String name, String surname) {
            this.name = name;
            this.surname = surname;
            this.age = 0;
            this.phone = 166;
        }
        
        public Builder age(int age) {
            this.age = age;
            return this;
        }
        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }
        
        public User build() {
            return new User(this);
        }
    }
}
