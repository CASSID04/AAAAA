package data;

import java.util.HashMap;

public class Patient {
    public static HashMap<String,String[]> patientBio = new HashMap<String,String[]>();
    
    public Patient() {
        String[] patientData1 = {"4C","39583","REGULAR"};
        patientBio.put("CLAY",patientData1);
        patientBio.put("a",patientData1);
        patientBio.put("s",patientData1);
        patientBio.put("d",patientData1);
        patientBio.put("f",patientData1);
    }
}