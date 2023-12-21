public class LinearSearch {

    public static int linearSearch(int marks[], int key) {
        for(int i=0; i<marks.length; i++) {
            if(marks[i] == key) 
                return i;
        }

        return -1;
    }
    public static void main(String[] args) {
        int marks[] = {95, 81, 95, 93, 76, 65};
        int key = 76;

        int index = linearSearch(marks, key);
        if(index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Element found at index : "+ index);
        }

    }
}