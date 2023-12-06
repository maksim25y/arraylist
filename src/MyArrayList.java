package src;

public class MyArrayList implements MyList{

    private Object[]array = new Object[10];
    private int size = 0;

    @Override
    public Object get(int index) {
        if(checkIndex(index)){
            return array[index];
        }
        return null;
    }

    @Override
    public void clear() {
        size = 0;
        array = new Object[10];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(Object element) {

    }

    @Override
    public void addAt(int index, Object element) {

    }

    @Override
    public void remove(Object element) {

    }

    @Override
    public void removeAt(int index) {

    }
    private void increaseArray(){
        Object[]arrCopy = new Object[size*2];
        for(int i=0;i<size;i++){
            arrCopy[i]=array[i];
        }
        array=arrCopy;
    }
    private boolean checkIndex(int index){
        return index>=0&&index<size;
    }
}
