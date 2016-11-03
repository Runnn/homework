/**
 * Created by 陈子健 on 2016/11/2.
 */
class Bag {
    private String[] muster;
    private int number;
    private final int MAXCOUNT = 100;
    public Bag() {
        muster = new String[MAXCOUNT];
        number= 0;
    }
    public void insert(String str) {

        int i = find(str);
        if (0 <= i && i < number) {
            System.out.println("待插入元素已经存在集合中！");
        } else {
            if (number < muster.length) {
                muster[number] = new String(str);
                number++;
            } else
                System.out.println("集合空间已满，不能添加新元素：" + str);
        }
    }
    public void remove(String str) {
        int i = find(str);
        if (0 <= i && i < number) {
            muster[i] = null;
            if (i < number - 1) {
                for (; i < number;i++) {
                    muster[i] = muster[i + 1];
                }
            }
            number--;
        } else {
            System.out.println("未找到待删除元素！");
        }
    }
    public boolean isEmpty() {
        if (number > 0)
            return false;
        else
            return true;
    }
    public int getAmount() {
        return number;
    }
    public int find(String str) {
        int i;
        for (i = 0; i < number; i++) {
            if (muster[i].compareTo(str) == 0)
                break;
        }
        if (i < number)
            return i;
        else
            return -1;
    }
    public String toString() {
        String str = "元素个数=" + number + "  ";
        int i;
        for (i = 0; i < number - 1; i++) {
            str = str + muster[i] + ",";
        }
        str = str + muster[i];
        return str;
    }
}
public class level3{
    public static void main(String[] args) {
        Bag bag = new Bag();
        bag.insert("Monday");
        bag.insert("Tuesday");
        bag.insert("Wednesday");
        System.out.println("集合中元素为：" + bag.toString());
        bag.remove("Tuesday");
        System.out.println("删除Tuesday后，集合中元素为：" + bag.toString());
        System.out.println("查找Monday的结果为：" + bag.find("Monday"));
        System.out.println("判断集合是否为空的结果为：" + bag.isEmpty());
        bag.insert("Monday");
    }
}
