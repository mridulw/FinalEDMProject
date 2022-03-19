package net.codejava;

public class VDepartmentStat {
    String deptid;
    double AverageSalary;
    double HighestSalary;
    double LowestSalary;

    public String getDeptid() {
        return this.deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid;
    }

    public double getAverageSalary() {
        return this.AverageSalary;
    }

    public void setAverageSalary(double AverageSalary) {
        this.AverageSalary = AverageSalary;
    }

    public double getHighestSalary() {
        return this.HighestSalary;
    }

    public void setHighestSalary(double HighestSalary) {
        this.HighestSalary = HighestSalary;
    }

    public double getLowestSalary() {
        return this.LowestSalary;
    }

    public void setLowestSalary(double LowestSalary) {
        this.LowestSalary = LowestSalary;
    }

    public VDepartmentStat(String deptid, double AverageSalary, double HighestSalary, double LowestSalary) {
        this.deptid = deptid;
        this.AverageSalary = AverageSalary;
        this.HighestSalary = HighestSalary;
        this.LowestSalary = LowestSalary;
    }

    public VDepartmentStat() {
    }

    @Override
    public String toString() {
        return "{" +
            " deptid='" + getDeptid() + "'" +
            ", AverageSalary='" + getAverageSalary() + "'" +
            ", HighestSalary='" + getHighestSalary() + "'" +
            ", LowestSalary='" + getLowestSalary() + "'" +
            "}";
    }

}
