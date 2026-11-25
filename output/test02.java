public class Test02 {
    public static void main(String[] args){
        int[] data=new int[8];
        data[0]=10;
        data[1]=20;
        data[2]=30;
        int size=3;
        printlist(data,size);
        size=insert(data,size,1,99);//下表1插入99
        printlist(data,size);
        size=remove(data,size,2);//删除下标2的元素
        printlist(data,size);
        System.out.println("有效长度:"+size);
        System.out.println("数组容量:"+data.length);
    }
    //返回插入后的新长度
    static int insert(int[] data,int size,int index,int value){
        for(int k=size-1;k>=index;k--){
            data[k+1]=data[k];
        }
        data[index]=value;
        return size+1;
    }
    //返回删除后的新长度
    static int remove(int[] data,int size,int index){
        for(int k=index;k<size-1;k++){
            data[k]=data[k+1];
        }
        return size-1;
    }
    //只打印有效元素
    static void printlist(int[] data,int size){
        System.out.print("[");
        for(int i=0;i<size;i++){
            if(i>0){
                System.out.print(",");
            }
            System.out.print(data[i]);
        }
        System.out.println("]");
    }
}
