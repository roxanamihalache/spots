package systems.ab4.workshop.spots.domain.spot;

import systems.ab4.workshop.spots.domain.location.Location;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Set;

/**
 * @author Alexandru Artimon
 * @since 19/06/2017.
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

    @Column
    @NotNull
    private Date startSeason;
    @Column
    @NotNull
    private Date endSeason;
    @Column
    @NotNull
    private Double cost;

    @ElementCollection(fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    @NotNull
    private Set<Activity> activities;

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

    protected Spot() {}

    public Spot(String name, Location location, Date startSeason, Date endSeason, Double cost, Set<Activity> activities){
        this.name = name;
        this.location = location;
        this.startSeason = startSeason;
        this.endSeason = endSeason;
        this.activities = activities;
        this.cost = cost;
    }

    public Date getStartSeason() {
        return startSeason;
    }

    public void setStartSeason(Date startSeason) {
        this.startSeason = startSeason;
    }

    public Date getEndSeason() {
        return endSeason;
    }

    public void setEndSeason(Date endSeason) {
        this.endSeason = endSeason;
    }

    public Set<Activity> getActivities() {
        return activities;
    }

    public void setActivities(Set<Activity> activities) {
        this.activities = activities;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return String.format(
                "Spot[id=%d, name='%s', location='%s', startSeason='%s', endSeason='%s', cost='%s', activities='%s' ]",
                id, name, location, startSeason, endSeason, cost, activities);
    }
}
