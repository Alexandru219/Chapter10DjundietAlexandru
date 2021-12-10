package com.company;

package com.company;

public class Ex14BPCommissionEmployee extends CommissionEmployee
{
  private double baseSalary; // base salary per week


  // six-argument constructor
  public Ex14BPCommissionEmployee( String first, String last,
                                   String ssn, double sales, double rate, double salary )
  {
    super( first, last, ssn, sales, rate );
    setBaseSalary( salary ); // validate and store base salary
  } // end six-argument BasePlusCommissionEmployee constructor


  // set base salary
  public void setBaseSalary( double salary )
  {
    baseSalary = ( salary &lt; 0.0 ) ? 0.0 : salary; // non-negative
  } // end method setBaseSalary


  // return base salary
  public double getBaseSalary()
  {
    return baseSalary;
  } // end method getBaseSalary


  public double earnings()
  {
    return getBaseSalary() + super.earnings();
  } // end method earnings


  public String toString()
  {
    return String.format( "%s %s; %s: $%,.2f",
            "base-salaried", super.toString(),
            "base salary", getBaseSalary() );
  } // end method toString
}

