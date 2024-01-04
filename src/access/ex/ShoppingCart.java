package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void displayItems() {
        int sum = 0;
        System.out.println("장바구니 상품 출력");
        for(int i = 0; i<itemCount; i++){
            System.out.println("상품명 : " + items[i].getItem() + ", 합계 : " + items[i].getTotalPrice());
            sum += items[i].getTotalPrice();
        }
        System.out.println("전체 가격 합 : " + sum);
    }

    public void addItem(Item item) {
        if (itemCount < 11) {
            items[itemCount] = item;
            itemCount++;
        } else {
            System.out.println("저장 개수 초과");
        }
    }
}
