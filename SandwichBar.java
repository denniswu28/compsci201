public class SandwichBar {
    public Boolean checkAvail(String[] available, String order){
        String[] orderList = order.split(" ",-1);

        for(String orderItem : orderList){
            Boolean isIn = false;
            for (String availableItem : available){
                if(orderItem.equals(availableItem)){
                    isIn = true;
                }
            }
            if(!isIn){
                return false;
            }
        }
        return true;
    }
    
    
    public int whichOrder(String[] available, String[] orders){
        for(int i = 0; i < orders.length; i+=1){
            if(checkAvail(available, orders[i])){
                return i;
            }
        }
        return -1; 
    }
}
