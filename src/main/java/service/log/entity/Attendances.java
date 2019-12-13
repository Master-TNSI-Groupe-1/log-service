package ServiceLog.Entity;

import javax.persistence.*;
import java.util.Date;

@Table(name="ATTENDANCES")
@Entity
public class Attendances {

    public Attendances(){

    }

    public Attendances(Date currentdate, int numberuser, int idlocation, int ticks) {
        this.currentdate = currentdate;
        this.numberuser = numberuser;
        this.idlocation = idlocation;
        this.ticks = ticks;
    }

    @Id
    @GeneratedValue
    @Column(name = "id_attendances")
    private int idattendances;

    @Column(name = "currentdate")
    private Date currentdate;

    @Column(name = "number_user")
    private int numberuser;

    @Column(name = "id_location")
    private int idlocation;

    @Column(name = "ticks")
    private int ticks ;

    public int getIdattendances() {
        return idattendances;
    }

    public void setIdattendances(int idattendances) {
        this.idattendances = idattendances;
    }

    public Date getCurrentdate() {
        return currentdate;
    }

    public void setCurrentdate(Date currentdate) {
        this.currentdate = currentdate;
    }

    public int getNumberuser() {
        return numberuser;
    }

    public void setNumberuser(int numberuser) {
        this.numberuser = numberuser;
    }

    public int getIdlocation() {
        return idlocation;
    }

    public void setIdlocation(int idlocation) {
        this.idlocation = idlocation;
    }

    public int getTicks() {
        return ticks;
    }

    public void setTicks(int ticks) {
        this.ticks = ticks;
    }
}
