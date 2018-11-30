package project;

public interface Visitor<T> {
	public void visit(Position<T> p, Object data);
}
