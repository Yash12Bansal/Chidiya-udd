import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import java.io.*;
//import sun.audio.*;
import java.net.*;
//import java.io.FileInputStream;

public class ud extends JFrame implements MouseListener,ActionListener
{
    Timer tim1;
    String xzz;
    int count12=0;
    int n1=1700;
    JLabel l1,la2,jl1,jl2,jl3,jl4,jl5,jl6,lb,lab,labe;
    String res,ds;
    int uo=0;
    JButton b,b1,b2;
    int count=0;
    int uds=0;
    int sco=0;
    JLabel la1;
    JTextArea ta;
    Font f,fo,fon,font;
    JCheckBox cb1;
    JScrollPane jsp;
    int che;
    String ls;
    Image im,im2;
    ImageIcon i1,imic;
    int r=0;
    String s1;
    int i=0;
    String ss1;
    String c="";
    int te=-1;
   int d=0;
   int a=0;
   String h=""; 
   int u=1;
   int co=0;
   int cd=0;
    JMenuBar jmb;
    JMenu ga;
    JMenuItem re,ex,scores;
   JFrame jf,jfr;
String hhh;
   int cou=5;
   
   @Override
      public void mouseEntered(MouseEvent me)
   {

   }
     @Override
public void mouseExited(MouseEvent me)
   {
    
   }
   @Override
   public void mousePressed(MouseEvent me)
   {
        
    
       uds=1;
       te++;
            //  System.out.println(te);
    
       
    
   }
   public void mouseReleased(MouseEvent me)
   {
       
       uds=2;
           co++;
                  //System.out.println(co);
           if(s1!=null)
           {
       for(int x=0;x<s1.length();x++)
       {
           
           char ch=s1.charAt(x);
           if(ch>='0' && ch<='9')
               c=c+ch;
           
            else
               if(c!="")
           {
               
                      int m=Integer.parseInt(c);
      if(m%2!=0 )
      {     c="";
                                                                                                            
             sco=sco+5;
             
             labe.setText(""+sco);
      }
      
      else
      {      
          
        if(cou==5)
        {
           /* try{
             FileInputStream in=new FileInputStream("xx.wav");
            AudioStream as=new AudioStream(in);
            AudioPlayer.player.start(as);
            }
            catch(Exception e)
            {
                System.out.println(e.toString());
            }
            */
            jl6.setBackground(Color.white);
            c="";
                   co=d;

                   sco=sco-2;
        labe.setText(""+sco);
        }
        
        else
        if(cou==4)
        {
            
            
            
           /* try{
             FileInputStream in=new FileInputStream("xx.wav");
            AudioStream as=new AudioStream(in);
            AudioPlayer.player.start(as);
            }
            catch(Exception e)
            {
                System.out.println(e.toString());
            }
            */
            jl5.setBackground(Color.white);
                        c="";
            co=d;

            
                   sco=sco-2;
        labe.setText(""+sco);
        }
       
else        
        
        if(cou==3)
        {
            
            
            
          /*  try{
            FileInputStream in=new FileInputStream("xx.wav");
            AudioStream as=new AudioStream(in);
            AudioPlayer.player.start(as);
            }
            catch(Exception e)
            {
                System.out.println(e.toString());
            }
            */
            jl4.setBackground(Color.white);
        
                    c="";
            co=d;

            
                   sco=sco-2;
        labe.setText(""+sco);
        }
       
        
        else
        if(cou==2)
        {
            
            
            
           /* try{
            FileInputStream in=new FileInputStream("xx.wav");
            AudioStream as=new AudioStream(in);
            AudioPlayer.player.start(as);
            }
            catch(Exception e)
            {
                System.out.println(e.toString());
            }
            */
            jl3.setBackground(Color.white);
            
                    c="";
            co=d;

        
                   sco=sco-2;
        labe.setText(""+sco);
        }
       
        
        else
        if(cou==1)
        {
            
            
            
            
            
                                    String resu="";
                        
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            jl2.setBackground(Color.white);
            
                   
        JOptionPane.showMessageDialog(jf,"Game Over");
        
              

         
           tim1.stop();
           l1.hide();
           che=0;
           ta.show();
           b.setEnabled(true);
           sco=0;
           
        labe.setText(""+sco);
           jl2.setBackground(Color.pink);
       jl3.setBackground(Color.pink);
        jl4.setBackground(Color.pink);
        jl5.setBackground(Color.pink);
        jl6.setBackground(Color.pink);
        
        
        c="";
        co=0;
        d=0;
te=-1;
        cou=6;
n1=1300;

            
            
            
        }
    
          
          
          
                      cou--;

          
          
          
      }                     
  }
      
       }
       
       
   }  }
   
    @Override
   public void mouseClicked(MouseEvent me)
   {
      
       if(che==0)
       {
           co=co-1;
       }
       
}

   public void actionPerformed(ActionEvent ae)
   {
       if(ae.getSource()==b)
       {
           
           
/*           try{
             InputStream in=new FileInputStream("Click.wav");
            AudioStream as=new AudioStream(in);
            AudioPlayer.player.start(as);
           }
           catch(Exception e)
           {
               
           }*/
           l1.show();
           ta.hide();
          
           tim1.start();
          che=1;
          b.setEnabled(false);
          fon=new Font("Arial",Font.BOLD,20);
          
       }
       if(ae.getSource()==ex)
       {
     int kj=      JOptionPane.showConfirmDialog(rootPane, "Are you sure that you want to exit ?");
           if(kj==JOptionPane.YES_OPTION)
                        System.exit(0);
           else
               return;
       }
       
       if(ae.getSource()==b1)
       {

           
           
        /*   try{
             InputStream in=new FileInputStream("Click.wav");
            AudioStream as=new AudioStream(in);
            AudioPlayer.player.start(as);
           }
           catch(Exception e)
           {
               
           }
          */ 
//                 xzz= JOptionPane.showInputDialog(rootPane, "Enter the name of player","",1);
                 
  //               if(xzz==null)
    //             System.exit(0);
      //           else
                 
        //         {
           ta.show();
                      jf.show();

                      jfr.hide();
           
          //       }
       }
       
       
       if(ae.getSource()==b2)
       {
           
           
           
          /* try{
             InputStream in=new FileInputStream("Click.wav");
            AudioStream as=new AudioStream(in);
            AudioPlayer.player.start(as);
           }
           catch(Exception e)
           {
               
           }
           */
           
     int kj=JOptionPane.showConfirmDialog(rootPane, "Are you sure that you want to quit the game ?");
           if(kj==JOptionPane.YES_OPTION)
                        System.exit(0);
           else
               return;
       }
      
       if(ae.getSource()==re)
       {
           
       
           tim1.stop();
           b.setEnabled(true);
           sco=0;
           labe.setText(""+sco);
           l1.hide();
           ta.show();
           che=0;
           jl2.setBackground(Color.pink);
       jl3.setBackground(Color.pink);
        jl4.setBackground(Color.pink);
        jl5.setBackground(Color.pink);
        jl6.setBackground(Color.pink);
        
        c="";
        co=0;
        d=0;
      cou=5;
       }
   }
    
    public ud()
    {
       jf=new JFrame();
        jf.setSize(500,500);
        jf.setResizable(false);
        jf.setLocation(370,140);
        
        lab=new JLabel("Score : ");
        labe=new JLabel("");
        labe.setText(""+sco);
        ImageIcon i3=new ImageIcon("1.jpg");
        Image im4=i3.getImage();
        
        jf.setIconImage(im4);
//        jf.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("1.jpg")));
    
    
//jsp=new JScrollPane(lb);
ta=new JTextArea();
ta.setOpaque(false);
        ta.setEditable(false);
        ls="                    Instructions to play the game :-\n\n"
                + " 1- As soon as you will click on the start button to \n     begin the game you will have to keep the left \n     button of your mouse pressed . \n\n "
                + "2- The pictures of different species will be visible on\n     the screen and you will have to identify whether\n     the creature in that particular picture can fly or not. \n\n "
                + "3- If it can then release the left button and press it\n     again while if it cannot then keep the button\n     pressed .\n\n "                                                                                            
                + "4- For every single mistake your one live will lost . \n\n "
                + "5- Every player will be given five lives .";                                                                                                                                                                                                                                                                                                      
    System.out.println(ls);     
    
        //jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
          //             jf.add(jsp);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
        
        jf.setTitle("Chidiya udd");
        l1=new JLabel();
        cb1=new JCheckBox();
        
        
        font=new Font("Arial",Font.BOLD,18);
                     ta.setText(ls);
    ta.setFont(font);

        
        jl1=new JLabel("Lives : ");
       jl2=new JLabel("");
       jl2.setOpaque(true);
       jl2.setBackground(Color.pink);
        jl3=new JLabel("");
               jl3.setOpaque(true);

               jl3.setBackground(Color.pink);

        jl4=new JLabel("");
       jl4.setOpaque(true);

        jl4.setBackground(Color.pink);

        jl5=new JLabel("");
               jl5.setOpaque(true);
      
               jl5.setBackground(Color.pink);
jl6=new JLabel("");
       jl6.setOpaque(true);
       
jl6.setBackground(Color.pink);

//        cb1.setSelectedIcon(new ImageIcon(ImageIO.read(. . .)));
     
        b=new JButton("Start");
        
        
        
        //Container c=getContentPane();
       jf.setLayout(null);
        jf.add(l1);
    jf.add(b);
    jf.add(cb1);
   jf.add(jl1);
      jf.add(jl2);
 jf.add(jl3);
   jf.add(jl4);
   jf.add(jl5);
   jf.add(jl6);
jf.add(ta);
            l1.setBorder(BorderFactory.createLineBorder(Color.black,4,true));
        //    ta.setBorder(BorderFactory.createLineBorder(Color.black,4,true));

    l1.setBounds(5,5,475,390);
    ta.setBounds(5,5,475,390);

         b.setBounds(5,405,250,30);   
                 fo=new Font("Arial",Font.BOLD,12);
jf.add(lab);
                jf.add(labe);
 
         jl1.setFont(fo);
                  lab.setFont(fo);
                  lab.setBounds(287,395,50,20);
                  labe.setBounds(345,395,50,20);
         jl1.setBounds(290,420,50,20);        
                  jl2.setBounds(465,420,20,20);
         jl3.setBounds(435,420,20,20);
         jl4.setBounds(405,420,20,20);
         jl5.setBounds(375,420,20,20);
jl6.setBounds(345,420,20,20);

         
     //    cb1.setBounds(300,300,70,30);

           
                       jmb=new JMenuBar();
               
               ga=new JMenu("Game");
               
               re=new JMenuItem("Restart");
              
                ex=new JMenuItem("Exit");
           //    scores=new JMenuItem("Score Board");
              
               ga.add(re);
              ga.addSeparator();
             //                                   ga.add(scores);
               // ga.addSeparator();
l1.hide();
//lb.show();

              ga.add(ex);
               jmb.add(ga);
           jf.setJMenuBar(jmb);
    
               tim1 = new Timer(n1, new ActionListener() {
         int i=1;    
         
            public void actionPerformed(ActionEvent ae) {
                
                System.out.println(uds);
 if(i%5==0)
 {
     if(n1!=600)
     { n1=n1-100;
 tim1.setDelay(n1);
     sco=sco+5;
     labe.setText(""+sco);
     
     }
     else
         if(n1>0)
         {
             n1=n1-20;
 tim1.setDelay(n1);
 sco=sco+7;
                  labe.setText(""+sco);

             
         }
 }
        if(i<61)
 i++;
           int ran=(int)(Math.random()*((60-1)+1)+1); 
 String z=""+ran;
       s1=z+".jpg";
       //if(i<61)
 //       i++;   
       
       
        
       System.out.println();

    if(co!=d)
    {
     
        if(cou==5)
        {
            
            
            
           /* try{
             FileInputStream in=new FileInputStream("xx.wav");
            AudioStream as=new AudioStream(in);
            AudioPlayer.player.start(as);
            }
            catch(Exception e)
            {
                System.out.println(e.toString());
            }*/
            
            jl6.setBackground(Color.white);
            co=d;
        
            sco=sco-2;
            labe.setText(""+sco);
        }
        
        
        if(cou==4)
        {
            
            
            /*try{
             FileInputStream in=new FileInputStream("xx.wav");
            AudioStream as=new AudioStream(in);
            AudioPlayer.player.start(as);
            }
            catch(Exception e)
            {
                System.out.println(e.toString());
            }
            */
            jl5.setBackground(Color.white);
                        co=d;

                        
            sco=sco-2;
            labe.setText(""+sco);
        }
       
        
        
        if(cou==3)
        {
            
            
            /*try{
             FileInputStream in=new FileInputStream("xx.wav");
            AudioStream as=new AudioStream(in);
            AudioPlayer.player.start(as);
            }
            catch(Exception e)
            {
                System.out.println(e.toString());
            }
            */
            jl4.setBackground(Color.white);
       
                    co=d;

                    
            sco=sco-2;
            labe.setText(""+sco);
        }
       
        
        
        if(cou==2)
        {
            
            
           /* try{
             FileInputStream in=new FileInputStream("xx.wav");
            AudioStream as=new AudioStream(in);
            AudioPlayer.player.start(as);
            }
            catch(Exception e)
            {
                System.out.println(e.toString());
            }
            */
            
            
            
           jl3.setBackground(Color.white);
                   co=d;
   
        
            sco=sco-2;
            labe.setText(""+sco);
        }
       
        
        
        if(cou==1)
        {
         
            String resu="";
                        
            
            
            
            
            
            
            
            jl2.setBackground(Color.white);
            
                   
        JOptionPane.showMessageDialog(jf,"Game Over");
        
              

       l1.hide();
           tim1.stop();
           che=0;
           b.setEnabled(true);
        sco=0;
        labe.setText(""+sco);
           ta.show();
           jl2.setBackground(Color.pink);
       jl3.setBackground(Color.pink);
        jl4.setBackground(Color.pink);
        jl5.setBackground(Color.pink);
        jl6.setBackground(Color.pink);
        
        
        c="";
        co=0;
        d=0;
te=-1;
        cou=6;
n1=1300;
            
            
            
        }
    
                cou--;

    }   

    
               // System.out.println(s1);
                
       i1=new ImageIcon(s1);
        im=i1.getImage();

        im2=im.getScaledInstance(470, 390,Image.SCALE_SMOOTH);
         imic = new ImageIcon(im2);
        l1.setIcon(imic);
        
     
   for(int x=0;x<s1.length();x++)
       {
           
           char ch=s1.charAt(x);
           if(ch>='0' && ch<='9')
               h=h+ch;
           else
               if(h!="")
           {
               
                      int m=Integer.parseInt(h);
      if(m%2!=0 )
      { d++;
   //   System.out.println(d);
      h="";
      }
      else
      {   a++;
      
     // System.out.println(a);
      h="";
      }
       }

               else 
                   continue;
       }
           
            }
        });
       // tim1.start();
     
        
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    
       jf. addMouseListener(this);
        
        b.addActionListener(this);
           ex.addActionListener(this);
        re.addActionListener(this);
      //jf. show();
    
      
      
      
//                                    ***********************************************                                                 //
      
      
      
      jfr=new JFrame();
      jfr.setSize(300,300);
      jfr.setLocation(500,200);
              jfr.setResizable(false);

              jfr.setIconImage(im4);
      jfr.setTitle("Chidiya udd");
      la1=new JLabel("Chidiya udd");
           la2=new JLabel("");
 
           la1.setForeground(Color.WHITE);
           b1=new JButton("Play");

           b2=new JButton("Quit");


f=new Font("Ravie",Font.BOLD,25);
    la1.setFont(f);
       jfr.setLayout(null);
       jfr.add(b1);
       jfr.add(b2);
       jfr.add(la1);
       jfr.add(la2);

   //    Container con=getContentPane();
       
       
       b1.setBounds(100,110,80,30);
       b2.setBounds(100,150,80,30);
       la1.setBounds(40,10,300,60);
       la2.setBounds(0,0,300,300);

        ImageIcon i2=new ImageIcon("d5.jpg");
        Image im2=i2.getImage();
        Image im3=im2.getScaledInstance(300, 300,Image.SCALE_SMOOTH);
        ImageIcon imic1 = new ImageIcon(im3);
        la2.setIcon(imic1);
       
       
        
        
      b1.addActionListener(this);
      b2.addActionListener(this);

      jfr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

      jfr.show();
     
      
    }

public static void main(String args[])
{
    ud ob=new ud();
    
}
}


