import java.util.*;
public class MyClass{
    public static void main(String[] args) {
        Scanner sn = new Scanner (System.in);
        Cricketer cricketers[] = new Cricketer[4];
        
        for(int i = 0; i< 4; i++){
            int id = sn.nextInt();
            sn.nextLine();
            String name = sn.nextLine();
            int jercyNo = sn.nextInt();
            sn.nextLine();;
            String group = sn.nextLine();
            String type = sn.nextLine();
            cricketers[i] = new Cricketer(id, name,jercyNo, group,type);
        }

        String group = sn.nextLine();
        String type = sn.nextLine();
        sn.close();

        Cricketer id = findCricketerWithMinJercyNo(cricketers, group, type);

        if(id !=null){
            System.out.println(id.getId());
        }
        else{
            System.out.println("There is no such cricketer");
        }
    }

    public static Cricketer findCricketerWithMinJercyNo(Cricketer [] arr, String group, String type){
        Cricketer obj = null;
        int minn = Integer.MAX_VALUE;

        for(int i  = 0 ; i< arr.length; i++ ){
            if(arr[i].getGroup().equals(group) && arr[i].getType().equals(type)){
                if(arr[i]. getJercyNo() < minn){
                    obj = arr[i];
                    minn = Math.min(minn, arr[i].getJercyNo());
                }
            }
        }
        return obj;
    }
}

class Cricketer {
    int id;
    int jercyNo;
    String name;
    String group;
    String type;

    public int getId() {
        return this.id;
    }

    public int getJercyNo() {
        return this.jercyNo;
    }

    public String getGroup() {
        return this.group;
    }

    public String getType() {
        return this.type;
    }

    public Cricketer(int id, String name, int jercyNo, String group, String type){
        this.id = id;
        this.name = name;
        this.jercyNo = jercyNo;
        this.group  = group;
        this.type = type;
    }
}

