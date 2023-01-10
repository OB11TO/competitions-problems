package dirty.course.javaDEV.L2.Enam;

import java.util.Arrays;

public class RunnerEnum {
    public static void main(String[] args) {
        ProcessorType type32 = ProcessorType.BIT_32;
        ProcessorType type64 = ProcessorType.BIT_64;
        System.out.println(type32);
        System.out.println(type64.toString());
        System.out.println(type32.name());
        System.out.println(ProcessorType.valueOf("BIT_64"));
        System.out.println(Arrays.toString(ProcessorType.values()));
        System.out.println(type64.ordinal());

        System.out.println(type32.getName());
        System.out.println(type32.getDescription());
        System.out.println(ProcessorType.BIT_64.getDescription());

        System.out.println(ProcessorType.BIT_32.getDescription2());
        System.out.println(ProcessorType.BIT_64.getDescription2());

    }
}
