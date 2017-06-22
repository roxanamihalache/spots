package systems.ab4.workshop.spots;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Roxana on 6/22/2017.
 */
@Entity
@Table
public class Spot {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column
    private String name;

    @ManyToOne
    @NotNull
    private Location location;

    public Spot(String name, Location location) {
        this.name = name;
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Spot{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location=" + location +
                '}';
    }
}
