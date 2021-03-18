### 解题思路
每个值都与后面一位的值作比较，如果小于后面的值，则减去；大于后面的值，则加上。

### 代码

```java
class Solution {
    public int romanToInt(String s) {
        if(s == null || s == ""){
            return 0;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int sum = 0;

        char[] array = s.toCharArray();
        for(int i = 0; i < array.length ; i++){
            Integer value = map.get(array[i]);
            if(i == array.length - 1){
                sum += value;
                continue;
            }
            Integer nextValue = map.get(array[i + 1]);
            if(nextValue <= value){
                sum += value;
            }else{
                sum -= value;
            }
        }
    
        return sum;
    }
}
```