public class PrintRecu{
    public static void print(int count){
        System.out.println(count);
        if(count == 5) return;
        count++;
        print(count);
    }

    public static String name = "mahesh";
    public static int count = 1;

    public static void print(){
        System.out.println(name);
        if(count == 5) return;
        count++;
        print();
    }
    
    public static void main(String[] args) {
        print();
    }

    
}