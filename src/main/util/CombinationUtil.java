package main.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Windy
 */
public class CombinationUtil {
    
    private static String separator = ",";
    private static final List<StringBuilder> lastResult = new ArrayList();
    
    public static void clearResult() {
        lastResult.clear();
    }
    
    public static List<StringBuilder> getLastResult() {
        return lastResult;
    }
    
    public static void setSeparator(String separator) {
        CombinationUtil.separator = separator;
    }
    
    public static void combinations(List<String> selectedList, List<String> dataList, int count) {
        if (count == 0) {
            StringBuilder sb = new StringBuilder();
            for (String input : selectedList) {
                sb.append(input).append(separator);
            }
            sb.setLength(sb.length() - 1);
            if (sb.length() > 0) {
                lastResult.add(sb);
            }
            return;
        }
        if (dataList.isEmpty()) {
            return;
        }
        selectedList.add(dataList.get(0));
        combinations(selectedList, dataList.subList(1, dataList.size()), count - 1);
        selectedList.remove(selectedList.size() - 1);
        combinations(selectedList, dataList.subList(1, dataList.size()), count);
    }
    
}
