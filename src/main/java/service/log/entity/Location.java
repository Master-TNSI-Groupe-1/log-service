package ServiceLog.Entity;

import javax.persistence.*;

@Table(name="location")
@Entity
public class Location {

    public Location(){

    }

    public Location(String name, String urlimage, Boolean isenabled, int numberPlaces, int numberUser, Integer idsite) {
        this.name = name;
        this.urlimage = urlimage;
        this.isenabled = isenabled;
        this.numberPlaces = numberPlaces;
        this.numberUser = numberUser;
        this.idsite = idsite;
    }

    @Id
    @GeneratedValue
    @Column(name = "id_location")
    private  int idlocation;

    @Column(name = "name")
    private String name;

    @Column(name = "url_image")
    private String urlimage;

    @Column(name = "is_enabled")
    private Boolean isenabled;

    @Column(name = "number_places")
    private int numberPlaces;

    @Column(name = "number_user")
    private int numberUser;

    @Column(name = "id_site")
    private Integer idsite;

    public int getIdlocation() {
        return idlocation;
    }

    public void setIdlocation(int idlocation) {
        this.idlocation = idlocation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrlimage() {
        return urlimage;
    }

    public void setUrlimage(String urlimage) {
        this.urlimage = urlimage;
    }

    public Boolean getIsenabled() {
        return isenabled;
    }

    public void setIsenabled(Boolean isenabled) {
        this.isenabled = isenabled;
    }

    public int getNumberPlaces() {
        return numberPlaces;
    }

    public void setNumberPlaces(int numberPlaces) {
        this.numberPlaces = numberPlaces;
    }

    public int getNumberUser() {
        return numberUser;
    }

    public void setNumberUser(int numberUser) {
        this.numberUser = numberUser;
    }

    public int getIdsite() {
        return idsite;
    }

    public void setIdsite(int idsite) {
        this.idsite = idsite;
    }
}
