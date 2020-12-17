package leetcode;

import java.util.List;
import java.util.ArrayList;

public class PrintWordsVertically1324 {

    public void PrintWordsVertically1324() {
        String s = "TO BE OR NOT TO BE";
        String sArr[] = s.split(" ");
        int iMaximunLength = 0;
        List<String> lList = new ArrayList();
        for (String string : sArr) {
            if (string.length() > iMaximunLength) {
                iMaximunLength = string.length();
            }
        }
        for (int i = 0; i < iMaximunLength; i++) {
            StringBuffer sTemp = new StringBuffer();
            for (int j = 0; j < sArr.length; j++) {
                if (sArr[j].length() > i) {
                    sTemp.append(sArr[j].charAt(i));
                } else if (i >= sArr[j].length()) {
                    sTemp.append(" ");
                }

            }
            lList.add(sTemp.toString());
        }
        for (int i = 0; i < lList.size(); i++) {
            StringBuffer sTemp = new StringBuffer(lList.get(i));
            while (sTemp.lastIndexOf(" ") == sTemp.length() - 1) {
                sTemp.deleteCharAt(sTemp.length() - 1);
            }
            lList.set(i, sTemp.toString());
        }
        for (String string : lList) {
            System.out.println(string + "-");
        }
    }
}
