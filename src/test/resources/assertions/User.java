public class User {
    
    private final String name;
    private final String address;
    private final int age;
    private final String surname;
    private final String phone;
    private final String starSign;
    private final double weightKg;
    private final double heightCm;
    private final double idk;
    private final int ye;
    
    private User(Builder builder) {
        this.name = builder.name;
        this.address = builder.address;
        this.age = builder.age;
        this.surname = builder.surname;
        this.phone = builder.phone;
        this.starSign = builder.starSign;
        this.weightKg = builder.weightKg;
        this.heightCm = builder.heightCm;
        this.idk = builder.idk;
        this.ye = builder.ye;
    }
    
    public String getName() { return name; }
    public String getAddress() { return address; }
    public int getAge() { return age; }
    public String getSurname() { return surname; }
    public String getPhone() { return phone; }
    public String getStarSign() { return starSign; }
    public double getWeightKg() { return weightKg; }
    public double getHeightCm() { return heightCm; }
    public double getIdk() { return idk; }
    public int getYe() { return ye; }
    
    public static class Builder {
        private final String name;
        private final String address;
        private final int age;
        private String surname;
        private String phone;
        private String starSign;
        private double weightKg;
        private double heightCm;
        private double idk;
        private int ye;
        
        public Builder(String name, String address, int age) {
            this.name = name;
            this.address = address;
            this.age = age;
            this.surname = "";
            this.phone = "0";
            this.starSign = "";
            this.idk = 131.32;
            this.ye = 99;
        }
        
        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }
        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }
        public Builder starSign(String starSign) {
            this.starSign = starSign;
            return this;
        }
        public Builder weightKg(double weightKg) {
            this.weightKg = weightKg;
            return this;
        }
        public Builder heightCm(double heightCm) {
            this.heightCm = heightCm;
            return this;
        }
        public Builder idk(double idk) {
            this.idk = idk;
            return this;
        }
        public Builder ye(int ye) {
            this.ye = ye;
            return this;
        }
        
        public User build() {
            return new User(this);
        }
    }
}
