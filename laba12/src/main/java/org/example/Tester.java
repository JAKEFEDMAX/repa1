package org.example;

import java.util.Objects;

public class Tester
{
    protected String name;
    protected String surname;
    protected int experienceInYears;
    protected int englishLevel;
    protected float salary;

    public Tester(String name, String surname)
    {
        this.name = name;
        this.surname = surname;
    }

    public Tester(String name, String surname, int salary, int experienceInYears)
    {
        this(name, surname);
        this.salary = salary;
        this.experienceInYears = experienceInYears;
    }

    public Tester(String name, String surname, int salary, int experienceInYears, int englishLevel)
    {
        this(name, surname, salary, experienceInYears);
        this.englishLevel = englishLevel;
    }
    public static void printInfo(String message)
    {
        System.out.println(message);
    }
    public int getEnglishLevel() {
        return englishLevel;
    }
    public void setEnglishLevel(int englishLevel)
    {
        this.englishLevel = englishLevel;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public float getSalary()
    {
        return salary;
    }
    public void setSalary(float salary)
    {
        this.salary = salary;
    }
    public int getExperienceInYears()
    {
        return experienceInYears;
    }
    public void setExperienceInYears(int experienceInYears)
    {
        this.experienceInYears = experienceInYears;
    }
    public String getSurname()
    {
        return surname;
    }
    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Tester tester = (Tester) o;
        return experienceInYears == tester.experienceInYears && englishLevel == tester.englishLevel &&
                Float.compare(salary, tester.salary) == 0 && Objects.equals(name, tester.name) &&
                Objects.equals(surname, tester.surname);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, surname, experienceInYears, englishLevel, salary);
    }

    @Override
    public String toString() {
        return "Тестировщик: " +
                "Имя - " + name +
                ", Фамилия - " + surname +
                ", Опыт в годах - " + experienceInYears +
                ", Уровень английского - " + englishLevel +
                ", Зарплата - " + salary + " BYN";
    }
}
