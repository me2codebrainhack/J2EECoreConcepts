package collections.list;


import java.util.*;

public class ArrayListExamples {

    public void getColorsList(){
        List<String> colorsList = new ArrayList<String>();
        colorsList.add("Red");
        colorsList.add("Blue");
        colorsList.add("white");
        System.out.println(colorsList);
    }

    public void iterateListInsertElement(){
        List<String> list = new ArrayList<String>();
        list.add("1st element");
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        list.add("2nd element");
        for(String str : list){
            System.out.println(str);
        }
        list.add(0,"New First Element");

        System.out.println(list);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public void getSpecificItemFromList(){
        List<String> menu = new ArrayList<String>();
        menu.add("Chicken Burger");
        menu.add("Cheese Burger");
        menu.add("Veg Burger");
        System.out.println("First Item on menu -> "+menu.get(0));
        System.out.println("Second Item on menu -> "+menu.get(1));
        System.out.println("Third Item on menu -> "+menu.get(2));
    }

    public void setSpecificItemOnList(){
        List<String> menu = new ArrayList<String>();
        menu.add("Chicken Burger");
        menu.add("Cheese Burger");
        menu.add("Veg Burger");
        System.out.println("Before Menu Change -> "+menu);
        menu.set(0,"Spicy Chicken Burger");
        menu.set(1,"Supreme Cheese Burger");
        menu.set(2,"Deluxe Veggie Burger");

        System.out.println("After Menu Change -> "+menu);
    }

    public void removeElementFromList(){
        List<String> feesOverDueStudents = new ArrayList<String>();
        feesOverDueStudents.add("Ramesh");
        feesOverDueStudents.add("Somesh");
        feesOverDueStudents.add("Lokesh");
        feesOverDueStudents.add("Hamesh");
        System.out.println("Fees OverDue Students names -> "+feesOverDueStudents);
        feesOverDueStudents.remove(2);
        System.out.println("Fees OverDue Students names After Payment -> "+feesOverDueStudents);
    }

    public void searchList(){
        List<String>  availableBooksInLibrary = new ArrayList<>();
        availableBooksInLibrary.add("Maths");
        availableBooksInLibrary.add("English");
        availableBooksInLibrary.add("Science");
        availableBooksInLibrary.add("Literature");

        ListIterator listIterator = availableBooksInLibrary.listIterator();
        while (listIterator.hasNext()){
            if(listIterator.next().equals("Literature")){
                System.out.println("Book is Available in Library .....");
            }
        }
    }

    public void sortList(){
        List<String> houseMaterials = new ArrayList<String>();
        houseMaterials.add("Chairs");
        houseMaterials.add("Beds");
        houseMaterials.add("Kitchen Stuff");
        houseMaterials.add("Bathroom Stuff");
        System.out.println("Before Sorting -> "+houseMaterials);
        Collections.sort(houseMaterials);
        System.out.println("After Sorting -> "+houseMaterials);
    }

    public void copyShuffleReverseContainsSwapSubList(){
        List<Integer> sales = new ArrayList<Integer>();
        sales.add(250);
        sales.add(320);
        sales.add(400);
        sales.add(500);
        List<Integer> salesCopy = new ArrayList<Integer>();
        System.out.println("Before copying -> "+salesCopy);
        for (Integer sale : sales){
            salesCopy.add(sale);
        }
        System.out.println("After copying -> "+salesCopy);
        List<Integer> salesCopyNew = Arrays.asList(new Integer[sales.size()]);
        System.out.println("Before copying -> "+salesCopyNew);
        Collections.copy(salesCopyNew,salesCopy);
        System.out.println("After copying -> "+salesCopyNew);

        Collections.shuffle(salesCopyNew);
        System.out.println("After Shuffling List -> "+salesCopyNew);
        Collections.reverse(salesCopyNew);
        System.out.println("After Reversing List -> "+salesCopyNew);
        System.out.println("Sub List -> "+salesCopyNew.subList(0,1));
        System.out.println(salesCopyNew.containsAll(salesCopy));
        System.out.println("Before Swapping -> "+salesCopyNew);
        Collections.swap(salesCopyNew,0,3);
        System.out.println("After Swapping -> "+salesCopyNew);

    }

    public void joinArrayEmptyList(){
        List<String> prefixList = new ArrayList<String>();
        prefixList.add("Today");
        prefixList.add("is");
        List<String> suffixList = new ArrayList<String>();
        suffixList.add("Full");
        suffixList.add("Moon");
        prefixList.addAll(suffixList);
        System.out.println(prefixList);
        prefixList.removeAll(prefixList);
        System.out.println("After removing all elements from above list -> "+prefixList);
        System.out.println("Is List empty -> "+prefixList.isEmpty());
    }

    public void sizeTrimSizeIncreaseList(){
        ArrayList<String> colorList = new ArrayList<String>(5);
        colorList.add("RED");
        colorList.add("BLUE");
        colorList.add("WHITE");
        System.out.println("Initial Capacity -> "+colorList.size());
        for(int i=0;i<colorList.size();i++){
            System.out.println(colorList.get(i));
        }
        colorList.trimToSize();
        System.out.println("Capacity after Trim to Size -> "+colorList.size());
        colorList.ensureCapacity(6);
        colorList.add("4");
        colorList.add("5");
        colorList.add("6");
        System.out.println("Capacity after Increasing Size and adding elements -> "+colorList.size());
    }
}
