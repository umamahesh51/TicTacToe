import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.imageio.*;
class TicTacToe extends JFrame implements ActionListener
{  public  int ch=0,i;
 int flag=0;
     int a[][] =new int[3][3];
	  //a[9]={0}
	JButton b[]=new JButton[10];
	TicTacToe()
	{
		setLayout(new GridBagLayout());
		GridBagConstraints c=new GridBagConstraints();
		c.fill=GridBagConstraints.BOTH;
		//c.gridwidth=1;
		 b[0]=new JButton("");
		c.gridx=0;
		c.gridy=0;
		    b[0].setPreferredSize(new Dimension(80, 80));
		add(b[0],c);
		 b[1]=new JButton("");
		c.gridx=0;
		c.gridy=1;
			b[1].setPreferredSize(new Dimension(80, 80));
		add(b[1],c);
		b[2]=new JButton("");
		c.gridx=0;
		c.gridy=2;
			b[2].setPreferredSize(new Dimension(80, 80));
		add(b[2],c);
		 b[3]=new JButton("");
		c.gridx=1;
		c.gridy=0;
			b[3].setPreferredSize(new Dimension(80, 80));
		add(b[3],c);
		 b[4]=new JButton("");
		c.gridx=1;
		c.gridy=1;
			b[4].setPreferredSize(new Dimension(80, 80));
		add(b[4],c);
		 b[5]=new JButton("");
		c.gridx=1;
		c.gridy=2;
			b[5].setPreferredSize(new Dimension(80, 80));
		add(b[5],c);
		 b[6]=new JButton("");
		c.gridx=2;
		c.gridy=0;
			b[6].setPreferredSize(new Dimension(80, 80));
		add(b[6],c);
         b[7]=new JButton("");
		c.gridx=2;
		c.gridy=1;
			b[7].setPreferredSize(new Dimension(80,80));
		add(b[7],c);
         b[8]=new JButton("");
		c.gridx=2;
		c.gridy=2;
			b[8].setPreferredSize(new Dimension(80, 80));
		add(b[8],c);	
		for(i=0;i<9;i++)
		{
		 b[i].setOpaque(true);
		 b[i].setBackground(Color.WHITE);
		 b[i].addActionListener(this);
		}
	
    }
	 public void actionPerformed(ActionEvent e)
	 {   
	     try
		 { int p;
		    
		  ch++;
		   for(p=0;p<9;p++)
		   {	   
		   if((e.getSource())==b[p]) break;
		     
		   }   
		  
		  
		  if(ch%2==0)
		  {
			 Image img = ImageIO.read(getClass().getResource("o.jpg"));
              b[p].setIcon(new ImageIcon(img));
			  //a[p]=5;
			  int x=p/3;
			    int y=p%3;
				a[x][y]=5;
			   int sum1=0,sum2=0;
			 
             if(a[0][0]+a[2][2]+a[1][1]==15) 
     				 { JOptionPane.showMessageDialog(null,"player o wins"); 
				       flag=0; ch=0;  
					   for(i=0;i<9;i++)
			           {
			     	    b[i].setIcon(null);
			           }
					   for(int k=0;k<3;k++)
					   for(int j=0;j<3;j++)
						    a[k][j]=0;
					 }
					   
             else if(a[0][2]+a[1][1]+a[2][0]==15)	
			 {  JOptionPane.showMessageDialog(null,"player o wins"); 
		            flag=0; ch=0;
					   for(i=0;i<9;i++)
			       {
			     	 b[i].setIcon(null);
			       }
				   for(int k=0;k<3;k++)
					   for(int j=0;j<3;j++)
						    a[k][j]=0;

			}
           else {
			  for(i=0;i<3;i++)
			  {  sum1=0;sum2=0;
				   for(int j=0;j<3;j++)
				   {
					   sum1+=a[i][j];
					   sum2+=a[j][i];
				   }
				  if(sum1==15 || sum2==15) { JOptionPane.showMessageDialog(null,"player o wins"); flag=0; ch=0;   
				  for(i=0;i<9;i++)
			       {
			     	 b[i].setIcon(null);
					 
			       }
				   for(int k=0;k<3;k++)
					   for(int j=0;j<3;j++)
						    a[k][j]=0;
				  }
			  }	  
		   }			 
		  }
		  else
		  {
			   Image img = ImageIO.read(getClass().getResource("x.png"));
               b[p].setIcon(new ImageIcon(img));
			  // a[p]=3;
			  int x=p/3;
			    int y=p%3;
				a[x][y]=3;
			   int sum1=0,sum2=0;
			    
             if(a[0][0]+a[2][2]+a[1][1]==9)  {  JOptionPane.showMessageDialog(null,"player X wins");	flag=0; ch=0; 
			 for(i=0;i<9;i++)
			       {
			     	 b[i].setIcon(null);
					
			       }
				    for(int k=0;k<3;k++)
					   for(int j=0;j<3;j++)
						    a[k][j]=0;
				 }	  
             else if(a[0][2]+a[1][1]+a[2][0]==9)	{ JOptionPane.showMessageDialog(null,"player X wins"); flag=0; ch=0;   
			 for(i=0;i<9;i++)
			       {
			     	 b[i].setIcon(null);
					 
			       } 
				   for(int k=0;k<3;k++)
					   for(int j=0;j<3;j++)
						    a[k][j]=0;
				}
			 else {
				 for(i=0;i<3;i++)
			    {  sum1=0; sum2=0;
				   for(int j=0;j<3;j++)
				   {
					   sum1+=a[i][j];
					   sum2+=a[j][i];
				   }
				  if(sum1==9 || sum2==9)  {JOptionPane.showMessageDialog(null,"player X wins"); flag=0;  ch=0;
				  for(i=0;i<9;i++)
			       {
			     	 b[i].setIcon(null);
					 
			       }
				   for(int k=0;k<3;k++)
					   for(int j=0;j<3;j++)
						    a[k][j]=0;
				 }
			    }	
			 }
			  
			
		  }
		  if(ch==9)
		  {    ch=0; 
			     flag=0;
				  if(a[0][0]!=0) {
				  JOptionPane.showMessageDialog(null,"match drawn");
				   for(i=0;i<9;i++)
			       {
			     	 b[i].setIcon(null);
			       }	
				   for(int k=0;k<3;k++)
					   for(int j=0;j<3;j++)
						    a[k][j]=0;
				  }		
			  
		  }
		  
	 } 


		  catch(Exception ex){ ex.printStackTrace();}
	 }
	        
				public static void main(String args[])
			      {
				  TicTacToe gui=new TicTacToe();
				  gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				 // gui.setSize(200,200);
				   gui.pack();
				   gui.setVisible(true);
				   gui.setTitle("14011A0551");
				   gui.setResizable(false);
				  }
}