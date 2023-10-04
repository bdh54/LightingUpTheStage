import java.util.ArrayList;
public class LightStrip {

    ArrayList<Light> lightStrip;

    public LightStrip() {
        lightStrip = new ArrayList<>();
    }

    public void display() {
        int index;
        int flourescent = 0;
        int totalLumens = 0;
        double heatOutput = 0;

        for (index = 0; index < lightStrip.size(); ++index) {
            System.out.println(index + ": " + lightStrip.get(index).toString());
            totalLumens += lightStrip.get(index).getLumens();
            if (lightStrip.get(index).isFlourescent()) {
                ++flourescent;
            }
            if (!lightStrip.get(index).isFlourescent()) {
                heatOutput += lightStrip.get(index).heatOutput();
            }
        }
        System.out.println("Total lumens = " + +totalLumens + ".0");
        System.out.println("Flourescent = " + flourescent);
        System.out.println("Heat output = " + heatOutput);
    }

    public void addLight(Light light) {
        lightStrip.add(light);
    }

    public void removeLight(int index) {
        if (index < lightStrip.size()) {
            lightStrip.remove(index);
        } else {
            System.out.println("ERROR: No light at that index");
        }
    }
}

