import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //Принцип замены Барбары Лисков - наследуй только тогда, когда можешь играть роль за предка
        Product[] products = {new Milk(), new Bread(), new Mustard()};
        Scanner scanner = new Scanner(System.in);
        //Правило DRY (Don’t Repeat Yourself): не повторяй свой код
        ShoppingList.listPrint(products);
        while (true) {
            System.out.println("Введите номер товара и количество, или end завершения");
            String str = scanner.nextLine();
            if (str.equals("end")) break;
            int productNumber = Integer.parseInt(str);
            System.out.println("Введите количество");
            products[productNumber - 1].setCount(Integer.parseInt(scanner.nextLine()));
        }
        ShoppingList.shoppingListPrint(products);
    }

    //Принцип единственной ответственности - каждый делает только то, для чего он предназначен
    static class ShoppingList {
        private static void listPrint(Product[] products) {
            System.out.println("Список товаров");
            for (int i = 0; i < products.length; i++) {
                System.out.println(i + 1 + ") " + products[i]);
            }
        }

        public static void shoppingListPrint(Product[] products) {
            System.out.println("Вы купили");
            int totalPrice = 0;
            for (Product item : products) {
                totalPrice += item.getCount() * item.getPrice();
                System.out.println(item.getName() + "  кол-во: " + item.getCount() + "; цена: " + item.getPrice() + " стоимость: " + item.getCount() * item.getPrice());
            }
            System.out.println("Итого: " + totalPrice);
        }
    }

}
