package Class;

public interface list_Class {
	public class Listes {
		private String list;
		private int n1, n2, n3, n4, n5;

		public Listes(String list, int n1, int n2, int n3, int n4, int n5) {
			this.list = list;
			this.n1 = n1;
			this.n2 = n2;
			this.n3 = n3;
			this.n4 = n4;
			this.n5 = n5;

		}

		@Override
		public String toString() {
			return "Array_List[" + list + " <" + n1 + ", " + n2 + ", " + n3 + ", " + n4 + ", " + n5 + ">]";
		}

		public String getList() {
			return list;
		}

		public void setList(String list) {
			this.list = list;
		}

		public int getN1() {
			return n1;
		}

		public void setN1(int n1) {
			this.n1 = n1;
		}

		public int getN2() {
			return n2;
		}

		public void setN2(int n2) {
			this.n2 = n2;
		}

		public int getN3() {
			return n3;
		}

		public void setN3(int n3) {
			this.n3 = n3;
		}

		public int getN4() {
			return n4;
		}

		public void setN4(int n4) {
			this.n4 = n4;
		}

		public int getN5() {
			return n5;
		}

		public void setN5(int n5) {
			this.n5 = n5;
		}
	}
}
