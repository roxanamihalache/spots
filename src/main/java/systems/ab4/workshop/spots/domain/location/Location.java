package systems.ab4.workshop.spots.domain.location;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 *
 *
 * @author Alexandru Artimon
 * @since 19/06/2017.
 */
@Entity
@Table
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column
    @NotNull
    private String name;

    @ManyToOne
    private Location parent;

    @Column
    private Long type;

    // default constructor for the sake of JPA :)
    protected Location() {}

    public Location(String name, Location parent, Long type) {
        this.name = name;
        this.parent = parent;
        this.type = type;
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

    public Location getParent() {
        return parent;
    }

    public void setParent(Location parent) {
        this.parent = parent;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format(
                "Location[id=%d, name='%s', parent='%s', type='%s']",
                id, name, parent, type);
    }
}
