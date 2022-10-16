import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //������� ������ ������� ������ - �������� ������ �����, ����� ������ ������ ���� �� ������
        Product[] products = {new Milk(), new Bread(), new Mustard()};
        Scanner scanner = new Scanner(System.in);
        //������� DRY (Don�t Repeat Yourself): �� �������� ���� ���
        ShoppingList.listPrint(products);
        while (true) {
            System.out.println("������� ����� ������ � ����������, ��� end ����������");
            String str = scanner.nextLine();
            if (str.equals("end")) break;
            int productNumber = Integer.parseInt(str);
            System.out.println("������� ����������");
            products[productNumber - 1].setCount(Integer.parseInt(scanner.nextLine()));
        }
        ShoppingList.shoppingListPrint(products);
    }

    //������� ������������ ��������������� - ������ ������ ������ ��, ��� ���� �� ������������
    static class ShoppingList {
        private static void listPrint(Product[] products) {
            System.out.println("������ �������");
            for (int i = 0; i < products.length; i++) {
                System.out.println(i + 1 + ") " + products[i]);
            }
        }

        public static void shoppingListPrint(Product[] products) {
            System.out.println("�� ������");
            int totalPrice = 0;
            for (Product item : products) {
                totalPrice += item.getCount() * item.getPrice();
                System.out.println(item.getName() + "  ���-��: " + item.getCount() + "; ����: " + item.getPrice() + " ���������: " + item.getCount() * item.getPrice());
            }
            System.out.println("�����: " + totalPrice);
        }
    }

}
