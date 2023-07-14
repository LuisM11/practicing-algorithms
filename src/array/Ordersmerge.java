package array;

import java.util.Arrays;

public class Ordersmerge {

    public static int[] merge(int[] orders1, int[] orders2 ){
        int[] mergedOrders = new int[orders1.length + orders2.length];
        int indexOrders1=0;
        int indexOrders2=0;
        for (int i = 0; i < mergedOrders.length ; i++) {
            if(indexOrders1 >= orders1.length){
                mergedOrders[i] = orders2[indexOrders2];
                indexOrders2++;
            }else if(indexOrders2 >= orders2.length){
                mergedOrders[i] = orders1[indexOrders1];
                indexOrders1++;
            }
            else if(orders1[indexOrders1] < orders2[indexOrders2] ){
                mergedOrders[i] = orders1[indexOrders1];
                indexOrders1++;

            }else{
                mergedOrders[i] = orders2[indexOrders2];
                indexOrders2++;

            }
        }
        return mergedOrders;
    }

    public static void main(String[] args) {
        int[] myArray = new int[]{3, 4, 6, 10, 11, 15};
        int[] alicesArray = new int[]{1, 5, 8, 12, 14, 19};
        System.out.println(Arrays.toString(merge(myArray, alicesArray)));
    }
}

//    public static boolean isFirstComeFirstServed(int[] takeOutOrders, int[] dineInOrders, int[] servedOrders) {
//        int takeOutOrdersIndex = 0;
//        int dineInOrdersIndex = 0;
//
//        for (int order : servedOrders) {
//
//            // if we still have orders in takeOutOrders
//            // and the current order in takeOutOrders is the same
//            // as the current order in servedOrders
//            if (takeOutOrdersIndex < takeOutOrders.length && order == takeOutOrders[takeOutOrdersIndex]) {
//                takeOutOrdersIndex++;
//
//                // if we still have orders in dineInOrders
//                // and the current order in dineInOrders is the same
//                // as the current order in servedOrders
//            } else if (dineInOrdersIndex < dineInOrders.size() && order == dineInOrders[dineInOrdersIndex]) {
//                dineInOrdersIndex++;
//
//                // if the current order in servedOrders doesn't match the current
//                // order in takeOutOrders or dineInOrders, then we're not serving first-come,
//                // first-served
//            } else {
//                return false;
//            }
//        }
//
//        // check for any extra orders at the end of takeOutOrders or dineInOrders
//        if (dineInOrdersIndex != dineInOrders.size() || takeOutOrdersIndex != takeOutOrders.size()) {
//            return false;
//        }
//
//        // all orders in servedOrders have been "accounted for"
//        // so we're serving first-come, first-served!
//        return true;
//    }
