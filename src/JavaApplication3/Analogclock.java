package JavaApplication3;

import java.awt.*;
import java.util.Random;
import javax.swing.*;


public class Analogclock extends NewClass {


    
     int milseconds=0;
     int sec=0;
     int lapint=0;
     boolean flag=true;
     JLabel stopwt=new JLabel("");
  
      JLabel b_lb=new JLabel();
      String s[]=new String[5];
      int r1; 
      Dimension t=new Dimension(0,60);
      Dimension l=new Dimension(350,400);
      Dimension c=new Dimension(200,400);
      Dimension r=new Dimension(350,400);
      Dimension b=new Dimension(0,60);
      int check=0;
   
      Dimension l1d=new Dimension(350,195);
      String sec1="";
      String mil="";
      NewClass n=new NewClass();
      String ampm="AM";
      JToggleButton set1=new JToggleButton("SET");
      JButton set2=new JButton("SET");
       
      JTextField s_1=new JTextField("HH");
       
      JTextField s_2=new JTextField("MM");
      JTextField s_3=new JTextField("SS");
      JTextField a_1=new JTextField("HH");
      JTextField a_2=new JTextField("MM");
       
       JToggleButton strt=new JToggleButton("START");
       JButton paus=new JButton("PAUSE");
       JButton lap=new JButton("LAP");
      
       
       JToggleButton Tog_but1 =new JToggleButton("SET"); 
       Dimension jtog2=new Dimension(67,24);
       Dimension jtog1=new Dimension(75,24);
       Dimension lapp=new Dimension(110,24);
       Dimension bx=new Dimension(24,24);
       Font head=new Font("Stencil",Font.BOLD,36);
       Font subhead=new Font("Stencil",Font.BOLD,18);
       Font quote_f=new Font("Stencil",Font.BOLD,20);
       Font txt=new Font("Berlin Sans FB Demi",Font.BOLD,14);
       JLabel err1=new JLabel("");
       JComboBox time_box=new JComboBox();
       JLabel lap1=new JLabel("lap1");
        JLabel lap2=new JLabel("lap2");
        JLabel lap3=new JLabel("lap3");
        JLabel lap4=new JLabel("lap4");
        JLabel lap5=new JLabel("lap5");
        JLabel lap6=new JLabel("lap6");
       

   
    public Analogclock()
    {   
        r1=0;
        s[0]="   \"The two most powerful warriors are patience and time\"   -  Leo Tolstoy";
        s[1]="   \"The time is always right to do what is right\"   -  Martin Luther King, Jr.";
        s[2]="   \"Someone is sitting in the shade today because someone planted a tree a long time ago\"   -  Warren Buffett";
        s[3]="   \"A man who dares to waste one hour of time has not discovered the value of life\" -  Charles Darwin";
        s[4]="   \"Time stays long enough for anyone who will use it\"  -  Leonardo da Vinci";
        Random ran=new Random();
        int ra=ran.nextInt(5);
        check=ra;
        
        lap1.setVisible(false);
        lap2.setVisible(false);
        lap3.setVisible(false);
        lap4.setVisible(false);
        lap5.setVisible(false);
        lap6.setVisible(false);
        lap1.setPreferredSize(lapp);
        lap2.setPreferredSize(lapp);
        lap3.setPreferredSize(lapp);
        lap4.setPreferredSize(lapp);
        lap5.setPreferredSize(lapp);
        lap6.setPreferredSize(lapp);
        lap1.setForeground(Color.WHITE);
        lap2.setForeground(Color.WHITE);
        lap3.setForeground(Color.WHITE);
        lap4.setForeground(Color.WHITE);
        lap5.setForeground(Color.WHITE);
        lap6.setForeground(Color.WHITE);
        
        JLabel t_lb=new JLabel("ANALOG CLOCK");
      
        JFrame f =new JFrame("ANALOG CLOCK");
        JPanel pane_left=new JPanel();
        JPanel pane_right=new JPanel();
        JPanel pane_center=new JPanel();
        JPanel pane_top=new JPanel();
        JPanel pane_bottom=new JPanel();
      
         pane_bottom.add(b_lb);
       
      GridBagConstraints con=new GridBagConstraints();

        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        f.add(pane_right,BorderLayout.EAST);
        f.add(pane_left,BorderLayout.WEST);
        f.add(n,BorderLayout.CENTER);
        f.add(pane_top,BorderLayout.NORTH);
        f.add(pane_bottom,BorderLayout.SOUTH);
         
        pane_top.setBackground(Color.ORANGE);
        pane_top.setPreferredSize(t);
        pane_top.setLayout(new GridBagLayout());
        pane_top.add(t_lb);
        t_lb.setForeground(Color.WHITE);
        t_lb.setBackground(Color.BLACK);
        t_lb.setFont(head);
        
        colo1.addItem("BLACK");
        colo1.addItem("RED");
        colo1.addItem("WHITE");
        colo1.addItem("BLUE");
        colo1.addItem("GREEN");
        colo1.addItem("YELLOW");
        colo2.addItem("BLACK");
        colo2.addItem("RED");
        colo2.addItem("WHITE");
        colo2.addItem("BLUE");
        colo2.addItem("GREEN");
        colo2.addItem("YELLOW");
        
        pane_bottom.setLayout(new GridBagLayout());
        pane_left.setBackground(Color.BLACK);
        pane_left.setPreferredSize(l);
        JPanel l1=new JPanel();
        JPanel l2=new JPanel();
        JPanel l3=new JPanel();
          
        l1.setBackground(Color.BLACK);
        l2.setBackground(Color.BLACK);
        l3.setBackground(Color.BLACK);
        l1.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        l2.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        l3.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        pane_left.setLayout(new GridBagLayout());
        l1.setPreferredSize(l1d);
        l2.setPreferredSize(l1d);
        l3.setPreferredSize(l1d);
        con.gridx=0;
        con.gridy=0;
        pane_left.add(l1,con);
        con.gridx=0;
        con.gridy=1;
        pane_left.add(l2,con);
        con.gridx=0;
        con.gridy=2;
        pane_left.add(l3,con);
        
        pane_right.setBackground(Color.BLACK);
        pane_right.setPreferredSize(r);
        JPanel r1=new JPanel();
        JPanel r2=new JPanel();
        JPanel r3=new JPanel();
        r1.setBackground(Color.BLACK);
        r2.setBackground(Color.BLACK);
        r3.setBackground(Color.BLACK);
        r1.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        r2.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        r3.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        pane_right.setLayout(new GridBagLayout());
        r1.setPreferredSize(l1d);
        r2.setPreferredSize(l1d);
        r3.setPreferredSize(l1d);
        con.gridx=0;
        con.gridy=0;
        pane_right.add(r1,con);
        con.gridx=0;
        con.gridy=1;
        pane_right.add(r2,con);
        con.gridx=0;
        con.gridy=2;
        pane_right.add(r3,con);   
        JLabel sub1=new JLabel("SET TIME :                                  ");
        sub1.setFont(subhead);
        sub1.setForeground(Color.WHITE);
        JLabel settime=new JLabel("SET TIME :        ");
        JLabel timezone=new JLabel("TIME ZONE :     ");
        settime.setFont(txt);
        timezone.setFont(txt);
        settime.setForeground(Color.WHITE);
        timezone.setForeground(Color.WHITE);

        time_box.addItem("INDIA (UTC+05:30)");
        time_box.addItem("US (UTC-06:00)");
        time_box.addItem("UK (UTC+01:00)");
        time_box.addItem("CHINA (UTC+08:00)");
        time_box.addItem("JAPAN (UTC+09:00)");
        time_box.addItem("AUSTRALIA (UTC+09:30)");
        time_box.setSelectedItem("INDIA (UTC+05:30)");
  
        b_lb.setText(s[ra]);
        err1.setFont(txt);
        err1.setForeground(Color.RED);
        l1.setLayout(new FlowLayout());
        l1.add(sub1);
        l1.add(Box.createVerticalStrut(30));
        l1.add(settime);
        l1.add(Box.createVerticalStrut(80));
        l1.add(s_1);
        set1.setPreferredSize(jtog1);
        set2.setPreferredSize(jtog2);
       // s_1.addActionListener(new 
        l1.add(Box.createHorizontalStrut(10));
        l1.add(s_2);
        l1.add(Box.createHorizontalStrut(10));
        l1.add(s_3);
        l1.add(Box.createHorizontalStrut(38));
        l1.add(set1);
        set1.addActionListener(new java.awt.event.ActionListener() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
             set1ActionPerformed(evt);
              }
                });
        l1.add(timezone);
        l1.add(time_box);
        l1.add(set2);
        set2.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
              set2ActionPerformed(evt);        
            }
        });
         s_1.addMouseListener(new java.awt.event.MouseAdapter() {
                                    public void mouseEntered(java.awt.event.MouseEvent evt) {
                                        s_1MouseEntered(evt);
                                    }
                                    public void mouseExited(java.awt.event.MouseEvent evt) {
                                        s_1MouseExited(evt);
                                    }
                                });
         s_1.addKeyListener(new java.awt.event.KeyAdapter() {
                                    public void keyTyped(java.awt.event.KeyEvent evt) {
                                        s_1KeyTyped(evt);
                                    }
                                });
          s_2.addKeyListener(new java.awt.event.KeyAdapter() {
                                    public void keyTyped(java.awt.event.KeyEvent evt) {
                                        s_2KeyTyped(evt);
                                    }
                                });
          
        s_2.addMouseListener(new java.awt.event.MouseAdapter() {
                                    public void mouseEntered(java.awt.event.MouseEvent evt) {
                                        s_2MouseEntered(evt);
                                    }
                                    public void mouseExited(java.awt.event.MouseEvent evt) {
                                        s_2MouseExited(evt);
                                    }
                                });
        s_3.addKeyListener(new java.awt.event.KeyAdapter() {
                                    public void keyTyped(java.awt.event.KeyEvent evt) {
                                        s_3KeyTyped(evt);
                                    }
                                });
        s_3.addMouseListener(new java.awt.event.MouseAdapter() {
                                    public void mouseEntered(java.awt.event.MouseEvent evt) {
                                        s_3MouseEntered(evt);
                                    }
                                    public void mouseExited(java.awt.event.MouseEvent evt) {
                                        s_3MouseExited(evt);
                                    }
                                });
                
        l1.add(Box.createVerticalStrut(45));
        l1.add(err1);
 
        JLabel sub2=new JLabel("ALARM :                                        ");
        sub2.setForeground(Color.WHITE);
        sub2.setFont(subhead);
        JLabel set_alrm=new JLabel("SET ALARM :");
        set_alrm.setForeground(Color.WHITE);
        set_alrm.setFont(txt);
        
        a_1.setPreferredSize(bx);
        a_2.setPreferredSize(bx);
        err2.setForeground(Color.RED);
        err2.setFont(txt);
        l2.setLayout(new FlowLayout());
        l2.add(sub2);
        Tog_but1.setPreferredSize(jtog1);
        l2.add(Box.createVerticalStrut(60));
        l2.add(set_alrm);
        l2.add(Box.createVerticalStrut(40));
        l2.add(Box.createHorizontalStrut(30));
        l2.add(a_1);
        l2.add(Box.createHorizontalStrut(20));
        l2.add(a_2);
        l2.add(Box.createHorizontalStrut(30));
        l2.add(Tog_but1);
        l2.add(Box.createVerticalStrut(95));
        l2.add(err2);
        stopwt.setPreferredSize(jtog1);
        Tog_but1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tog_but1ActionPerformed(evt);
                
            }});
         a_1.addKeyListener(new java.awt.event.KeyAdapter() {
                                    public void keyTyped(java.awt.event.KeyEvent evt) {
                                        a_1KeyTyped(evt);
                                    }
                                });
         a_1.addMouseListener(new java.awt.event.MouseAdapter() {
                                 
                                    public void mouseEntered(java.awt.event.MouseEvent evt) {
                                        a_1MouseEntered(evt);
                                    }
                                    public void mouseExited(java.awt.event.MouseEvent evt) {
                                        a_1MouseExited(evt);
                                    }
                                });
         a_2.addKeyListener(new java.awt.event.KeyAdapter() {
                                    public void keyTyped(java.awt.event.KeyEvent evt) {
                                        a_2KeyTyped(evt);
                                    }
                                });
         a_2.addMouseListener(new java.awt.event.MouseAdapter() {
                                  
                                    public void mouseEntered(java.awt.event.MouseEvent evt) {
                                        a_2MouseEntered(evt);
                                    }
                                    public void mouseExited(java.awt.event.MouseEvent evt) {
                                        a_2MouseExited(evt);
                                    }
                                });
                          
        
        JLabel sub3=new JLabel("QUOTE  :                                       ");
        JButton ch_quote = new JButton("CHANGE QUOTE");
        sub3.setFont(subhead);
        sub3.setForeground(Color.WHITE);
        ch_quote.addActionListener(new java.awt.event.ActionListener()
                {    
                    public void actionPerformed(java.awt.event.ActionEvent evt)                
                    {
                          ch_quoteActionPerformed(evt);
                    }
                });
        l3.add(sub3);
        l3.add(Box.createVerticalStrut(80));
        l3.add(ch_quote);
        
        JLabel sub4=new JLabel("COLOR :                                       ");
        sub4.setFont(subhead);
        sub4.setForeground(Color.WHITE);
        JLabel col_h=new JLabel("HANDS :");
        col_h.setFont(txt);
        col_h.setForeground(Color.WHITE);
        JLabel col_c=new JLabel("CLOCK :");
        col_c.setFont(txt);
        col_c.setForeground(Color.WHITE);
        
        
        r1.setLayout(new FlowLayout());
        r1.add(sub4);
        r1.add(Box.createVerticalStrut(40));
        r1.add(col_h);
        r1.add(Box.createHorizontalStrut(40));
        r1.add(colo1);
    
        r1.add(Box.createVerticalStrut(50));
        r1.add(Box.createHorizontalStrut(300));
        r1.add(col_c);
        r1.add(Box.createHorizontalStrut(40));
        r1.add(colo2);
       
        
        JLabel sub5=new JLabel("STOPWATCH :               ");
        sub5.setForeground(Color.WHITE);
        sub5.setFont(subhead);
        
       
        paus.setVisible(false);
        lap.setVisible(false);
        r2.add(sub5);
      
        r2.add(Box.createHorizontalStrut(20));
        
        r2.add(stopwt);
        
        r2.add(lap);
        
        r2.add(Box.createHorizontalStrut(20));
        r2.add(Box.createVerticalStrut(50));
        r2.add(strt);
        r2.add(Box.createHorizontalStrut(20));
        r2.add(paus);
        r2.add(Box.createHorizontalStrut(30));
        
        r2.add(lap1);
        r2.add(Box.createHorizontalStrut(30));
        r2.add(lap2);
        r2.add(Box.createHorizontalStrut(71));
        r2.add(lap3);
        r2.add(Box.createHorizontalStrut(28));
        r2.add(lap4);
        r2.add(Box.createHorizontalStrut(45));
        r2.add(lap5);
        r2.add(Box.createHorizontalStrut(27));
        r2.add(lap6);
        r2.add(Box.createHorizontalStrut(30));
        
        stopwt.setFont(subhead);
        lap.setPreferredSize(jtog1);
        stopwt.setForeground(Color.WHITE);
        strt.setPreferredSize(jtog1);
        paus.setPreferredSize(jtog1);
        s_1.setPreferredSize(bx);
        s_2.setPreferredSize(bx);
        s_3.setPreferredSize(bx);
        
        strt.addActionListener(new java.awt.event.ActionListener()
        {
          public void actionPerformed(java.awt.event.ActionEvent evt)
          {
                 strtActionPerformed(evt);
          
          }
        });
        paus.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                pausActionPerformed(evt);
                            }
                        });
        
        lap.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                lapActionPerformed(evt);
                            }
                        });
         
        JLabel sub6=new JLabel("PROJECT BY :                              ");
        JLabel name1=new JLabel("ADITYA       ANUJ");
        JLabel name2=new JLabel("DHRUV        SAURABH");  
        sub6.setFont(subhead);
        sub6.setForeground(Color.WHITE);
        name1.setFont(txt);
        name1.setForeground(Color.WHITE);
        name2.setFont(txt);
        name2.setForeground(Color.WHITE);
      
        r3.add(Box.createHorizontalStrut(25));
        r3.add(Box.createVerticalStrut(20));
        r3.add(sub6);
        r3.add(name1);
        r3.add(Box.createHorizontalStrut(25));
        r3.add(Box.createVerticalStrut(100));
        r3.add(name2);
        
        b_lb.setForeground(Color.WHITE);
        b_lb.setFont(quote_f);
        pane_bottom.add(b_lb);
        
        pane_bottom.setBackground(Color.ORANGE);
        pane_bottom.setPreferredSize(b);
   
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }  
    public static void main(String[] args) 
    {  
                
               Analogclock a= new Analogclock(); 
        
    } 
    
    public void set1ActionPerformed(java.awt.event.ActionEvent evt)
    {
      if(set1.isSelected())
        {   if(!((err1.getText()=="INVALID INPUT")||(s_1.getText().equals(""))||(s_2.getText().equals(""))||(s_3.getText().equals(""))||(s_1.getText().equals("HH"))||(s_2.getText().equals("MM"))||(s_3.getText().equals("SS"))))
            { sys_time=false;
              set1.setText("RESET");
              time_box.setSelectedIndex(0);
                utc_min=0;
                utc_hr=0;
               hours = Integer.parseInt(s_1.getText());
               minutes = Integer.parseInt(s_2.getText());
               seconds = Integer.parseInt(s_3.getText()); 
           
            }
            else
            {
              set1.setText("SET");
            }
        }
        else{
              set1.setText("SET");
              sys_time=true;
            }
    }                                     
    public void s_1MouseEntered(java.awt.event.MouseEvent evt)
    {
      s_1.setText("");
    }
    public void s_1MouseExited(java.awt.event.MouseEvent evt)
    {
         try{
          int m=Integer.parseInt(s_1.getText());
            if(m>23||m<0)
            {
                err1.setText("INVALID INPUT");
                s_1.setText("HH");
            }
            else{
                  err1.setText("");
               }
        
        }
        catch(Exception e)
        {
            s_1.setText("HH");
            err1.setText("");
        }
    }                 
    public void s_1KeyTyped(java.awt.event.KeyEvent evt)
    {
      char c=evt.getKeyChar();
      if(!(Character.isDigit(c)))
      {
         evt.consume();
      }
    
    }
     public void s_2KeyTyped(java.awt.event.KeyEvent evt)
    {
      char c=evt.getKeyChar();
      if(!(Character.isDigit(c)))
      {
         evt.consume();
      }
    
    }
     public void s_2MouseEntered(java.awt.event.MouseEvent evt)
    {
      s_2.setText("");
    }
         public void s_2MouseExited(java.awt.event.MouseEvent evt)
    {
     // s_1.setText("AS");
         try{
          int m=Integer.parseInt(s_2.getText());
            if(m>60||m<0)
            {
                err1.setText("INVALID INPUT");
                s_2.setText("MM");
            }
            else{
                  err1.setText(" ");
               }
        
        }
        catch(Exception e)
        {
            s_2.setText("MM");
            err1.setText("");
        }
    }     
 
     public void s_3MouseEntered(java.awt.event.MouseEvent evt)
    {
      s_3.setText("");
    }
    public void s_3KeyTyped(java.awt.event.KeyEvent evt)
    {
      char c=evt.getKeyChar();
      if(!(Character.isDigit(c)))
      {
         evt.consume();
      }
    
    }
    public void s_3MouseExited(java.awt.event.MouseEvent evt)
    {
         try{
          int m=Integer.parseInt(s_3.getText());
            if(m>60||m<0)
            {
                err1.setText("INVALID INPUT");
                s_3.setText("SS");
            }
            else{
                  err1.setText("");
               }
        
        }
        catch(Exception e)
        {
            err1.setText("");
            s_3.setText("SS");
        }
    } 
    
    public void Tog_but1ActionPerformed(java.awt.event.ActionEvent e)
    {
     if(Tog_but1.isSelected())
        {   if(!((err2.getText()=="INVALID INPUT")||((a_1.getText()).equals(""))||((a_2.getText()).equals(""))||((a_1.getText()).equals("HH"))||((a_2.getText()).equals("SS"))))
            { 
              Tog_but1.setText("RESET");
              err2.setText("Alarm Set");
              x=Integer.parseInt(a_1.getText());
              y=Integer.parseInt(a_2.getText());
              alarm=true;
             
            }
            else
            {
              Tog_but1.setText("SET");
              alarm=false;
              clip.stop();
              err2.setText("");
            }
        }
        else{
                 Tog_but1.setText("SET");
                 err2.setText("");
                 alarm=false;
                 clip.stop();
                 err2.setText("");
            }
    }
     public void a_1MouseEntered(java.awt.event.MouseEvent evt)
     {
        a_1.setText("");
     }
     public void a_1KeyTyped(java.awt.event.KeyEvent evt)
    {
      char c=evt.getKeyChar();
      if(!(Character.isDigit(c)))
      {
         evt.consume();
      }
    
    }
     public void a_1MouseExited(java.awt.event.MouseEvent evt)
     {
         try{
          int m=Integer.parseInt(a_1.getText());
            if(m>23||m<0)
            {
                err2.setText("INVALID INPUT");
                a_1.setText("HH");
            }
            else{
                  err2.setText("");
               }
        
        }
        catch(Exception e)
        {
            err2.setText("");
            a_1.setText("HH");
        }
     
     }
     public void a_2MouseEntered(java.awt.event.MouseEvent evt)
     {
        a_2.setText("");
     }
      public void a_2KeyTyped(java.awt.event.KeyEvent evt)
    {
      char c=evt.getKeyChar();
      if(!(Character.isDigit(c)))
      {
         evt.consume();
      }
    
    }
     public void a_2MouseExited(java.awt.event.MouseEvent evt)
     {
         try{
          int m=Integer.parseInt(a_2.getText());
            if(m>59||m<0)
            {
                err2.setText("INVALID INPUT");
                a_2.setText("SS");
            }
            else{
                  err2.setText("");
               }
         
        }
        catch(Exception e)
        {
            err2.setText("");
            a_2.setText("SS");
        }
     
     }
     public void ch_quoteActionPerformed(java.awt.event.ActionEvent e)
     {

        boolean quote=true;
        while(quote)
        {
        Random ran=new Random();
        int r=ran.nextInt(5);
        if(r!=check)
        {
         b_lb.setText(s[r]);
         check=r;
         quote=false;
        } 
        }
    }
     public void strtActionPerformed(java.awt.event.ActionEvent e)
     { 
        Thrd tha=new Thrd();
        if(strt.isSelected())
        {    
             tha.start();
             flag=true;
             
            strt.setText("STOP");
         
            paus.setVisible(true);
            lap.setVisible(true);
            lapint=0;
            lap1.setText("");
            lap2.setText("");
            lap3.setText("");
            lap4.setText("");
            lap5.setText("");
            lap6.setText("");
        }
        else
        {   
            stopwt.setText("   ");
            lap1.setVisible(false);
            lap2.setVisible(false);
            lap3.setVisible(false);
            lap4.setVisible(false);
            lap5.setVisible(false);
            lap6.setVisible(false);
            tha.stop1();
            stopwt.setText("   ");
            strt.setText("START");
            paus.setVisible(false);
            lap.setVisible(false);
           
           
        }
     }
     
      public void pausActionPerformed(java.awt.event.ActionEvent evt) {                                               
      
          flag=false;           
          stopwt.setText(""+sec1+":"+mil);

    }                              
     public void lapActionPerformed(java.awt.event.ActionEvent evt) {                                               
          lapint++;    
         switch(lapint)
   {    
        case 1:lap1.setText("     LAP 1 = "+sec1+":"+mil);
                lap1.setVisible(true);
                break;    
        case 2:lap2.setText("      LAP 2 = "+sec1+":"+mil);
                lap2.setVisible(true);
                break;
        case 3:lap3.setText("  LAP 3 = "+sec1+":"+mil);
                lap3.setVisible(true);
                break;
        case 4:lap4.setText("  LAP 4 = "+sec1+":"+mil);
                lap4.setVisible(true);
                break;
        case 5:lap5.setText("LAP 5 = "+sec1+":"+mil);
                lap5.setVisible(true);
                break;
        case 6:lap6.setText("LAP 6 = "+sec1+":"+mil);
                lap6.setVisible(true);
                break;
    }
   
      
 
     }
      
 
      public void set2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
      
      {
       sys_time=true;
       tmzone=true;
       String s=(String)time_box.getSelectedItem();
       int i=5,j=30;
          switch (s) {
              case "INDIA (UTC+05:30)":
                  utc_hr=0;
                  utc_min=0;
                  break;
              case "US (UTC-06:00)":
                  utc_hr=-6-i;
                  utc_min=0-j;
                  break;
              case "UK (UTC+01:00)":
                  utc_hr=1-i;
                  utc_min=0-j;
                  break;
              case "CHINA (UTC+08:00)":
                  utc_hr=8-i;
                  utc_min=0-j;
                  break;
              case "JAPAN (UTC+09:00)":
                  utc_hr=9-i;
                  utc_min=0-j;
                  break;
              case "AUSTRALIA (UTC+09:30)":
                  utc_hr=9-i;
                  utc_min=30-j;
                  break;
              default:
                  break;
          }
      }
    }  
     
   public class Thrd extends Thread
   {  long a;
      long ab=System.nanoTime();
      long d=System.currentTimeMillis();
      long b=0;
      long e;
      long p;    
      
      public void run()
      {   
          while(flag)
          {   a=System.nanoTime();
              e=System.currentTimeMillis();
              a=a-ab;
              e=e-d;
              p=e/1000;
              e=e-(p*1000);
              b=a/1000000000;
              sec1=""+b;
              mil=""+e;
               
 
              stopwt.setText(sec1+":"+mil);
      
           }
          stopwt.setText("");
      }
        public void stop1()
            {  stopwt.setText("");
               flag=false;
               this.stop();
               
            }
       
   }
}
