class Solution {
    public String intToRoman(int num) {
        // Map<Integer, String> map = new LinkedHashMap<>();

        // map.put(1000, "M");
        // map.put(900, "CM");
        // map.put(500, "D");
        // map.put(400, "CD");
        // map.put(100, "C");
        // map.put(90, "XC");
        // map.put(50, "L");
        // map.put(40, "XL");
        // map.put(10, "X");
        // map.put(9, "IX");
        // map.put(5, "V");
        // map.put(4, "IV");
        // map.put(1, "I");

        // StringBuilder res = new StringBuilder();

        // for (Map.Entry<Integer, String> elem : map.entrySet()) {
        //     while (num >= elem.getKey()) {
        //         num -= elem.getKey();

        //         res.append(elem.getValue());
        //     }
        // }

        // return res.toString();

        String[] ths = {"", "M", "MM", "MMM"};
        String[] hrns = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return ths[num/1000] + hrns[(num%1000) / 100] + tens[(num % 100)/10] + ones[num%10];
    }
}