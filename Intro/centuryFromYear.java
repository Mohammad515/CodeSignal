/*
 *  Given a year, return the century it is in. The first century spans from the year 1 up to and including the year 100,
 *  the second - from the year 101 up to and including the year 200, etc.
 *
 *  Example
 *
 *  For year = 1905, the output should be centuryFromYear(year) = 20;
 *  For year = 1700, the output should becenturyFromYear(year) = 17
 *
 *  Geben Sie für ein gegebenes Jahr das Jahrhundert zurück, in dem es sich befindet.
 *  Das erste Jahrhundert erstreckt sich vom ersten Jahr bis einschließlich des Jahres 100, 
 *  das zweite vom Jahr 101 bis einschließlich des Jahres 200 usw.
 *
 *  Beispiele
 *
 *  Für Jahr = 1905 sollte die Ausgabe CenturyFromYear (Jahr) = 20 sein;
 *  Für Jahr = 1700 sollte die Ausgabe ab Jahr (Jahr) = 17 sein
 *
 *
 *  @author Mohammad AlMahamed 
 */
 
 
 int centuryFromYear(int year) {
 
if (year % 100 == 0) 
 {    
  return year/100 ;
 }
  else
      {
      return (year/100) + 1 ;
      }        


 
