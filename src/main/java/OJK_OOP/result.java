package OJK_OOP;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import Class.Basic_Shape_Class.Shape;
import Class.Vehicles_Class.Vehicless;
import Class.list_Class.Listes;



public class result {
	public static void main(String[] args) {

		Scanner menuList = new Scanner(System.in);
		boolean loop = true;
		while (loop) {
			System.out.println(" Filter List Employee\n| 1.Basic Shape | 2.Vehicles | 3.List ");
			System.out.println("Chose Filter: ");
			String validate = menuList.next();
			if (validate.matches("[1-3]") == false) {
				System.out.println("Just Number 1-3");

				continue;
			}
			int menu = Integer.parseInt(validate);
			something(menu);
			System.out.println("Press Y/y to search again and type anything to Stop");
			if (menuList.next().equalsIgnoreCase("Y") == false) {
				loop = false;
				System.out.println("Thank You");
			}

		}
		menuList.close(); 

	}

	public static void something(int menu) {
		
		List<Listes> list = Arrays.asList(new Listes("List1", 1, 2, 3, 4, 5), new Listes("List2",1,3,5,7,9));
		List<Vehicless> allwheel = Arrays.asList(new Vehicless("Veichles","car","Motorcycle","Bus","Truck"));
		List<Shape> shape = Arrays.asList(new Shape("Basic Shape","Rectangle","Square","Trapezium","Cone"));
		if (menu <= 3) {
			System.out.println(" ");
		} else {
			System.out.println("You must pick 1-3 on the menu");
		}

		switch (menu) {
		case 1:
			System.out.println("Basic Shape");
			String a = "";
			System.out.println(shape.stream()
					.filter(s -> s.getShapecat().toLowerCase().contains(a.toLowerCase()))
					.collect(Collectors.toList()));
			break;

		case 2:
			System.out.println("Vehicles");
			String b = "";
			System.out.println(allwheel.stream()
					.filter(s -> s.getCategory().toLowerCase().contains(b.toLowerCase()))
					.collect(Collectors.toList()));
			break;

		case 3:
			System.out.println("List can be showed by (input a Number (1 to show list1 || 2 to show list2) or name of list(List = all || List1 = list 1 || List2 = list 2)");
			Scanner numberList = new Scanner(System.in);
			System.out.println("Show List: ");
			String c = "";
			c = numberList.nextLine();
			final String z = c;
			System.out.println(list.stream()
					.filter(s -> String.valueOf(s.getList()).contains(z))
					.collect(Collectors.toList()));
			break;


		}
	}
}