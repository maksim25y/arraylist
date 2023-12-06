package src;

public class Main {
    public static void main(String[] args) {
        MyList list = new MyArrayList();
        for(int i=0;i<20;i++){
           list.add(i+"j");
        }
        list.removeAt(3);
        System.out.println(list.size());
    }
}
