package javaDEV.L2.Enam;

public enum ProcessorType  implements Describable{
    BIT_32("bit_32"){
        @Override
        public String getDescription() {
            return "dic32";

        }
    },
    BIT_64("bit_64"){
        @Override
        public String getDescription() {
            return "dic64";
        }
    };

    private final String name;


    ProcessorType(String name) {
        this.name = name;
    }

    @Override
    public String getDescription2(){
        return name + " implements";
    }

    public abstract String getDescription();

    public String getName() {
        return name;
    }
}
