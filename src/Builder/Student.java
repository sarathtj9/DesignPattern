package Builder;

public class Student {
    String name;
    int age;
    String univName;
    int gradYear;
    double psp;
    String batch;
    String companyName;

    private Student(Builder builder) {
        //validations start
//        if (builder.getGradYear() > 2022) {
//            throw new IllegalArgumentException("Grad Year can't be greater than 2022");
//        }
        //validations end
        this.name = builder.name;
        this.age = builder.age;
        this.batch = builder.batch;
        this.univName = builder.univName;
    }

    public static Builder getBuilder() {
        return new Builder();
    }


    static class Builder { // Inner Class
        String name;
        int age;
        String univName;
        int gradYear;
        double psp;
        String batch;
        String companyName;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getUnivName() {
            return univName;
        }

        public Builder setUnivName(String univName) {
            this.univName = univName;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public String getCompanyName() {
            return companyName;
        }

        public Builder setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }

        private boolean validate() {
            return true;
        }

        public Student build() {
            //Validations can come here as well.
            if (this.getGradYear() > 2022) {
                throw new IllegalArgumentException("Grad Year can't be greater than 2022");
            }
            return new Student(this);
        }
    }
}