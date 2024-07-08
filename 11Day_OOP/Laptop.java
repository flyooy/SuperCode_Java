public class Laptop {
    private String hersteller;
    private float cpuHz; // 3.2f ==> 3.2 GHz
    private byte ram;  // zb 16 => 16GB
    private int diskSpace; // 512 => 512 GB
    private float monitorSize; // 15.6 ==> 15.6"
    private float weight; // 1.48 ==> 1.48 kg


    public Laptop(String hersteller, float cpuHz, byte ram, int diskSpace, float monitorSize, float weight) {
        setHersteller(hersteller);
        this.cpuHz = cpuHz;
        this.ram = ram;
        this.diskSpace = diskSpace;
        this.monitorSize = monitorSize;
        this.weight = weight;

    }

    public String setHersteller(String hersteller) {
        if (hersteller == "Apple" || hersteller == "Samsung" || hersteller == "Toshiba" || hersteller ==  "Acer" || hersteller == "HP" || hersteller == "Dell" )
        this.hersteller = hersteller;
        return this.hersteller = hersteller;
    }

    public String getHersteller() {
        return this.hersteller = hersteller;
    }

    public float setCpuHz(float cpuHz) {
       
        return    this.cpuHz = cpuHz;
    }

    public float getCpuHz() {
        return this.cpuHz = cpuHz;
    }

    public int setDiskSpace(byte diskSpace) {
      
        return     this.diskSpace = diskSpace;
    }

    public int getDiskSpace() {
        return   this.diskSpace = diskSpace;
    }


    public float setMonitorSize(float monitorSize) {
      
        return     this.monitorSize = monitorSize;
    }

    public float getMonitorSize() {
        return this.monitorSize = monitorSize;
    }
    

    public float  setWeight(float  weight) {
      
        return     this.ram = ram;
    }

    public byte getWeight() {
        return this.ram = ram;
    }

    public float setRam(byte ram) {
      
        return      this.weight = weight;
    }

    public float getRam() {
        return   this.weight = weight;
    }

    public void printInfo() {
        System.out.println("Laptop Hersteller: " + getHersteller());
        System.out.println("Laptop cpuHz: " + getCpuHz() + " Ghz");
        System.out.println("Laptop Ram: " + getRam() + " GB");
        System.out.println("Laptop Disk Space: " + getDiskSpace()+ " GB");
        System.out.println("Laptop Monitor Size: " + getMonitorSize());
        System.out.println("Laptop Weight: " + getWeight()+" kg");
    }
    
}
