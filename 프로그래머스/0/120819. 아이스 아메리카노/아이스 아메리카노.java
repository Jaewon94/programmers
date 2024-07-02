import java.util.ArrayList;
import java.util.List;

class Solution {
    public List solution(int money) {
        int origin = money;
        int num = 0;
        int change = 0;
        for (int i = 0; i <= origin; i += 5500) {
            if (money >= 5500) {
                num++;
                money -= 5500;
            }
        }
        List list = new ArrayList();

        change = origin - (num * 5500);

        list.add(num);
        list.add(change);
        return list;
    }
}