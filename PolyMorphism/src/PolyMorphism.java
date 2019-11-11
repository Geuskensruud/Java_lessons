class Willow extends Tree{
	@Override
	public void grow() {
		System.out.println("willow grows");
	}}
class Tree{
	public void grow() {
		System.out.println("tree grows");
	}}
public class PolyMorphism {

	public static void main(String[] args) {
		Tree t1 = new Tree();
		Willow w1 = new Willow();
		Tree t2 = w1;
		t1.grow();
		t2.grow();
		doGrow(t1);
		
	}
	 public static void doGrow(Tree tree) {
	        tree.grow();
	    }}
