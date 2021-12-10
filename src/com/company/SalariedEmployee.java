package com.company;

public class SalariedEmployee extends Employee
{
  private double weeklySalary;


  public SalariedEmployee( String first, String last, String ssn,
                           double salary )
  {
    super( first, last, ssn );
    setWeeklySalary( salary );
  }
  public void setWeeklySalary( double salary )
  {
    weeklySalary = salary &lt; 0.0 ? 0.0 : salary;
  }
  public double getWeeklySalary()
  {
    return weeklySalary;
  }
  public double earnings()
  {
    return getWeeklySalary();
  }
  public String toString()
  {
    return String.format( "salaried employee: %sn%s: $%,.2f",
            super.toString(), "weekly salary", getWeeklySalary() );
  } // end method toString
}
