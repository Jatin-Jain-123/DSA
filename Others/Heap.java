public class Heap{
    private int[] arr;
    private int capacity;
    private int size;
    public Heap(int capacity){
        this.capacity=capacity;
        arr=new int[capacity];
        size=0;
    }
    public void insert(int value){
        if(size==0){
            throw new RuntimeException("the heap is full");
        }
        arr[size]=value;
        int current = size;
        size++;
        while(current > 0 && arr[current]<arr[parent(current)]){
            swap(current, parent(current));
            current = parent(current);
        }

    }
    private void swap(int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    private int parent(int i){
        return (i-1)/2;
    }
    public static void main(String[] args) {
        
    }
}