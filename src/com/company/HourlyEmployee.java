package com.company;

public class HourlyEmployee extends Employee
{
  private double wage;
  private double hours;


  public HourlyEmployee( String first, String last, String ssn,
                         double hourlyWage, double hoursWorked )
  {
    super( first, last, ssn );
    setWage( hourlyWage );
    setHours( hoursWorked );
  }


  // set wage
  public void setWage( double hourlyWage )
  {
    wage = ( hourlyWage &lt; 0.0 ) ? 0.0 : hourlyWage;
  } // end method setWage


  // return wage
  public double getWage()
  {
    return wage;
  } // end method getWage


  // set hours worked
  public void setHours( double hoursWorked )
  {
    hours = ( ( hoursWorked &gt;= 0.0 ) &amp;&amp; ( hoursWorked &lt;= 168.0 ) ) ?
    hoursWorked : 0.0;
  }
  public double getHours()
  {
    return hours;
  }
  public double earnings()
  {
    if ( getHours() &lt = 40 )
    return getWage() * getHours();
     else
    return 40 * getWage() + ( getHours() - 40 ) * getWage() * 1.5;
  }
  public String toString()
  {
    return String.format( "hourly employee: %sn%s: $%,.2f; %s: %,.2f",
            super.toString(), "hourly wage", getWage(),
            "hours worked", getHours() );
  }
}

