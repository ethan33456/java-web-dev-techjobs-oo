package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job(){
        this.id = nextId;
        nextId++;
    }
    public Job(String aName, Employer aEmployer, Location aLocation, PositionType aPositionType, CoreCompetency aCoreCompetency){
        this();
        this.name = aName;
        this.employer = aEmployer;
        this.location = aLocation;
        this.positionType = aPositionType;
        this.coreCompetency = aCoreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }
    public String toString(){
        final String DEFAULT_VALUE = "Data not available";
        String output = "";
        if(this.getName() == null && this.getCoreCompetency() == null && this.getPositionType() == null && this.getLocation() == null && this.getEmployer() == null){
            output = "OOPS! This job does not seem to exist.";
            return "\n" + output + "\n";
        }
        output += "\nID: " + this.getId() + "\nName: ";
        if (this.getName() == null || this.getName() == ""){
            output += DEFAULT_VALUE;
        }
        else{
            output += this.getName();
        }
        output += "\nEmployer: ";
        if (this.getEmployer().getValue() == null || this.getEmployer().getValue() == ""){
            output += DEFAULT_VALUE;
        }
        else{
            output += this.getEmployer();
        }
        output += "\nLocation: ";
        if(this.getLocation().getValue() == null || this.getLocation().getValue() == ""){
            output += DEFAULT_VALUE;
        }
        else{
            output += this.getLocation();
        }
        output += "\nPosition Type: ";
        if(this.getPositionType().getValue() == null || this.getPositionType().getValue() == ""){
            output += DEFAULT_VALUE;
        }
        else{
            output += this.getPositionType();
        }
        output += "\nCore Competency: ";
        if(this.getCoreCompetency().getValue() == null || this.getCoreCompetency().getValue() == ""){
            output += DEFAULT_VALUE;
        }
        else{
            output += this.getCoreCompetency();
        }


        return output + "\n";
    }
}
