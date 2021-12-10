package com.company;

public class CommissionEmployee extends Employee
{
  private double grossSales; // gross weekly sales
  private double commissionRate; // commission percentage


  // five-argument constructor
  public CommissionEmployee( String first, String last, String ssn,
                             double sales, double rate )
  {
    super( first, last, ssn );
    setGrossSales( sales );
    setCommissionRate( rate );
  }
  public void setCommissionRate( double rate )
  {
    commissionRate = ( rate &gt; 0.0 &amp;&amp; rate &lt; 1.0 ) ? rate : 0.0;
  } // end method setCommissionRate


  // return commission rate
  public double getCommissionRate()
  {
    return commissionRate;
  } // end method getCommissionRate


  // set gross sales amount
  public void setGrossSales( double sales )
  {
    grossSales = ( sales &lt; 0.0 ) ? 0.0 : sales;
  } // end method setGrossSales


  // return gross sales amount
  public double getGrossSales()
  {
    return grossSales;
  } // end method getGrossSales


  // calculate earnings; override abstract method earnings in Employee
  public double earnings()
  {
    return getCommissionRate() * getGrossSales();
  } // end method earnings


  // return String representation of CommissionEmployee object
  public String toString()
  {
    return String.format( "%s: %sn%s: $%,.2f; %s: %.2f",
            "commission employee", super.toString(),
            "gross sales", getGrossSales(),
            "commission rate", getCommissionRate() );
  } // end method toString
}