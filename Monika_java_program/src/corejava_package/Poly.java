package corejava_package;
public class Poly {
	void volume(int s)
	{
		System.out.println("Volume of Cube is"+(s*s*s));
	}
	void volume(int a, int b,int c)
	{
		System.out.println("VOlume of Cuboid is"+(a*b*c));
	}
	void volume (float r)
	{
		System.out.println("Volume of sphere is:"+(4/3*3.14*r*r*r));
	}

	public static void main(String[] args) {
		Poly ob1=new Poly();
		ob1.volume(3);
		ob1.volume(6,4,5);
		ob1.volume(2);
		// TODO Auto-generated method stub
        
	}

}