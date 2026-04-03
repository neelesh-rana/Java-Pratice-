package com.OOPS2.ABSTRACT.Ex2;

public class FreelanceEmployee extends  Employee {
    double ratePerProject;
    int projectsCompleted;

    FreelanceEmployee(String name, int id, double ratePerProject, int projectsCompleted) {
        super(name, id);
        this.ratePerProject = ratePerProject;
        this.projectsCompleted = projectsCompleted;
    }

    @Override
    double calculateSalary() {
        return ratePerProject * projectsCompleted;   // Paid per project
    }
}
