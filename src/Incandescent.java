public class Incandescent extends Light{

 public double heatOutput;
 public static final double HEAT_OUTPUT_CONSTANT = 87.4;
    public Incandescent(int lumens) {
        super(lumens);
    }

    @Override
    public double heatOutput() {
       heatOutput = getLumens() * HEAT_OUTPUT_CONSTANT;
        return(heatOutput);
    }

    @Override
    public boolean isFlourescent() {
        return false;
    }
}
