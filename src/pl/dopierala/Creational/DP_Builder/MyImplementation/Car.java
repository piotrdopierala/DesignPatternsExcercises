package DP_Builder.MyImplementation;

public class Car implements Car_intf {

    private String make;
    private String color;
    private String engine;


    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getEngine() {
        return engine;
    }

    @Override
    public String getColor() {
        return color;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder {

        private String make;
        private String color;
        private String engine;

        private Car carDTO;

        public Builder withMake(String make) {
            this.make=make;
            return this;
        }

        public Builder withColor(String color) {
            this.color=color;
            return this;
        }

        public Builder  withEngine(String engine) {
            this.engine=engine;
            return this;
        }

        public Car build() {
            carDTO = new Car();
            carDTO.color=this.color;
            carDTO.make=this.make;
            carDTO.engine=this.engine;
            return carDTO;
        }
    };
}
