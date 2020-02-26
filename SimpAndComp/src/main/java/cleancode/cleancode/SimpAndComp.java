package cleancode.cleancode;

public class SimpAndComp {
	double interest(double principle,double rate,int time)
	{
		double simpleinterest=((principle*rate*time)/100);
		return simpleinterest;
	}
	double compound(double pr,double rate,int time)
	{
	  double  com=pr * Math.pow(1.0+rate/100.0,time) - pr;
	  return com;
	}

}
