import javax.swing.JOptionPane;
public class exercise {
	public static void main (String [] args){
		int 
		x=Integer.parseInt(JOptionPane.showInputDialog("please enter x"));
		
		JOptionPane.showMessageDialog(null,x+" to the power of 10 is "+sqart(x));
		
		
		JOptionPane.showMessageDialog(null,"The sum of the two number is "+absolute(x));
		
		JOptionPane.showMessageDialog(null,"squrt(x) + absolute(y) + z^y= "+sum(x));
		
		
}
		
	public static long sqart(int  h){
		return (long)(h*h*h*h*h*h*h*h*h*h);
	}
	public static double absolute(int f){
		int
		y=Integer.parseInt(JOptionPane.showInputDialog("please enter y"));
		double n;
		n=f+y;
		return n;
			   
	}
	public static double sum(int g){
		double
		x=Integer.parseInt(JOptionPane.showInputDialog("please enter x"));
		int
		y=Integer.parseInt(JOptionPane.showInputDialog("please enter y"));
		int
		z=Integer.parseInt(JOptionPane.showInputDialog("please enter z"));
		
			x=Math.sqrt(x);
			int i=0;
			while(i<y){
				z=z*z;
				i++;
			}
			if(y<0){
				y=-y;
			}
		double sum;
		sum=z+y+x;
		return sum;
			   
	}
}

