package cpu;

import java.util.Scanner;

class Cpu {
    int price;

    void add() {
        this.price = 15000;
    }

    public class Processor {
        int numCores;
        String manufacturer;

        void add(int numCores, String manufacturer) {
            this.numCores = numCores;
            this.manufacturer = manufacturer;
        }

        public static class Ram {

            static int memory;
            static String ramManufacturer;


        }

    }
}
class CpuMain{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Cpu cpu1=new Cpu();
        cpu1.add();
        Cpu.Processor processor1=cpu1.new Processor();
        System.out.println("Enter the CPU manufacturer: ");
        String manufacturer=sc.nextLine();
        System.out.println("Enter no. of cores in CPU:");
        int numCores=sc.nextInt();
        processor1.add(numCores,manufacturer);
        System.out.println("Enter the memory size: ");
        int mSize=sc.nextInt();
        System.out.println("Enter the Ram manufacturer: ");
        String rManufacturer=sc.next();
        Cpu.Processor.Ram.memory=mSize;
        Cpu.Processor.Ram.ramManufacturer=rManufacturer;
        System.out.println("CPU: "+processor1.manufacturer);
        System.out.println("CPU price: "+"Rs "+cpu1.price);
        System.out.println("Number of cores: "+processor1.numCores);
        System.out.println("RAM manufacturer: "+ Cpu.Processor.Ram.ramManufacturer);
        System.out.println("RAM memory: "+ Cpu.Processor.Ram.memory+" GB");
    }
}



