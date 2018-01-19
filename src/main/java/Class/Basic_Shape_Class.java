package Class;

public interface Basic_Shape_Class {
	public class Shape {
		private String shapecat, shape1, shape2, shape3, shape4;

		public Shape(String Shapecat, String shape1, String shape2, String shape3, String shape4) {
			this.shapecat = Shapecat;
			this.shape1 = shape1;
			this.shape2 = shape2;
			this.shape3 = shape3;
			this.shape4 = shape4;
		}

		@Override
		public String toString() {
			return "Shape [" + shapecat + ", " + shape1 + ", " + shape2 + ", " + shape3 + "," + shape4 + "]";
		}

		public String getShapecat() {
			return shapecat;
		}

		public void setShapecat(String shapecat) {
			this.shapecat = shapecat;
		}

		public String getShape1() {
			return shape1;
		}

		public void setShape1(String shape1) {
			this.shape1 = shape1;
		}

		public String getShape2() {
			return shape2;
		}

		public void setShape2(String shape2) {
			this.shape2 = shape2;
		}

		public String getShape3() {
			return shape3;
		}

		public void setShape3(String shape3) {
			this.shape3 = shape3;
		}

		public String getShape4() {
			return shape4;
		}

		public void setShape4(String shape4) {
			this.shape4 = shape4;
		}

	}
}
