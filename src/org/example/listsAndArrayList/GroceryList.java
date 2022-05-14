
package org.example.listsAndArrayList;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String newItem) {
        groceryList.add(newItem);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("grocery item " + (position + 1) + " has been modified.");
    }


    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

//   public String findItem(String searchItem) {
//        int position = groceryList.indexOf(searchItem);
//        if (position >= 0) {
//            return groceryList.get(position);
//        }
//        return null;
//    }
//
//    private int findItem(String searchItem){
//        return groceryList.indexOf(searchItem);
//    }
//
//    public boolean onFile(String searchItem){
//        int position = findItem(searchItem);
//        if (position<=0){
//            return true;
//        }
//        return false;
//    }
}


