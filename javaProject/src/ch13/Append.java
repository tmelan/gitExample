package ch13;

public class Append {
	public static void main(String[] args) {
		//불변 immutable
		String a="hello";
		System.out.println(System.identityHashCode(a));
		a=a+"java";
		System.out.println(a);
		System.out.println(System.identityHashCode(a));
		
		System.out.println("===가변형 StringBuilder===");
		//가변형(mutable, 메모리가 같음=메모리 절약이 가능)
		StringBuilder b = new StringBuilder("hello");
		System.out.println(System.identityHashCode(b));
		b.append("java");
		System.out.println(b);
		System.out.println(System.identityHashCode(b));
	}
}
