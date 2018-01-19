package Class;

public interface Vehicles_Class {
	public class Vehicless {
		private String category, cat1, cat2, cat3, cat4;

		public Vehicless(String category, String cat1, String cat2, String cat3, String cat4) {
			this.category = category;
			this.cat1 = cat1;
			this.cat2 = cat2;
			this.cat3 = cat3;
			this.cat4 = cat4;
		}

		@Override
		public String toString() {
			return "Vehicless :[" + category + " , " + cat1 + " , " + cat2 + " , " + cat3 + ", " + cat4 + "]";
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getCat1() {
			return cat1;
		}

		public void setCat1(String cat1) {
			this.cat1 = cat1;
		}

		public String getCat2() {
			return cat2;
		}

		public void setCat2(String cat2) {
			this.cat2 = cat2;
		}

		public String getCat3() {
			return cat3;
		}

		public void setCat3(String cat3) {
			this.cat3 = cat3;
		}

		public String getCat4() {
			return cat4;
		}

		public void setCat4(String cat4) {
			this.cat4 = cat4;
		}

		}

	}