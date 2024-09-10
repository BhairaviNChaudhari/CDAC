package a7.Assignment.oop;

//1.	Design and implement a class named InstanceCounter to track and count the number of instances 
//created from this class.
public class InstancC {
    private static int instanceCount = 0;
    private int instanceNumber;

    public InstancC() {
        instanceCount++;
        instanceNumber = instanceCount;
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    public static void main(String[] args) {
    	InstancC obj1 = new InstancC();
        System.out.println("Instance number for obj1: " + obj1.getInstanceNumber());
        System.out.println("Total instances: " + InstancC.getInstanceCount());

        InstancC obj2 = new InstancC();
        System.out.println("Instance number for obj2: " + obj2.getInstanceNumber());
        System.out.println("Total instances: " + InstancC.getInstanceCount());

        InstancC obj3 = new InstancC();
        System.out.println("Instance number for obj3: " + obj3.getInstanceNumber());
        System.out.println("Total instances: " + InstancC.getInstanceCount());
    }
}
