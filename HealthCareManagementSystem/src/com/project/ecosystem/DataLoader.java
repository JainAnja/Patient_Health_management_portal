/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.ecosystem;

import com.project.bloodbank.BloodBankEnterprise;
import com.project.donor.DonorProfile;
import java.util.Random;

import com.project.employee.Employee;
import com.project.enterprise.Enterprise;
import com.project.healthcare.HospitalSystemEnterprise;
import com.project.location.City;
import com.project.location.Country;
import com.project.location.State;
import com.project.network.Network;
import com.project.network.Network.NetworkType;
import com.project.organization.Organization;
import com.project.patient.Encounter;
import com.project.patient.PatientProfile;
import com.project.patient.VitalSigns;
import com.project.person.Person;
import com.project.ui.pharmacy.PharmacyEnterprise;
import com.project.role.AdminRole;
import com.project.role.BloodSupplyManagerRole;
import com.project.role.BloodInventoryManagerRole;
import com.project.role.DoctorRole;
import com.project.role.DonorRole;
import com.project.role.EnterpriseAdminRole;
import com.project.role.InsuranceClaimsManagerRole;
import com.project.role.LabAssistantRole;
import com.project.role.NurseRole;
import com.project.role.PatientRole;
import com.project.role.Pharmacist;
import com.project.role.ReceptionistRole;
import com.project.role.Role;
import com.project.role.SystemAdminRole;
import com.project.useraccount.UserAccount;
import com.project.utils.Utils;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author Anjali
 */
public class DataLoader {

    private static ArrayList<Country> countries = new ArrayList<>();
    private static HashMap<String, Integer> insuranceMap = new HashMap<>();

    public static Business configure() {

        Business business = Business.getInstance();
        populateCountryCityState();
        addInsurancePlan();

        Ecosystem system = new Ecosystem("HEALTHCARE SYSTEM", "SYSTEM", com.project.network.Network.NetworkType.GLOBAL.getValue());
        business.setSystemorg(system);
        Employee employee = system.getEmployeeDirectory().addNewEMployee("Anjali jain");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sys", "sys", employee, new SystemAdminRole());
        ua.setIsActive(true);
        HospitalSystemEnterprise rootHospital = null;
        Enterprise rootEnterprise = system.getRootNetwork().getEnterpriseDirectory().addNewEnterprise("WEcareHospital", Enterprise.EnterpriseType.HospitalSystemEnterprise);
        if (rootEnterprise instanceof HospitalSystemEnterprise) {
            rootHospital = (HospitalSystemEnterprise) rootEnterprise;
        }

//        created network and enterprise
        Network countryNetwork = system.getRootNetwork().getSubNetworkDirectory().createAndAddNetwork("USA", NetworkType.COUNTRY.getValue());
        Enterprise hospital = countryNetwork.getEnterpriseDirectory().addNewEnterprise("WeCare-USA", Enterprise.EnterpriseType.HospitalSystemEnterprise);
        Enterprise bloodbank = countryNetwork.getEnterpriseDirectory().addNewEnterprise("BloodBank-USA", Enterprise.EnterpriseType.BloodBankEnterprise);
        Enterprise pharmacy = countryNetwork.getEnterpriseDirectory().addNewEnterprise("Pharmacy-USA", Enterprise.EnterpriseType.PharmacyEnterprise);
        Enterprise insurance = countryNetwork.getEnterpriseDirectory().addNewEnterprise("Insurance-USA", Enterprise.EnterpriseType.InsuranceEnterprise);
        HospitalSystemEnterprise hospitalSystemEnterprise = (HospitalSystemEnterprise) hospital;
        hospitalSystemEnterprise.getAssociatedEnterprise().add(pharmacy);
        hospitalSystemEnterprise.getAssociatedEnterprise().add(bloodbank);
        hospitalSystemEnterprise.getAssociatedEnterprise().add(pharmacy);

        //ignore and delete this. test for stuti
        Network nepalNetwork = system.getRootNetwork().getSubNetworkDirectory().createAndAddNetwork("Nepal", NetworkType.COUNTRY.getValue());
        Enterprise nepalHospital = countryNetwork.getEnterpriseDirectory().addNewEnterprise("Hosp-Nepal", Enterprise.EnterpriseType.HospitalSystemEnterprise);
        Enterprise nepalBloodbank = countryNetwork.getEnterpriseDirectory().addNewEnterprise("BloodBank-Nepal", Enterprise.EnterpriseType.BloodBankEnterprise);


//        Employee e = system.getEmployeeDirectory().addNewEMployee("EnterAdmin");
//        UserAccount userAccount = hospital.getUserAccountDirectory().createUserAccount("en", "en", e, new EnterpriseAdminRole());
//        create ADMIN oRganization
        Organization adminOrganization = hospital.getOrganizationDirectory().
                createOrganization("Wecare-USA-Admin", Organization.Type.ADMIN);
        Employee admin = adminOrganization.getEmployeeDirectory().addNewEMployee("admin@gmail.com");
        UserAccount userAccountadmin = adminOrganization.getUserAccountDirectory().
                createUserAccount("ad", "ad", admin, new AdminRole());

        Employee receptionist = adminOrganization.getEmployeeDirectory().addNewEMployee("reception@gmail.com");
        UserAccount userAccountreceptionist = adminOrganization.getUserAccountDirectory().
                createUserAccount("re", "re", receptionist, new ReceptionistRole());

//        Create DOCTOR Organization
        Organization doctorOrganization = hospital.getOrganizationDirectory().
                createOrganization("Wecare-USA-Doctor", Organization.Type.DOCTOR);
        Employee doctor = doctorOrganization.getEmployeeDirectory().addNewEMployee("doctor@gmail.com");
        UserAccount userAccountdoctor = doctorOrganization.getUserAccountDirectory().
                createUserAccount("do", "do", doctor, new DoctorRole());

//        create NURSE Organization
        Organization nurseOrganization = hospital.getOrganizationDirectory().
                createOrganization("Wecare-USA-Nurse", Organization.Type.NURSE);
        Employee nurse = nurseOrganization.getEmployeeDirectory().addNewEMployee("nurse@gmail.com");
        UserAccount userAccountnurse = nurseOrganization.getUserAccountDirectory().
                createUserAccount("nu", "nu", nurse, new NurseRole());

//          create patient Organization
        Organization labOrganization = hospital.getOrganizationDirectory().
                createOrganization("Wecare-USA-LabAssistant", Organization.Type.LABORATORY);
        Employee lab = labOrganization.getEmployeeDirectory().addNewEMployee("lab@gmail.com");
        UserAccount userAccountlab = labOrganization.getUserAccountDirectory().
                createUserAccount("lab", "lab", lab, new LabAssistantRole());

//          create patient Organization
        Organization patientOrganization = hospital.getOrganizationDirectory().
                createOrganization("Wecare-USA-Patient", Organization.Type.PATIENT);
        Person patientProfile = new PatientProfile();
        patientProfile.setfName("Zuckerberg");
        patientProfile.setlName("Cena");
        patientProfile.setEmailId("bhavin29486@gmail.com");
        UserAccount userAccountpatient = patientOrganization.getUserAccountDirectory().
                createUserAccount("pa", "pa", patientProfile, new PatientRole());
        patientOrganization.getPersonDirectory().getPersonList().add(patientProfile);
        
        generateVitalSigns(patientProfile);

//        create donor organization
        Organization donorOrganization = hospital.getOrganizationDirectory().
                createOrganization("Wecare-USA-Donor", Organization.Type.DONOR);
        Person donorProfile = new DonorProfile();
        UserAccount uaerAccountdonor = donorOrganization.getUserAccountDirectory().
                createUserAccount("donor", "donor", donorProfile, new DonorRole());
        donorProfile.setfName("Test");
        donorProfile.setlName("Donor1");
        donorOrganization.getPersonDirectory().getPersonList().add(donorProfile);

        // Create pharmacy operations organization
        Organization pharmacyOpsOrg = pharmacy.getOrganizationDirectory().
                createOrganization("PE-PharmacyOrg", Organization.Type.PHARMACY);
        Employee pharmacyOps = pharmacyOpsOrg.getEmployeeDirectory().
                addNewEMployee("pharmacyops@gmail.com");
        UserAccount uaPharmacist = pharmacyOpsOrg.getUserAccountDirectory().
                createUserAccount("ph", "ph", pharmacyOps, new Pharmacist());

        Organization insuranceClaimsOrg = insurance.getOrganizationDirectory().
                createOrganization("PE-InsuranceOrg", Organization.Type.INSURANCE);
        Employee insuranceClaimsMgr = insuranceClaimsOrg.getEmployeeDirectory().
                addNewEMployee("insuranceOps@gmail.com");
        UserAccount uaInsuranceClaimsMgr = insuranceClaimsOrg.getUserAccountDirectory().
                createUserAccount("ic", "ic", pharmacyOps, new InsuranceClaimsManagerRole());

        Organization bloodInventoryOrg = bloodbank.getOrganizationDirectory().
                createOrganization("BloodBank-Inventory", Organization.Type.BLOODBANKINVENTORY);
        Employee bloodInventoryMgr = bloodInventoryOrg.getEmployeeDirectory().
                addNewEMployee("bloodInventory@gmail.com");
        UserAccount uaBloodInventoryMgr = bloodInventoryOrg.getUserAccountDirectory().
                createUserAccount("bim", "bim", bloodInventoryMgr, new BloodInventoryManagerRole());

//        Organization bloodSupplyOrg = bloodbank.getOrganizationDirectory().
//                createOrganization("BloodBank-Supply", Organization.Type.BLOODBANKSUPPLY);
//        Employee bloodSupplyMgr = bloodSupplyOrg.getEmployeeDirectory().
//                addNewEMployee("bloodDonation@gmail.com");
//        UserAccount uaBloodSupplyMgr = bloodSupplyOrg.getUserAccountDirectory().
//                createUserAccount("bdm", "bdm", bloodSupplyMgr, new BloodSupplyManagerRole());

        return business;
    }

    public static void populateCountryCityState() {

        ArrayList<String> countryNames = new ArrayList<>(Arrays.asList("USA", "India", "Canada"));

        for (int i = 0; i < countryNames.size(); i++) {
            String countryName = countryNames.get(i);
            Country country = new Country(countryName);

            if (countryName.equalsIgnoreCase("USA")) {
                country.getStates().add(new State("MA"));
                country.getStates().add(new State("New York"));
                country.getStates().add(new State("Califonia"));

            }

            if (countryName.equalsIgnoreCase("India")) {
                country.getStates().add(new State("Maharashtra"));
                country.getStates().add(new State("Gujarat"));
                country.getStates().add(new State("Delhi"));

            }

            if (countryName.equalsIgnoreCase("Canada")) {
                country.getStates().add(new State("Ontario"));
                country.getStates().add(new State("Ottawa"));
                country.getStates().add(new State("Alberta"));

            }
            countries.add(country);

        }
    }

    public static ArrayList<Country> getCountries() {
        return countries;
    }

    public static void addInsurancePlan() {
        insuranceMap.put("Blue Cross Blue Shield", 450);
        insuranceMap.put("Anthem PPO", 750);
        insuranceMap.put("Signa", 1500);
        insuranceMap.put("Harvard Medical", 2000);
    }

    public static HashMap<String, Integer> getInsuranceMap() {
        return insuranceMap;
    }

    public static void generateVitalSigns(Person person) {
        PatientProfile patientProfile = (PatientProfile) person;
        for (int i = 0; i < 5; i++) {
            VitalSigns newVitalSigns = new VitalSigns(new Random().nextInt(100), new Random().nextInt(200), new Random().nextInt(200));
            Encounter encounter = new Encounter(Utils.getRandomDate(), newVitalSigns);
            newVitalSigns.setEncounter(encounter);
            patientProfile.getEncounterHistory().addNewEncounter(encounter);
        }
    }

}
