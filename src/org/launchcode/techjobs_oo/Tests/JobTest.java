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
}
