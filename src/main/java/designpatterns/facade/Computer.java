package designpatterns.facade;

/**
 * @Author: yangdingshan
 * @Date: 2018/10/17 14:24
 * @Description:
 */
public class Computer {

    private CPU cpu;

    private Disk disk;

    private Memory memory;

    public Computer() {
        this.cpu = new CPU();
        this.disk = new Disk();
        this.memory = new Memory();
    }

    public void startup() {
        System.out.println("computer startup");
        cpu.startup();
        disk.startup();
        memory.startup();
        System.out.println("computer finished");
    }
}
