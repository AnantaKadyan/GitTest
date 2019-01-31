
 public class MyTime
{
	private int hour;
	private int minute;
	private int second;
	

	public MyTime()
	{
		hour = 0;
		minute = 0;
		second = 0;
	}

	public MyTime (int hour,int minute,int second) throws IllegalArgumentException
	{
		if ((hour<=23 && hour>=0) && (minute>=0 && minute<60) && (second>=0 && second<60))
			setTime( hour ,minute,second);
		else 
			throw new IllegalArgumentException("invalid");
	}

public	void setTime( int hour, int minute, int second) 
	{
       this.hour= hour;
       this.minute = minute;
       this.second = second;

	}


   public  int getHour()
	{
		return hour;
	}

	public int getMinute()
	{
		return minute;
	}

public 	int getSecond()
	{
		return second;
	}
	public void setHour(int hour)
	{
       if ( hour>23)
       this.hour = 0;
      else if (hour <0)
       this.hour = 23;
     else 
     	this.hour = hour;
	}
public 	void setMinute( int minute)
	{
	    if ( minute>59)
       this.minute = 0;
      else if (minute <0)
       this.minute = 59;
     else 
     	this.minute =minute;
	}
public 	void setSecond(int second)
	{
		if ( second>59)
       this.second = 0;
      else if (second <0)
       this.second = 59;
     else 
     	this.second = second;	
	}
    
  public  String toString()
    {
    	String s = String.format("%02d:%02d:%02d",hour,minute,second);
    	return s;

    }

  public   MyTime nextHour()
    {
    	MyTime temp = new MyTime();
        temp.setHour( getHour() +1);
        temp.setMinute( getMinute());
        temp.setSecond ( getSecond());
        return temp;
	}

	public  MyTime nextMinute()
    {
    	MyTime temp = new MyTime();
    	if( getMinute() == 59)
    	{
        temp.setHour( getHour() +1 );
        temp.setMinute( getMinute()+1);
        temp.setSecond ( getSecond());
        }
        else
        {
          temp.setHour( getHour() );
        temp.setMinute( getMinute()+1);
        temp.setSecond ( getSecond());	
        }
        return temp;
	}

	 MyTime nextSecond()
    {
    	MyTime temp = new MyTime();
   
        if ( getMinute() == 59 && getSecond() ==59)
        {
        temp.setHour( getHour() +1);
        temp.setMinute( getMinute() +1);
        temp.setSecond ( getSecond() +1);	
        }
        else  if( getSecond() == 59)
      {
        temp.setHour( getHour() );
        temp.setMinute( getMinute() +1);
        temp.setSecond ( getSecond() +1);
        }
        else
        {
        	temp.setHour( getHour() );
        temp.setMinute( getMinute() );
        temp.setSecond ( getSecond() +1);
        }
        return temp;
	}

      public   MyTime previousHour()
    {
      MyTime temp = new MyTime();
        temp.setHour( getHour() -1);
        temp.setMinute( getMinute());
        temp.setSecond ( getSecond());
        return temp;
  }
     
   MyTime previousMinute()
    {
      MyTime temp = new MyTime();
      if( getMinute() == 0)
      {
        temp.setHour( getHour() -1 );
        temp.setMinute( getMinute()-1);
        temp.setSecond ( getSecond());
        }
        else
        {
          temp.setHour( getHour() );
        temp.setMinute( getMinute()-1);
        temp.setSecond ( getSecond());  
        }
        return temp;
  }

  MyTime previousSecond()
    {
      MyTime temp = new MyTime();
   
        if ( getMinute() == 0 && getSecond() ==0)
        {
        temp.setHour( getHour() -1);
        temp.setMinute( getMinute() -1);
        temp.setSecond ( getSecond() -1); 
        }
        else  if( getSecond() == 0)
      {
        temp.setHour( getHour() );
        temp.setMinute( getMinute() -1);
        temp.setSecond ( getSecond() -1);
        }
        else
        {
          temp.setHour( getHour() );
        temp.setMinute( getMinute() );
        temp.setSecond ( getSecond() -1);
        }
        return temp;
  }






    }



