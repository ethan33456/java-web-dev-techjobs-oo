package org.launchcode.techjobs_oo.Tests;


import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {


   // @Before
   // public void createJobObjects() {
   //    Job testJob = new Job();
   //
    //     Job testJobTwo = new Job();
    //}
    @Test
    public void testSettingJobId() {
        Job testJob = new Job();
        Job testJobTwo = new Job();
        assertTrue((testJobTwo.getId() - testJob.getId()) == 1);
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(testJob.getName() == "Product tester");
        assertTrue(testJob.getName() instanceof String);
        assertTrue(testJob.getEmployer() instanceof Employer);
        assertTrue(testJob.getEmployer().getValue() == "ACME");
        assertTrue(testJob.getLocation() instanceof Location);
        assertTrue(testJob.getLocation().getValue() == "Desert");
        assertTrue(testJob.getPositionType().getValue() == "Quality control");
        assertTrue(testJob.getPositionType() instanceof PositionType);
        assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
        assertTrue(testJob.getCoreCompetency().getValue() == "Persistence");
    }
    @Test
    public void testJobsForEquality(){
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJobTwo = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(testJob.equals(testJobTwo));
    }
    @Test
    public void testToString(){
        //If i see if toString.contains ID: 1 the test only passes if this is the only test I run
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(testJob.toString().startsWith("\n"));
        assertTrue(testJob.toString().endsWith("\n"));
        assertTrue(testJob.toString().contains("\nID: "));
        assertTrue(testJob.toString().contains("\nName: " + "Product tester"));
        assertTrue(testJob.toString().contains("\nEmployer: " + "ACME"));
        assertTrue(testJob.toString().contains("\nLocation: " + "Desert"));
        assertTrue(testJob.toString().contains("\nPosition Type: " + "Quality control"));
        assertTrue(testJob.toString().contains("\nCore Competency: " + "Persistence"));
        Job testJobTwo = new Job("Product tester", new Employer(), new Location(), new PositionType(), new CoreCompetency());
        Job testJobThree = new Job();

        assertTrue(testJobTwo.toString().contains("\nCore Competency: " + "Data not available"));
        assertTrue(testJobTwo.toString().contains("\nPosition Type: " + "Data not available"));
        assertTrue(testJobTwo.toString().contains("\nLocation: " + "Data not available"));
        assertTrue(testJobTwo.toString().contains("\nEmployer: " + "Data not available"));

        assertTrue(testJobThree.toString().contains("OOPS! This job does not seem to exist."));
    }
}
