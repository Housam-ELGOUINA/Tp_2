package Exo1;

import java.util.Date;

public class Worker {
    private String name ;
    private String birthdate ;
    private String endDate ;
    public int getAge() {
        return 2026 - Integer.parseInt(birthdate);
    } ;
    public double something() {} ;
    public void terminate(String endDate) {
        return;
    }
    public Worker() {} ;

}


class Employee extends Worker {
    private long somth ;

}
