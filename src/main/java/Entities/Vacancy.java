package Entities;

public class Vacancy {
    public String jobTitle;
    public String role;
    public String seniority;
    public String yearsOfExperience;
    public String description;
    public String domain;
    public String mainStacks;
    public String secondaryStacks;
    public String englishLevel;
    public String mainLanguage;
    public String otherLanguages;
    public String otherLanguagesLevel;
    public String preferableLocation;
    public String workType;
    public String employmentType;
    public String hourlySalaryMin;
    public String hourlySalaryMax;
    public String annualSalaryMin;
    public String annualSalaryMax;
    public boolean dontShowSalary;

    public Vacancy(String jobTitle, String role, String mainStacks, String secondaryStacks,
                   String otherLanguages, String otherLanguagesLevel, String preferableLocation,
                   String workType, String hourlySalaryMin){
        this.jobTitle = jobTitle;
        this.role = role;
        this.mainStacks = mainStacks;
        this.secondaryStacks = secondaryStacks;
        this.otherLanguages = otherLanguages;
        this.otherLanguagesLevel = otherLanguagesLevel;
        this.preferableLocation = preferableLocation;
        this.workType = workType;
        this.hourlySalaryMin = hourlySalaryMin;
    }
}
