
package JavaApplication3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Calendar;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class NewClass extends JPanel implements ActionListener
{   int width, height;
    double ang_deg=0,ang_rad=0;
    int p1,q1,p2,q2,k,l,num;
    String no;
    static boolean tmzone=false;
    static Clip clip;
   // int seconds,minutes,hours;
    static boolean abc=true;
    static boolean sys_time=true;
    static int utc_min=0;
    static int utc_hr=0;
    static int hours=0;
    static int seconds=0;
    static int minutes=0;
    static boolean alarm=false;
    static int x=0;
    static int y=0;
    Font font_tm=new Font("Stencil",Font.BOLD,18);  
    int o=0;
    static JLabel err2=new JLabel("");
    Timer t=new Timer(1000,this);
    String rem_tm="";
    static JComboBox colo1 = new JComboBox();
    static JComboBox colo2 = new JComboBox();
    String hr_string="";
    String min_string="";
    String timeString="";
    String sec_string="";
    String ampm="AM";
    
    
    public NewClass()
    {

      this.setBackground(Color.ORANGE);
      width = 670;
      height = 570;
      ang_deg=0;ang_rad=0;
      x=0;y=0;
      try{
        File file=new File("C:\\Users\\admin\\Desktop\\alrm.wav");
        AudioInputStream sound = AudioSystem.getAudioInputStream(file);
        clip=AudioSystem.getClip();
        clip.open(sound);
        }
        catch(Exception e){}
     
    }
    @Override
    public void paintComponent(Graphics g)
    {  
       super.paintComponent(g);
       num=-1;
       color_switch((String)colo2.getSelectedItem(),g);
       Graphics2D g2=(Graphics2D)g;
       g2.setStroke(new BasicStroke(4));
       g2.setStroke(new BasicStroke(26));
       g.drawOval(width/2-210,height/2-210,420,420);
       while(ang_deg<=360)
       { 
           
       
           
         
          ang_rad= Math.toRadians(ang_deg);
          ang_rad-=0.5 * Math.PI;
          p1 = (int) (185*Math.cos(ang_rad));
          q1 = (int) (185*Math.sin(ang_rad));
          p2 = (int) (200*Math.cos(ang_rad));
          q2 = (int) (200*Math.sin(ang_rad));
          if(ang_deg%30==0)          
          { num++;
            if(num!=0)
            {
            g2.setStroke(new BasicStroke(5));
            g.drawLine(width/2+p1,height/2+q1,width/2+p2,height/2+q2 ); 
            String no=Integer.toString(num);
            g.setFont(new Font("TimesRoman",Font.BOLD,32));
            g.drawString(no,(int)(width/2+(170*Math.cos(ang_rad)))-10,(int)(height/2+(170*Math.sin(ang_rad)))+13);
            if(num==12)
            {
               num=num-12;
            }
            }
          }      
          else
          { p1 = (int) (195*Math.cos(ang_rad));
            q1 = (int) (195*Math.sin(ang_rad));
            g2.setStroke(new BasicStroke(3));
            g.drawLine(width/2+p1,height/2+q1,width/2+p2,height/2+q2 );  
          }
            ang_deg=ang_deg+6;
        }
        color_switch((String)colo1.getSelectedItem(),g);
        g2.setStroke(new BasicStroke(4));
        drawWedge( 2*Math.PI * (hours+(0.0167)*minutes) / 12, width/7, g ); 
        drawWedge( 2*Math.PI * minutes / 60, width/5, g ); 
        g2.setStroke(new BasicStroke(3));
        drawHand( 2*Math.PI * seconds / 60, width/4, g ); 
        g.setFont(font_tm);
        g.setColor(Color.WHITE);
        g.drawString(timeString,670/2+120+40+40,570);
       
        t.start();
    }
    public void actionPerformed(ActionEvent e)
    {  
       ang_deg=0;
       num=0;
       if(sys_time)
       {
        Calendar cal = Calendar.getInstance();  
        hours = cal.get( Calendar.HOUR_OF_DAY );  
        minutes = cal.get( Calendar.MINUTE );  
        seconds = cal.get( Calendar.SECOND );
            if(tmzone)
       {
       hours+=utc_hr;
         minutes+=utc_min;
         if(minutes<0)
         {
               minutes=60+minutes;
               hours--;
          }
         if(hours<0)
         {
             hours=24+hours;
               
         }
     
       }
       }
       else
       { seconds++;
         
       
         if(seconds>=60)
         {
            minutes++;
            seconds=0;
         }
         if(minutes>=60)
         {
            hours++;
            minutes=0;   
         } 
       }
             if(hours<10)
             {
               hr_string="0"+hours;
             }
             else
             {
               if(hours>=12)
               {
                 ampm="PM";
                 hr_string=String.valueOf(hours-12);
               }
             }
             if(seconds<10)
             {
               sec_string="0"+seconds;
             }
             else
             {
                sec_string=String.valueOf(seconds);
             }
             if(minutes<10)
             {
               min_string="0"+minutes;
             }
             else
             {
                min_string=String.valueOf(minutes);
             }     
             if(alarm)
             {
                   if(hours==x&&minutes==y&&seconds==0)
                   {   
                      rem_tm="";
                      clip.loop(1000);
                      err2.setText("");
                      alarm=false;
                      
                   }
                   else{   
                           k=x-hours;
                           l=y-minutes-1;
                           o=60-seconds;
                           if(l<0)
                           {
                            l=60+l;
                            k--;
                           }
                           if(k<0)
                           {
                              k=24+k;
                           }
                          
                           rem_tm=k+" Hours "+l+" Minutes "+o+" Seconds  Remaining ";
                          
                           err2.setText(rem_tm);
                       }
             }   
        
             timeString = hr_string+":"+min_string+":"+sec_string+ampm; 
             
        repaint();
    }
    
     void drawHand( double angle, int radius, Graphics g ) 
    {  
       angle -= 0.5 * Math.PI;  
       int x = (int)( radius*Math.cos(angle) );  
       int y = (int)( radius*Math.sin(angle) );
       int m = (int)( (radius-120)*Math.cos(angle+1 * Math.PI));
       int n = (int)( (radius-120)*Math.sin(angle+1 * Math.PI) );  
       g.drawLine( width/2, height/2, width/2 + x, height/2 + y );  
       g.drawLine(width/2,height/2 ,(width/2+m) ,(height/2+n)  );
       g.drawOval( (width/2+m)-3,(height/2+n)-3 ,6,6);
       g.fillOval( (width/2+m)-3,(height/2+n)-3 ,6,6);
    }  
   
    void drawWedge( double angle, int radius, Graphics g ) {  
       angle -= 0.5 * Math.PI;  
       int x = (int)( radius*Math.cos(angle) );  
       int y = (int)( radius*Math.sin(angle) );  
       angle += 2*Math.PI/3;  
       int x2 = (int)( 5*Math.cos(angle) );  
       int y2 = (int)( 5*Math.sin(angle) );  
       angle += 2*Math.PI/3;  
       int x3 = (int)( 5*Math.cos(angle) );  
       int y3 = (int)( 5*Math.sin(angle) );  
       g.drawLine( width/2+x2, height/2+y2, width/2 + x, height/2 + y );  
       g.drawLine( width/2+x3, height/2+y3, width/2 + x, height/2 + y );  
       g.drawLine( width/2+x2, height/2+y2, width/2 + x3, height/2 + y3 );  
    }
    
    public void color_switch(String s,Graphics g)
    {   
        switch(s)
        {
            case "BLACK" : g.setColor(Color.BLACK);
                           break;
            case "RED" : g.setColor(Color.RED);
                           break;
            case "WHITE" : g.setColor(Color.WHITE);
                            break;
            case "DARK GRAY" : g.setColor(Color.DARK_GRAY);
                               break;
            case "BLUE" : g.setColor(Color.BLUE);
                          break;
            case "GREEN": g.setColor(Color.GREEN);
                          break;
            case "YELLOW": g.setColor(Color.YELLOW);
                           break;
            case "GRAY": g.setColor(Color.GRAY);
                           break;
            default: g.setColor(Color.BLACK);
                          break;
        }
    }
  
}
